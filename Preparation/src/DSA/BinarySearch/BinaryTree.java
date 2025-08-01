package DSA.BinarySearch;

import java.util.Scanner;

public class BinaryTree {
   public static class Node{
       int value;
       Node left;
       Node right;

       public Node(int value){
           this.value=value;
       }
   }
   private Node root;

   public void populate(Scanner sc){
       System.out.print("Enter the value of root node: ");
       int value = sc.nextInt();
       root=new Node(value);
       populate(sc,root);
   }
   public void populate(Scanner sc,Node node){
       System.out.println("Do you want to enter the left of(true/false): "+node.value);
       boolean left=sc.nextBoolean();
       if(left){
           System.out.println("Enter the value of left of "+node.value);
           int value=sc.nextInt();
           node.left=new Node(value);
           populate(sc,node.left);
       }
       System.out.println("Do you want to enter the right of(true/false): "+node.value);
       boolean right=sc.nextBoolean();
       if(right){
           System.out.println("Enter the value of right of "+node.value);
           int value=sc.nextInt();
           node.right=new Node(value);
           populate(sc,node.right);
       }
   }
   public void print(){
       print(root," ");
   }
   public void print(Node node,String indent){
       System.out.println(indent + node.value);
       if(node==null){
           return;
       }
       print(node.left,indent + "  ");
       print(node.right,indent + "  ");
   }
    }

