int averageValue(int* nums, int numsSize) {
    int nb = 0 ;
    int len_of_nb = 0 ;
    int i ;
    int resultat = 0; 
    for(i= 0 ; i < numsSize ; i++){
        if( nums[i] % 6 == 0 ){
            nb += nums[i] ;
            len_of_nb++;
        }
    }
    if( len_of_nb == 0 ){
        resultat;
    }else{
        resultat += nb/len_of_nb;
    }
    return resultat;
}