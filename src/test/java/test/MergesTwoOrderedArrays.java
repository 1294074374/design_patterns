package test;

/**
 * @author laijunlin
 * @date 2021-03-07 11:04
 */
public class MergesTwoOrderedArrays {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 12, 55, 56, 71, 81};
        int[] b = {2, 12, 13, 19, 32, 55, 57, 100};
        merge2(a, a.length, b, b.length);
        //for (int i = 0; i < a.length; i++) {
        //    System.out.print(a[i] + " ");
        //}
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = nums1.length - 1;
         m = m-1;
        n = n-1;
        while (m >= 0 && n  >= 0) {
            if (nums1[m ] < nums2[n]) {
                nums1[k] = nums2[n];
                n--;
                k--;
            } else {
                nums1[k] = nums1[m];
                m--;
                k--;
            }
        }

        while (m < 0 && n >= 0) {
            nums1[k] = nums2[n];
            n--;
            k--;
        }
        while (n < 0 && m  >= 0) {
            nums1[k] = nums1[m];
            m--;
            k--;
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        int k = result.length-1;
        m = m-1;
        n = n-1;
        while(m>= 0 && n>=0){
            if(nums1[m] < nums2[n]){
                result[k] = nums2[n];
                n--;
                k--;
            }else{
                result[k] = nums1[m];
                m--;
                k--;
            }
        }

        while (m<0 && n>=0){
            result[k] = nums2[n];
            n--;
            k--;
        }

        while (n<0 && m>=0){
            result[k] = nums1[m];
            m--;
            k--;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

