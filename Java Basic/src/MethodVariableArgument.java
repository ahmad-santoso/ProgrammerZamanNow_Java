public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {100, 100, 100, 100, 100};                   // Cara pertama
        sayCongrats1("Ahmad Santoso", values);

        sayCongrats2("Anto", 100, 100, 100, 100, 100);                                        // Cara kedua
    }

    static void sayCongrats1(String name, int[] values) {           // Cara Pertama
        System.out.println("==========================Tanpa Variabel Argument==========================");
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 50) {
            System.out.println("Selamat " + name + " anda lulus");
        } else {
            System.out.println("Maaf " + name + " coba lagi");
        }
    }

    static void sayCongrats2(String name, int... values) {                                                      // Cara kedua
        System.out.println("==========================Dengan Variabel Argument==========================");
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 50) {
            System.out.println("Selamat " + name + " anda lulus");
        } else {
            System.out.println("Maaf " + name + " coba lagi");
        }
    }
}
