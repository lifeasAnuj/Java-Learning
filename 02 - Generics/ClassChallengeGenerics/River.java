import java.util.List;

public class River extends Line implements Mappable{
    private String riverName;

    public River(List<List<String>> lineCoordinates, String riverName) {
        super(lineCoordinates);
        this.riverName = riverName;
    }

    @Override
    public void render(){
        System.out.printf("%s flows through %s%n",riverName,lineCoordinates);
    }
}
