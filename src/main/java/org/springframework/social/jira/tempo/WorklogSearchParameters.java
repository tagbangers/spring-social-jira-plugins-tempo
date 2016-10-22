package org.springframework.social.jira.tempo;

import java.time.LocalDate;

public class WorklogSearchParameters {

	private LocalDate dateFrom;

	private LocalDate dateTo;

	private String accountKey;

	public WorklogSearchParameters(LocalDate dateFrom, LocalDate dateTo) {
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
	}

	public WorklogSearchParameters accountKey(String accountKey) {
		this.accountKey = accountKey;
		return this;
	}

	public LocalDate getDateFrom() {
		return dateFrom;
	}

	public LocalDate getDateTo() {
		return dateTo;
	}

	public String getAccountKey() {
		return accountKey;
	}
}
