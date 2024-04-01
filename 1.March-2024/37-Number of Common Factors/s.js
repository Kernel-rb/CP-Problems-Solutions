var commonFactors = function(a, b) {
    let nb_common_factors = 0;
    for (let i = 1; i <= 1000 ; i++) {
        if (a % i === 0 && b % i === 0) {
            nb_common_factors++;
        }
    }
    return nb_common_factors; 
};