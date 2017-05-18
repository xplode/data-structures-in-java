class Node
{
  public Node left;
  public Node right;  
  public int key;

  public String toString()
  {
    return "(" + key + ")";
  }

  public Node(int k)
  {
    key = k;
  }
}

class Bst
{
  public Node root;

  /* Perform binary search tree insertion.  Does not rebalance the tree. */ 
  public void insert(Node n)
  {
    // If the root node is null, then the given node becomes root! 
    if ( root == null ) {
      System.out.println("Inserting node " + n.toString() + " as root node.");
      root = n;
      return;
    }

    Node currentNode = root;
    // Otherwise we need to find a place to insert the node.
    while (true) {
      if ( n.key < currentNode.key ) {
        // Search will proceed to the left.
        if ( currentNode.left == null ) {
          // We've found our spot to insert the node.
          currentNode.left = n;
          System.out.println("Inserting " + n.toString() + " to left of " + currentNode.toString());
          return;
        } else {
          // The search must continue.
          currentNode = currentNode.left;
        }
      } else {
        // Search will proceed to the right.
        if ( currentNode.right == null ) {
          // We've found our spot to insert the node.
          currentNode.right = n;
          System.out.println("Inserting " + n.toString() + " to right of " + currentNode.toString());
          return;
        } else {
          // The search must continue.
          currentNode = currentNode.right;
        }
      }
    } 
  }

  // Returns either the first node with key k or null.  Very similar logic to 
  // insertion.
  public Node find(int k)
  {
    System.out.println("Searching for " + k);
    Node currentNode = root;
    while (true) {
      if (currentNode == null) {
        System.out.println("Couldn't find " + k + " in the tree.");
        return null;
      }

      System.out.println(currentNode.toString());
      if (currentNode.key == k) {
        System.out.println("Found it!");
        return currentNode;
      }

      if (k < currentNode.key) {
        currentNode = currentNode.left; 
      } else {
        currentNode = currentNode.right; 
      }
    }
  }
}


class App 
{
  public static void main(String[] args)
  {
    System.out.println("Running binary search tree application.");
    Bst tree = new Bst();

    // Let's create and insert a node for root.
    tree.find(23);
    Node n = new Node(23);
    tree.insert(n);
    tree.insert(new Node(10));
    tree.insert(new Node(30));
    tree.insert(new Node(2));
    tree.insert(new Node(10));
    tree.insert(new Node(2));
    tree.insert(new Node(3));
    tree.find(23);
    tree.find(6);
    tree.find(2);
  }
}




