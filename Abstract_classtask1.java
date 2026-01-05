package pratices.index;

  abstract class vehicle{
	  void startengine(){
		  System.out.println("engine started");
		  
	  }
	  abstract void calculateMileage();
  }
 class car extends vehicle{
	   void calculateMileage() {
		  System.out.println("enter the vehicle speed km:123km");
	  }
}
class bike extends car{
	  void calculateMileage() {
		 System.out.println("enter the bike mileage 15/km");
		 
	 }
}
public class Abstract_classtask1 {
	public static void main(String[]args) {
		vehicle s1=new car();
		s1.startengine();
		s1.calculateMileage();
	  
		vehicle bike= new bike();
		bike.startengine();
		bike.calculateMileage();
		
	}

}
 