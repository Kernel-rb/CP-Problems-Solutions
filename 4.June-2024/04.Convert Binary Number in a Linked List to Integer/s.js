/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {number}
 */
var getDecimalValue = function(head) {
    let length = 0;
    let temp = head; 
    while(temp){
        length++;
        temp = temp.next;
    }
    let counter=  0 ;
    temp = head;
    while(temp){
        counter += temp.val * Math.pow(2,length-1);
        length--;
        temp = temp.next;
    }
    return counter;
};