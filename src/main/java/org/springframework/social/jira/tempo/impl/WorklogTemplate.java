package org.springframework.social.jira.tempo.impl;

import org.springframework.social.jira.api.impl.AbstractJiraOperations;
import org.springframework.social.jira.tempo.Worklog;
import org.springframework.social.jira.tempo.WorklogOperations;
import org.springframework.social.jira.tempo.WorklogSearchParameters;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class WorklogTemplate extends AbstractJiraOperations implements WorklogOperations {

	private final RestTemplate restTemplate;

	public WorklogTemplate(String baseUrl, RestTemplate restTemplate) {
		super(baseUrl);
		this.restTemplate = restTemplate;
	}

	@Override
	public List<Worklog> search(WorklogSearchParameters searchParameters) {
		MultiValueMap<String, String> parameters = WorklogSearchParametersUtil.buildQueryParametersFromSearchParameters(searchParameters);
		Worklog[] worklogs = restTemplate.getForObject(buildUri("/rest/tempo-timesheets/3/worklogs/", parameters), Worklog[].class);
		return Arrays.asList(worklogs);
	}
}
