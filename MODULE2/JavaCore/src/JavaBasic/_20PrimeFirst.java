package JavaBasic;

public class _20PrimeFirst {
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
        int count = 0;
        int num = 2;
        while (count < 20) {
            if (checkPrime(num)) {
                count++;
                System.out.println(num + " ");
            }
            num++;
        }
    }
}
