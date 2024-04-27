/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numbers, target) {
    let n = numbers.length;
    let f_pointer = 0 ;
    let l_pointer = n - 1 ;
    while(f_pointer < l_pointer){
        if(numbers[f_pointer] + numbers[l_pointer] == target ){
            return [f_pointer +1  , l_pointer+ 1]
        }else if(numbers[f_pointer] + numbers[l_pointer] < target ){
            f_pointer++;
        }else{
            l_pointer--;
        }
    }
    return [];
};
