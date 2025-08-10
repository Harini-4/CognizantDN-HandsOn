public class SearchDemo {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Mobile", "Electronics"),
            new Product(4, "Watch", "Accessories"),
            new Product(5, "Book", "Education")
        };

        // Linear Search
        Product result1 = LinearSearch.linearSearch(products, "Mobile");
        System.out.println("Linear Search Result: " + result1);

        // Binary Search
        Product result2 = BinarySearch.binarySearch(products, "Mobile");
        System.out.println("Binary Search Result: " + result2);
    }
}
