pub fn final_string(s: String) -> String {
  let mut a:String = String::new();
  for i in s.chars()
  {
    if i != 'i'
    {
      a.push(i);
    }else{
      a = a.chars().rev().collect::<String>();
    }
  }
  return a; 
}