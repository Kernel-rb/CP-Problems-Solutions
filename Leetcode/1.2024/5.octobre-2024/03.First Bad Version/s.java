public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n ;
        while(l <= r)
        {
            int midd =l + (r - l) / 2;
            if(isBadVersion(midd))
            {
                r = midd - 1 ;
            }else if(!isBadVersion(midd)){
                l = midd + 1;
            }
        }
        return l;
    }
}