class Solution {

    /**
     * @param Integer $num1
     * @param Integer $num2
     * @return Integer
     */
    function countOperations($n1, $n2) 
    {
        $count = 0;
        while($n1 > 0 and $n2 > 0)
        {
            if($n1 > $n2)
            {
                $n1 -= $n2;
                $count += 1;
            }
            else{
                $n2 -= $n1;
                $count += 1;
            }
        }
        return $count;
    }
}