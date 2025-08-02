// INORDER TRAVERSAL
// import java.util.*;
// public class BST
// {
//     class Node
//     {
//         Node left,right;
//         int data;
//         Node(int data)
//         {
//             this.data=data;
//             this.right=null;
//             this.left=null;
//         }
//     }
//     Node root;
//     public void insert(int data)
//     {
//         Node newNode = new Node(data);
//         if(root==null)
//         {
//             root = newNode;
//             return;
//         }
//         Node temp = root;
//         Node parent = null;
//         while(temp!=null)
//         {
//             parent = temp;
//             if(data<temp.data)
//             {
//                 temp = temp.left;
//             }
//             else
//             {
//                 temp = temp.right;
//             }
//         }
//         if(data<parent.data)
//         {
//             parent.left = newNode;
//         }
//         else
//         {
//             parent.right = newNode;
//         }
//     }
//     public void inOrder(Node root)
//     {
//         if(root!=null)
//         {
//             inOrder(root.left);
//             System.out.print(root.data+" ");
//             inOrder(root.right);
//         }
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         BST bst = new BST();
//         for(int i=0;i<n;i++)
//         {
//             int data = sc.nextInt();
//             bst.insert(data);
//         }
//         bst.inOrder(bst.root);
//     }
// }

// SEARCHING
// import java.util.*;
// public class BST
// {
//      class Node
//         {
//             Node right;
//             Node left;
//             int data;
//             Node(int data)
//             {
//                 this.right=null;
//                 this.left=null;
//                 this.data=data;
//             }
//         }
//         Node root;
//         public void insert(int data)
//         {
//             Node newNode = new Node(data);
//             if(root==null)
//             {
//                 root = newNode;
//                 return;
//             }
//             Node temp = root;
//             Node parent = null;
//             while(temp!=null)
//             {
//                 parent = temp;
//                 if(data<temp.data)
//                 {
//                     temp = temp.left;
//                 }
//                 else
//                 {
//                     temp = temp.right;
//                 }
//             }
//             if(data<parent.data)
//             {
//                 parent.left = newNode;
//             }
//             else
//             {
//                 parent.right = newNode;
//             }
//         }
//         public void show(Node root)
//         {
//             if(root!=null)
//             {
//                 show(root.left);
//                 System.out.print(root.data+" ");
//                 show(root.right);
//             }
//         }
//         public boolean search(int key)
//         {
//             Node temp = root;
//             while(temp!=null)
//             {
//                 if(key==temp.data)
//                 {
//                     return true;
//                 }
//                 if(key<temp.data)
//                 {
//                     temp = temp.left;
//                 }
//                 else
//                 {
//                     temp = temp.right;
//                 }
//             }
//             return false;
//         }
//         public static void main(String[] args)
//         {
//             Scanner sc = new Scanner(System.in);
//             int n =sc.nextInt();
//             BST bst = new BST();
//             for(int i=0;i<n;i++)
//             {
//                 bst.insert(sc.nextInt());
//             }
//             int k = sc.nextInt();
//             boolean t = bst.search(k);
//             System.out.print(t);
//             // bst.show(bst.root);
//         }
         
// }

//DELETION
// import java.util.*;
// public class BST
// {
//     class Node
//     {
//         Node right,left;
//         int data;
//         Node(int data)
//         {
//             this.right=null;
//             this.left=null;
//             this.data=data;
//         }
//     }
//     Node root;
//     public void insert(int data)
//     {
//         Node newNode = new Node(data);
//         if(root == null)
//         {
//             root = newNode;
//             return;
//         }
//         Node temp = root;
//         Node parent = null;
//         while(temp!=null)
//         {
//             parent = temp;
//             if(data<temp.data) temp = temp.left;
//             else temp = temp.right;
//         }
//         if(data<parent.data) parent.left = newNode;
//         else parent.right = newNode;
//     }
//     public void show(Node root)
//     {
//         if(root!=null)
//         {
//             show(root.left);
//             System.out.print(root.data+" ");
//             show(root.right);
//         }
//     }
//     public Node delete(Node root,int key)
//     {
//         if(root==null)
//         {
//             return null;
//         }
//         if(key<root.data)
//         {
//             root.left = delete(root.left, key);
//         }
//         else if(key>root.data)
//         {
//             root.right = delete(root.right, key);
//         }
//         else
//         {
//             if(root.left==null)
//             {
//                 return root.right;
//             }
//             if(root.right==null)
//             {
//                 return root.left;
//             }
//             Node succ = findMin(root.right);
//             root.data = succ.data;
//             root.right = delete(root.right, succ.data);
//         }
//         return root;
//     }
//     public Node findMin(Node root)
//     {
//         while(root.left!=null)
//         {
//             root=root.left;
//         }
//         return root;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         BST bst = new BST();
//         for(int i=0;i<n;i++)
//         {
//             bst.insert(sc.nextInt());
//         }
//         int del = sc.nextInt();
//         bst.root = bst.delete(bst.root,del);
//         bst.show(bst.root);
//     }
// }

