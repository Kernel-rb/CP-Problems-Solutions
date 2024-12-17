import java.util.*;

public class  L {
    public static void main (String[] argv ){
        List<Integer> l1 = List.of(1,2 , 3 , 3 , 3 , 4 , 7 , 99 , 0 , 0 );
        List<Integer> l2 = new ArrayList<Integer>();
        copieEl(l1 , l2);
        System.out.println(l2);
    }   
    // time = O(n) , space  = O(n) 
    public static List<Integer> copieEl(List<Integer> l1 , List<Integer> l2){
        HashSet<Integer> s  = new HashSet<Integer>();
        for(int i : l1){
            s.add(i);
        }
        for(int i : s ){
            l2.add(i);
        }
        return l2;
    }

}

