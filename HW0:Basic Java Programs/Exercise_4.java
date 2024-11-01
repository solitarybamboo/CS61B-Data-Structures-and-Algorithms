public class Exercise_4 {
    public static void windowPosSum(int[] a, int n) {
        for(int i = 0; i < a.length; i += 1){
            if(a[i] > 0){
                for(int j = 1; j <= n; j ++){
                    if(i + j >= a.length){
                        break;
                    }
                    a[i] += a[i + j];
                }
            } else{
                continue;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}