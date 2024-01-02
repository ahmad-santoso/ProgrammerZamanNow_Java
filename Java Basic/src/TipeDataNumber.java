public class TipeDataNumber{
    public static void main(String[] args) {
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000000;
        long iniLong = 100000000;
        long iniLong2 = 100000000L;

        float iniFloat = 10.10F;
        double iniDouble = 10.10;

        int decimalInt = 19;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;

        System.out.println("Angka yang ada di variable iniByte : " + iniByte);
        System.out.println("Angka yang ada di variable iniShort : " + iniShort);
        System.out.println("Angka yang ada di variabel iniInt : " + iniInt);
        System.out.println("Angka yang ada di variabel iniLong : " + iniLong);
        System.out.println("Angka yang ada di variabel iniLong2 : " + iniLong2);

        System.out.println("=================================================");
        System.out.println("Angka yang ada di variabel iniFloat : " + iniFloat);
        System.out.println("Angka yang ada di variabel iniDouble : " + iniDouble);
        System.out.println("=================================================");

        System.out.println("Angka yang ada di variabel decimalInt : " + decimalInt);
        System.out.println("Angka yang ada di variabel hexaDecimal : " + hexaDecimal);
        System.out.println("Angka yang ada di variabel binaryDecimal : " + binaryDecimal);
    }
}