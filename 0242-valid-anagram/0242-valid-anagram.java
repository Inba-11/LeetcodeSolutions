class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()){
        return false;
       }
       Map<Character, Integer> M1 = new HashMap<>();
       Map<Character, Integer> M2 = new HashMap<>();
       for(char c:s.toCharArray()){
        M1.put(c,M1.getOrDefault(c,0)+1);
       }
       for(char c:t.toCharArray()){
        M2.put(c,M2.getOrDefault(c,0)+1);
       }
       return M1.equals(M2);
        }
    }
