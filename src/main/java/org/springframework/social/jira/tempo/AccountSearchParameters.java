package org.springframework.social.jira.tempo;

public class AccountSearchParameters {

	private String query;

	private String tqlQuery;

	public AccountSearchParameters(String query) {
		this.query = query;
	}

	public AccountSearchParameters tqlQuery(String tqlQuery) {
		this.tqlQuery = tqlQuery;
		return this;
	}

	public String getQuery() {
		return query;
	}

	public String getTqlQuery() {
		return tqlQuery;
	}
}
