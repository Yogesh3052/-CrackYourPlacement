class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int begsum=0;
        int endsum=0;
        int end=n-1;
        int sum=0;
        int max=0;
        for(int i=0;i<k;i++){
            begsum+=cardPoints[i];
        }
        sum=begsum+endsum;
        max=sum;
        for(int i=k-1;i>=0;i--){
            begsum-=cardPoints[i];
            endsum+=cardPoints[end];
            sum=begsum+endsum;
            max=Math.max(sum,max);
            end--;
        }
        return max;
    }
}