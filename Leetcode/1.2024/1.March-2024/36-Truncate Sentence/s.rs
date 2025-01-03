pub fn truncate_sentence(s: String, k: i32) -> String {
    let mut a:String =  String::new();
    let mut count = 0;
    for i in s.chars(){
        if i == ' '{
            count += 1;
        }
        if count == k{
            break;
        }
        a.push(i);
    }
    return a;
}