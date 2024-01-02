public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {                                                          // Switch Normal
            case "A":
                System.out.println("Wow, anda lulus dengan baik");
                break;
            case "B":
                System.out.println("Nilai anda cukup baik");
                break;
            case "C":
                System.out.println("Anda bisa mencoba lagi nanti");
                break;
            case "D":
                System.out.println("Perbanyak belajar, dan semangat terus");
                break;
            default:
                System.out.println("Anda salah jurusan");
                break;
        }

        System.out.println("==================================");
        
        switch (nilai) {                                                           // Switch Lambda / Lebih Simpel
            case "A" -> System.out.println("Wow, Anda lulus dengan baik");
            case "B" -> System.out.println("Nilai anda cukup baik");
            case "C" -> System.out.println("Anda bisa mencoba lagi nanti");
            case "D" -> System.out.println("Perbanyak belajar, dan semangat terus");
            default -> {System.out.println("Mungkin anda salah jurusan");}
        }
        
        System.out.println("==================================");
        
        String ucapan;                                                             // Switch Tanpa Yield
        switch (nilai) {
            case "A" -> ucapan = "Wow, Anda lulus dengan baik";
            case "B" -> ucapan = "Nilai anda cukup baik";
            case "C" -> ucapan = "Anda bisa mencoba lagi nanti";
            case "D" -> ucapan = "Perbanyak belajar, dan semangat terus";
            default -> {
                ucapan = "Mungkin anda salah jurusan";
            }
        }
        System.out.println(ucapan);

        System.out.println("==================================");

        ucapan = switch (nilai) {                                                   // Switch Dengan Yield
            case "A" :
                yield "Wow, Anda lulus dengan baik";
            case "B" :
                yield "Nilai anda cukup baik";
            case "C" :
                yield "Anda bisa mencoba lagi nanti";
            case "D" :
                yield "Perbanyak belajar, dan semangat terus";
            default :
                yield "Mungkin anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}