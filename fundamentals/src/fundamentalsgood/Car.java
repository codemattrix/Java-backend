package fundamentalsgood;

public class Car {
	
	
		int number;
		String carName;
		String CarColor;
	
		Car(int number,String carName,String CarColor){
			this.number=number;
			this.carName=carName;
			this.CarColor=CarColor;
			
		}
		void car() {
		System.out.println(" wheeler: "+number+"\n car Name: "+carName+"\n CarColor: "+CarColor);
		}
	
//	void Car() {
//		System.out.println("Ravish");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Car c=new Car(4,"Benz","black");
 c.car();
 
	}

}
