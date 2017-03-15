import java.io.IOException;

public class NoSuchCityException extends Exception {
	
private IOException noSuchCityException;
private String er;

public NoSuchCityException(String er){
this.er = er;
}

public IOException getHiddenException(){
	return noSuchCityException;
}
}
