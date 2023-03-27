public class Strings {
    public static void main(String[] args) {
        String brand = "Anurag";
        brand.concat("Shukla");
        System.out.println(brand);
        StringBuilder brand1 = new StringBuilder("Anurag");
        System.out.println(brand1);
        brand1.append("Shukla");
        System.out.println(brand1);
        // System.out.println(brand1.append("Shukla"));

    }
}
