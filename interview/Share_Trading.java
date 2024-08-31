package interview;

public class Share_Trading
{
    void trade(int a[]) {
        int buy=0,sell=0,profit=0;
        for (int i = 0; i < a.length; i++) {//int a[] = {7, 1, 5, 3, 6, 4};
            for (int j =a.length-1; j>i; j--)
            {
                if ((a[j] - a[i]) > profit)
                {
                    buy=i;
                    sell=j;
                    profit=(a[j] - a[i]);
                }
            }
        }
        System.out.println("\nBuy on day:"+(buy+1)+"  and sell on day:"+(sell+1)+" profit:"+profit);
    }

    public static void main(String args[]) {
        int a[] = {7, 1, 5, 3, 6, 4};
        Share_Trading obj=new Share_Trading();
        obj.trade(a);
    }
}
