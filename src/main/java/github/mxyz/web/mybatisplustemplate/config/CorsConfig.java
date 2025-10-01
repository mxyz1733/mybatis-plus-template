package github.mxyz.web.mybatisplustemplate.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 对所有接口生效
                .allowedOrigins("*") // 允许跨域的前端源
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 允许跨域的请求方法
                .allowedMethods("*"); // 允许跨域的请求方法
    }
}
