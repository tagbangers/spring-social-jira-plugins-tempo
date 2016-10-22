package org.springframework.social.jira.tempo.impl;

import org.springframework.social.jira.tempo.AccountSearchParameters;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;

class AccountSearchParametersUtil {

	public static MultiValueMap<String, String> buildQueryParametersFromSearchParameters(AccountSearchParameters searchParameters) {
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
		if (StringUtils.hasText(searchParameters.getQuery())) {
			parameters.set("query", searchParameters.getQuery());
		}
		if (StringUtils.hasText(searchParameters.getTqlQuery())) {
			parameters.set("tqlQuery", searchParameters.getTqlQuery());
		}
		return parameters;
	}
}