class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> table = new Hashtable<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (table.containsKey(complement)) {
                return new int[] { table.get(complement), i };
            }
            table.put(nums[i], i);
        }

        return new int[] {}; // return empty if no solution
    }
}



/*class Solution {
    public int[] twoSum(int[] nums, int target) {
      Hashtable<Integer, Integer> table = new Hashtable<>();
      int arr[] = new int[2];
      for(int i=0; i<nums.length; i++){
        table.put(nums[i],i);
      } 
      for(int i=0; i<nums.length; i++){
        int m = target - nums[i];
        if(table.containsKey(m)){
            if(table.get(m)!=i){
                arr[0] = i;
                arr[1] = table.get(m);
                return arr;
            }
            
        }
      } 
      return arr;
    }
}
*/
