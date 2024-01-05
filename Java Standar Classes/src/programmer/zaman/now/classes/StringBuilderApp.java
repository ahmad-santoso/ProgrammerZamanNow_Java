package programmer.zaman.now.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Ahmad");
        builder.append(" ");
        builder.append("Santoso");
        builder.append(" ");
        builder.append("Anto");

        String name = builder.toString();
        System.out.println(name);
    }
}
