public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.set_name("Laptop");
        product.setId(1);
        product.set_description("Asus");
        product.set_price(5000);
        product.set_stockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        Product product2 = new Product(2, "mobil", "samsung", 500, 200, "mavi");
        productManager.add(product2);

        System.out.println(product.get_code());
        System.out.println(product2.get_code());
    }
}