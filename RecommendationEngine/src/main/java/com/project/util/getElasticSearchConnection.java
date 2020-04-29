package com.project.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

public class getElasticSearchConnection<client> {

	public TransportClient getElasticSearchConnection() throws UnknownHostException {

		Settings settings = Settings.builder().put("client.transport.sniff", true).put("cluster.name", "my-application")
				.put("client.transport.ping_timeout", "60s").build();
		TransportClient client = new PreBuiltTransportClient(settings)
				.addTransportAddress(new TransportAddress(InetAddress.getByName("localhost"), 9300));
		return client;

	}

}
