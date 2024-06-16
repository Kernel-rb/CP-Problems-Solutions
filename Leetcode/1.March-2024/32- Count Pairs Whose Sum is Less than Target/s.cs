public int CountPairs(IList<int> nums, int target) {
    int counter = 0;
    int i , j;
    for(i = 0 ; i < nums.Count ; i++)
    {
        for(j= i+1 ; j <nums.Count ; j++ )
        {
           if(nums[i] + nums[j] < target)
           {
            counter++;
           }
        }
    
    } 
    return counter;       
}