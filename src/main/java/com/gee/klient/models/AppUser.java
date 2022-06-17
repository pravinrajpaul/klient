package com.gee.klient.models;

import lombok.Data;

@Data
public class AppUser {
	private String userName;
	private Long userID;
	private Credential credential;
	private KafkaProducerConfig[] producerConfigs;
}
