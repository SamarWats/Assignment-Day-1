package Trainer3;


@FunctionalInterface
interface StringFormatter {
    String format(String input);
}

public class E2{

    public static void main(String[] args) {

        // Lambda expression
        StringFormatter formatter = 
                str -> String.join(" ", str.split(""));

        System.out.println(formatter.format("CG"));
        System.out.println(formatter.format("HELLO"));
    }
}
