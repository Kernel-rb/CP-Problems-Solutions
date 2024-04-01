impl Solution {
    pub fn average_value(nums: Vec<i32>) -> i32 {
        let mut nb:i32 = 0 ;
        let mut len_of_nb:i32= 0;
        let mut resultat:i32 = 0;
        for i in 0..nums.len(){
            if nums[i] % 6 == 0 {
                nb += nums[i];
                len_of_nb += 1;
            }
        }

        if len_of_nb == 0 {
            return resultat;
        }else{
            resultat += nb / len_of_nb ;
            return resultat;
        }
    }   
}