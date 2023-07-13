package com;

import java.util.ArrayList;
import java.util.List;

public class GameService {
	static private List<Game> games=new ArrayList<Game>();
	public  GameService() {
		games.clear();
		games.add(new Game("SnowBird","Danny",300));
		games.add(new Game("FreshFood","Ram",450));
		games.add(new Game("Batsman","Kate",400));
		games.add(new Game("Pokiman","Steeve",600));
		games.add(new Game("YammyTommy","Narayan",350));
	}
	public List<Game> viewAll(){
		return games;
	}
	
	public String authorSearch(String author) {
		if(author==null)
			return null;
		String foundGameName=null;
//		
		for(Game game:games) {
			if(game.getAuthorName().equalsIgnoreCase(author)) {
				foundGameName= game.getGameName();			}
		}
		
		if(foundGameName!=null)
			return foundGameName;
		else {
			System.out.println("Game NOT FOUND");
			return foundGameName;
		}
		
		
	}
}
