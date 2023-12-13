class Solution {
    public int countKDifference(int[] nums, int k) {
        
        Map<Integer,Integer> hasmap = new HashMap<>();
        
        int count =0;
        
      
        for(int i =0;i<nums.length;i++)
        {
          if(hasmap.containsKey(nums[i]+k))
          {
              count = count + hasmap.get(nums[i]+k);
          }
          if(hasmap.containsKey(nums[i]-k))
          {
             count = count + hasmap.get(nums[i]-k);
          }
            
            hasmap.put(nums[i],hasmap.getOrDefault(nums[i],0)+1);
        }
        
        return count;
    }
}