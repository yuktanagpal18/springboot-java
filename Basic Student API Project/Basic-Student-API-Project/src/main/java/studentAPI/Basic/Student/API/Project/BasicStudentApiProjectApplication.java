package studentAPI.Basic.Student.API.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicStudentApiProjectApplication {

	public static void main(String[] args) {
		try {
            SpringApplication.run(BasicStudentApiProjectApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
