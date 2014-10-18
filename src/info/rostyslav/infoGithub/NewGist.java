package info.rostyslav.infoGithub;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.egit.github.core.Gist;
import org.eclipse.egit.github.core.GistFile;
import org.eclipse.egit.github.core.service.GistService;

public class NewGist  {

	public static void createNewGist(String user, String password, String code, String description,
			String nameFile, boolean isPublic) throws IOException {

		GistFile file = new GistFile();
		file.setContent(code);

		Gist gist = new Gist();
		gist.setDescription(description);
		gist.setFiles(Collections.singletonMap(nameFile, file));
		gist.setPublic(isPublic);

		GistService service = new GistService();
		service.getClient().setCredentials(user, password);

		gist = service.createGist(gist);
	}

}
