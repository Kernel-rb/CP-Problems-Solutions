# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head):
        if not head  : 
            return None
        s = head
        f =  head
        while True: 
            if not f or not f.next : 
                return None
            s = s.next
            f = f.next.next
            if s == f : 
                break
        f = head
        while f != s :
            f = f.next
            s = s.next
        return f