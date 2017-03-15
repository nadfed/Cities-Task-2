package by.htp.MyGame;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNonexistentCityInput {
	
  @Test(expectedExceptions=Exception.class)
  public void nameNonexistentCity() {
	 Game game = new Game();
	 Assert.assertEquals(game.userPlayer("Хойники"));
  }
}
