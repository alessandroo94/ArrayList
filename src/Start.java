
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {
       List<String> cityName = Arrays.asList("Milano", "Roma", "Napoli");
       //cityName.add("Venezia");

       cityName.set(1, "Tegucigalpa");
        System.out.println("The names of cities are: " + cityName);

        List<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romulus");
        kingsOfRome.add("Numa Pompilius");
        kingsOfRome.add("Tullus Hostilius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Lucius Tarquinius Priscus");
        kingsOfRome.add("Servius Tullius");
        kingsOfRome.add("Lucius Tarquinius Superbus");

        String[] kingOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingOfRomeArray[6] = "Lucius Tarquinius Supercar";
        System.out.println("The king of Rome are: " + Arrays.toString(kingOfRomeArray));

    }
}
