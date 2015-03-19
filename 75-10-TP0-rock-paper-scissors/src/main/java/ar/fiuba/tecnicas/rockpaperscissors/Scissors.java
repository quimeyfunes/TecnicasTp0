package ar.fiuba.tecnicas.rockpaperscissors;

public class Scissors {
	public Scissors vs(Scissors scissors){
		return new Scissors();
	}
	
	public Scissors vs(Paper paper){
		return new Scissors();
	}
	
	public Rock vs(Rock rock){
		return new Rock();
	}
}
