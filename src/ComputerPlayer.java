
public class ComputerPlayer {
String computerAnswer;
char startLetter;
char endLetter;
public ComputerPlayer(String computerAnswer, char startLetter, char endLetter) {
	super();
	this.computerAnswer = computerAnswer;
	this.startLetter = startLetter;
	this.endLetter = endLetter;
}
public ComputerPlayer() {
	// TODO Auto-generated constructor stub
}
public String getComputerAnswer() {
	return computerAnswer;
}
public void setComputerAnswer(String computerAnswer) {
	this.computerAnswer = computerAnswer;
}
public char getStartLetter() {
	return startLetter;
}
public void setStartLetter(char startLetter) {
	this.startLetter = startLetter;
}
public char getEndLetter() {
	return endLetter;
}
public void setEndLetter(char endLetter) {
	this.endLetter = endLetter;
}

}
