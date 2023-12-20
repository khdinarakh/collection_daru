package com.company.colors;

public enum Colours {
    ////Создайте публичное перечисление Colors с константами цветов. Выведите значения перечисления Colors на печать.
    RED("Red"),
    BLACK("Black"),
    WHITE("White"),
    GREEN("Green"),
    YELLOW("Yellow");

    private final String value;

    Colours(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static void print() {
        for (Colours color : Colours.values()) {
            System.out.println(color.getValue());
        }
    }

}
