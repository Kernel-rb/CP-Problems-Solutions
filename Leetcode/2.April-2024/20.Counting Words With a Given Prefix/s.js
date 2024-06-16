/**
 * @param {string[]} words
 * @param {string} pref
 * @return {number}
 */
var prefixCount = function(words, pref) {
    let counter = 0 ;
    let len_pref = pref.length;
    for(let i = 0 ; i < words.length ; i++){
        if(words[i].length>= len_pref && words[i].substring(0,len_pref) === pref  && words[i].startsWith(pref)){
            counter++;
        }
    }
    return counter;
};