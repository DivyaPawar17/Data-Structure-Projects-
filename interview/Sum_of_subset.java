package interview;

public class Sum_of_subset {
    boolean sum_check(int a[], int target) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] + a[j]) == target) {
                    System.out.println("(" + a[i] + "," + a[j] + ")");
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static void main(String args[]) {
        int a[] = {1, 4, 5, 6, 8}, target = 9;
        Sum_of_subset obj = new Sum_of_subset();
        System.out.println("Target:" + target + " exists in array:" + obj.sum_check(a, target));
    }
}
