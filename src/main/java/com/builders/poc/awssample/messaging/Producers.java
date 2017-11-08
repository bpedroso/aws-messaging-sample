package com.builders.poc.awssample.messaging;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.builders.poc.awssample.domain.messaging.SuperMessages;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Component
public class Producers extends MessagingConstants {

	private final QueueMessagingTemplate queueMessagingTemplate;

	@Autowired
	public Producers(AmazonSQSAsync amazonSqs) {
		this.queueMessagingTemplate = new QueueMessagingTemplate(amazonSqs);
	}
	
	public void sendMessage(final SuperMessages message) {
		log.info("Send message: {}", message);

		Map<String, Object> headers = new HashMap<>();
		this.queueMessagingTemplate.convertAndSend(QUEUE_NAME, MessageBuilder.withPayload(message).build(), headers);
	}
}
