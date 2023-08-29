class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[n*2];
        int right=n;
        for(int i=0;i<n;i++){
            res[i*2]=nums[i];
            res[i*2+1]=nums[right++];
        }
        return res;
    }
}