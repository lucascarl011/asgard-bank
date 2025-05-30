package me.dio.asgard_bank.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Asgard Bank - API")
                        .description("API exemplo de uso de Spring Boot REST API")
                        .version("1.0")
                        .termsOfService("Termo de uso: Open Source")
                        .contact(new Contact()
                                .name("Lucas Carlos")
                                .url("http://www.dio.com.br")
                                .email("lucassscarlosss54@gmail.com"))
                        .license(new io.swagger.v3.oas.models.info.License()
                                .name("Licença - Asgard Bank")
                                .url("http://www.dio.com.br")));
    }
}
