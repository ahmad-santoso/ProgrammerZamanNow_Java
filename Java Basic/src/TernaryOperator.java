public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("===============Tanpa Ternary Operator=============");
        var nilai = 75;
        String ucapan;

        if (nilai >= 75) {
            ucapan = "Selamat anda lulus";
        } else {
            ucapan = "Anda boleh ulang lagi";
        }
        System.out.println(ucapan);

        System.out.println("\n===========Menggunakan Ternary Operator===========");
        var nilai2 = 75;
        String ucapan2 = nilai2 >= 75 ? "Selamat anda lulus" : "Anda boleh ulang lagi";

        System.out.println(ucapan2);
    }
}