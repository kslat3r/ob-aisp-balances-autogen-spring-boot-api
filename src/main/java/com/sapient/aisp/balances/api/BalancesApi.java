/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.0.2).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.sapient.aisp.balances.api;

import com.sapient.aisp.balances.model.OBErrorResponse1;
import com.sapient.aisp.balances.model.OBReadBalance1;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Validated
@Api(value = "balances", description = "the balances API")
public interface BalancesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "Get Balances", nickname = "getBalances", notes = "", response = OBReadBalance1.class, authorizations = {
        @Authorization(value = "PSUOAuth2Security", scopes = {
            @AuthorizationScope(scope = "accounts", description = "Ability to read Accounts information")
            })
    }, tags={ "Balances", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Balances Read", response = OBReadBalance1.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    @RequestMapping(value = "/balances",
        produces = { "application/json; charset=utf-8" }, 
        method = RequestMethod.GET)
    default ResponseEntity<OBReadBalance1> getBalances(@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true) @RequestHeader(value="x-fapi-financial-id", required=true) String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC" ) @RequestHeader(value="x-fapi-customer-last-logged-time", required=false) String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId,@ApiParam(value = "Indicates the user-agent that the PSU is using." ) @RequestHeader(value="x-customer-user-agent", required=false) String xCustomerUserAgent) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json; charset=utf-8"))) {
                    ApiUtil.setExampleResponse(request, "application/json; charset=utf-8", "{  \"Meta\" : {    \"LastAvailableDateTime\" : \"2000-01-23T04:56:07.000+00:00\",    \"FirstAvailableDateTime\" : \"2000-01-23T04:56:07.000+00:00\",    \"TotalPages\" : 0  },  \"Links\" : {    \"Last\" : \"https://openapi-generator.tech\",    \"Prev\" : \"https://openapi-generator.tech\",    \"Next\" : \"https://openapi-generator.tech\",    \"Self\" : \"https://openapi-generator.tech\",    \"First\" : \"https://openapi-generator.tech\"  },  \"Data\" : {    \"Balance\" : [ {      \"AccountId\" : \"AccountId\",      \"CreditLine\" : [ {        \"Included\" : true,        \"Amount\" : {          \"Amount\" : \"Amount\",          \"Currency\" : \"Currency\"        }      }, {        \"Included\" : true,        \"Amount\" : {          \"Amount\" : \"Amount\",          \"Currency\" : \"Currency\"        }      } ],      \"Amount\" : {        \"Amount\" : \"Amount\",        \"Currency\" : \"Currency\"      },      \"CreditDebitIndicator\" : \"Credit\",      \"DateTime\" : \"2000-01-23T04:56:07.000+00:00\"    }, {      \"AccountId\" : \"AccountId\",      \"CreditLine\" : [ {        \"Included\" : true,        \"Amount\" : {          \"Amount\" : \"Amount\",          \"Currency\" : \"Currency\"        }      }, {        \"Included\" : true,        \"Amount\" : {          \"Amount\" : \"Amount\",          \"Currency\" : \"Currency\"        }      } ],      \"Amount\" : {        \"Amount\" : \"Amount\",        \"Currency\" : \"Currency\"      },      \"CreditDebitIndicator\" : \"Credit\",      \"DateTime\" : \"2000-01-23T04:56:07.000+00:00\"    } ]  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
