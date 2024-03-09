void reverse_str( char* s , int i , int j ){
  for( char el ; i < j ; i++ , j-- )
  {
    el = s[i];
    s[i] = s[j];
    s[j]  = el;
  }
}

char* finalString(char* s) {
  char* a = "";
  int i , j; 
  for(i = 0 ; i < strlen(s) ; i++)
  {
    if( i != 'i')
    {
      a += i;   
    }else{
      reverse_str(a , 0, strlen(s) - 1);
    }
  }
  return a; 
}