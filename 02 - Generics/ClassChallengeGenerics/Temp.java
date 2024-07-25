import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temp {
    public static void main(String[] args) {

        List<List<String>> gangaCoordinates = new ArrayList<>();
        gangaCoordinates.add(Arrays.asList("1.0, 2.0"));
        gangaCoordinates.add(Arrays.asList("3.0, 4.0"));
        System.out.println(gangaCoordinates);


    }
    public void addListElements(Integer x){

    }


    public void passingAndPrinting(List<List<Integer>> mylist){


        for(List<Integer> x : mylist){
            System.out.println(x);
        }
    }

}

