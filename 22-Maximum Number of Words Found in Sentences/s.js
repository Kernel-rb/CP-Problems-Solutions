/**
 * @param {string[]} sentences
 * @return {number}
 */
var mostWordsFound = function (sentences) {
    var count = 0
    const split = sentences.map(sentence => sentence.split(' '));
    for (let i = 0; i < split.length; i++) {
        
            if (split[i].length > count) {
                count = split[i].length
            }
    }
   
    return count

};