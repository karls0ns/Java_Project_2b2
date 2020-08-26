import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class Firm {

	private String Firmname;
	private ArrayList<Employee> E = new ArrayList<Employee>();	
	
	public Firm (String Firmname){
		this.Firmname = Firmname;
		
	}
	

	public void add(Employee Emp){
				
			E.add(new Employee(Emp));
	
	}
	
	public double getMaxSalary(){
		double MaxSalary = 0;
		Employee temp;
		int i = 0;
		double temp1 = 0;
			
		while (i != E.size()) {
			temp = (Employee) E.get(i);
			temp1 = temp.getSalary();
			if (temp1 > MaxSalary){
				MaxSalary = temp1;
			}
			i++;
		}
		return MaxSalary;
	}
	
	
	public void sortSalariesAsc(){
		Collections.sort(E);
	}
	
	public void sortSalariesDesc(){
		Collections.sort(E,new SalDesc());
	}
	
	
	@Override
	public String toString() {
		String temp = ("Firma: " +Firmname+ " Darbinieku skaits: " +E.size());
		StringBuilder SB = new StringBuilder(temp);
		
		SB.append(System.lineSeparator());		
		
		int i = 0;
		
		while (i != E.size()) {
			i++;
			SB.append("	" +i+". " +E.get(i-1)+ System.lineSeparator());			
			
		}
		temp = SB.toString();
		return temp;
	}

	class SalDesc implements Comparator<Employee> {
		public int compare(Employee O1, Employee O2){
			double P1 = ((Employee) O1).getSalary();
			double P2 = ((Employee) O2).getSalary();
			return (P1>P2)?-1:((P1>P2)?1:0);
		}
				
	}

}
