package org.springframework.social.jira.tempo.impl;

import org.springframework.social.jira.tempo.WorklogSearchParameters;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;

import java.time.format.DateTimeFormatter;

class WorklogSearchParametersUtil {

	public static MultiValueMap<String, String> buildQueryParametersFromSearchParameters(WorklogSearchParameters searchParameters) {
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
		if (searchParameters.getDateFrom() != null) {
			parameters.set("dateFrom", searchParameters.getDateFrom().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		}
		if (searchParameters.getDateTo() != null) {
			parameters.set("dateTo", searchParameters.getDateTo().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		}
		if (StringUtils.hasText(searchParameters.getAccountKey())) {
			parameters.set("accountKey", searchParameters.getAccountKey());
		}
		return parameters;
	}
}