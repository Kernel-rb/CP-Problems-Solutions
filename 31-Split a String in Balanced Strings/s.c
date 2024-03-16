int balancedStringSplit(char* s) {
 int i , n_R = 0 , n_L = 0 , n = 0;
    for(i = 0 ; i < strlen(s) ; a++){
        if(s[i] == 'R'){
            n_R++;
        }
        else{
            n_L++;
        }
        if(n_R == n_L){
            n++;
            n_R = 0;
            n_L = 0;
        }
    }
    return n;   
}