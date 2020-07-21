package exercises;

public class Factorial {

    public static int factorial(int x) {
        int factorialSum = 0;
        for (int i=0; i<=x; i++) {
            factorialSum += i;
        }
        return factorialSum;
    }

    public static long recursiveFactorial(long x) {
        if (x == 0) {
            return 1;
        } else {
//            int i = recursiveFactorial(x - 1);
//            int val = x * i;
//            return val;
            return (x * recursiveFactorial(x - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(Math.abs(recursiveFactorial(15000l)));
    }

}
