public class Main {
  public static void main(String[] args){
    char[] letters = {'x', 'x' , 'y','y'};
    char r = nextGreatestLetter(letters , 'z');
    System.out.println(r);
  }
  public static char nextGreatestLetter(char[] letters, char target) 
  {
    int start = 0; 
    int end = letters.length - 1 ;
    while(start <= end){
      int midd = start + (end - start) / 2;
      if(letters[midd] <= target){
        start = midd + 1;
      }else{
        end = midd - 1;
      }
    }
    return (start <= letters.length - 1 ) ? letters[start] : letters[0]; 
  }
}
