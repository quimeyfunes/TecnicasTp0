package ar.fiuba.tecnicas.rockpaperscissors;

public class Rock {

	public Rock vs(Scissors scissors){
		return this;
	}
	
	public Paper vs(Paper paper){
		return paper;
	}
	
	public Rock vs(Rock rock){
		return this;
	}
}
