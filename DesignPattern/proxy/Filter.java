public class Filter implements Surfing{
    private String WEB_TO_BE_BLOCKED = "www.politique.com";
    private boolean toBlock = false;

    public void doFiltering(){
        System.out.println("404 page not found.\nFiltering the \"bad\" website for you:little brother");
    }

    public void sendBackPage(String site){
        System.out.format("here you are:%s \n",site);
    }

    @Override
    public void surfingOnInternet(String site){
        toBlock = this.WEB_TO_BE_BLOCKED.equals(site);
        if(toBlock){
            doFiltering();
        } else {
            sendBackPage(site);
        }
        System.out.println("***********************************");
    }
}
