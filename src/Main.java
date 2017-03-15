
public class Main {
	
	public static void main(String[] args)  {
		
		Game game= new Game();
		
		try {
			game.playGame();
		} catch (NoSuchCityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getHiddenException();
			e.getMessage();
		}
		

	}

}
