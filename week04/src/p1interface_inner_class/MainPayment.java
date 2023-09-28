package p1interface_inner_class;
public class MainPayment implements Payment {

   @Override
    public double calculateGross(double hours) {
        return hours*20;
    }

    @Override
    public void doSomething(int i, double x) {
        // nothing to add here!
        // we must add it anyhow 
    }
    
}
