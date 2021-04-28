package test;

import java.util.ArrayList;

/**
 * @author laijunlin
 * @date 2021-03-07 20:21
 */
public class AllSortsOneToN {
    static ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        ArrayList list = new ArrayList();
        dfs(list,arr);
        System.out.println(res.size());
        System.out.println(res.toString());
    }

    private static void dfs(ArrayList list, int[] arr) {
        if(list.size() == arr.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(!list.contains(arr[i])){
                list.add(arr[i]);
                dfs(list,arr);
                list.remove(list.size()-1);
            }
        }
    }


}
