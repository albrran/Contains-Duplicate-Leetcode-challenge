class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>(); // initialize hashset

        for(int i = 0; i < nums.length; i++) { 
            if(uniques.contains(nums[i])) { // if exists, we want to return true
                return true;
            }
            uniques.add(nums[i]); // doesnt exist, keep adding elem 
        }
        return false; 
    } // containsDuplicate
} // solution