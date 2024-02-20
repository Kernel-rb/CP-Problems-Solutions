var commonFactors = function(a, b) {
    let nb = 0;
    for(let i =1 ; i<=1000 ; i++ )
    {
        if ( a % i == 0 & b % i ==0 )
        {
            nb += 1;
        }
    
    }
    return nb 
   
};