package org.springframework.social.jira.tempo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Worklog implements Serializable {

	private Long id;

	private String self;

	private long timeSpentSeconds;

//	@JsonFormat(pattern = "yyyy-MM-ddTHH:mm:ss.zzz")
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime dateStarted;

	private String comment;

	private Author author;

	private Issue issue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public long getTimeSpentSeconds() {
		return timeSpentSeconds;
	}

	public void setTimeSpentSeconds(long timeSpentSeconds) {
		this.timeSpentSeconds = timeSpentSeconds;
	}

	public LocalDateTime getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(LocalDateTime dateStarted) {
		this.dateStarted = dateStarted;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Worklog that = (Worklog) o;
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
