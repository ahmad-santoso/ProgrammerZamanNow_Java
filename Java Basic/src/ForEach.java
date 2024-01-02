public class ForEach {
    public static void main(String[] args) {
        String[] names = {
            "Ahmad", "Anto", "Santoso", "Masant", "Tray"
        };
        System.out.println("===================Tanpa For Each===================");
        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("\n===================Menggunakan For Each===================");
        for (var name : names) {
            System.out.println(name);
        }
    }
}