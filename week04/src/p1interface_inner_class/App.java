package p1interface_inner_class;
public class App {
    public static void main(String[] args) throws Exception {
        Car myCar = new Car();
        myCar.StartDriving();
        /*
         * Inner Class
         * 
         */
        Car specialCar = new Car() {
            public void StartDriving() {
                System.out.println("Driving on water!!");
            }
        };

        specialCar.stopDriving();

        MainPayment mPayment1 = new MainPayment();

        System.out.println(mPayment1.calculateGross(24));
        
        Payment mPayment2 = new Payment() {
            @Override
            public double calculateGross(double hours) {
                return hours * 20;
            }

            @Override
            public void doSomething(int i, double x) {
            }
            
        };
        mPayment2.calculateGross(20);
    }
}
