import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String targetName) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = products[mid].productName.compareToIgnoreCase(targetName);

            if (compare == 0)
                return products[mid];
            else if (compare < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }
}
