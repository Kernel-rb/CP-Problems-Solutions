/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *detectCycle(struct ListNode *head) {
    if(head==NULL){
        return NULL;
    }
    struct ListNode *slow=head;
    struct ListNode *fast=head;
    while(true){
        if( fast==NULL || fast->next==NULL){
            return NULL;
        }
        slow=slow->next;
        fast=fast->next->next;
        if(slow==fast){
            break;
        }
    }
    fast=head;
    while(slow!=fast){
        slow=slow->next;
        fast=fast->next;
    }
    return slow;
}