package javaKeyword.superKeyword;

import java.beans.beancontext.BeanContextMembershipEvent;

class Box{
    private double width;
    private double height;
    private double depth;

    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double volume(){
        return width * height * depth;
    }
}
class BoxWeight extends Box{
    double weight;
    BoxWeight(double width, double height, double depth, double weight){
        super(width, height, depth);
        this.weight = weight;
    }
}
class Shipment extends BoxWeight{
    double cost;
    Shipment(double width, double height, double depth, double weight, double cost){
        super(width, height, depth, weight);
        this.cost = cost;
    }
}

public class SuperInMultilevel {
    public static void main(String[] args) {
        Shipment obj = new Shipment(5, 10, 5, 50, 10000);
        System.out.println(obj.volume());   //  250.0
    }
}
