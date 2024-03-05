var isAcronym = function(words, s) {
    return s === words.map((str) => str[0]).join("")
};