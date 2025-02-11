class Solution {
    public void reverseString(char[] s) {
        	ArrayList<Character> List = new ArrayList<>();
		for(int i=s.length-1;i>=0;i--){
		    List.add(s[i]);
		}
		for(int i=0;i<s.length;i++){
            s[i]=List.get(i);
        }
        
    }
}