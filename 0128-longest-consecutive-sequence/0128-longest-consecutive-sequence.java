class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;
        
        Set<Integer> set = new HashSet<>();
        
        int max = 0;
        
        for(int i =0;i<n;i++)
        {
          set.add(nums[i]);
        }
        
        for(int i =0;i<n;i++)
        {
            int length = 1;
            
            if(set.contains(nums[i]-1))
            {
              continue;
            }
            
            {
                int num = nums[i];
                while(set.contains(num+1))
                {
                  num = num +1;
                  length++;
                }
                
                if(length > max)
                {
                  max = length;
                }
            }
        }
        
        return max;
    }
}