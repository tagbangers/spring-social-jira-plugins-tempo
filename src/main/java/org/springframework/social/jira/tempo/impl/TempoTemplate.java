package org.springframework.social.jira.tempo.impl;

import org.springframework.social.jira.api.Jira;
import org.springframework.social.jira.api.impl.JiraTemplate;
import org.springframework.social.jira.tempo.AccountOperations;
import org.springframework.social.jira.tempo.CustomerOperations;
import org.springframework.social.jira.tempo.Tempo;
import org.springframework.social.jira.tempo.WorklogOperations;
import org.springframework.social.oauth1.AbstractOAuth1ApiBinding;
import org.springframework.web.client.RestTemplate;

public class TempoTemplate extends AbstractOAuth1ApiBinding implements Tempo {

	private final JiraTemplate jiraTemplate;

	private AccountOperations accountOperations;

	private CustomerOperations customerOperations;

	private WorklogOperations worklogOperations;

	public TempoTemplate(JiraTemplate jiraTemplate) {
		this.jiraTemplate = jiraTemplate;
		configureRestTemplate(jiraTemplate.getRestTemplate());
		initSubApis();
	}

	@Override
	public Jira jira() {
		return jiraTemplate;
	}

	@Override
	public RestTemplate getRestTemplate() {
		return jiraTemplate.getRestTemplate();
	}

	@Override
	public AccountOperations accountOperations() {
		return accountOperations;
	}

	@Override
	public CustomerOperations customerOperations() {
		return customerOperations;
	}

	@Override
	public WorklogOperations worklogOperations() {
		return worklogOperations;
	}

	@Override
	public boolean isAuthorized() {
		return false;
	}

	private void initSubApis() {
		this.accountOperations = new AccountTemplate(this.jiraTemplate.getBaseUrl(), getRestTemplate());
		this.customerOperations = new CustomerTemplate(this.jiraTemplate.getBaseUrl(), getRestTemplate());
		this.worklogOperations = new WorklogTemplate(this.jiraTemplate.getBaseUrl(), getRestTemplate());
	}
}
