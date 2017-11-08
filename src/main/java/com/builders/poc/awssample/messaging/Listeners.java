package com.builders.poc.awssample.messaging;

import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

import com.builders.poc.awssample.domain.messaging.SuperMessages;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Listeners extends MessagingConstants {

	@SqsListener(QUEUE_NAME)
	public void queueListener(final SuperMessages message) {
		log.info("Send message: {}", message);
	}
}
