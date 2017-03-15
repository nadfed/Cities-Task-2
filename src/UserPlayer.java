
public class UserPlayer {
String userAnswer;
char startLetter;
char endLetter;
public UserPlayer(String userAnswer, char startLetter, char endLetter) {
	super();
	this.userAnswer = userAnswer;
	this.startLetter = startLetter;
	this.endLetter = endLetter;
}
public UserPlayer(){}
public String getUserAnswer() {
	return userAnswer;
}
public void setUserAnswer(String userAnswer) {
	this.userAnswer = userAnswer;
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
