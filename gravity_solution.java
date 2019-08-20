import java.util.*;
class gravity_solution {
  public static void main(String[] args) {
    System.out.println("Enter Time");
    Scanner Sc = new Scanner(System.in);
    double time = Sc.nextDouble();
    double g = 9.8;
    double velocity = 0.5*(g*time*time);
    System.out.println("The speed of the object at "+ time +" seconds after its release is "+ velocity +" and the distance the object has travelled in the "+ time +" seconds after the relase is "+ g*time );
    }
}
