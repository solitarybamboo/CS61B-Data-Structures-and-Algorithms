public class Exercise_1_1_2 {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            int sum = 0;
            for(int i = 0; i <= x; i += 1){
                sum += i;
            }
            System.out.print(sum + " ");
            x = x + 1;
        }
    }
}