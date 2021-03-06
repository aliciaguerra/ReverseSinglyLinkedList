#Reverse a Linked List Recursive Java
Now, let's find a recursive solution in Java for this problem. The advantage that we have with recursion is the fact 
that we can go to the very end of the linked list and work backwards to reverse the list starting from the every end.
This is because with recursion we can go to the very end of the linked list, but also essentially "save" our place in
each and every node we traverse so that we can go backwards and change the pointers in the linked list so that the list is reversed.

#Base Case for Recursive Solution
Before we come up with our recursive case, we should come up with our base case for this problem. The base case is what we use to essentially stop the recursion from continuously running. So, when should we stop the recursion from running - try to see if you can come up with scenario on your own.

The base case for this problem will actually occur whenever we reach the tail node of the linked list - and by "tail" node we mean the very last node. We will know that we have reached the tail node when the current node's next node is NULL - so the current node will be the tail node.

#What should be done in the base case for this recursive problem?
Now, we know what the base case is and how to check for it, but what exactly should we be doing in this case? Well, we obviously want to have a return statement so that we can put a stop to the recursion. But is there anything else that we should be doing here as well? It turns out that there is something else we need to do in the base case, because in the base case we are at the very end of the linked list. This means that because we are trying to reverse the linked list, we need to set the head pointer to point to the very last node.

This means that our base case would look like this - remember that we are assuming that in the recursive case, we will just be passing in the very next node in the linked list to the recursive function:

#Java Code for Recursive Solution's Base Case
`/*If we are at the TAIL node*/` <br>
`if(currentNode.next==NULL)` <br>
`{` <br>
`//set HEAD to TAIL since we are reversing list` <br>
`head = currentNode;` <br>
`return; //since this is the base case` <br>
`}`

#Coming Up with a Recursive Case
Now that we've come up with a base case in Java, what about the recursive case? Well, in the recursive case we will clearly need to change the pointers so that the nodes are reversed. For a given node - let's say we are dealing with node 99 in the linked list image above - the Node coming after 99 (node 37) is represented by Node 99 -> next. If we want node 37 to point back to node 99 (which is what we would want if we are reversing the nodes), then we would set the next pointer of node 37 to point back to node 99, which in pseudocode would look like Node99 -> next = Node 99.

We would also need to get rid of the pointer from node 99 to node 37 so we would have to set Node 99 -> next to NULL.

So now we come up with code that would be our final recursive answer to the problem of reversing a singly linked list.
