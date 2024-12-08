// link : https://projecteuler.net/problem=1
public class MultiplesFiveOrThree {
    public static void main(String[] args) {
        int r = 0; 
        for(int i = 1 ; i < 1000 ; i++){
            if(i  % 3 == 0 || i % 5 == 0) r +=i;
        }
        System.out.println(r);
    }
}