public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;
        Byte iniByte = null;

        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniByte);

        System.out.println("===============");

        iniByte = 100;
        System.out.println(iniByte);

        System.out.println("===============");

        int iniInt = 100;
        Integer iniInteger2 = iniInt;
        System.out.println(iniInteger2);

        System.out.println("===============");

        Integer iniObject = iniInt;
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        Long amount = 1000000L;
        amount.shortValue();

        System.out.println(iniShort);
        System.out.println(iniLong2);
        System.out.println(iniFloat);
        System.out.println(amount);
    }
}
