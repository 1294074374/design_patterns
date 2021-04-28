package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author laijunlin
 * @date 2021-03-08 0:34
 */
public class Subsequence {
    static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

    public static void main(String[] args) {
        Subsequence subsequence = new Subsequence();
        int[] nums = {1, 2, 3, 4, 5};
        subsequence.subsets(nums);
        System.out.println(result.toString());
    }

    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        for (int j = 0; j <= nums.length; j++)
            backtracking(nums, j, 0, list);
        return result;
    }

    public void backtracking(int[] nums, int k, int start, List<Integer> list) {
        if (k < 0) return;
        else if (k == 0)
            result.add(new ArrayList(list));
        else {
            for (int i = start; i < nums.length; i++) {
                list.add(nums[i]);
                backtracking(nums, k - 1, i + 1, list);
                list.remove(list.size() - 1);
            }
        }
    }
}
