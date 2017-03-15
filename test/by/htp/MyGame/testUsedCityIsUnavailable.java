package by.htp.MyGame;

import java.util.HashSet;

import org.testng.annotations.Test;

public class testUsedCityIsUnavailable {
  @Test
  public void f() {
	  Game game = new Game();
	  HashSet<String> usedCities = new HashSet<String>();
	  String userTurn = game.UserPlayerCity("ќмск");
	  game.addCityToHashSet(userTurn, usedCities);
	  String computerTurn = game.ComputerPlayerCity(userTurn);
	  String userTurn2 = game.UserPlayerCity("ќмск");
	  AssertFalse(game.addCityToHashSet(userTurn2, usedCities));
  }
}
