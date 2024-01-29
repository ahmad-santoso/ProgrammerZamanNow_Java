package programmer.zaman.now.lambda.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String, Integer> functionLength = value -> value.length();     // menggunakan fanction

        System.out.println(functionLength.apply("Ahmad"));
    }
}
