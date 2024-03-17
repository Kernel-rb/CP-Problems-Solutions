#include <string.h> 

int finalValueAfterOperations(char** operations, int operationsSize) {
    int x = 0;
    int i ;
    for(i = 0 ; i < operationsSize ; i++)
    {
        if(strcmp(operations[i], "--X") == 0 || strcmp(operations[i], "X--") == 0) 
        {
            x -= 1;
        }else{  
            x++;
        }
    }   
    return x;
}