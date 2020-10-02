package exercises;

public class CodingNomads {
    public static void main(String[] args) {
        for (int n=1; n<=100; n++) {
            if (n%3 == 0 && n%5 ==0) {
                System.out.println("Coding Nomads");
            }
            else if (n%3 == 0) {
                System.out.println("Coding");
            } else if (n%5 == 0) {
                System.out.println("Nomads");
            } else {
                System.out.println(n);
            }
        }
    }
}


