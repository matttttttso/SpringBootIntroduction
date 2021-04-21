package com.example.demo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "target")
public class TargetProperties {
	@NotEmpty
	private String host;
	@Min(0)
	@Max(65535)
	private int port;
	
	public String getHost() {return host;}
	public void setHost(String host) {this.host = host;}
	public int getPort() {return port;}
	public void setPort(int port) {this.port = port;}
}
