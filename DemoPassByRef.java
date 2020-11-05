public class DemoPassByRef {

        // instance variable
        int firstVal, secondVal;

        // parameterized constructor
        DemoPassByRef(int firstVal, int secondVal) {
                this.firstVal=firstVal;
                this.secondVal=secondVal;
        }

        // method to display firstVal and secondVal
        void show(DemoPassByRef object) {
                System.out.println("firstVal - "+this.firstVal+" secondVal -  "+this.secondVal);
                System.out.println("firstValu - "+object.firstVal+" secondVal - "+object.secondVal);
        }

        // main method
        public static void main(String[] args) {
                // object creation
                DemoPassByRef object1 = new DemoPassByRef(10,20);       //10,20 values passed
                DemoPassByRef object2 = new DemoPassByRef(30,40);

                // show method called by object1 and passed object "object1"
                object1.show(object1);  //10,20 ; 10,20
                object2.show(object2);  //30,40 ; 30,40

                // show method called by object1 and passed object "object2"
                object1.show(object2);  //10,20 ; 30,40
                object2.show(object1);  //30,40 ; 10,20
        }
}
