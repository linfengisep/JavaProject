public enum Wood{
   INDIAN_ROSEWOOD,BRAZILIAN_ROSEWOOD,COCOBOLO,CEDAR,ALDER;
   public String toString(){
      switch(this){
         case INDIAN_ROSEWOOD:
               return "Indian Rosewood";
         case BRAZILIAN_ROSEWOOD:
               return "Brazilian Rosewood";
         case COCOBOLO:
               return "cocobolo";
         case CEDAR:
               return "Cedar";
         case ALDER:
               return "Alder";
         default:
               return "no wood";
      }
   }
}
