package interview;

public class Max_sub_array {

    public  int maxSubArray(int a[]) {
        int maxSoFar = 0,max=a[0];

        int start=0,size=2;
        while(size<a.length)
        {

            for (int i = 0; i < a.length; i++) {
                maxSoFar = 0;
                for (start = i; start < i + size && start < a.length; start++) {
                    maxSoFar += a[start];
                }
                if (maxSoFar > max)
                    max = maxSoFar;
                }
                size++;
            }


        return max;
    }

    public static void main(String[] args)
    {
        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Max_sub_array obj=new Max_sub_array();
        int maxSum = obj.maxSubArray(a);
        System.out.println("Maximum contiguous sum is " + maxSum); // Output: 6
    }
}
