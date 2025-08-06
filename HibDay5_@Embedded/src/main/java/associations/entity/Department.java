package associations.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Embeddable
@Table(name="hib1Dept")
public class Department { //One 

	@Column(unique=true,nullable=false)
	private String dept_name;
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	@Override
	public String toString() {
		return "Department ["+", dept_name=" + dept_name + "]";
	}
	
	
}
