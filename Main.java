// import java.util.*;
// public class practice
// {
//     class Node
//     {
//         Node next;
//         int data;
//         Node(int data)
//         {
//             this.next = null;
//             this.data = data;
//         }
//     }
//     Node head,tail;
//     practice()
//     {
//         head=null;
//         tail=null;
//     }
//     public void insert(int data)
//     {
//         Node newNode = new Node(data);
//         if(head==null)
//         {
//             head = newNode;
//             tail = newNode;
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }
//     public void show()
//     {
//         Node temp = head;
//         while(temp!=null)
//         {
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//     }
//     public static void Main(String[] args)
//     {
//         Scanner sc= new Scanner(System.in);
//         practice bst = new practice();
//         int n = sc.nextInt();
//         for(int i=0;i<n;i++)
//         {
//             bst.insert(sc.nextInt());
//         }
//         bst.show();
//     }
// }

// import java.util.*;
// public class practice
// {
//     class Node
//     {
//         Node next;
//         int data;
//         Node(int data)
//         {
//             this.data=data;
//             this.next=null;
//         }
//     }
//     Node head;
//     practice()
//     {
//         head=null;
//     }
    
//     public void insertFirst(int data)
//     {
//         Node newNode = new Node(data);
//         newNode.next=head;
//         head=newNode;
//     }
    
//     public void show()
//     {
//         Node temp = head;
//         while(temp!=null)
//         {
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//     }
    
//     public static void Main(String[] args)
//     {
//         Scanner sc =new Scanner(System.in);
//         int n = sc.nextInt();
//         practice list = new practice();
//         for(int i=0;i<n;i++)
//         {
//             int data = sc.nextInt();
//             list.insertFirst(data);
//         }
//         list.show();
//     }
    
// }

// import java.util.*;
// public class practice
// {
//     class Node
//     {
//         Node next;
//         int data;
//         Node(int data)
//         {
//             this.data=data;
//             this.next=null;
//         }
//     }
//     Node head,tail;
//     practice()
//     {
//         this.head=null;
//         this.tail=null;
//     }
//     public void insert(int data)
//     {
//         Node newNode = new Node(data);
//         if(head==null)
//         {
//             head=newNode;
//             tail=newNode;
//         }
//         tail.next = newNode;
//         tail = newNode;
        
//     }
//     public void insertAtMid(int data,int pos)
//     {
//         Node newNode = new Node(data);
//         if(pos==1)
//         {
//             newNode.next=head;
//             head=newNode;
//             return;
//         }
//         Node temp = head;
//         for(int i=1;temp!=null && i<pos-1;i++)
//         {
//             temp=temp.next;
//         }
//         if(temp==null)
//         {
//             System.out.print("Invalid");
//             return;
//         }
//         newNode.next = temp.next;
//         temp.next=newNode;
//     }
//     public void show()
//     {
//         Node temp=head;
//         while(temp!=null)
//         {
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//     }
    
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         practice bst = new practice();
//         for(int i=0;i<n;i++)
//         {
//             int data=sc.nextInt();
//             bst.insert(data);
//         }
//         bst.show();
//         int data=sc.nextInt();
//         int val = sc.nextInt();
//         bst.insertAtMid(data,val);
//         bst.show();
//     }
    
// }



// import java.util.*;
// public class practice
// {
//     class Node
//     {
//         Node next;
//         int data;
//         Node(int data)
//         {
//             this.data=data;
//             this.next=null;
//         }
//     }
//     Node head,tail;
//     practice()
//     {
//         this.head=null;
//         this.tail=null;
//     }
//     public void insert(int data)
//     {
//         Node newNode = new Node(data);
//         if(head==null)
//         {
//             head=newNode;
//             tail=newNode;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }
//     public void show()
//     {
//         Node temp = head;
//         while(temp!=null)
//         {
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//     }
//     public void deleteAtEnd()
//     {
//         if(head==null)
//         {
//             System.out.print("Empty List");
//             return;
//         }
//         if(head.next==null)
//         {
//             head=null;
//             return;
//         }
//         Node temp=head;
//         while(temp.next.next!=null)
//         {
//             temp=temp.next;
//         }
//         temp.next=null;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         practice bst = new practice();
//         for(int i=0;i<n;i++)
//         {
//             int data = sc.nextInt();
//             bst.insert(data);
//         }
//         bst.show();
//         System.out.println();
//         bst.deleteAtEnd();
//         bst.show();
//     }
// }


