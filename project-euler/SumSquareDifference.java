public class SumSquareDifference {
    public static void main(String[] args) {
        int r = squareOfSum() - sumOfSquare();
        System.out.println(r);
    }

    public static int squareOfSum(){
        int r = 0;
        for(int i =  1 ; i < 101 ; i++){
            r += i;
        }
        return (int) Math.pow(r, 2);
    }

    public static int sumOfSquare(){
        double r = 0;
        for(int i =  1 ; i < 101 ; i++){
            r += Math.pow(i, 2);
        }
        return (int)r;
    }
    
}
