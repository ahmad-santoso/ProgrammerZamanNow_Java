package programmer.zaman.now.classes;

import java.util.Locale;

public class StringApp {
    public static void main(String[] args) {
        String name = "Ahmad Santoso";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);                           // normal
        System.out.println(nameLowerCase);                  // lowercase atau kecil semua
        System.out.println(nameUpperCase);                  // uppercase atau besar semua
        System.out.println(name.length());                  // length atau panjang
        System.out.println(name.startsWith("Ahmad"));       // cek apakah dimulai dengan string value
        System.out.println(name.endsWith("Santoso"));       // cek apakah diakhiri dengan string value

        String[] names = name.split(" ");             // untuk split
        for (var value : names) {
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());      // akan false karena " "
        System.out.println("".isEmpty());       // akan true karena ""
        System.out.println(name.charAt(0));

         char[] chars = name.toCharArray();
    }
}