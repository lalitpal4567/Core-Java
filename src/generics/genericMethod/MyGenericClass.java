package generics.genericMethod;

public class MyGenericClass<T extends Number> {
    private T data;

    public MyGenericClass(T data){
        this.data = data;
    }
    public double square(){
        return data.doubleValue() * data.doubleValue();
    }

    public static void main(String[] args) {
        MyGenericClass<Integer> o = new MyGenericClass(8);
        MyGenericClass<Integer> obj = new MyGenericClass<>(5);
//        MyGenericClass<String> obj2 = new MyGenericClass<>("Hello");

        double result = obj.square();
//        double result2 = obj2.square();
    }
}
