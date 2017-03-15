package by.htp.MyGame;

import java.io.IOException;

import org.testng.annotations.Test;

public class testCityListPath {
  @Test(expectedExceptions=IOException.class)
  public void cityListDowloaded() {
	  Game game = new Game();
	  game.fillcityList("cities/wrong.txt");
	  
  }
}
