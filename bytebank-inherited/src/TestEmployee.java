
public class TestEmployee {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setName("Nico Steppat");
		employee.setCpf("123456789-10");
		employee.setSalary(2600.00);
		
		System.out.println(employee.getName());
		System.out.println(employee.getBonus());
	}

}
