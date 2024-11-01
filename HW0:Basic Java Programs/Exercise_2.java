public class Exercise_2 {
    public static int max(int[] m) {
        int length = m.length;
        int i = 0, max_num = m[0];
        while(i < length){
            if(m[i] > max_num){
                max_num = m[i];
            }
            i = i + 1;
        }
        return max_num;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}