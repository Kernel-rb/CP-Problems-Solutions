pub fn cal_points(ops: Vec<String>) -> i32 {
    let mut record: Vec<i32> = Vec::new();
    for i in ops {
        if i == "C" {
            record.pop();
        } else if i == "D" {
            record.push(record.last().unwrap() * 2);
        } else if i == "+" {
            let last = record.len() - 1;
            let second_last = record.len() - 2;
            record.push(record[last] + record[second_last]);
        } else {
            record.push(i.parse::<i32>().unwrap());
        }
    }
    return record.iter().sum::<i32>();
}