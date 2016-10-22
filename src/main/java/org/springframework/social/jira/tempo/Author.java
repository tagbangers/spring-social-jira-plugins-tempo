package org.springframework.social.jira.tempo;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;

public class Author implements Serializable {

	private String self;

	private String name;

	private String displayName;

	private String avatar;

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Author that = (Author) o;
		return new EqualsBuilder()
				.append(getSelf(), that.getSelf())
				.append(getName(), that.getName())
				.append(getDisplayName(), that.getDisplayName())
				.append(getAvatar(), that.getAvatar())
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(getSelf())
				.append(getName())
				.append(getDisplayName())
				.append(getAvatar())
				.toHashCode();
	}
}
