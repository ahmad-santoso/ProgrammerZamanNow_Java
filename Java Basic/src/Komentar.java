public class Komentar {
    public static void main(String[] args) {
        //  ini untuk satu baris            (single line biasanya untuk dalam  code program)

        /** ini untuk beberapa baris        (multiline biasanya untuk dokumentasi method, class)
         * 
         * 
         */

         System.out.println(sum(10, 10));
    }
    /**
     * Method untuk menjumlahkan value1 dan value2
     * @param value1 angka pertama
     * @param value2 angka kedua
     * @return hasil penjumlahan value1 dan value2
     */
    
    static int sum(int value1, int value2) {
        // jumlahkan value1 ditambah value2
        return value1 + value2;
    }
}
