class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // sort array
        for (int i = 0; i < nums.length - 1; i++) { // iterate to len - 1 since we are comparing nums[i] + 1
            if(nums[i] == nums[i + 1]) { // if # same to # + 1 then true
                    return true;
            }
        }
        return false;
    } //containsDuplicate
} //Solution