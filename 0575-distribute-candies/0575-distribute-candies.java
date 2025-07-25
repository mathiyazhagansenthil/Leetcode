class Solution {
    public int distributeCandies(int[] can) {
        int x =1;
        Arrays.sort(can);
        int y=can[0];
        for(int i=1;i<can.length;i++){
            if(y!=can[i]){
                y=can[i];
                x++;
            }
        }
        int n=can.length/2;
        if(x>=n){
            return n;
            
        }
        return x;

    }
}