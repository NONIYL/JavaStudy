package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

//테이블 모양보다는 조회하려는 데이터의 형태만큼
//모델 클래스가 존재하는 것이 편하다
public class EmpDept {
	 Integer employee_id;
	 String first_name;
	 String last_name;
	 String email;
	 String phone_number;
	 Date hire_Date;
	 String job_id;
	 Float salary;
	 Float commission_pct;
	 Integer emp_manager_id;
	 Integer department_id;
	 String department_name;
	 Integer dept_manager_id;
	 Integer location_id;
	  
	  public EmpDept() {}
	  
	  public EmpDept(ResultSet rs) throws SQLException {
		
		  employee_id = rs.getInt("employee_id");
		  first_name = rs.getString("first_name");
		  last_name = rs.getString("last_name");
		  email = rs.getString("email");
		  phone_number = rs.getString("phone_number");
		  hire_Date = rs.getDate("hire_Date");
		  job_id = rs.getNString("job_id");
		  salary = rs.getFloat("salary");
		  commission_pct = rs.getFloat("commission_pct");
		  emp_manager_id = rs.getInt("Emp_MANAGER_ID");
		  department_id = rs.getInt("department_id");
		  department_name = rs.getString("department_name");
		  dept_manager_id = rs.getInt("DEPT_MANAGER_ID");
		  location_id = rs.getInt("location_id");
		  
	  }
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public Date getHire_Date() {
		return hire_Date;
	}
	public void setHire_Date(Date hire_Date) {
		this.hire_Date = hire_Date;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public Float getCommission_pct() {
		return commission_pct;
	}
	public void setCommission_pct(Float commission_pct) {
		this.commission_pct = commission_pct;
	}
	public Integer getEmp_manager_id() {
		return emp_manager_id;
	}
	public void setEmp_manager_id(Integer emp_manager_id) {
		this.emp_manager_id = emp_manager_id;
	}
	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public Integer getDept_manager_id() {
		return dept_manager_id;
	}
	public void setDept_manager_id(Integer dept_manager_id) {
		this.dept_manager_id = dept_manager_id;
	}
	public Integer getLocation_id() {
		return location_id;
	}
	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}
	  
	  
	  

}
