package org.springframework.social.jira.tempo.impl;

import org.springframework.social.jira.api.impl.AbstractJiraOperations;
import org.springframework.social.jira.tempo.*;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class AccountTemplate extends AbstractJiraOperations implements AccountOperations {

	private final RestTemplate restTemplate;

	public AccountTemplate(String baseUrl, RestTemplate restTemplate) {
		super(baseUrl);
		this.restTemplate = restTemplate;
	}

	@Override
	public AccountSearchResults search(AccountSearchParameters searchParameters) {
		MultiValueMap<String, String> parameters = AccountSearchParametersUtil.buildQueryParametersFromSearchParameters(searchParameters);
		return restTemplate.getForObject(buildUri("/rest/tempo-accounts/1/account/search", parameters), AccountSearchResults.class);
	}

	@Override
	public Account getAccount(long accountId) {
		return restTemplate.getForObject(buildUri("/rest/tempo-accounts/1/account/" + accountId), Account.class);
	}

	@Override
	public List<AccountLink> getLinks(long accountId) {
		return restTemplate.getForObject(buildUri("/rest/tempo-accounts/1/account/" + accountId + "/link"), AccountLinkList.class);
	}

	private static class AccountLinkList extends ArrayList<AccountLink> {}
}
