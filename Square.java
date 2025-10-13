@FunctionalInterface
interface SquareCal {
    int square(int x);
}

public class Square {
    public static void main(String[] args) {
        SquareCal sq = (n) -> n * n;

        int num1 = 5;
        int num2 = 7;

        System.out.println("Square of " + num1 + ": " + sq.square(num1));
        System.out.println("Square of " + num2 + ": " + sq.square(num2));
    }
}
