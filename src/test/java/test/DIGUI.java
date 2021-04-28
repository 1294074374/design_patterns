package test;

/**
 * @author laijunlin
 * @date 2021-03-07 23:49
 */
public class DIGUI {
    public static void main(String[] args) {
        System.out.println(digui(10,1,8));;
    }

    private static int digui(int i,int j ,int count) {
        if(j == count){
            return i;
        }else{
            return digui(i+2,j+1,count);
        }
    }
}
