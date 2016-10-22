package org.springframework.social.jira.tempo;

import java.util.List;

public interface CustomerOperations {

	List<Customer> getAllCustomers();

	Customer getCustomer(long customerId);
}
