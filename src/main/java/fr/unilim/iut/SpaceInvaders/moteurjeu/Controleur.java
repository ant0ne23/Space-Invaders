package fr.unilim.iut.SpaceInvaders.moteurjeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controleur implements KeyListener {

	private Commande commandeEnCours;
	private  Commande commandeARetourner;

	public Controleur() {
		this.commandeEnCours = new Commande();
		this.commandeARetourner = new Commande();
	}

	public Commande getCommande() {
		Commande aRetourner = this.commandeARetourner;
		this.commandeARetourner = new Commande(this.commandeEnCours);
		return (aRetourner);
	}

	public void keyPressed(KeyEvent e) {

		switch (e.getKeyChar()) {
		case 'q':
			this.commandeEnCours.gauche = true;
			this.commandeARetourner.gauche = true;
			break;
		case 'd':
			this.commandeEnCours.droite = true;
			this.commandeARetourner.droite = true;
			break;
		case 'z':
			this.commandeEnCours.haut = true;
			this.commandeARetourner.haut = true;
			break;
		case 's':
			this.commandeEnCours.bas = true;
			this.commandeARetourner.bas = true;
			break;
		}

	}

	public void keyReleased(KeyEvent e) {
		switch (e.getKeyChar()) {
		case 'q':
			this.commandeEnCours.gauche = false;
			break;
		case 'd':
			this.commandeEnCours.droite = false;
			break;
		case 'z':
			this.commandeEnCours.haut = false;
			break;
		case 's':
			this.commandeEnCours.bas = false;
			break;
		}

	}

	public void keyTyped(KeyEvent e) {

	}

}
