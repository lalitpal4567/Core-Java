package nestedClass.innerClass;

interface OuterInterface{
    void read();
}
public class OuterBox {
    class InnerBox1 extends OuterBox implements OuterInterface{
        @Override
        public void read(){
            System.out.println("reading interface");
        }
        void box1Method() {
            System.out.println("box 1 method");
        }
    }
    class InnerBox2 extends InnerBox1{
        public void box2Method(){
            System.out.println("box 2 method");
        }
    }

    public static void main(String[] args) {
        OuterBox obj = new OuterBox();
        InnerBox2 innerObj = obj.new InnerBox2();
        innerObj.box1Method();
        innerObj.box2Method();
        innerObj.read();
    }
}