// import java.util.*;
// public class practice
// {
//     class Node
//     {
//         Node next;
//         int data;
//         Node(int data)
//         {
//             this.data=data;
//             this.next=null;
//         }
//     }
//     Node head,tail;
//     practice()
//     {
//         this.head=null;
//         this.tail=null;
//     }
//     public void insert(int data)
//     {
//         Node newNode = new Node(data);
//         Node temp=head;
//         if(head==null)
//         {
//             head = newNode;
//             tail = newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail = newNode;
//     }
//     public void show()
//     {
//         Node temp=head;
//         while(temp!=null)
//         {
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//     }
//     public void delete()
//     {
//         if(head==null)
//         {
//             System.out.print("Invalid");
//             return;
//         }
//         head = head.next;
        
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         practice bst = new practice();
//         for(int i=0;i<n;i++)
//         {
//             int data=sc.nextInt();
//             bst.insert(data);
//         }
//         bst.show();
//         System.out.println();
//         bst.delete();
//         bst.show();
//     }
// }



// import java.util.*;
// public class practice
// {
//     class Node
//     {
//         Node next;
//         int data;
//         Node(int data)
//         {
//             this.next=null;
//             this.data=data;
//         }
//     }
//     Node head,tail;
//     boolean flag = true;
//     practice()
//     {
//         this.head=null;
//         this.tail=null;
//     }
//     public void insert(int data)
//     {
//         Node newNode = new Node(data);
//         if(head==null)
//         {
//             head=newNode;
//             tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }
//     public void deleteAtSpecific(int val)
//     {
//         if(head==null)
//         {
//             System.out.print("List is empty");
//             return;
//         }
//         if(head.data==val)
//         {
//             head = head.next;
//             if(head==null)
//             {
//                 tail=null;
//             }
//             return;
//         }
//         Node prev = null;
//         Node temp = head;
//         while(temp!=null && temp.data!=val)
//         {
//             prev = temp;
//             temp = temp.next;
//         }
//         if(temp==null)
//         {
//             flag=false;
//             return;
//         }
//         prev.next=temp.next;
//         if(temp.next==null)
//         {
//             tail=prev;
//         }
//     }
//     public void show(int val)
//     {
//         if(flag)
//         {
//             Node temp=head;
//             while(temp!=null)
//             {
//                 System.out.print(temp.data+" ");
//                 temp=temp.next;
//             }
//         }
//         else
//         {
//             System.out.print(val+"Element not found");
//         }
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         practice bst = new practice();
//         for(int i=0;i<n;i++)
//         {
//             bst.insert(sc.nextInt());
//         }
//         System.out.println();
//         int val = sc.nextInt();
//         bst.deleteAtSpecific(val);
//         bst.show(val);
//     }
// }

// import java.util.*;
// public class practice
// {
//     class Node
//     {
//         Node next;
//         int data;
//         Node(int data)
//         {
//             this.data=data;
//             this.next=null;
//         }
//     }
//     Node head,tail;
//     practice()
//     {
//         this.head=null;
//         this.tail=null;
//     }
//     public void insert(int data)
//     {
//         Node newNode = new Node(data);
//         if(head==null)
//         {
//             head=newNode;
//             tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }
//     public void reverse()
//     {
//         Node curr=head;
//         Node prev=null;
//         Node next=null;
//         while(curr!=null)
//         {
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         head=prev;
//     }
//     public void show()
//     {
//         Node temp=head;
//         if(head==null)
//         {
//             System.out.print("List is empty");
//             return;
//         }
//         while(temp!=null)
//         {
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         practice bst = new practice();
//         for(int i=0;i<n;i++)
//         {
//             bst.insert(sc.nextInt());
//         }
//         bst.reverse();
//         bst.show();
//     }
// }

// import java.util.*;
// public class Main
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
//         Main bst = new Main();
//         for(int i=0;i<n;i++)
//         {
//             int data = sc.nextInt();
//             bst.insert(data);
//         }
//         bst.inOrder(bst.root);
//     }
// }


// import java.util.*;
// public class Main
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
//             Main bst = new Main();
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


// import java.util.*;
// public class Main
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
//         Main bst = new Main();
//         for(int i=0;i<n;i++)
//         {
//             bst.insert(sc.nextInt());
//         }
//         int del = sc.nextInt();
//         bst.root = bst.delete(bst.root,del);
//         bst.show(bst.root);
//     }
// }


import java.util.*;
public class Main
{
    class Node
    {
        Node left,right;
        int data;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    Node root;
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
            parent=temp;
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
    public void levelOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        Main bst = new Main();
        for(int i=0;i<n;i++)
        {
            bst.insert(sc.nextInt());
        }
        bst.levelOrder(bst.root);
    }
}