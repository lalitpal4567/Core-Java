package javaBasics.enumeration;

enum Flowers { LOTUS, ROSE, JASMINE, DAISY, SUNFLOWER;
    public void displayInfo(){
        for(Flowers flower : Flowers.values()){
            System.out.println(flower);
        }
    }
}
public class InstanceMethodInsideEnum {
    public static void main(String[] args) {
        Flowers obj = Flowers.ROSE;
        obj.displayInfo();
    }
}
