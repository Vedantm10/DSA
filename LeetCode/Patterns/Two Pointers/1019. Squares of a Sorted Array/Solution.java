class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int res[] = new int[n];
        int head=0;
        int tail=n-1;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        for(int pos=n-1;pos>0;pos--){
            if(nums[head] > nums[tail]){
                res[pos]=nums[head];
                head++;
            }else{
                res[pos]=nums[tail];
                tail--;
            }
        }
        return res;

    }
}