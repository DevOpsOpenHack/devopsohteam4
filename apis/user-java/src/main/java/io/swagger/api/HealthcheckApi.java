/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ErrorResponseDefault;
import io.swagger.model.Healthcheck;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-03T19:26:46.543Z")

@Api(value = "User Java", description = "User-Java API", tags = { "User Java" })
public interface HealthcheckApi {

    @ApiOperation(value = "", nickname = "healthcheckUserGet", notes = "Returns healthcheck for systems looking to ensure API is up and operational", response = Healthcheck.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Service is healthy", response = Healthcheck.class),
        @ApiResponse(code = 200, message = "An error occurred", response = ErrorResponseDefault.class) })
    @RequestMapping(value = "/healthcheck/user-java",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Healthcheck> healthcheckUserGet();

}
