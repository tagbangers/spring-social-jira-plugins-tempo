package org.springframework.social.jira.tempo;

import java.util.List;

public interface AccountOperations {

	AccountSearchResults search(AccountSearchParameters searchParameters);

	Account getAccount(long accountId);

	List<AccountLink> getLinks(long accountId);
}
