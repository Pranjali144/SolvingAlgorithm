//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    
		    Complete obj = new Complete();
		    long res = obj.calculate(arr, sizeOfArray);
		    System.out.println(res);
		}
	}
}





// } Driver Code Ends


//User function Template for Java


class Complete{
    
   
    // Function for finding maximum and value pair
    public static long calculate (int arr[], int n) {
        int count = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int currentElement = arr[i];

            // Check if the XOR of the current element with any previous element is zero
            if (frequencyMap.containsKey(currentElement)) {
                count += frequencyMap.get(currentElement);
            }

            // Update the frequency of the current element in the HashMap
            frequencyMap.put(currentElement, frequencyMap.getOrDefault(currentElement, 0) + 1);
        }
        
        return count;

    }
    
    
}


