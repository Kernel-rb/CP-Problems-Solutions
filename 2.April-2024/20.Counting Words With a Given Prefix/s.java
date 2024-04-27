public int prefixCount(String[] words, String pref) {
    int counter = 0 ;
    int len_pref = pref.length();
    for(int i = 0 ; i < words.length ; i++){
        if(words[i].length() >= len_pref && words[i].substring(0,len_pref).equals(pref) && words[i].startsWith(pref) ){
                counter++;
        }
    }
    return counter;
    
}