def subtractProductAndSum(n: int) -> int:
    l:list[int] = [int(i) for i in str(n) ]
    product:int =1
    for i in l :
        product *= i
    print(product - sum(l))

subtractProductAndSum(234)

# https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/