package fr.unilim.iut.SpaceInvaders;
  
public class SpaceInvaders {

	int longueur;
	int hauteur;

	public SpaceInvaders(int longueur, int hauteur) {
		this.longueur = longueur;
		this.hauteur = hauteur;
	}
	
	@Override
    public String toString() {
		StringBuilder espaceJeu = new StringBuilder();
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < longueur; j++) {
            	espaceJeu.append('.');
            }
            espaceJeu.append('\n');
        }
        return espaceJeu.toString();
    }
}