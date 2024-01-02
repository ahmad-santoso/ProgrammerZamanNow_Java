public class Array {
        public static void main(String[] args) {
                String[] stringArray;                      // Contoh Bikin Array Pertama
                stringArray = new String[2];

                stringArray[0] = "Ahmad";
                stringArray[1] = "Santoso";

                System.out.println(stringArray[0]);
                System.out.println(stringArray[1]);

                System.out.println("=============================");

                stringArray[0] = "Masant";                 // Contoh Bikin Array Kedua
                stringArray[1] = "Tray";

                System.out.println(stringArray[0]);        
                System.out.println(stringArray[1]);

                System.out.println("=============================");

                String[] stringArray2 = new String[2];     // Contoh Bikin Array Ketiga

                stringArray2[0] = "Ahmad";
                stringArray2[1] = "Santoso";

                System.out.println(stringArray2[0]);
                System.out.println(stringArray2[1]);

                System.out.println("=============================");

                String[] stringArray3 = {                  // Contoh Bikin Array Keempat
                        "Ahmad", "Santoso"
                };

                System.out.println(stringArray3[1]);

                System.out.println("=============================");

                int[] arrayList = new int[] {               // Contoh Bikin Array Kelima
                        1, 2, 3, 4, 5
                };

                System.out.println(arrayList[3]);

                System.out.println("=============================");

                long[] arrayLong = {                        // Contoh Bikin Array Keenam
                        1L, 2L, 3L, 4L, 5L
                };

                System.out.println(arrayLong[2]);
                System.out.println(arrayLong.length);       // Hitung Panjang Dari Array Long

                System.out.println("=============================");

                String[][] members = {                      // Contoh Bikin Array Dalam Array
                        {"Ahmad", "Santoso"},
                        {"Masant", "Tray"},
                        {"Anto"}
                };

                System.out.println(members[0][1]);
                System.out.println(members[1][0]);
                System.out.println(members[2][0]);
        }
}