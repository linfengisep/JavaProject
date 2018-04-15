public enum Builder{
   FENDER,MARTIN,GIBSON,COLLINGS,OLSON;
   public String toString(){
      switch(this){
      case FENDER:return "Fender";
      case MARTIN:return "Martin";
      case GIBSON:return "Gbson";
      case COLLINGS:return "Collings";
      case OLSON:return "Olson";
      default: return "no builder";
      }
   }
}
