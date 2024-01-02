public class Continue {
    public static void main(String[] args) {
        for (int angka = 1; angka <= 100; angka++) {
            if (angka % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan ganjil ke-" + angka);
        }

        System.out.println("=============================");
        
        for (int angka = 1; angka <= 100; angka++) {
            if (angka % 2 == 1) {
                continue;
            }
            System.out.println("Perulangan genap ke-" + angka);
        }
    }
}