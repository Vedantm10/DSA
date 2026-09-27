class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = index.length;
        int[] target = new int[n];

        for (int i = 0; i < n; i++) {

            // Shift elements to the right
            for (int j = n - 1; j > index[i]; j--) {
                target[j] = target[j - 1];
            }

            // Insert the element
            target[index[i]] = nums[i];
        }
        return target;
    }
}