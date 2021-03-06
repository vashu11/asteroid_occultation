package solution.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class TelescopeManager {

	private final static String INPUT_FILE_TELESCOPES = "telescope.txt";

	private List<Telescope> telescopes = new ArrayList<Telescope>();
	private String folder;
	
	public TelescopeManager(String folder) {
		this.folder = folder;
	}
	
	public void Load() throws IOException {
		Path eventsFile = Paths.get(Paths.get("").toAbsolutePath() + java.io.File.separator + this.folder + java.io.File.separator + INPUT_FILE_TELESCOPES);
		BufferedReader reader = Files.newBufferedReader(eventsFile, Charset.defaultCharset());
		StringBuilder content = new StringBuilder();
		String line = null;
		while ((line = reader.readLine()) != null) {
		    content.append(line).append("/n");
		    
		    String[] parts = line.split(" ");
		    if (parts[0].equals("#")) { 
		    	continue;
		    }
		    Telescope t = new Telescope();
		    t.setId(Integer.parseInt(parts[0]));
		    t.setX(Double.parseDouble(parts[1]));
		    t.setY(Double.parseDouble(parts[2]));
		    telescopes.add(t);
		}
	}

	public List<Telescope> getTelescopes() {
		return telescopes;
	}

	public void setTelescopes(List<Telescope> telescopes) {
		this.telescopes = telescopes;
	}
	
	public Telescope getTelescopeById(int id) {
		for (Telescope t : this.telescopes) {
			if (t.getId() == id) {
				return t;
			}
		}
		return null;
	}
	
	
}
