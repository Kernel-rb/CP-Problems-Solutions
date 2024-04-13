pub fn flip_and_invert_image(mut image: Vec<Vec<i32>>) -> Vec<Vec<i32>> {
        for i in 0..image.len() {
            image[i] = image[i].iter().rev().map(|&x| 1 - x).collect();
        }
        image
    }

