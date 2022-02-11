package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the EMPLOYEET database table.
 * 
 */
@Entity
@NamedQuery(name="Employeet.findAll", query="SELECT e FROM Employeet e")
public class Employeet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empid;
	
	private String country;

	private String empaddress;

	private int empage;

	private String empname;

	private int salary;

	public Employeet() {
	}

	public int getEmpid() {
		return this.empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpaddress() {
		return this.empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public int getEmpage() {
		return this.empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}

	public String getEmpname() {
		return this.empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
