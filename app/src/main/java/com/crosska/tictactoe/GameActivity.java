package com.crosska.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Класс игры
 *
 * Класс реализует методы, взаимодействие, логику и непосредственно игру.
 *
 * @author Crosska
 * @version 1.0.0
 * @copyright GNU Public License
 * @todo Реализовать все методы
 */
public class GameActivity extends AppCompatActivity {

    int turn;

    /**
     * Массив игрового поля
     *
     * Массив простых чисел, который обозначает состояния поля
     *
     * @var int[][] cell
     */
    int[][] cell = new int[3][3];

    /**
     * Показатель конца игры
     *
     * Обозначет конец игровой сессии
     *
     * @var  boolean end
     */
    boolean end = false;

    /**
     * Показатель сложности игры
     *
     * Обозначет для последующих методов сложность игры
     *
     * @var int computer_difficulty
     */
    int computer_difficulty;
    int mark_type;
    int player_type;
    int[] bot_choice = new int[2];

    Button mButton_0_0;
    Button mButton_0_1;
    Button mButton_0_2;
    Button mButton_1_0;
    Button mButton_1_1;
    Button mButton_1_2;
    Button mButton_2_0;
    Button mButton_2_1;
    Button mButton_2_2;
    Button mButton_white_flag;
    TextView mTextViewTurn;

    /**
     * Работа со свойством {Bundle savedInstanceState}
     *
     * Стандартный метод, вызывающийся при запуске активности.
     * Реализует создание активити и всех ее элементов, подготавливая к показу на экране
     *
     * @param *Bundle savedInstanceState структура хранящяя в себе данные об активности
     * @return void
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    /**
     * Активация игрового поля {boolean Enable}
     *
     * Обновляет у всех клеток игрового поля свойство Enabled
     * Вызывается при начале новой игровой сессии
     *
     * @param *boolean Enable логическая переменная, которая используется
     * для активации игрового поля
     * @return void
     */
    public void updateButtonsUsabilty(boolean Enable) {
        mButton_0_0.setEnabled(Enable);
        mButton_0_1.setEnabled(Enable);
        mButton_0_2.setEnabled(Enable);
        mButton_1_0.setEnabled(Enable);
        mButton_1_1.setEnabled(Enable);
        mButton_1_2.setEnabled(Enable);
        mButton_2_0.setEnabled(Enable);
        mButton_2_1.setEnabled(Enable);
        mButton_2_2.setEnabled(Enable);
    }

