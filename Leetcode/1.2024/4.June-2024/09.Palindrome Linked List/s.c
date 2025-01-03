/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool isPalindrome(struct ListNode* head) {
    struct ListNode* f = head;
    struct ListNode* s = head;
    while(f != NULL && f->next != NULL){
        f = f->next->next;
        s = s->next;
    }

    struct ListNode* prev = NULL;
    while(s != NULL){
        struct ListNode* temp = s->next;
        s->next = prev ;
        prev = s ;
        s = temp;
    }

    struct ListNode* l = head;
    struct ListNode* r = prev;
    while(r != NULL){
        if( r->val != l->val){
            return false;
        };
        l = l->next;
        r = r->next;
    }
    return true;
}
