public class GreatWall implements Surfing{
    private Filter filter = null;
    @Override
    public void surfingOnInternet(String site){
        System.out.format("i want to surf the website: %s\n",site);
        if(filter == null){
            filter = new Filter();
        }
        filter.surfingOnInternet(site);
    }
}
