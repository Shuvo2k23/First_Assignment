import java.awt.*;

public class Create_Box {
    public static void main(String[] args) {
        String name = "SHUVO";
        int length = name.length() + 4;
        String first = "+" + "-".repeat(length) + "+";
        String up_down = "|" + " ".repeat(length) + "|";

        System.out.println(first);
        System.out.println(up_down);
        System.out.println("|  " + name + "  |");
        System.out.println(up_down);
        System.out.println(first);

    }
}
