package org.springframework.social.jira.tempo;

import org.springframework.social.ApiBinding;
import org.springframework.social.jira.api.Jira;

public interface Tempo extends ApiBinding {

	Jira jira();

	AccountOperations accountOperations();

	CustomerOperations customerOperations();

	WorklogOperations worklogOperations();
}
