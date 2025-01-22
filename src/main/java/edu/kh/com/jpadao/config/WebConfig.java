package edu.kh.com.jpadao.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // 웹 관련 설정. 스프링부트가 컴퓨터에 직접 접근하게 설정
public class WebConfig implements WebMvcConfigurer {
    @Value("${upload-img}")
    private String uploadImg;
    
    
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 리소스 경로에 저장된 파일에 직접접근
        registry.addResourceHandler("/images/**")  // 외부에 보일 거짓 경로
                .addResourceLocations("file:" + uploadImg + "/"); // 실제 경로
        
    }
    
    
}
