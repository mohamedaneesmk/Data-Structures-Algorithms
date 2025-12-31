public class TwoSortedArraysMedianOptimized {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int total = n + m;
        int mid = total / 2;

        int i = 0, j = 0, count = 0;
        int curr = 0, prev = 0;

        while (count <= mid) {
            prev = curr;
            if (i < n && (j >= m || nums1[i] <= nums2[j]))
                curr = nums1[i++];
            else
                curr = nums2[j++];
            count++;
        }

        return total % 2 == 0 ? (prev + curr) / 2.00 : curr;

    }
}
