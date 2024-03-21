var truncateSentence = function(s, k) {
    let a = s.split(' ');
    return a.slice(0, k).join(' ');  
};