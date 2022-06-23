package Easy;

public class MergeTwoSortedLists {

    /*
    Merge two sorted lists - Takes in two linked lists (from first node) and merges them -
    Return the merged linked list from the first node -
    [1,2,4], [1,3,4] ==> [1,1,2,3,4,4]
    */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //Create new list node
        ListNode result = new ListNode();
        //Create pointer to first node in list
        ListNode head = result;
        //Start loop - will end at end of list node where value == null

        while(list1!=null && list2!=null){
            //Check if list1 is smaller than list2 at index
            if(list1.val<list2.val){
                //Assign value from list1
                result.next = list1;
                //Iterate to next value in list node
                list1 = list1.next;
                //If list2 is smaller than list1 at index
            }else{
                //Assign value from list2
                result.next = list2;
                //Iterate to next value in list node
                list2 = list2.next;
            }
            //Iterate to next value in list node
            result = result.next;
        }

        //If one list is longer than the other
        if(list1!=null){
            //Assign value from list1
            result.next=list1;
        }else{
            //Assign value from list2
            result.next=list2;
        }

        //Return result from the head of the list node
        return head.next;
    }

    /*
     *
     * Definition for singly-linked list.
     *
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
