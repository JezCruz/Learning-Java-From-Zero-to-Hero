// Java grade checker


public class Main {
    public static void main(String[] args) {
        int grade = 85;

        if (grade >= 90) {
            System.out.println("Excellent");
        } else if (grade >= 75) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}