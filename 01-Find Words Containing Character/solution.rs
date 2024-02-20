impl Solution {
    pub fn find_words_containing(words: Vec<String>, x: char) -> Vec<i32> {
        let mut arr =  Vec::new();
        let mut index  = 0;
        for i in words{
            if i.contains(x){
                arr.push(index)
            }
            index += 1;
        }
        arr
    }
}