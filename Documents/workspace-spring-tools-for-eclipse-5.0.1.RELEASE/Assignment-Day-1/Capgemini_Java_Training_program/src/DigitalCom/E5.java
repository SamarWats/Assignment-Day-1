package Trainer3;


@FunctionalInterface
interface Factorial {
    int calculate(int n);
}

class fact {

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}

public class E5{

    public static void main(String[] args) {

        fact utils = new fact();


        Factorial fact = utils::factorial;

        System.out.println("Factorial of 5: " + fact.calculate(5));
        System.out.println("Factorial of 6: " + fact.calculate(6));
    }
}
