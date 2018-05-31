package my.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class MoviesPage extends WebUIInteractions{
	private static By moviesList = By.xpath("//ul[@class='movie__grid']//dt//a");
	
	public boolean checkIfNowShowingIsSelected() {
		boolean result = false;
		if(getCurrentUrl().contains("now-showing")) 
			result = true;
		return result;
	}
	
	public ArrayList<String> getListOfNowShowingMovies(){
		return getListOfElements(moviesList);
	}

}
