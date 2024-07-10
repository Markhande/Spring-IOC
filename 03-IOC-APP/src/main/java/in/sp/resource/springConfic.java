package in.sp.resource;
import in.sp.bean.Address;
import in.sp.bean.Student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class springConfic {
	@Bean
	public Address creatObj() 
	{	
		Address adrr = new Address();
		adrr.setHouse_no(110);
		adrr.setCity("Nagpur");
		adrr.setPincode(440035);
		
		return adrr;
	}
	@Bean
	public Student createObj() {
		Student std=new Student();
		std.setName("hemant");
		std.setRollno(110);
		std.setAddress(creatObj());
		
		return std;
	}
}
