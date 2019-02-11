public class BinarySearchTree{
   BinarySearchTree left,right;
   int value;
   BinarySearchTree(int value){
      this.value=value;
      left=null;
      right=null;
   }
   void insertNode(int value){
      if(value<this.value){
         if(this.left !=null) this.left.insertNode(value);
         this.left = new BinarySearchTree(value);
      }else if(value>this.value){
         if(this.right !=null) this.right.insertNode(value);
         this.right = new BinarySearchTree(value);
      }else{
         //value == this.value???
         //System.exit(-1);
         //same value, continue;
      }
   }

   int findNode(int value){
      if(value<this.value && this.left !=null ){
         return this.left.findNode(value);
      }else if(value>this.value && this.right !=null){
         return this.right.findNode(value);
      }else{
         return value;
      }
   }

   public static void main(String[] args) {
      BinarySearchTree bst = new BinarySearchTree(15);
      bst.insertNode(9);
      bst.insertNode(11);
      bst.insertNode(13);
      bst.insertNode(4);
      bst.insertNode(7);
      bst.insertNode(20);
      bst.insertNode(10);

      System.out.println(bst.findNode(13));
      System.out.println(bst.findNode(10));
   }
}
