/*
 * PPCM(a,b) =  |a * b| / PGCD(a,b)
 */

 public class SmallestMultiple {
    public static void main(String[] args) {
        long r = 1L; 
        for (int i = 1; i <= 20; i++) {
            r = PPCM(r, i); 
        }
        System.out.println(r); 
    }

    public static long PPCM(long a, int b) {
        return (a * b) / PGCD(a, b); 
    }

    public static int PGCD(long a, int b) {
            while (b != 0) {
                int r = (int) (a % b);
                a = b;
                b = r;
            }
            return (int) a;
    }
}

