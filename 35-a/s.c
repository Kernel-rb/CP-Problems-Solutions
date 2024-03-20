char* restoreString(char* s, int* indices, int indicesSize) {
    int i;
    char* res = (char*)malloc(sizeof(char) * (indicesSize + 1));
    for (i = 0; i < indicesSize; i++) {
        res[indices[i]] = s[i];
    }
    res[indicesSize] = '\0';
    return res;
    
}