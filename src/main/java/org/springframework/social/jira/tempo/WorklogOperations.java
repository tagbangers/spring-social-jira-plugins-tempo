package org.springframework.social.jira.tempo;

import java.util.List;

public interface WorklogOperations {

	List<Worklog> search(WorklogSearchParameters searchParameters);
}
