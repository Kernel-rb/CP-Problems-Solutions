impl Solution 
{
    pub fn check_if_pangram(sentence: String) -> bool 
    {
            let alphabet = "abcdefghijklmnopqrstuvwxyz";
            for char in alphabet.chars() 
            {
                if !sentence.contains(char) 
                {
                    return false;
                }
            }
            return true;
    }
}