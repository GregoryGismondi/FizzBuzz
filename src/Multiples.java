public class Multiples {
    public static void main(String[] args) {
        int multiple = 0;
        for (int i = 1; i < 1001; i++){
            if (i % 5 == 0 || i % 3 == 0){
                multiple++;
            }
        }
        System.out.println(multiple);
    }
}
