package hibernatesample;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class students 
{
	@Id
	int studentid;
	String name;
	@OneToMany
	private List<books> list;
	
	public List<books> getList() {
		return list;
	}
	public void setList(List<books> list) {
		this.list = list;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
