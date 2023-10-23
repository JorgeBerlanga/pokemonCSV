import com.pruebaCSV.LectorCSV;

public class Main {
    public static void main(String[] args) {
        LectorCSV miLector = new LectorCSV();
        miLector.leeCSV("./datos/pokemon.csv");
    }
}