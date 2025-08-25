package com.cliPos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = "com.cliPos")
public class SystemApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(SystemApplication.class, args);
    }
}
