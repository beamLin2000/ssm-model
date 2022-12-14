package com.gxa.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webapi")
                .apiInfo(apiInfo())
                .enable(true)//开始swagger
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.gxa.controller"))
                .build()
                .pathMapping("/swagger");
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("医院就诊系统项目接口文档")
                .description("医院就诊系统项目接口测试")
                .version("1.0.0")
                .contact(new Contact("作者名字", "https://www.baidu.com", "邮箱"))
                .termsOfServiceUrl("")
                .license("")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .build();
    }

    @Bean
    public Docket api1() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("group02")
                .apiInfo(apiInfo1())
                .enable(true)//开始swagger
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.gxa.controller"))
                .build();
    }

    private ApiInfo apiInfo1() {
        return new ApiInfoBuilder()
                .title("yyy项目接口文档")
                .description("yyy项目接口测试")
                .version("1.0.0")
                .contact(new Contact("作者名字", "https://www.baidu.com", "邮箱"))
                .termsOfServiceUrl("")
                .license("")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .build();
    }
}
