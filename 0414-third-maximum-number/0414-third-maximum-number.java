class Solution {
    public int thirdMax(int[] nums) {
        long n1 = Long.MIN_VALUE;
        long n2 = Long.MIN_VALUE;
        long n3 = Long.MIN_VALUE;
        for(int n : nums){
            if(n==n1 || n==n2 || n==n3){
                continue;
            }
            if(n>n1){
                n3=n2;
                n2=n1;
                n1=n;
            }
            else if(n>n2){
                n3=n2;
                n2=n;
            }
            else if(n>n3){
                n3=n;
            }
        }
        return (int) (n3!=Long.MIN_VALUE ? n3:n1);
    }
}