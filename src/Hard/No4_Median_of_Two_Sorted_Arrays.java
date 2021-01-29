package Hard;

public class No4_Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int[] merged = new int[totalLength];
        merge(nums1, nums2, totalLength, merged);
        double sum;
        if (totalLength % 2 == 0)
            sum = ((double) merged[(totalLength / 2) - 1] + (double) merged[totalLength / 2]) / 2;
        else
            sum = merged[totalLength / 2];
        return sum;
    }

    private void merge(int[] nums1, int[] nums2, int totalLength, int[] merged) {
        int j = 0, k = 0;
        for(int i = 0; i < totalLength; i++) {
            if (j > nums1.length - 1)
                merged[i] = nums2[k++];
            else if (k > nums2.length - 1)
                merged[i] = nums1[j++];
            else {
                if (nums1[j] > nums2[k])
                    merged[i] = nums2[k++];
                else
                    merged[i] = nums1[j++];
            }
        }
    }
}
