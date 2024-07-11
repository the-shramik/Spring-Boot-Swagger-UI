package com.springswagger.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(    //This annotation we can use on the main class of project also
		info=@Info(
                title = "Test API",
                description="This documentation is describing swagger-ui documentation testing"
        )
)
public class OpenApiConfig {

}
