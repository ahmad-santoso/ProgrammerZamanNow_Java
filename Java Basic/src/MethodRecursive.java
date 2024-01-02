public class MethodRecursive {
    public static void main(String[] args) {
        System.out.println("=============Tanpa Recursive============");         // Faktorial Loop
        System.out.println(factorialLoop(5));
        System.out.println("=============Menggunakan Recursive============");   // Faktorial Recursive
        System.out.println(factorialRecursive(5));
        loop(10000);                                    // error stack overflow kalo angka 10000
        // System.out.println(1*2*3*4*5);                  // Pembuktian lewat perkalian manual
    }

    static int factorialLoop(int value) {
        var result = 1;

        for (var angka = 1; angka <= value; angka++) {
            result *= angka;
        }
        return result;
    }

    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    static void loop(int value) {                           // ini bakal error stack overflow
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop ke-" + value);
            loop(value - 1);
        }
    }
}