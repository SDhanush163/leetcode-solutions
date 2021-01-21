package Easy;

public class No88_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        m--;
        n--;
        while (m >=0 && n >= 0) {
            if (nums1[m] > nums2[n])
                nums1[i--] = nums1[m--];
            else
                nums1[i--] = nums2[n--];
        }
        // When nums1 has no elements
        while (n >=0)
            nums1[i--] = nums2[n--];
    }
}
