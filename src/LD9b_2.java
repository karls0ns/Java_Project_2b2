public class LD9b_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Firm Gaisma = new Firm("Gaisma");
			
					
		Gaisma.add(new Employee("Kaiva","Klavina",666.55));
		Gaisma.add(new Employee("Ilze","Liela",500.20));
		Gaisma.add(new Employee("Laura","Smaile",1500.20));
				
		System.out.println(Gaisma);
		
		System.out.println(Gaisma.getMaxSalary());
		
		
		Gaisma.sortSalariesAsc();
		
		System.out.println(Gaisma);
		
		Gaisma.sortSalariesDesc();
		
		System.out.println(Gaisma);
		
	}

}
