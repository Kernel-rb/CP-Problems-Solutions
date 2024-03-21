var selfDividingNumbers = function(left, right) {
  let a = [];  
    for (let i = left; i <= right; i++) {
        let s = i.toString();
        let isDivide = true;
        for (let j = 0; j < s.length; j++) {
            if (i % parseInt(s[j]) !== 0) {
                isDivide = false;
                break;
            }
        }
        if (isDivide) {
            a.push(i);
        }
    }
    return a;
};