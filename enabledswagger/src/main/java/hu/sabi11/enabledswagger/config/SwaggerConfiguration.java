package hu.sabi11.enabledswagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableScheduling
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket swaggerConfig() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("user-api")
                .apiInfo(apiInfo()).select()
                //.paths(PathSelectors.ant("/api/user"))
                .apis(RequestHandlerSelectors.basePackage("hu.sabi11.enabledswagger"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Generate Swagger Docket")
                .description("Spring boot with Swagger")
                .termsOfServiceUrl("there is no terms")
                .license("feel free")
                .licenseUrl("whatever.licence.com")
                .version("1.0")
                .build();
    }
}
