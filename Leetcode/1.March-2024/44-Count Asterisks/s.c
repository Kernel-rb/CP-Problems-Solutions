#include <stdbool.h>

int countAsterisks(char* s) {
    int i = 0;
    int count = 0;
    bool odd = false;
    while (s[i] != '\0') {
        if (s[i] == '|') {
            odd = !odd;
        }
        if (s[i] == '*' && !odd) {
            count++;
        }
        i++;
    }
    return count;
}
