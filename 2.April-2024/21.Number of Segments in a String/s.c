int countSegments(char* s) {
    int counter = 0 ;
    for(int i = 0 ; s[i] ; i++){
        if(s[i] != ' ' && (i == 0 || s[i-1] == ' ')){
            counter++ ;
        }
    }
    return counter ;   
}