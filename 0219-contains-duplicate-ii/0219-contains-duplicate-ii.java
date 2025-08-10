class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> seen = new HashMap<>();
        for(int i=0;i<n;i++){
            int t = nums[i];
            if(seen.containsKey(t) && i-seen.get(t)<=k){
                return true;
            }
            seen.put(nums[i],i);
        }
        return false;
    }
}