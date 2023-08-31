class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int len=nums.length-1;
        while(s<=len){
          int mid=s+(len-s)/2;
          if(nums[mid]==target){
            return mid;
          }
          else if(nums[mid]<target){
            s=mid+1;
          }
          else{
            len=mid-1;
          }
        }
        return -1;
        
    }
}