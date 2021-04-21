package com.example.demo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties(prefix = "target")
@Setter
@Getter
public class TargetProperties {
	@NotEmpty
	private String host;
	@Min(0)
	@Max(65535)
	private int port;
}
