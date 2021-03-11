package com.crosska.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

/**
 * Главное меню
 *
 * Класс описывает методы и взаимодействие с главным меню.
 *
 * @author Crosska
 * @version 1.0.0
 * @copyright GNU Public License
 * @todo Реализовать все методы
 */
public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void exit_menu_button_clicked(View view) {
        this.finishAffinity();
    }

    public void settings_menu_button_clicked(View view) {
        Intent intent = new Intent(MenuActivity.this, MenuActivity.class);
        startActivity(intent);
    }
}