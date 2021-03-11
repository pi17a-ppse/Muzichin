package com.crosska.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Меню настроек
 *
 * Класс описывает методы и взаимодействие с настройками приложения.
 *
 * @author Crosska
 * @version 1.0.0
 * @copyright GNU Public License
 * @todo Реализовать все методы
 */
public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }
}