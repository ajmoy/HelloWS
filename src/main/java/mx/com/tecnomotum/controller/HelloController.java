/*
 * Creation date: Nov 11, 2017 1:02:06 AM
 */

package mx.com.tecnomotum.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Moisés Martínez
 */
@RestController
@RequestMapping("/HelloWS")
@Api(value="HelloWS", description="WS to test" )//
public class HelloController 
{
    @ApiOperation(value = "Says hello")//Tag for documentation
    @RequestMapping(value="/hello", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String index() 
    {
        return "Hello app!";
    }
}
