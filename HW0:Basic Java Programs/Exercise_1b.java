public class Exercise_1b {
    public static void drawTriangle(int N){
        int i = 1;
        while(i <= N){
            int j = i;
            while(j > 0){
                System.out.print("*");
                j = j - 1;
            }
            i = i + 1;
            System.out.println();
        }
    }
    public static void main(String[] args){
        int N = 10;
        drawTriangle(10);
    }
}