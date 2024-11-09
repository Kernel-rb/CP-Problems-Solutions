impl Solution {
    fn binary_search(matrix: &Vec<Vec<i32>>, r: usize, c_start: usize, c_end: usize, target: i32) -> bool {
        let mut c_start = c_start;
        let mut c_end = c_end;
        
        while c_start <= c_end {
            let mid = c_start + (c_end - c_start) / 2;
            if matrix[r][mid] == target {
                return true;
            }
            if matrix[r][mid] < target {
                c_start = mid + 1;
            } else {
                if mid == 0 {
                    break;
                }
                c_end = mid - 1;
            }
        }
        false
    }

    pub fn search_matrix(matrix: Vec<Vec<i32>>, target: i32) -> bool {
        if matrix.is_empty() {
            return false;
        }
        
        let r = matrix.len();
        let c = matrix[0].len();
        
        if r == 1 {
            return Self::binary_search(&matrix, 0, 0, c - 1, target);
        }
        
        let mut r_start = 0;
        let mut r_end = r - 1;
        
        while r_start <= r_end {
            let mid = r_start + (r_end - r_start) / 2;
            if matrix[mid][0] <= target && matrix[mid][c-1] >= target {
                return Self::binary_search(&matrix, mid, 0, c - 1, target);
            }
            if matrix[mid][0] > target {
                if mid == 0 {
                    break;
                }
                r_end = mid - 1;
            } else {
                r_start = mid + 1;
            }
        }
        false
    }
}