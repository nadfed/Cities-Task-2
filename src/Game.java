import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;




public class Game {
	UserPlayer userplayer = new UserPlayer();
	ComputerPlayer computerplayer = new ComputerPlayer();
	 public  static ArrayList<City> cityList = new ArrayList<>(); 
	 HashSet<String> game = new HashSet<String>();
	 String S = null;
	 UserPlayer userTurn = new UserPlayer();
	 char lastLetter;
	 String lastSymbol;
	 String cityComputer = "a";
	
	 public ArrayList<City> fillcityList(String fileName) {
	        
	        
	         try(BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)))) {
	            while ((S = reader.readLine()) != null) {
	                cityList.add(new City(S));
	            }  
	        }  
	        catch (IOException e) {
	            System.out.println(e);
	        } 
	       return cityList;
			//return null;
	    }
	 public String UserPlayerCity() throws NoSuchCityException {
			System.out.print("User, it is your turn: ");
			Scanner sc = new Scanner(System.in);
			String cityUser = "";
			int index = 0;
			if (sc.hasNext()){
				cityUser = sc.nextLine();
				//correctCity(cityUser);
				
				ArrayList<City> cities = fillcityList("cities/citylist.txt");
				int j = 0;
				 while (!cities.isEmpty()){
					 
					 if(cityUser.equalsIgnoreCase(cities.get(j).toString())){
						 index++;
						 break;
						
					 }
					 else {
						 j++;
						 if(j==1077) break;
						  
					 }
					 
				 }
				 //}
			if (index==0){
				//System.out.println("No such city in Russia"); 
				throw new NoSuchCityException("No such city in Russia");
			}
			}
			else{
				System.out.println("Your answer is accepted");
				
			}
			return cityUser;
			
	 }
	 public boolean correctCity(String answer){
		 if (game.contains(answer)){
			 System.out.println("This city has already been mentioned, name another one");
			 return false;
		 }
		 else return true;
	 }
	 public String CityLastLetter (String city){
		 
		 if (!city.isEmpty()){
				char lastLetter = city.charAt(city.length()-1);
		 lastSymbol = String.valueOf(lastLetter).toLowerCase();
		 //return 0;
	 
	 }
		return lastSymbol;
	 
}
	 public boolean addCityToHashSet(String city, HashSet<String> game){
			boolean result = false;
			if (!city.isEmpty()){
				if (game.contains(city) == false) {
					game.add(city);
					result = true;
				} else {
					System.out.println("Do not repeat cities!");
				}	
			}
			return result;
		}
	 public String ComputerPlayerCity(String cityUser){
		// System.out.println("The Computer's answer is:");
		 int i = 0;
		 
		 ArrayList<City> cities = fillcityList("cities/citylist.txt");
		 String last = CityLastLetter(cityUser);
		 System.out.println("Computer searches for cities that start with " + "<" + last + ">");
		 while (!cities.isEmpty()){
			 char ch =(cities.get(i).getName().charAt(0));
			 String first = String.valueOf(ch);
			 System.out.print(first);
			 if(first.equalsIgnoreCase(last)){
				 cityComputer = cities.get(i).toString();
				 if (game.contains(cityComputer)){
					 cityComputer = cities.get(i+1).toString(); 
				 }
				 //System.out.println(cityComputer);
				 cities.remove(i);
				 break;
			 } else{
				 i++;
			 }
				
		 }
		 return cityComputer;
	 }
	 public void playGame() throws NoSuchCityException {
		 int i = 0;
		 while(i!=5){
		String userTurn = UserPlayerCity();
		if((correctCity(userTurn)) == false){
			userTurn = UserPlayerCity();
		}
		userplayer.setUserAnswer(userTurn);
		printAnswer("you say: ".concat(userplayer.getUserAnswer()));
		addCityToHashSet(userTurn, game);
		System.out.println("City " + userTurn + " is added to HashSet."); 
		
		String computerTurn = ComputerPlayerCity(userTurn);
		computerplayer.setComputerAnswer(computerTurn);
		System.out.println();
		printAnswer("computer says: ".concat(computerplayer.getComputerAnswer()));
		addCityToHashSet(computerTurn, game); 
		System.out.println("City " + computerTurn + " is added to HashSet."); 
		i++;
		
	 }
	 }
	 public void printAnswer(String answer){
		 System.out.println(answer); 
	 }
}
