package Arrayssss;

public class Stocks {
    public static int BuyStockSell(int prices[]){
        int Buyprize=Integer.MAX_VALUE;//Minus Infinity
        int MaxPrize=0;

        //first loop or the array values
        for(int i =0;i<prices.length;i++){
            if(Buyprize<prices[i]){
                int profit= prices[i]-Buyprize;//Today's Profit
                MaxPrize=Math.max(MaxPrize,profit);
            }else{
                Buyprize=prices[i];
            }
        }
        return MaxPrize;
    }
    public static void main(String[]args){
        int prices[]={7,1,5,3,6,4};
        //Price
        //  7 | ●
        //  6 |            ●
        //  5 |      ●
        //  4 |               ●
        //  3 |         ●
        //  2 |
        //  1 |   ●
        //    --------------------------------
        //      0   1   2   3   4   5  (Day)
        System.out.println("The Highest Prize is : "+BuyStockSell(prices));
    }
}
