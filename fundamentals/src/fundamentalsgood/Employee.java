package fundamentalsgood;

public class Employee {
	int empid;
	String Name;
	int Age;
	static String Company;
	public Employee(int id,String name,int age,String comp) {
		empid=id;
		Name=name;
		Age=age;
		Company=comp;
		
	}
	public void show() {
		System.out.println(" ID:"+empid+"\n Name:"+Name+"\n Age:"+Age+"\n Company:"+Employee.Company);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee(01,"ravish",25,"INFOSYS");
		obj.show();
		System.out.println(obj);
		
		Employee obj1=new Employee(02,"anish",23,"Soft tech");
		obj1.show();
		System.out.println(obj1);
		 
		Employee obj2=obj;
		
		System.out.println(obj2);
	}

}
