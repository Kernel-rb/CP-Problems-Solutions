pub fn added_integer(mut nums1: Vec<i32>, mut nums2: Vec<i32>) -> i32 {
    nums1.sort();
    nums2.sort();
    for i in 0..nums1.len() {
        return nums2[i] - nums1[i];
    }
    return 0;
}