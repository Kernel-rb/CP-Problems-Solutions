import java.util.HashMap;
public int romanToInt(String s) {
    HashMap<Character, Integer> roman_to_int = new HashMap<>();
    roman_to_int.put('I', 1);
    roman_to_int.put('V', 5);
    roman_to_int.put('X', 10);
    roman_to_int.put('L', 50);
    roman_to_int.put('C', 100);
    roman_to_int.put('D', 500);
    roman_to_int.put('M', 1000);
    int counter = 0 ;
    for(int i = 0 ; i  < s.length() ;i++){
        if( i < s.length() - 1 && roman_to_int.get(s.charAt(i)) < roman_to_int.get(s.charAt(i+1))){
            counter -= roman_to_int.get(s.charAt(i));
        }else{
            counter += roman_to_int.get(s.charAt(i));
        }
    }
    return counter;
}