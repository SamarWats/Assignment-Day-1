package Trainer3;

public class E1{
    
    @FunctionalInterface
    interface IPower {
        double calculate(int x, int y);
    }

    public static void main(String[] args) {

        IPower power = (x, y) -> Math.pow(x, y);

        System.out.println(power.calculate(2, 3));  
        System.out.println(power.calculate(5, 2)); 
    }
}
