public class Break {
    public static void main(String[] args) {
        var angka = 1;

        while (true) {
            System.out.println("Perulangan " + angka);
            angka++;

            if (angka > 10) {
                break;
            }
        } 
        System.out.println("Program berhenti");
    }
}