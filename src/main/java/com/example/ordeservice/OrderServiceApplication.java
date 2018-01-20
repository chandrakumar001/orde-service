package com.example.ordeservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableDiscoveryClient
@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}
	
}
@RestController
class OrderController{
	private static List list=new ArrayList<>();
	static {
		list.add(new order(1111));
		list.add(new order(2222));
		list.add(new order(3333));
		list.add(new order(4444));
		
	} 
	
	@GetMapping("/orders")
	public List getAll() {
		return list;
	}
	
}
class order{
	private int or_nu;

	public int getOr_nu() {
		return or_nu;
	}

	public void setOr_nu(int or_nu) {
		this.or_nu = or_nu;
	}

	
	public order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public order(int or_nu) {
		super();
		this.or_nu = or_nu;
	}

	@Override
	public String toString() {
		return "order [or_nu=" + or_nu + "]";
	}

}