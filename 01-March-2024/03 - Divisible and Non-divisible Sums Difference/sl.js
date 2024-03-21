var differenceOfSums = function (n , m) {
    let num1 = 0;
    let num2 = 0;
    const range = [1, n + 1];
    for (let i = 0 ; i <= n; i++){
        if(i % m != 0){
            num1 += i
        } else {
            num2 += i
        }
    }
    console.log(num1 - num2)
};

differenceOfSums(10,3)