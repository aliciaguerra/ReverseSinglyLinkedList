# Reversing a Linked List Iteratively
First off, in case you don't already know, the word 'iterative' when used in problems like these basically means
that we use some sort of loop to solve the problem - whether it's a while loop, a for loop, or whatever type of loop
you desire to use. We chose to use a while loop to come up with a solution.

Let's assume that we are going to start reversing the linked list starting from the very first node - the head node.
What it basically comes fown to is changing pointers from one node to the next so that the entire linked list becomes
reversed. There is definitely a process - an algorithm - that we want to follow in order to do that:

#Reverse a Linked List Iterative Algorithm
1. The head node's next pointer should be set to null since the head will become the tail. This is the exception for
the head node, and can be done outside the while loop. But, before we do this, we will need a temp variable to point to
the second node (the node after the head node), because the only way to reference the second node is through the head
node's next pointer.

2. The second node (the node after the head node) should have it's own next pointer changed to point to the head node.
This will reverse the order of the nodes. But remember that the second node's pointer will at first be pointing to the third node. This means that before we change the second node's next pointer, we have to save a reference to the third node
otherwise we will have no way of referencing the third node. So, we simply store a reference to the third node in a variable
before we change the second node's next pointer.

3. The third node then becomes the "first" node in the while loop and we repeat the process of changing pointers described in step 2.

4. Continue step 3 until we come across a node that has a next pointer set to NULL. When we do come across a NULL next pointer
we just set the head node ro point to the node that has the null next pointer. This node was previously the tail node, but is
now the head node because we are reversing the linked list.
