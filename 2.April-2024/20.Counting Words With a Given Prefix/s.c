int prefixCount(char** words, int wordsSize, char* pref) {
    int count = 0;
    int len_pref = strlen(pref);
    for (int i = 0; i < wordsSize; i++) {
        if ( len_pref <= strlen(words[i]) && strncmp(words[i], pref, len_pref) == 0  ) {
            count++;
        }
    }
    return count;
}