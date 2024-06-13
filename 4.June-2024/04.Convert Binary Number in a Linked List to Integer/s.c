/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int getDecimalValue(struct ListNode* head) {
    int length = 0;
    struct ListNode* temp = head;
    while(temp != NULL){
        length++;
        temp = temp->next;
    }
    int counter = 0;
    temp = head;
    while(temp != NULL){
        counter += temp->val * pow(2, length-1);
        length--;
        temp = temp->next;
    }
    return counter;
}