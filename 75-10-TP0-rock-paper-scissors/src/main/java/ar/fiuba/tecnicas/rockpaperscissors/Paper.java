package ar.fiuba.tecnicas.rockpaperscissors;

public class Paper {
	
	public Scissors vs(Scissors scissors){
		return new Scissors();
	}
	
	public Paper vs(Paper paper){
		return new Paper();
	}
	
	public Paper vs(Rock rock){
		return new Paper();
	}
}
