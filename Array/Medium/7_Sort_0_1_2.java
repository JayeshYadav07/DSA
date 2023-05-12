// https://leetcode.com/problems/sort-colors/
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int curr = 0;
        while (curr <= high) {
            if (nums[curr] == 0) {
                int temp = nums[curr];
                nums[curr] = nums[low];
                nums[low] = temp;
                curr++;
                low++;
            } else if (nums[curr] == 1) {
                curr++;
            } else {
                int temp = nums[curr];
                nums[curr] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}