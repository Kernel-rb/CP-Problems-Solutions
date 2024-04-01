var averageValue = function(nums) {
  let nb  = 0 ;
  let len_of_nb = 0 ;
    for (let i = 0 ; i < nums.length ; i++){
        if (nums[i] % 2 === 0 && nums[i] % 3 === 0){
            nb += nums[i] ;
            len_of_nb++ ;
        }
    }
    if (len_of_nb === 0) return 0 ;
    return nb / len_of_nb ;

};