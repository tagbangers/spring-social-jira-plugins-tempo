package org.springframework.social.jira.tempo;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;

public class IssueType implements Serializable {

	private String name;

	private String iconUrl;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		IssueType that = (IssueType) o;
		return new EqualsBuilder()
				.append(getName(), that.getName())
				.append(getIconUrl(), that.getIconUrl())
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(getName())
				.append(getIconUrl())
				.toHashCode();
	}
}
