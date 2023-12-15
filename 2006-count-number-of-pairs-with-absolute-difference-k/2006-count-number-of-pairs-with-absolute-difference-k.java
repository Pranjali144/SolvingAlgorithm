import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> hasmap = new HashMap<>();
        int count = 0;

        // Populate the hashmap with the frequency of each element
        for (int num : nums) {
            hasmap.put(num, hasmap.getOrDefault(num, 0) + 1);
        }

        // Iterate through the hashmap to count pairs with absolute difference k
        for (int num : hasmap.keySet()) {
            int target1 = num + k;

            // Handle the case where k is equal to 0 separately
            if (k == 0) {
                // Count pairs where the frequency of an element is greater than or equal to 2
                if (hasmap.get(num) >= 2) {
                    count++;
                }
            } else {
                // Check if target1 exists in the hashmap
                if (hasmap.containsKey(target1)) {
                    // If yes, increment the count by the product of frequencies
                    count += hasmap.get(num) * hasmap.get(target1);
                }
            }
        }

        return count;
    }
}
