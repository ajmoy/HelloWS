/*
 * Creation date: Nov 11, 2017 12:51:50 AM
 */

package mx.com.tecnomotum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 *
 * @author Moisés Martínez
 */
@SpringBootApplication
public class MainApp //extends SpringBootServletInitializer
{
    //private static final Class<MainApp> MAINAPP = MainApp.class;
    
    public static void main(String[] args) 
    {
        SpringApplication.run(MainApp.class, args);
    }
    
//    @Override
//    protected SpringApplicationBuilder configure (SpringApplicationBuilder applicationBuilder) 
//    {
//       return applicationBuilder.sources(MAINAPP);
//    }
}
