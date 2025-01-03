void reverseString(char* s, int sSize) {
    int n = sSize;
    int f_ptr = 0;
    int l_ptr = n-1;
    while(f_ptr < l_ptr){
        char temp = s[f_ptr];
        s[f_ptr] = s[l_ptr];
        s[l_ptr] = temp;
        f_ptr++;
        l_ptr--;
    }
}