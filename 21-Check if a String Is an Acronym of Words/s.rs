impl Solution {
    pub fn is_acronym(words: Vec<String>, s: String) -> bool {
        words.into_iter()
            .flat_map(|string| string.chars().next())
            .eq(s.chars())
    }
}