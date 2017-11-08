package com.builders.poc.awssample.domain.messaging;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SuperMessages {
	private String uuid;
	private String message;
}
