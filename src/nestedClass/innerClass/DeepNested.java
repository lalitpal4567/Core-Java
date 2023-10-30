package nestedClass.innerClass;

public class DeepNested {
    private int x = 10;
    class B{
        private int x = 20;
        class C{
            private int x = 30;
            public void allTheX(){
                System.out.println(x);      // 30
                System.out.println(this.x); // 30
                System.out.println(C.this.x);   // 30
//                System.out.println(C.x);    // compilation error
                System.out.println(B.C.this.x); // 30
                System.out.println(C.this.x);   // 30
                System.out.println(B.this.x);   // 20
                System.out.println(DeepNested.this.x);  // 10
            }
        }
    }

    public static void main(String[] args) {
        DeepNested deepNested = new DeepNested();
        B b = deepNested.new B();
        B.C c = b.new C();
        c.allTheX();

        new DeepNested().new B().new C().allTheX(); // valid
    }
}
