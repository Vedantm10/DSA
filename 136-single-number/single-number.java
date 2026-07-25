class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int number = nums[i];
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[j] == number) {
                    count++;
                }
            }

            if (count == 1) {
                return number;
            }
        }

        return -1;
    }
}