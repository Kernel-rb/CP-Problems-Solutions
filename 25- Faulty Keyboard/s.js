var finalString = function(s) {
    const arr = []

    for(let x of s){
        if(x === 'i'){
            arr.reverse()
        }else{
            arr.push(x)
        }
    }
    
    return arr.join('')
};