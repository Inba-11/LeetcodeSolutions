class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList <Integer> List = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            List.add(nums[i]);
        }
        ArrayList <Integer> UniqueList = new ArrayList <Integer>();
        for(int i=0;i<List.size();i++){
            if(i==0||List.get(i)!=List.get(i-1)){
                UniqueList.add(List.get(i));
            }
        }
        for(int i=0;i<UniqueList.size();i++){
            nums[i]=UniqueList.get(i);
        }
        return UniqueList.size();
    }
}