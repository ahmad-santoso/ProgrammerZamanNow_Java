package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Ahmad", "Santoso", "Tray"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        //Ini bisa pakai salah satu
        System.out.println(
                ArrayHelper.<String>count(names)
        );

        System.out.println(
                ArrayHelper.count(numbers)
        );
    }
}
