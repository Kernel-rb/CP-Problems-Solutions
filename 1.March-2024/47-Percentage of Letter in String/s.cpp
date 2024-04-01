class Solution {
public:
    int percentageLetter(string s, char letter) {
        int counter = 0 ;
        int i = 0 ;
        while(s[i] != '\0')
        {
            if(s[i] == letter ){
                counter++;
            }
        i++;
        }
        return (counter * 100) / i;
    }
};