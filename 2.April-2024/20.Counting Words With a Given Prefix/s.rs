pub fn prefix_count(words: Vec<String>, pref: String) -> i32 {
       let mut counter:i32 = 0 ;
       let len_pref = pref.len();
       for i in words.iter(){
           if i.len() >= len_pref && i[0..len_pref] == pref {
              if(i.starts_with(&pref)){
                  counter += 1;
              }
           }
       } 
         counter
}