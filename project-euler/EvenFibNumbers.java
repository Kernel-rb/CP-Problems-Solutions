public class EvenFibNumbers {
    public static void main(String[] args) throws Exception {
        double n = 4 * Math.pow(10, 6);
        int r = 0; 
        int a = 0; 
        int b = 1;
        while( b  <= n ){
            if(b % 2 == 0 ){
                r += b;
            }
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(r);
    }
}
