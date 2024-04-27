impl Solution {
    pub fn detect_capital_use(word: String) -> bool {
        if word == word.to_uppercase() || word == word.to_lowercase() {
            return true;
        }
        if word.chars().next().unwrap().is_uppercase() &&
            word.chars().skip(1).all(|c| c.is_lowercase()) {
            return true;
        }
        false
    }
}
