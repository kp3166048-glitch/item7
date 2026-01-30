public class AlternatePrimeEasy {
    public static void main(String[] args) {
        int num = 2;  
        int printed = 0;

        while (printed < 10) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                printed++;
                num++;
            }
            num++;
        }
    }
    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }
}
