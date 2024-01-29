package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        // Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;   // ini method referece static

        System.out.println(predicateIsLowerCase.test("ahmad"));
        System.out.println(predicateIsLowerCase.test("Ahmad"));

        // Method Reference di Parameter
        // Function<String, String> functionUpper = (String value) -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("Ahmad"));
    }

    public void run() {
        // Predicate<String> predicateIsLowerCase = MethodReferenceApp.this::isLowerCase;
        Predicate<String> predicateIsLowerCase = this::isLowerCase;     // ini method referece non static

        System.out.println(predicateIsLowerCase.test("ahmad"));
        System.out.println(predicateIsLowerCase.test("Ahmad"));
    }

    public void run2() {
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicateIsLowerCase = app::isLowerCase; // contoh mengakses method orang lain

        System.out.println(predicateIsLowerCase.test("ahmad"));
        System.out.println(predicateIsLowerCase.test("Ahmad"));
    }


    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
