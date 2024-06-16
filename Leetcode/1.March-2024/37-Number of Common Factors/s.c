int commonFactors(int a, int b) {
    int nb_common_factors = 0 ;
    int i ;
    for (i = 1;  i <= 1000 ; i++){
        if(a % i == 0 &&  b % i == 0 )
        {
            nb_common_factors++;
        }
    }   
    return nb_common_factors;
}