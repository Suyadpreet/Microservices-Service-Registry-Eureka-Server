package com.suyad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesServuceRegistryEurekaServerApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(MicroservicesServuceRegistryEurekaServerApplication.class, args);
		System.out.println("Service Registry Has been Started Successfully...........");
	}

}
