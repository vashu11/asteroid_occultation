package solution;
import java.util.List;

import solution.model.Asteroid;
import solution.model.AsteroidManager;
import solution.model.Telescope;
import solution.model.Event;
import solution.model.TelescopeManager;
import solution.model.EventManager;

import solution.algorithm.AlgorithmRunner;

public class Test {
//	private final static String INPUT_FOLDER = ".." + 
//				java.io.File.separator + "simulation";
	
	private final static String INPUT_FOLDER = ".";

	public static void main(String[] args) throws Exception {
		TelescopeManager tm = new TelescopeManager(INPUT_FOLDER);
		
		tm.Load();
		
		AsteroidManager am = new AsteroidManager(INPUT_FOLDER);
		
		am.Load();
		
		List<Telescope> telescopes = tm.getTelescopes();
		
		List<Asteroid> asteroids = am.getAsteroids();
		
		System.out.println(telescopes);
		
		
		EventManager em = new EventManager(INPUT_FOLDER);
		
		em.Load(tm);
		
		List<Event> events = em.getEvents();
		
		System.out.println(events);
		System.out.println(asteroids);
		
		new AlgorithmRunner(telescopes, events, asteroids).run();
	}
	
//	public static LoadEvents() {
//		
//	}
//	
//	public static LoadAsteroids() {
//		
//	}
//	
//	public static LoadTelescopes() {
//		
//	}

}
