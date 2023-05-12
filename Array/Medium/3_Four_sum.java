import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int t) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0;
        while (i < n - 3) {
            if (i == 0 || (nums[i] != nums[i - 1])) {
                int j = i + 1;
                long target0 = t - nums[i];
                while (j < n - 2) {
                    if (j == i + 1 || (nums[j] != nums[j - 1])) {
                        int low = j + 1, high = n - 1;
                        long target = target0 - nums[j];
                        while (low < high) {
                            long sum = nums[low] + nums[high];
                            if (sum == target) {
                                ArrayList<Integer> temp = new ArrayList<>();
                                temp.add(nums[i]);
                                temp.add(nums[j]);
                                temp.add(nums[low]);
                                temp.add(nums[high]);
                                ans.add(temp);
                                low++;
                                high--;
                                while (low < high && nums[low] == nums[low - 1])
                                    low++;
                                while (low < high && nums[high] == nums[high + 1])
                                    high--;
                            } else if (sum > target) {
                                high--;
                            } else {
                                low++;
                            }

                        }
                    }
                    j++;
                }
            }
            i++;
        }
        return ans;
    }
}