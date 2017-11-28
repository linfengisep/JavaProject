import java.util.*;

public class TestList{
   public List<String> classList=new ArrayList<String>();

//affect one list to another;
   public void affectListTo (List<String> list){
      this.classList=list;
   }
//show the list;
   public void showList(){
   for(String s:classList){
         System.out.println("element is:"+s);
      }
   }

   public static void main(String[]args){
      List listFirst=new ArrayList<String>();
      listFirst.add("linfeng");
      listFirst.add("julien");
      listFirst.add("isep");

      TestList list=new TestList();
      list.affectListTo(listFirst);
      list.showList();

      System.out.println("***********************************");
      //change and check again;
      List listSecond=new ArrayList<String>();
      listSecond.add("isep");
      listSecond.add("estp");
      listSecond.add("science-PO");

      list.affectListTo(listSecond);
      list.showList();

      System.out.println("***********************************");
      int index=0;
      System.out.println("check the first:"+list.classList.get(index));

   }
}
