pub fn count_negatives(grid: Vec<Vec<i32>>) -> i32 {
    let mut counter: i32 = 0;
        for i in &grid {
            let mut start: i32 = 0;
            let mut end: i32 = (i.len() - 1) as i32;
            while start <= end {
                let midd: i32 = (start + end) / 2;
                if id[midd as usize] < 0 {
                    counter += end - midd + 1;
                    end = midd - 1;
                } else {
                    start = midd + 1;
                }
            }
        }
    counter
}

