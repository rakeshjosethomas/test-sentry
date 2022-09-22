package com.apica.testsentry;

//import io.sentry.Sentry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class Handler {

  public Mono<ServerResponse> handleRequest(ServerRequest request) {
    return ServerResponse.ok()
        .body(sayHello(request)
//            .onErrorResume(e -> Mono.error(new NameRequiredException(
//                HttpStatus.BAD_REQUEST,
//                "name is required", e))), String.class);
            .onErrorResume(e -> {
//              Sentry.captureException(e);
              return Mono.error(new NameRequiredException(
                HttpStatus.BAD_REQUEST,
                "name is required", e));
            }), String.class);
  }

  private Mono<String> sayHello(ServerRequest request) {
//    try {
      return Mono.just("Hello, " + request.queryParam("name").get());
//    } catch (Exception e) {
//      return Mono.error(e);
//    }
  }

}
