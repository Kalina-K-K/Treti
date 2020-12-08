package edu3;
import java.util.ArrayList;
import java.util.Arrays;
public class Film {
	String name;
	ArrayList<Actor> actors;
	ArrayList<Scene>scenes;
	
	Film(){
		scenes = new ArrayList<Scene> (Arrays.asList(new Scene(1), new Scene(2), new Scene(3)));
	}
}
