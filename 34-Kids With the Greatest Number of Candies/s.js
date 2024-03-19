var kidsWithCandies = function(candies, extraCandies) {
    let a =  [];
    let max = Math.max(...candies);
    for(let i = 0; i < candies.length; i++){
        if(candies[i] + extraCandies >= max){
            a.push(true);
        }else{
            a.push(false);
        }
    }
    return a;
};