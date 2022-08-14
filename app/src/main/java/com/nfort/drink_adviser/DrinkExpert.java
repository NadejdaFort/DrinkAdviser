package com.nfort.drink_adviser;

import java.util.ArrayList;
import java.util.List;

public class DrinkExpert {

    public List<String> getDrinkOptions(String kindOfDrink) {

        List<String> options = new ArrayList<>();
        if(kindOfDrink.equals("Чай")) {
            options.add("Чай пакетированный");
            options.add("Чай по-английски");
            options.add("Чай с корицей");
            options.add("Холодный чай");
            options.add("Шоколадный чай");
            options.add("Чай со сливками");
            options.add("Чай с лимоном");
            options.add("Чай с мятой");
            options.add("Зеленый чай со льдом и мятой");
            options.add("Цитрусовый зеленый чай");
            options.add("Зеленый чай с молоком, ванилью и мятой");
            options.add("Чай с медом и молоком");
        } else if(kindOfDrink.equals("Капучино")) {
            options.add("Пряный капучино");
            options.add("Шоколадный капучино");
            options.add("Мегакапучино");
            options.add("Ванильный капучино");
            options.add("Ореховый капучино");
            options.add("Медовый капучино");
        } else if(kindOfDrink.equals("Американо")) {
            options.add("Американо с молоком");
            options.add("Американо с корицей");
            options.add("Американо с лимоном");
            options.add("Сливочный американо");

        } return options;
    }
}
