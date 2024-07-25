public class Point {
    private String longitude;
    private String latitude;

    //public Constructor
    public Point(String longitude, String latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    //getters and setters
    public String getLongitude() {
        return longitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public String getLatitude() {
        return latitude;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }


}
