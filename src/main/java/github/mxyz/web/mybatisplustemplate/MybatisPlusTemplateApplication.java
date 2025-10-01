package github.mxyz.web.mybatisplustemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class MybatisPlusTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusTemplateApplication.class, args);
    }

}
