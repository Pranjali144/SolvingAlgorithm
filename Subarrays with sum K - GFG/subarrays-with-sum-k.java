//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int k = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.findSubArraySum(Arr, N, k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int findSubArraySum(int nums[], int N, int k)
    {
        int count = 0;
        int cumulativeSum = 0;

        // HashMap to store the count of each cumulative sum
        Map<Integer, Integer> cumulativeSumMap = new HashMap<>();
        cumulativeSumMap.put(0, 1); // Initialize with 0 to account for subarrays starting from index 0

        // Iterate through the array
        for (int num : nums) {
            cumulativeSum += num;

            // Check if (cumulativeSum - k) exists in the cumulativeSumMap
            if (cumulativeSumMap.containsKey(cumulativeSum - k)) {
                count += cumulativeSumMap.get(cumulativeSum - k);
            }

            // Update the count of the current cumulativeSum in the map
            cumulativeSumMap.put(cumulativeSum, cumulativeSumMap.getOrDefault(cumulativeSum, 0) + 1);
        }

        return count;
    }
}