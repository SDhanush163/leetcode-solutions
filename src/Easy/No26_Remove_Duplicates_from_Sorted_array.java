package Easy;

public class No26_Remove_Duplicates_from_Sorted_array {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != nums[j]) {
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
