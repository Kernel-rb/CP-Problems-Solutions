int countAsterisks(char* s) {
    int i=0;
    int count = 0;
    bool isOdd = false;
    while(s[i]!='\0')
    {
        if(s[i] == '|')
        {
            if(!isOdd)
                isOdd = true;
            else
                isOdd = false;
        }
        if(s[i] == '*')
        {
            if(!isOdd)
                count++;
        }
        i++;
    }
    return count;
}