class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int[] ans = new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i] != val){
                ans[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
        return j;
    }
}