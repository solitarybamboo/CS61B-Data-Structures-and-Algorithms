public class Exercise_1a {
    public static void main(String[] args){
        int i = 1;
        while(i <= 5){
            int j = i;
            while(j > 0){
                System.out.print("*");
                j = j - 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}