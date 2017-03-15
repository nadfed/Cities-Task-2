package by.htp.MyGame;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class testCitylistCorrect {
  @Test
  public void f() {
	  Game game = new Game();
	  ArrayList<City> citylist = game.fillcityList("cities/cities.txt");
	  AssertEquals(citylist.get(0).toString(), "Абаза");
	  AssertEquals(citylist.get(1).toString(), "Абакан");
	  AssertEquals(citylist.size(), 1111);
}
}
