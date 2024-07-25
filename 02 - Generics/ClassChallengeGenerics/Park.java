public class Park extends Point implements Mappable{
    private String parkName;

    //constructors
    public Park(String longitude, String latitude, String parkName) {
        super(longitude, latitude);
        this.parkName = parkName;
    }

    //getters and setters
    public String getParkName(){
        return parkName;
    }

    @Override
    public void render(){
        System.out.printf("%s is at (%s,%s))%n",getParkName(),getLatitude(),getLongitude());

    }
}
