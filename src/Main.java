public class Main {
    public static void main(String[] args) {
        Menu[] products = {
                new Menu("Pandesal", 5, 2),
                new Menu("Ensaymada", 5, 6),
                new Menu("Choc Chip Cookie", 8, 1),
                new Menu("Croissant", 15, 7),
                new Menu("Cheesecake Slice", 4, 3)
        };

        int productMinLength = 20;

        System.out.println(
                "_______________________________________\n" +
                        "| Name         Price         Quantity |");
        for (int i = 0; i < products.length; i++) {
            System.out.println("| " + Utils.spaceFiller(products[i].name, productMinLength) + " | " + products[i].price + " |");
        }
    }
}