import org.springframework.boot.*;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;



@SpringBootApplication
@PropertySource("classpath:application.yml")
@ComponentScan(basePackages="com.indu")
public class InventoryService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(InventoryService.class, args);
	}

}
