public class TwoSum01 {

    public int[] twoSum(int[] nums, int target) {
        HashMap < Integer , Integer > hm = new HashMap < Integer , Integer > () ;
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int t=target-nums[i]; 
            if(hm.containsKey(t)&&hm.get(t)!=i)return new int[] {hm.get(t) ,i};
        }
        return new int[] {-1,-1};
    }

}