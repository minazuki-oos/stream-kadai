import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("cherry blossoms", "sunflower", "cosmos", "Lily", "rose", "dandelion");

        List<String> filteredNames = names.stream()
                .filter(name -> name.contains("r"))
                .toList();

        filteredNames.forEach(System.out::println);
    }
}