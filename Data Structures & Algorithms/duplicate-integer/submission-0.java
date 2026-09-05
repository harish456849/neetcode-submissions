
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> table = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            // .add() returns false if the item is already present
            if (!table.add(nums[i])) {
                return true; // Duplicate found!
            }
        }
        
        return false; // No duplicates found
    }
}


/*
       for(int i=0; i<nums.length; i++){
          for(int j=i+1; j<nums.length; j++){
            if(nums[i]==nums[j]){
                return !flag;
            }
          }
       }
       return flag; */