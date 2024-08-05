/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Nguyen Huy
 */


// Definition for singly-linked list.
 class ListNode {
     int val;
    ListNode next;
    ListNode() {}
   ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeLinkLisst {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode save = new ListNode();
        ListNode temp = save;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next = list1;
                list1=list1.next;
            }else{
                temp.next = list2;
                list2=list2.next;
            }
            temp = temp.next; 
        }
        temp.next = list1!= null ? list1: list2;
        return save.next; //=> return save.next vi neu return next se return ca gia tri 0
        //=> save.next se return ca mot list node  
        // vidu listNode list1 se tham chieu den : (1 --> 2 --> 5 --> 7) --> 1 listNodde
        
    }
}

