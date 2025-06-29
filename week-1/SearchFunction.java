import java.util.*;

public class SearchFunction {
    public static List<String> searchProducts(List<String> products, String query) {
        List<String> result = new ArrayList<>();
        for (String product : products) {
            if (product.toLowerCase().contains(query.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> products = Arrays.asList("Laptop", "Keyboard", "Mouse", "Monitor", "USB Cable");
        String query = "lap";
        List<String> results = searchProducts(products, query);
        System.out.println("Search Results: " + results);
    }
}
