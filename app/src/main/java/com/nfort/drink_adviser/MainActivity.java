package com.nfort.drink_adviser;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {
    private DrinkExpert drinkExpert = new DrinkExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindDrink(View view) {

        // Получить ссылку на TextView
        TextView drinkOptions = (TextView) findViewById(R.id.drink_options);

        // Получить ссылку на Spinner
        Spinner kindOfDrink = (Spinner) findViewById(R.id.kind_of_drink);

        // Получить вариант, выбранный в Spinner
        String kindOfDrinks = String.valueOf(kindOfDrink.getSelectedItem());

        // Вывести выбранный вариант
//        drinkOptions.setText(kindOfDrinks);

        List<String> listOptionsOfDrink = drinkExpert.getDrinkOptions(kindOfDrinks);
        StringBuilder optionsFormatter = new StringBuilder();
        for(String option : listOptionsOfDrink) {
            optionsFormatter.append(option).append("\n");
        }

        drinkOptions.setText(optionsFormatter);

    }
}