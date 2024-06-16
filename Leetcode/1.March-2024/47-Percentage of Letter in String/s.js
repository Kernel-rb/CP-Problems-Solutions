/**
 * @param {string} s
 * @param {character} letter
 * @return {number}
 */
var percentageLetter = function(s, letter) {
  let counter = 0 ;
  const n = s.length;
  for(let i = 0 ; i < n ; i++){
        if(s[i] === letter){
            counter++;
        }
    }
    return (counter/n)*100;  
};