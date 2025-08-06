package associations.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="hibEmployee")
public class Employee { // Many

	@Id
	private int emp_id;
	private int salary;
	private String name;

	@ManyToOne
	@JoinColumn(name="employee_department")
	private Department dept;

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Employee() {

	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", salary=" + salary + ", name=" + name+"]";
	}

	public Employee(int emp_id, int salary, String name, Department laptop) {
		super();
		this.emp_id = emp_id;
		this.salary = salary;
		this.name = name;
	}

}
