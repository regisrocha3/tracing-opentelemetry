package io.rrlabs.tracing.opentelemetry.traceapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class Service1 {

	@Autowired private RestTemplate restTemplate;
	
	public void callApiServiceB() {
		HttpHeaders headers = new HttpHeaders();
    	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    	HttpEntity<String> entity = new HttpEntity<>(headers);
    	restTemplate.exchange("http://opentelemetry-app-b:9082/service", HttpMethod.GET, entity, String.class).getBody();	
	}
}
