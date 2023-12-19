class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int arr[] = new int[2];
        int len = nums.length;
        Arrays.fill(arr,-1);
        
        int start =0;
        int end =len-1;
        
        int firstOcc =-1;
        int lastOcc = -1;
        
        
        while(start<=end)
        {
            int mid = (end-start/2)+start;
            
            if(nums[mid]<target)
            {
               start = mid+1; 
            }
            else if(nums[mid] > target)
            {
                end = mid-1;
            }
            else
            {
                firstOcc = mid;
                end = mid-1;
            }
        }
        
        start =0;
        end =len-1;
        
        while(start<=end)
        {
            int mid = (end-start/2)+start;
            
            if(nums[mid]<target)
            {
                start = mid+1;
            }
            else if(nums[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                lastOcc = mid;
                start = mid +1;
            }
        }
        
        arr[0] = firstOcc;
        arr[1] = lastOcc;
        
        return arr;
    }
}