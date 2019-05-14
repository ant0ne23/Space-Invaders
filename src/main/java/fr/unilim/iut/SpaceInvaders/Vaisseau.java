package fr.unilim.iut.SpaceInvaders;

public class Vaisseau {

    int x;
    int y;
    int longueur;
    int hauteur;

	public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}

    public Vaisseau(int longueur, int hauteur, int x, int y) {
	   this.longueur=longueur;
	   this.hauteur=hauteur;
	   this.x = x;
	   this.y = y;
    }
	
    public boolean occupeLaPosition(int x, int y) {
	     if (estAbscisseCouverte(x) && estOrdoneeCouverte(y))
			return true;
		
	     return false;
    }

	private boolean estOrdoneeCouverte(int y) {
		return (ordoneeLaPlusHaute()<=y) && (y<=ordoneeLaPlusBasse());
	}

	private int ordoneeLaPlusBasse() {
		return this.y;
	}

	private int ordoneeLaPlusHaute() {
		return ordoneeLaPlusBasse()-this.hauteur+1;
	}

	private boolean estAbscisseCouverte(int x) {
		return (this.x<=abcisseLaPlusAGauche()) && (x<=abscisseLaPlusADroite());
	}

	private int abscisseLaPlusADroite() {
		return this.x+this.longueur-1;
	}
	
    public void seDeplacerVersLaDroite() {
	      this.x = this.x + 1 ;
    }
    
    public int abcisseLaPlusAGauche() {
    	return this.x;
    }

	public void seDeplacerVersLaGauche() {
		this.x = this.x - 1 ;
	}

    public void positionner(int x, int y) {
	    this.x = x;
	    this.y = y;
    }
}