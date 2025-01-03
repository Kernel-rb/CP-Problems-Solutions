/**
 * @param {number[]} prices
 * @param {number} money
 * @return {number}
 */
var buyChoco = function(prices, money) {
    prices.sort((a , b) => a - b );
    const paires = []
    for(let i = 0 ; i < prices.length ; i++ ){
        for(let j = i + 1 ; j < prices.length ; j++){
            let  a = prices[i] + prices[j];
            if(a <= money){
                paires.push(a);
            }  
        }
    }
    
    if(paires.length ===  0 ){
        return money
    }else{
        let min = Math.min(...paires);
        return money - min;
    }
};