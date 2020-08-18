package main.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class WinScreen implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		terminal.write("CODER YOU HAVE DONE IT, ", 1, 1);
		terminal.writeCenter("-- press f to restart --", 22);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_F ? new PlayScreen() : this;
	}
}
