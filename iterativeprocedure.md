#Iterative Procedure 
The following are the sequence of the steps to be followed:
- Initially take three pointers: PrevNode, CurrNode, and NextNode.
- Let CurrNode point to HeaderNode of the list. And let PrevNode and NextNode points to null.
- Now iterate through the linked list until CurrNode is null.
- In the loop, we need to change NextNode to PrevNode, PrevNode to CurrNode and CurrNode to NextNode.

Consider the following linked list that needs to be reversed:

HeaderNode-> [1] -> [2] -> [3] -> [4] -> [5] -> NULL

Dry Run for the Above Example: <br>
Taking 3 pointers: PrevNode, CurrNode, and NextNode where currNode pointing to HeaderNode <br>

Header <br>
&nbsp;&nbsp; V <br>
&nbsp;&nbsp; [1] [2] -> [3] -> [4] -> [5] -> NULL <br>
 ^   &nbsp;   ^                               <br>
Prev &nbsp;  Next <br>

After First Iteration: <br>
After the first iteration of the loop, PrevNode points to the node containing element 1 and CurrNode & NextNode points to 
the node containing element 2. And the node pointed by PrevNode gets unlinked. <br>

Header <br>
V      <br>
[1]   [2] <br>
^   &nbsp;   ^  <br>
Prev  Next      <br>
&nbsp;&nbsp; ^  <br>
&nbsp;&nbsp; Curr <br>

After Second Iteration: <br>
After the second iteration of the loop, PrevNode Points to the node containing element 2 and currentNode
