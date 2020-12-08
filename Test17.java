package edu3;

import java.util.ArrayList;
import java.util.Arrays;

public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fest fest = new Fest();
		fest.name="Sofia film fest";
		Actor pitt = new Actor();
		pitt.name="Brad Pitt";
		Actor smith = new Actor();
		smith.name="Will Smith";
		Actor jolie = new Actor();
		jolie.name = "Angelina Jolie";
		
		Film f1 = new Film();
		f1.name="Mr. and Mrs. Smith";
		Film f2 = new Film();
		f2.name="Men in black";
		Film f3 = new Film();
		f3.name = "Bright 2";
		
		pitt.films= new ArrayList<Film>(Arrays.asList(f1));
		jolie.films= new ArrayList<Film>(Arrays.asList(f1,f3));
		smith.films= new ArrayList<Film>(Arrays.asList(f2,f3));
		
		f1.actors = new ArrayList<Actor>(Arrays.asList(pitt,jolie));
		f2.actors= new ArrayList<Actor>(Arrays.asList(smith));
		f3.actors= new ArrayList<Actor>(Arrays.asList(smith,jolie));
		
		fest.filmsf = new ArrayList<Film>(Arrays.asList(f1, f2, f3));
		
		System.out.println("Films in " + fest.name + ":");
		for(Film f : fest.filmsf) {
			System.out.print(f.name + ": ");
			for(Actor a : f.actors) {
				System.out.print(a.name + " ");
			}
			System.out.println();
		}
		
	}

}
