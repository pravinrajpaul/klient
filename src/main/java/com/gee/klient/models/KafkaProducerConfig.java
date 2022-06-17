package com.gee.klient.models;

import lombok.Data;

@Data
public class KafkaProducerConfig {
	private String[] bootStrapServers;
	private String keySerializer;
	private String valueSerializer;
}
