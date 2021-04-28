package test;

public class Test2000以内的质数 {
    public static void main(String[] args) {
        for (int i = 2; i < 2000; i++) {
            if(checkzhishu(i) && checkgeweihe(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean checkgeweihe(int i) {
        int j = 2;
        while(j<i){
            if(i % j == 0){
                return false;
            }
            j++;
        }
        return true;
    }

    private static boolean checkzhishu(int i) {
        int temp = 0;
        if(i>1000){
            temp += i/1000;
            i = i%1000;
        }
        if(i>100){
            temp += i/100;
            i = i%100;
        }
        if(i>10){
            temp += i/10;
            i = i%10;
        }
        if(i<10){
            temp = i+temp;
        }
        if(temp %2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
