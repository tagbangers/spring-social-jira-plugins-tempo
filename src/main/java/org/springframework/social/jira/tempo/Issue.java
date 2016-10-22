package org.springframework.social.jira.tempo;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;

public class Issue implements Serializable {

	private long id;

	private String self;

	private long projectId;

	private String key;

	private long remainingEstimateSeconds;

	private IssueType issueType;

	private String summary;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public long getRemainingEstimateSeconds() {
		return remainingEstimateSeconds;
	}

	public void setRemainingEstimateSeconds(long remainingEstimateSeconds) {
		this.remainingEstimateSeconds = remainingEstimateSeconds;
	}

	public IssueType getIssueType() {
		return issueType;
	}

	public void setIssueType(IssueType issueType) {
		this.issueType = issueType;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Issue that = (Issue) o;
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
