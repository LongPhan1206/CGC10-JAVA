package JavaBasic;

public class _100Prime {
    public static boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("100 number prime first: ");
        for (int i = 0; i < 100; i++)  {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
