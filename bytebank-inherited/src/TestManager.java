
public class TestManager {

	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.setName("Marco");
		m1.setCpf("2345679");
		m1.setSalary(5000.0);
		
		System.out.println(m1.getName());
		System.out.println(m1.getCpf());
		System.out.println(m1.getSalary());

		m1.authenticate(2222);
		m1.setPassword(2222);
		
		boolean authenticate = m1.authenticate(2222);
		
		System.out.println(authenticate);
	}

}
