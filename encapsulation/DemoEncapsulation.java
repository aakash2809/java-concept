
class Demo {
        private String name;
        private int x;
        private int y;

        public static int i=200;
        public static int j=100;

        Demo() {
                System.out.println("default");
        }

        Demo(int i) {
                this.x=i;
        }

        Demo(int i, int j) {
                this.x=i;
                this.y=j;
        }

        public void setName(String name) {
                this.name=name;
        }

        public String getName() {
                return this.name;
        }

        public void show(){
                System.out.println("name --- "+this.name);
        }

        public void show1(){
                System.out.println("value of x - "+this.x);
        }

        public void show2() {
                System.out.println("value of x - "+this.x+" y is - "+this.y);
        }

        public static void show3() {
                System.out.println("value of j - "+j);
        }

        int addition(int i, int j){
                return i+j;
        }
}


//Main class
public class DemoEncapsulation extends Demo {
        public static void main(String args[]) {
                Demo obj = new Demo();  //object creation - happens with new keyword
                obj.setName("abc");
                System.out.println("name is - "+obj.getName());
                new Demo().show();      //accessing show method
                new Demo(10).show1();           //constructor with parameter

                new Demo(10,20).show2();

                System.out.println("j value in DemoEncap class - "+Demo.j);
                Demo.show3();

                System.out.println("addition of 10+10 = "+new DemoEncapsulation().addition(10,10));
        }
}
