package com.carmuriolabs.myportfolio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyPortfolio {

	private static final Logger log = LoggerFactory.getLogger(MyPortfolio.class);

	public static void main(String[] args) {
		// SpringApplication.run(MyPortfolio.class, args);


		ConfigurableApplicationContext appContext = SpringApplication.run(MyPortfolio.class, args);

		log.info("App Running");

 		log.info("Beans Autoloaded: ");
		for (String name : appContext.getBeanDefinitionNames()) {
			log.info("Autoloaded Bean name: " + name);
		}

/*		Map<java.lang.String, IDataSource> dss = appContext.getBeanFactory().getBeansOfType(IDataSource.class);
		dss.forEach((key,value) -> getSourceData(value));
		*/

		log.info("App Closing");
		appContext.close(); 
		log.info("App Closed");
	}

}
