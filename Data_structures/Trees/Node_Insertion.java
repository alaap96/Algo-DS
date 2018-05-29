 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) {
    // temp to iteration 
        Node temp = root;
    // parent to keep track of the parent node
        Node parent = null;
    // new node to insert
        Node newNode = new Node();
        newNode.data = value;
    // traversing until we find the right spot to insert
        while(temp != null){
            parent = temp;
            if(temp.data < value){
                temp = temp.right;
            }else{
                temp = temp.left;
            }
        }
    // if parent is null that means tree is empty so return new node
        if(parent == null){
            return newNode;
        }
    // else find right spot and insert there.
        else{
            if(value > parent.data)
            {
                parent.right = newNode;
            }
            else{
                parent.left = newNode;
            }
        }
    	return root;
    }
