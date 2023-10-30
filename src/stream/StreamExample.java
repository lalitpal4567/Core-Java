package stream;

import java.util.ArrayList;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class StreamExample {
    public static void main(String[] args) {
        ArrayList<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",27000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        ArrayList<Float> productPriceList = new ArrayList<Float>();
        for(Product product: productsList){

            // filtering data of list
            if(product.price < 30000){
                productPriceList.add(product.price);
            }
        }
        System.out.println(productPriceList);
    }
}
