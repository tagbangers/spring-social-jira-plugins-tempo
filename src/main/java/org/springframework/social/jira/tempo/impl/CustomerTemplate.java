package org.springframework.social.jira.tempo.impl;

import org.springframework.social.jira.api.impl.AbstractJiraOperations;
import org.springframework.social.jira.tempo.Customer;
import org.springframework.social.jira.tempo.CustomerOperations;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class CustomerTemplate extends AbstractJiraOperations implements CustomerOperations {

	private final RestTemplate restTemplate;

	public CustomerTemplate(String baseUrl, RestTemplate restTemplate) {
		super(baseUrl);
		this.restTemplate = restTemplate;
	}

	@Override
	public List<Customer> getAllCustomers() {
		Customer[] customers = restTemplate.getForObject(buildUri("/rest/tempo-accounts/1/customer"), Customer[].class);
		return Arrays.asList(customers);
	}

	@Override
	public Customer getCustomer(long customerId) {
		return restTemplate.getForObject(buildUri("/rest/tempo-accounts/1/customer/" + customerId), Customer.class);
	}
}
