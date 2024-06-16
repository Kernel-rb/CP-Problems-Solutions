var countDigits = function(num) {
    let count = 0;
    let numStr = num.toString();
    for (let i = 0; i < numStr.length; i++) {
        if (num % parseInt(numStr[i]) === 0) {
            count++;
        }
    }
    return count;  
};