function premier_occurence(nums , target){
    let res = -1;
    let start = 0;
    let end = nums.length - 1;
    while(start <= end){
        let mid = Math.floor((start + end) / 2);
        if(nums[mid] === target){
            res = mid;
            end = mid - 1;
        }else if(nums[mid] < target){
            start = mid + 1;
        }else{
            end = mid - 1;
        }
    }
    return res;
}

console.log(premier_occurence([1,2,2,2,2,3,4,5,6,7,8,9,10], 2)); // 1