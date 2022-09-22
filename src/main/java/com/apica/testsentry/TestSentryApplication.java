package com.apica.testsentry;

//import io.sentry.Sentry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@SpringBootApplication
public class TestSentryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSentryApplication.class, args);
//		try {
//			throw new Exception("This is a test");
//		} catch (Exception e) {
//			Sentry.captureException(e);
//		}
	}

}
