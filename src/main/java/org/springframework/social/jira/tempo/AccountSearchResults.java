package org.springframework.social.jira.tempo;

import java.io.Serializable;
import java.util.List;

public class AccountSearchResults implements Serializable {

	private int pageSize;

	private int currentPage;

	private int totalRecords;

	private int totalPages;

	private String tqlQuery;

	private List<Account> accounts;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public String getTqlQuery() {
		return tqlQuery;
	}

	public void setTqlQuery(String tqlQuery) {
		this.tqlQuery = tqlQuery;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
}
