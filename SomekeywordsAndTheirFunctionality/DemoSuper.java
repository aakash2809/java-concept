
class A {
        int i;
        A(int val) {
                i=val;
        }
        void show() {
                System.out.println("i - "+i);
        }
}

class B extends A {
        int j, k;

        B(int j, int k) {
                super(k);
                this.j=j;       //to differentiate local and instance variable
                this.k=k;
        }
        void show1() {
                System.out.println("show1 -  i - "+super.i);
                System.out.println("j - "+j+" k - "+k);
                System.out.println("this i - "+this.i);
        }
        String showv(int i,int j) {
                return "i - "+i+" & j - "+j;
        }
}

public class DemoSuper extends B{
        int l, m , n;                           // instance member
        DemoSuper(int l, int m, int n) {        // local vairable
                super(m,n);
                this.l=l;
                this.m=m;
                this.n=n;
        }
        void show2() {
                System.out.println("l - "+l+" m - "+m+" n - "+n);
                System.out.println("values passed in showv - "+super.showv(10,20));
        }

        public static void main(String[] args) {
                DemoSuper obj = new DemoSuper(10,20,30);
                obj.show2();
                obj.show1();
                obj.show();
        }
}
