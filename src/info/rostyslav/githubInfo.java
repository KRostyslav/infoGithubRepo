package info.rostyslav;

import java.io.IOException;

import org.eclipse.egit.github.core.*;
import org.eclipse.egit.github.core.client.*;
import org.eclipse.egit.github.core.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class githubInfo implements dataInterface {

	static Logger logger = LoggerFactory.getLogger(githubInfo.class);

	public static void main(String[] args) throws IOException {
		logger.info("Hello GitHubInfo");
		System.out.println("------------");
	//	infoRepo(USER,REPO);
	//	watchRepo(USER);		
	//	NewGist.createNewGist(USER, PASSWORD, CODE, DESCRIPTION, NAME_FILE, isPublicGist);
	}

	public static void watchRepo(String user) throws IOException {
		RepositoryService service = new RepositoryService();
		for (Repository repo : service.getRepositories(user))
			System.out.println(repo.getName() + " repository watchers "
					+ repo.getWatchers() + " user(s).");
	}

	public static void infoRepo(String user, String repository) throws IOException {
		RepositoryService service = new RepositoryService();
		Repository repo = service.getRepository(user, repository);
		System.out.println("Id " + repo.getId());
		System.out.println("Name " + repo.getName());
		System.out.println("Description " + repo.getDescription());
		System.out.println("Homepage " + repo.getHomepage());
		System.out.println("Size " + repo.getSize());
		System.out.println("Language " + repo.getLanguage());
		System.out.println("Owner " + repo.getOwner().getLogin());
		System.out.println("Parent " + repo.getParent());
		System.out.println("HtmlUrl " + repo.getHtmlUrl());
		System.out.println("GitUrl " + repo.getGitUrl());
		System.out.println("UpdatedAt " + repo.getUpdatedAt());
		System.out.println("Watchers " + repo.getWatchers());
		System.out.println("MasterBranch " + repo.getMasterBranch());
	}
}
