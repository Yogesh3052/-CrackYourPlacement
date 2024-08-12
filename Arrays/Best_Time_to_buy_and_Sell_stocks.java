class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        int maxprofit=0;
        for(int price:prices){
            if(price<min){
                min=price;
            }
            profit=price-min;
            if(maxprofit<profit){
                maxprofit=profit;
            }
        }
        return maxprofit;
    }
}