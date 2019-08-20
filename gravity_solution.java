import java.util.*;
class gravity_solution {
  public static void main(String[] args) {
    System.out.println("Enter Time");
    Scanner Sc = new Scanner(System.in);
    double t = Sc.nextDouble();
    double grav = 9.8;
    double velo = 0.5*(grav*t*t);
    System.out.println("The speed of the object at "+ t +" seconds after its release is "+ velo +" and the distance the object has travelled in the "+ time +" seconds after the relase is "+ g*time );
    }
}
