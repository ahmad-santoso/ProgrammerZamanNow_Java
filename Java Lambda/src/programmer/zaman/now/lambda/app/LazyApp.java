package programmer.zaman.now.lambda.app;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        testScore(90, () -> getName());         // kalau score 60 method getName() tidak dipanggil
    }

    public static void testScore(int score, Supplier<String> name) {
        if (score > 80) {
            System.out.println("Selamat " + name.get() + ", Anda Lulus");
        } else {
            System.out.println("Coba Lagi Nanti");
        }
    }

    public static String getName() {
        System.out.println("Method getName() dipanggil");
        return "Anto";
    }
}
