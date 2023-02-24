import java.util.HashMap;
import java.util.Map;


public class TwoSum1 {

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

    public static void main(String[] args) {
        TwoSum1 ts = new TwoSum1();

        System.out.println(ts.twoSum(new int[]{2, 7, 11, 15}, 9));
        System.out.println(ts.twoSum(new int[]{1, 2, 3}, 5));
    }

}