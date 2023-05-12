import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int num1 = nums[0];
        int num2 = nums[0];
        int count1 = 1;
        int count2 = 0;
        for (int i = 1; i < nums.length; i++) {
            if (num1 == nums[i])
                count1++;
            else if (num2 == nums[i])
                count2++;
            else if (count1 > 0 && count2 > 0) {
                count1--;
                count2--;
            } else if (count1 == 0) {
                num1 = nums[i];
                count1 = 1;
            } else {
                num2 = nums[i];
                count2 = 1;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; i++) {
            if (num1 == nums[i])
                count1++;
            else if (num2 == nums[i])
                count2++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if (count1 > n / 3)
            ans.add(num1);
        if (count2 > n / 3)
            ans.add(num2);
        return ans;
    }

}