package my;

import java.util.ArrayList;

public class AllSort {
   static ArrayList<ArrayList<Integer>> list  = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        sort(arr);
        System.out.println(list);
    }

    private static void sort(int[] arr) {
        if(arr == null ){
            return;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        allSort(arrayList,arr);
    }

    private static void allSort(ArrayList<Integer> arrayList, int[] arr) {
        if(arrayList.size() <= arr.length){
            list.add(new ArrayList<Integer>(arrayList));
        }
        if(arrayList.size() == arr.length){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(!arrayList.contains(arr[i])){
                arrayList.add(arr[i]);
                allSort(arrayList,arr);
                arrayList.remove(arrayList.size()-1);
            }
        }
    }
}
