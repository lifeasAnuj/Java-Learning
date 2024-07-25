import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Double>> coordinatesList = new ArrayList<>();
//        coordinatesList.add();
//
//        int[][] coordinates = new int[2][];
//
//        River Ganga = new River( ,"Ganga");



        List<River> rivers = Arrays.asList(
                new River(Arrays.asList(Arrays.asList("10,10", "20,20")), "Nile"),
                new River(Arrays.asList(Arrays.asList("15,30", "25,40")), "Amazon"),
                new River(Arrays.asList(Arrays.asList("30,45", "40,50")), "Mississippi"),
                new River(Arrays.asList(Arrays.asList("5,10", "15,20")), "Yangtze"),
                new River(Arrays.asList(Arrays.asList("8,18", "18,28")), "Ganges"),
                new River(Arrays.asList(Arrays.asList("12,24", "22,34")), "Danube"),
                new River(Arrays.asList(Arrays.asList("7,14", "17,24")), "Volga"),
                new River(Arrays.asList(Arrays.asList("3,6", "13,16")), "Rhine"),
                new River(Arrays.asList(Arrays.asList("20,25", "30,35")), "Mekong"),
                new River(Arrays.asList(Arrays.asList("25,30", "35,40")), "Thames")
        );
        List<Park> parks = Arrays.asList(
                new Park("77.5946", "12.9716", "Cubbon Park"),
                new Park("151.2153", "-33.8572", "Hyde Park"),
                new Park("-0.1657", "51.5085", "Kensington Gardens"),
                new Park("139.6917", "35.6895", "Shinjuku Gyoen"),
                new Park("-118.2989", "34.0736", "Griffith Park")
        );
        Layer<Mappable> parkLayer = new Layer<>();
        Layer<Mappable> riverLayer = new Layer<>();

        for (Park park : parks) {
            parkLayer.addMappableItem(park);
        }

        for (River river : rivers) {
            riverLayer.addMappableItem(river);
        }

        // Render layers
        System.out.println("Parks Layer:");
        parkLayer.renderLayer();
        System.out.println("\nRivers Layer:");
        riverLayer.renderLayer();
    }
}
