# Overview (What is a binary search tree?)
Let's start high level.  A (tree)[https://en.wikipedia.org/wiki/Tree_(graph_theory)]
is an undirected (graph)[https://en.wikipedia.org/wiki/Graph_theory] where every node 
is connected by exactly one path.  Any acyclic connected graph is a tree.

A graph where every node can have at most two children is a binary tree.

A binary search tree is a type of binary tree with the following characteristic:
* Each node has a key that can be compared to the keys of other nodes.
* A node's left child must have a key less that of it's parent.
* A node's right child must have a key greater or equal to that of it's parent.

This characteristic allows us to find a node having a key via a binary search.
