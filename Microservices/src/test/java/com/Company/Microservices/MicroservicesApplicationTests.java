package com.Company.Microservices;


import org.junit.jupiter.api.Test;
import org.reactivestreams.Subscription;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Mono;

@SpringBootTest
class MicroservicesApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void test(){
		Mono<String> monoPublisher = Mono.just("testing the data").log();
//		monoPublisher.subscribe(new CoreSubscriber<String>() {
//			@Override
//			public void onSubscribe(Subscription subscription) {
//				System.out.println("Subscription done");
//
//				subscription.request(1);
//			}
//
//			@Override
//			public void onNext(String s) {
//				System.out.println("data");
//			}
//
//			@Override
//			public void onError(Throwable throwable) {
//				System.out.println(throwable.getMessage());
//			}
//
//			@Override
//			public void onComplete() {
//				System.out.println("Completed");
//			}
//		});

		monoPublisher.subscribe(System.out::println);
	}
}
