package test;

/**
 * @author laijunlin
 * @date 2021-03-08 0:23
 */
public class PrimeAndEven {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            if(checkPrime(i) && checkEven(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean checkEven(int i) {
        int g=(i/1)%10;
        int s=(i/10)%10;
        int b=(i/100)%10;
        int q=(i/1000)%10;
        if((g+s+b+q)%2==0){
           return true;
        }
        return false;
    }

    private static boolean checkPrime(int i) {
        for (int j = 3; j < i; j++) {
            if(i%j == 0){
                return false;
            }
        }
        return true;
    }
}
