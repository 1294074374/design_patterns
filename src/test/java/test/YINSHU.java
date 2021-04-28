package test;

import java.util.ArrayList;

/**
 * @author laijunlin
 * @date 2021-03-08 9:47
 */
public class YINSHU {
    public static void main(String[] args) {
        getNumber(120);
    }

    public static ArrayList<Integer> getNumber(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        StringBuffer sb = new StringBuffer();
        sb.append(n).append("=");
        while(n>1){
            for (int i = 2; i <= n; i++) {
                if(n%i==0){
                    list.add(i);
                    n = n/i;
                    break;
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("*");
        }
        String result = sb.toString();
        System.out.println(result.substring(0,result.length()-1));
        return list;
    }
}
