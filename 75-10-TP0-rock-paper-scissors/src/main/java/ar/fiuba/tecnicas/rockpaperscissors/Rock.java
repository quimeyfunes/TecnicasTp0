package ar.fiuba.tecnicas.rockpaperscissors;

public class Rock {

	public Rock vs(Scissors scissors){
		return new Rock();
	}
	
	public Paper vs(Paper paper){
		return new Paper();
	}
	
	public Rock vs(Rock rock){
		return new Rock();
	}
}
