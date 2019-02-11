public class NodeTree{
   int value;
   NodeTree left,right;
   NodeTree(int value){
      this.value = value;
      left = null;right = null;
   }

   void insertLeftNode(int value){
      if(this.left == null){
         this.left = new NodeTree(value);
      }else{
         NodeTree nodeNew = new NodeTree(value);
         nodeNew.left = this.left;
         this.left = nodeNew;
      }
   }

   void insertRightNode(int value){
      if(this.right==null){
         this.right = new NodeTree(value);
      }else{
         NodeTree nodeNew = new NodeTree(value);
         nodeNew.right = this.right;
         this.right = nodeNew;
      }
   }
   public static void main(String[] args) {
      NodeTree root = new NodeTree(0);
      root.insertLeftNode(3);
      root.insertRightNode(4);

      NodeTree nodeB = root.left;
      nodeB.insertRightNode(7);

      NodeTree nodeC = root.right;
      nodeC.insertLeftNode(6);
      nodeC.insertRightNode(8);

      NodeTree nodeD = nodeB.right;
      NodeTree nodeE = nodeC.left;
      NodeTree nodeF = nodeC.right;
/*
      System.out.println(root.value);
      System.out.println(nodeB.value);
      System.out.println(nodeC.value);
      System.out.println(nodeD.value);
      System.out.println(nodeE.value);
      System.out.println(nodeF.value);
*/
   }
}
