public class IfStatement {
    public static void main(String[] args) {
        var nilai = 78;  
        var absen = 80; 

        if (nilai >=  75 && absen >= 75){
            System.out.println("Selamat anda lulus!");
        } else {
            System.out.println("Maaf anda tidak lulus!");
        }

        System.out.println("============================");
            
        if (nilai >= 80 && absen >= 80) {
            System.out.println("Anda mendapatkan nilai A");
        } else if (nilai >= 75 && absen >= 75) {
            System.out.println("Anda mendapatkan nilai B");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Anda mendapatkan nilai C");
        } else if (nilai >= 65 && absen >= 65) {
            System.out.println("Anda mendapatkan nilai D");
        } else {
            System.out.println("Anda mendapatkan nilai E");
        }
    }
}
