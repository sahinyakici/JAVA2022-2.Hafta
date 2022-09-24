package oop1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitInStock(3);
        product1.setImageUrl("bilmemne.jpg");
        //Set
        /*product1.name = "Delonghi Kahve Makinesi";
        product1.unitPrice = 7500;
        product1.discount = 7;
        product1.unitInStock = 3;
        product1.imageUrl = "bilmemne.jpg";*/

        //Get
        //System.out.println(product1.name);
        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(8);
        product2.setUnitPrice(6500);
        product2.setUnitInStock(2);
        product2.setImageUrl("bilmemne2.jpg");
       /* product2.name = "Smeg Kahve Makinesi";
        product2.unitPrice = 6500;
        product2.discount = 8;
        product2.unitInStock = 2;
        product2.imageUrl = "bilmemne2.jpg";
*/
        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(9);
        product3.setUnitPrice(4500);
        product3.setUnitInStock(4);
        product3.setImageUrl("bilmemne3.jpg");
        /*product3.name = "Kitchen Aid Kahve Makinesi";
        product3.unitPrice = 4500;
        product3.discount = 9;
        product3.unitInStock = 4;
        product3.imageUrl = "bilmemne3.jpg";*/

        Product[] products = {product1, product2, product3};
        System.out.println("<ul>");
        for (Product pro : products) {
            System.out.println("<li>" + pro.getName() + "</li>");
            System.out.println("<li>" + pro.getUnitPrice() + "</li>");
            System.out.println("<li>" + pro.getDiscount() + "</li>");
            System.out.println("<li>" + pro.getUnitInStock() + "</li>");
            System.out.println("<li>" + pro.getImageUrl() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("1");
        individualCustomer.setCustomerNumber("123");
        individualCustomer.setFirstName("Malik");
        individualCustomer.setLastName("soyad");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("kodlama.io");
        corporateCustomer.setPhone("526465");
        corporateCustomer.setTextNumber("54454654");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer, corporateCustomer};
    }
}