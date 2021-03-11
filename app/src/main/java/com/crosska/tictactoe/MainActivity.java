package com.crosska.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

/**
 * Первичное меню
 *
 * Класс описывает методы и взаимодействие с первичным экраном.
 *
 * @author Crosska
 * @version 1.0.0
 * @copyright GNU Public License
 * @todo Реализовать все методы
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Toast.makeText(this, "Добро пожаловать!", Toast.LENGTH_LONG).show();
    }

    public void play_button_clicked(View view) {
        Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show();
        Intent intent2 = new Intent(MainActivity.this, MenuActivity.class);
        intent2 = new Intent(MainActivity.this, MenuActivity.class);
        startActivity(intent2);
    }
}