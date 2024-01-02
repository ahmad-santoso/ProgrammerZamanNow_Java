public class KonversiNumber {
    public static void main(String[] args) {

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;

        System.out.println("Konveri Number iniByte : " + iniByte);
        System.out.println("Konversi Number iniShort : " + iniShort);
        System.out.println("Konversi Number iniInt : " + iniInt);

        System.out.println("=================================================");

        System.out.println("Konversi Number iniInt2 : " + iniInt2);
        System.out.println("Konversi Number iniByte2 : " + iniByte2);
    }
}
