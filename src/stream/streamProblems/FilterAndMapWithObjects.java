package stream.streamProblems;

import java.util.ArrayList;
import java.util.List;

// Given a list of Product objects, filter out the products with a price less than 17000/-,
// and then transform the remaining products to a list of their names.
class Product{
    private String name;
    private int price;
    Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
}

public class FilterAndMapWithObjects {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 50000));
        products.add(new Product("Mouse", 1000));
        products.add(new Product("Keyboard", 1500));
        products.add(new Product("Monitor", 17000));
        products.add(new Product("Web Camera", 30000));
        products.add(new Product("Processor", 40000));
        products.add(new Product("Graphic Card", 35000));
        products.add(new Product("SSD", 25000));
        products.add(new Product("RAM", 3000));
        products.add(new Product("Antivirus", 4500));

        List<String> productList = products.stream()
//                .filter(product :: getPrice > 17000)    // compilation error
                .filter(product -> product.getPrice() > 17000)
                .map(Product::getName)
                .toList();

        productList.forEach(product -> System.out.println(product));
    }
}
