package cn.com.sit.examplebizservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages ={ "cn.com.sit.examplebizservice.repo"})
@EntityScan(basePackages ={ "cn.com.sit.examplebizservice.model"})
@EnableTransactionManagement
@EnableDiscoveryClient
public class ExampleBizServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleBizServiceApplication.class, args);
	}
}
