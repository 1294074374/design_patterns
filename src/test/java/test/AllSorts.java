package test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author laijunlin
 * @date 2021-03-07 18:38
 */
public class AllSorts {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        AllSorts sorts = new AllSorts();
        sorts.sort(nums);
        System.out.println(res.toString());
    }

   static ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        if (num == null || num.length == 0) {
            return res;
        }
        Arrays.sort(num);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        slove(arrayList,num);
        return res;
    }

    private void slove(ArrayList<Integer> arrayList, int[] num) {
        if(arrayList.size() == num.length){
            res.add(new ArrayList<Integer>(arrayList));
            return ;
        }

        for (int i = 0; i < num.length; i++) {
            if(!arrayList.contains(num[i])){
                arrayList.add(num[i]);
                slove(arrayList,num);
                arrayList.remove(arrayList.size() -1);
            }
        }
    }





    public static void sort(int[] nums){
        ArrayList<Integer> list = new ArrayList<Integer>();

        allSort(list,nums);

        System.out.println(res.toString());
    }

    private static void allSort(ArrayList<Integer> list, int[] nums) {
        if(list.size() <= nums.length){
            res.add(new ArrayList<Integer>(list));
        }

        if(list.size() == nums.length){
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                allSort(list,nums);
                list.remove(list.size()-1);
            }
        }
    }


}
