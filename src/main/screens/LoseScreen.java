package main.screens;

import java.awt.event.KeyEvent;

import main.entities.Creature;
import asciiPanel.AsciiPanel;

public class LoseScreen implements Screen {
	private Creature player;
	
	public LoseScreen(Creature player){
		this.player = player;
	}
	
	@Override
	public void displayOutput(AsciiPanel terminal) {
		terminal.writeCenter("The customer again did not pay for the order and the coder died of starvation", 3);
		terminal.writeCenter(player.causeOfDeath(), 5);
		terminal.writeCenter("-- press F to restart --", 22);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_F ? new PlayScreen() : this;
	}
}