//LEVEL ORDER
// import java.util.*;
// public class BST
// {
//     class Node
//     {
//         Node left,right;
//         int data;
//         Node(int data)
//         {
//             this.data=data;
//             this.left=null;
//             this.right=null;
//         }
//     }
//     Node root;
//     public void insert(int data)
//     {
//         Node newNode = new Node(data);
//         if(root==null)
//         {
//             root = newNode;
//             return;
//         }
//         Node temp = root;
//         Node parent = null;
//         while(temp!=null)
//         {
//             parent=temp;
//             if(data<temp.data)
//             {
//                 temp = temp.left;
//             }
//             else
//             {
//                 temp = temp.right;
//             }
//         }
//         if(data<parent.data)
//         {
//             parent.left = newNode;
//         }
//         else
//         {
//             parent.right = newNode;
//         }
//     }
//     public void levelOrder(Node root)
//     {
//         if(root == null)
//         {
//             return;
//         }
//         Queue<Node> q = new LinkedList<>();
//         q.add(root);
//         while(!q.isEmpty())
//         {
//             Node temp = q.poll();
//             System.out.print(temp.data+" ");
//             if(temp.left!=null)
//             {
//                 q.add(temp.left);
//             }
//             if(temp.right!=null)
//             {
//                 q.add(temp.right);
//             }
//         }
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc= new Scanner(System.in);
//         int n = sc.nextInt();
//         BST bst = new BST();
//         for(int i=0;i<n;i++)
//         {
//             bst.insert(sc.nextInt());
//         }
//         bst.levelOrder(bst.root);
//     }
// }

// Height of the tree
// import java.util.*;
// public class BST
// {
//     class Node
//     {
//         Node left,right;
//         int data;
//         Node(int data)
//         {
//             this.left = null;
//             this.right = null;
//             this.data = data;
//         }
//     }
//     Node root;
//     BST()
//     {
//         root = null;
//     }
//     public void insert(int data)
//     {
//         Node newNode = new Node(data);
//         if(root==null)
//         {
//             root = newNode;
//             return;
//         }
//         Node temp = root;
//         Node parent = null;
//         while(temp!=null)
//         {
//             parent = temp;
//             if(data<temp.data)
//             {
//                 temp = temp.left;
//             }
//             else
//             {
//                 temp = temp.right;
//             }
//         }
//         if(data<parent.data)
//         {
//             parent.left = newNode;
//         }
//         else
//         {
//             parent.right = newNode;
//         }
//     }
//     public void show(Node root)
//     {
//         if(root!=null)
//         {
//             show(root.left);
//             System.out.print(root.data+" ");
//             show(root.right);
//         }
//     }
//     public int height(Node root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
//         int left = height(root.left);
//         int right = height(root.right);
//         return 1+Math.max(left,right);
//     }
    
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         BST bst = new BST();
//         for(int i=0;i<n;i++)
//         {
//             bst.insert(sc.nextInt());
//         }
//         int r = bst.height(bst.root);
//         System.out.print(r);
        
//     }
// }


// Ancestor of the tree
import java.util.*;
public class BST
{
    public class Node
    {
        Node left,right;
        int data;
        Node(int data)
        {
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }
    Node root;
    BST()
    {
        root = null;
    }
    public void insert(int data)
    {
        Node newNode = new Node(data);
        if(root==null)
        {
            root = newNode;
            return;
        }
        Node temp = root;
        Node parent = null;
        while(temp!=null)
        {
            parent = temp;
            if(data<temp.data)
            {
                temp = temp.left;
            }
            else
            {
                temp = temp.right;
            }
        }
        if(data<parent.data)
        {
            parent.left = newNode;
        }
        else
        {
            parent.right = newNode;
        }
    }
    public int ancestor(Node root,int p,int q)
    {
        while(root!=null)
        {
            if(p<root.data && q<root.data)
            {
                root = root.left;
            }
            else if(p>root.data && q>root.data)
            {
                root = root.right;
            }
            else
            {
                return root.data;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BST bst = new BST();
        for(int i=0;i<n;i++)
        {
            bst.insert(sc.nextInt());
        }

        int r = bst.ancestor(bst.root, 2, 4);
        System.out.println(r);

    }
}