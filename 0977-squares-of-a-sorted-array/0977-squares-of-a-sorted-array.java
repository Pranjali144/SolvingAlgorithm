class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int len = nums.length;
        
        int start = 0;
        int end = len-1;
        int index = len -1;
        
        int result[] = new int[len];
    
        while(start <= end)
        {
            int left = nums[start] * nums[start];
            int right = nums[end] * nums[end];
            
            if(left > right)
            {
                result[index] = left;
                start++;
            }
            else
            {
                result[index] = right;
                end--;
            }
            
            index--;
        }
        
        return result;
    }
}





