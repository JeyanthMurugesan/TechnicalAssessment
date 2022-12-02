package com.example.helloSpringBoot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.merchantManagement.SpringBootCrud.service.merchantServiceInterceptor;

/**
* WebConfig
*
*
*
*/
@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Autowired@Component
	private MerchantService merchantServiceInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
	// Custom interceptor, add intercept path and exclude intercept path
	registry.addInterceptor(merchantServiceInterceptor).addPathPatterns("/**");
	}
}