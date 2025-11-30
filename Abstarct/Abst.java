
abstract  class MotorCycle {

    public abstract void bike();
        public void model(){
        System.out.println("Yamaha");
        }
 }

 class BikeModel extends MotorCycle
 {
    public void bike(){
        System.out.println("150cc");
    }
 }

public class Abst {
    public static void main(String[] args) {
        
        BikeModel Bc = new BikeModel();
        Bc.bike();
        Bc.model();
    }
}
