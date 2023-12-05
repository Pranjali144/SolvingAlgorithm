class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> charFreq = new HashMap<>();
        
        int index = -1;
        
        for(int i =0;i<s.length();i++)
        {
          charFreq.put(s.charAt(i), charFreq.getOrDefault(s.charAt(i),0)+1);
        }
        
        for(int i =0;i<s.length();i++)
        {
            int freq = charFreq.get(s.charAt(i));
            
           if(charFreq.containsKey(s.charAt(i)) && freq == 1 )
           {
               index = i;
               return index;
           }
        }
        
        return index;
    }
}