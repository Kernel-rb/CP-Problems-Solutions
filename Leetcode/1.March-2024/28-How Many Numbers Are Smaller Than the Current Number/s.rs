pub fn smaller_numbers_than_current(nums: Vec<i32>) -> Vec<i32> {
            let mut a:Vec<i32> = Vec::new();   
            for i in 0..nums.len()
            {
                let mut counter:i32 = 0 ; 
                for j in 0..nums.len()
                {
                        if nums[i] > nums[j]
                        {
                                counter += 1 ;
                        }
                }
                a.push(counter);
            }

            return a; 

}