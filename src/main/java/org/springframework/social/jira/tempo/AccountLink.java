package org.springframework.social.jira.tempo;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;

public class AccountLink implements Serializable {

	private long id;

	private String scopeType;

	private long scope;

	private long accountId;

	private String key;

	private String name;

	private String linkType;

	private boolean defaultAccount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getScopeType() {
		return scopeType;
	}

	public void setScopeType(String scopeType) {
		this.scopeType = scopeType;
	}

	public long getScope() {
		return scope;
	}

	public void setScope(long scope) {
		this.scope = scope;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLinkType() {
		return linkType;
	}

	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}

	public boolean isDefaultAccount() {
		return defaultAccount;
	}

	public void setDefaultAccount(boolean defaultAccount) {
		this.defaultAccount = defaultAccount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccountLink that = (AccountLink) o;
		return new EqualsBuilder()
				.append(getId(), that.getId())
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(getId())
				.toHashCode();
	}
}
