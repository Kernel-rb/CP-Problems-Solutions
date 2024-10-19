import java.util.HashMap;

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder r = new StringBuilder();
        char[] arr = identifier.toCharArray();
       
        HashMap<Character, Character> leetspeak = new HashMap<>();
        leetspeak.put('4', 'a');
        leetspeak.put('3', 'e');
        leetspeak.put('0', 'o');
        leetspeak.put('1', 'l');
        leetspeak.put('7', 't');

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                r.append('_');
                continue; 
            }
            if (arr[i] == '-') {
                i++; 
                if (i < arr.length) {
                    r.append(Character.toUpperCase(arr[i]));
                }
                continue;
            }
            if (leetspeak.containsKey(arr[i])) {
                r.append(leetspeak.get(arr[i]));
                continue; 
            }
            if (Character.isLetter(arr[i])) {
                r.append(arr[i]);
            }
        }
        return r.toString();
    }

}

