pub fn minimum_cost( cost: Vec<i32>) -> i32 {
    let mut sorted_cost = cost.clone();
    sorted_cost.sort_by(|a, b| b.cmp(a)); // Sort the costs in descending order

    let mut total_cost = 0;
    for (index, &candy_cost) in sorted_cost.iter().enumerate() {
        if index % 3 != 2 { // Every three candies, one is free
            total_cost += candy_cost;
        }
    }
    total_cost
}