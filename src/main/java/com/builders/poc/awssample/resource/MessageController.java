package com.builders.poc.awssample.resource;

import static java.util.UUID.randomUUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.builders.poc.awssample.domain.messaging.SuperMessages;
import com.builders.poc.awssample.messaging.Producers;

@RestController
public class MessageController {

	@Autowired
	private Producers sqsQueueSender;

	@GetMapping(path="/envioteste/{message}") 
	public void envioteste(@PathVariable("message") String message) {
		this.sqsQueueSender.sendMessage(SuperMessages.builder().message(message).uuid(randomUUID().toString()).build());
	}
}