    /**
     * Действие при нажатии не игровое поле 0 0 {View view}
     *
     * Реализует проверку игрового поля на занятость и, если поле свободно,
     * то ставит знак текущего игрока.
     *
     * @param *View view - базовый класс для представления button.
     * @return void
     */
    public void cell_0_0_pressed(View view) {
        if (cell[0][0] != 1 && cell[0][0] != 2) { // 1 - нолик, 2 - крестик
            if (turn == 1) {
                cell[0][0] = 1;
                mButton_0_0.setText("O");
            } else {
                cell[0][0] = 2;
                mButton_0_0.setText("X");
            }
            updateTurnValue();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Действие при нажатии не игровое поле 0 1 {View view}
     *
     * Реализует проверку игрового поля на занятость и, если поле свободно,
     * то ставит знак текущего игрока.
     *
     * @param *View view - базовый класс для представления button.
     * @return void
     */
    public void cell_0_1_pressed(View view) {
        if (cell[0][1] != 1 && cell[0][1] != 2) {
            if (turn == 1) {
                cell[0][1] = 1;
                mButton_0_1.setText("O");
            } else {
                cell[0][1] = 2;
                mButton_0_1.setText("X");
            }
            updateTurnValue();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Действие при нажатии не игровое поле 0 2 {View view}
     *
     * Реализует проверку игрового поля на занятость и, если поле свободно,
     * то ставит знак текущего игрока.
     *
     * @param *View view - базовый класс для представления button.
     * @return void
     */
    public void cell_0_2_pressed(View view) {
        if (cell[0][2] != 1 && cell[0][2] != 2) { // 1 - нолик, 2 - крестик
            if (turn == 1) {
                cell[0][2] = 1;
                mButton_0_2.setText("O");
            } else {
                cell[0][2] = 2;
                mButton_0_2.setText("X");
            }
            updateTurnValue();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Действие при нажатии не игровое поле 1 0 {View view}
     *
     * Реализует проверку игрового поля на занятость и, если поле свободно,
     * то ставит знак текущего игрока.
     *
     * @param *View view - базовый класс для представления button.
     * @return void
     */
    public void cell_1_0_pressed(View view) {
        if (cell[1][0] != 1 && cell[1][0] != 2) { // 1 - нолик, 2 - крестик
            if (turn == 1) {
                cell[1][0] = 1;
                mButton_1_0.setText("O");
            } else {
                cell[1][0] = 2;
                mButton_1_0.setText("X");
            }
            updateTurnValue();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Действие при нажатии не игровое поле 1 1 {View view}
     *
     * Реализует проверку игрового поля на занятость и, если поле свободно,
     * то ставит знак текущего игрока.
     *
     * @param *View view - базовый класс для представления button.
     * @return void
     */
    public void cell_1_1_pressed(View view) {
        if (cell[1][1] != 1 && cell[1][1] != 2) { // 1 - нолик, 2 - крестик
            if (turn == 1) {
                cell[1][1] = 1;
                mButton_1_1.setText("O");
            } else {
                cell[1][1] = 2;
                mButton_1_1.setText("X");
            }
            updateTurnValue();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Действие при нажатии не игровое поле 1 2 {View view}
     *
     * Реализует проверку игрового поля на занятость и, если поле свободно,
     * то ставит знак текущего игрока.
     *
     * @param *View view - базовый класс для представления button.
     * @return void
     */
    public void cell_1_2_pressed(View view) {
        if (cell[1][2] != 1 && cell[1][2] != 2) { // 1 - нолик, 2 - крестик
            if (turn == 1) {
                cell[1][2] = 1;
                mButton_1_2.setText("O");
            } else {
                cell[1][2] = 2;
                mButton_1_2.setText("X");
            }
            updateTurnValue();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Действие при нажатии не игровое поле 2 0 {View view}
     *
     * Реализует проверку игрового поля на занятость и, если поле свободно,
     * то ставит знак текущего игрока.
     *
     * @param *View view - базовый класс для представления button.
     * @return void
     */
    public void cell_2_0_pressed(View view) {
        if (cell[2][0] != 1 && cell[2][0] != 2) { // 1 - нолик, 2 - крестик
            if (turn == 1) {
                cell[2][0] = 1;
                mButton_2_0.setText("O");
            } else {
                cell[2][0] = 2;
                mButton_2_0.setText("X");
            }
            updateTurnValue();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Действие при нажатии не игровое поле 2 1 {View view}
     *
     * Реализует проверку игрового поля на занятость и, если поле свободно,
     * то ставит знак текущего игрока.
     *
     * @param *View view - базовый класс для представления button.
     * @return void
     */
    public void cell_2_1_pressed(View view) {
        if (cell[2][1] != 1 && cell[2][1] != 2) { // 1 - нолик, 2 - крестик
            if (turn == 1) {
                cell[2][1] = 1;
                mButton_2_1.setText("O");
            } else {
                cell[2][1] = 2;
                mButton_2_1.setText("X");
            }
            updateTurnValue();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Действие при нажатии не игровое поле 2 2 {View view}
     *
     * Реализует проверку игрового поля на занятость и, если поле свободно,
     * то ставит знак текущего игрока.
     *
     * @param *View view - базовый класс для представления button.
     * @return void
     */
    public void cell_2_2_pressed(View view) {
        if (cell[2][2] != 1 && cell[2][2] != 2) { // 1 - нолик, 2 - крестик
            if (turn == 1) {
                cell[2][2] = 1;
                mButton_2_2.setText("O");
            } else {
                cell[2][2] = 2;
                mButton_2_2.setText("X");
            }
            updateTurnValue();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Обновление показателя хода {}
     *
     * Обновляет показатель хода текущего игрока.
     *
     * @param *void
     * @return void
     */
    private void updateTurnValue() {
        if (turn == 1) turn = 2;
        else turn = 1;
    }

}