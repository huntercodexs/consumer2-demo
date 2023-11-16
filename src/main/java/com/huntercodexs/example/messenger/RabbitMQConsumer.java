package com.huntercodexs.example.messenger;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

	@RabbitListener(queues = {"queue-1-direct"})
	public void consumerExchangeDirectQueue1(@Payload String body) {
		System.out.println("Message from ExchangeDirectQueue1: " + body);
	}

	@RabbitListener(queues = {"queue-2-direct"})
	public void consumerExchangeDirectQueue2(@Payload String body) {
		System.out.println("Message from ExchangeDirectQueue2: " + body);
	}

	@RabbitListener(queues = {"queue-3-direct"})
	public void consumerExchangeDirectQueue3(@Payload String body) {
		System.out.println("Message from ExchangeDirectQueue3: " + body);
	}

	@RabbitListener(queues = {"queue-1-fanout"})
	public void consumerExchangeFanoutQueue1(@Payload String body) {
		System.out.println("Message from ExchangeFanoutQueue1: " + body);
	}

	@RabbitListener(queues = {"queue-2-fanout"})
	public void consumerExchangeFanoutQueue2(@Payload String body) {
		System.out.println("Message from ExchangeFanoutQueue2: " + body);
	}

	@RabbitListener(queues = {"queue-3-fanout"})
	public void consumerExchangeFanoutQueue3(@Payload String body) {
		System.out.println("Message from ExchangeFanoutQueue3: " + body);
	}

	@RabbitListener(queues = {"queue-1-topic"})
	public void consumerExchangeTopicQueue1(@Payload String body) {
		System.out.println("Message from ExchangeTopicQueue1: " + body);
	}

	@RabbitListener(queues = {"queue-2.1-topic"})
	public void consumerExchangeTopicQueue21(@Payload String body) {
		System.out.println("Message from ExchangeTopicQueue21: " + body);
	}

	@RabbitListener(queues = {"queue-2.2-topic"})
	public void consumerExchangeTopicQueue22(@Payload String body) {
		System.out.println("Message from ExchangeTopicQueue22: " + body);
	}

	@RabbitListener(queues = {"queue-3-topic"})
	public void consumerExchangeTopicQueue3(@Payload String body) {
		System.out.println("Message from ExchangeTopicQueue3: " + body);
	}

}
