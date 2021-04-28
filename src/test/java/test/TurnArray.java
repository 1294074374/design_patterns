package test;

/**
 * @author laijunlin
 * @date 2021-03-07 15:55
 */
public class TurnArray {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        solve(a.length,2,a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] solve (int n, int m, int[] a) {
        // write code here
        if(m == 0){
            return a;
        }
        int i = 0;
        int aLength = a.length;
        while (m>i){
            int temp = a[aLength-1];
            for (int j = aLength-1; j >0 ; j--) {
                a[j] = a[j-1];
            }
            a[0] = temp;
            i++;
        }
        return a;
    }
}
