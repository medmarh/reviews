package com.services;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
public interface IServiceCall {

	public String getNbaStars();
}
