package main.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;
import main.Sound;

public class StartScreen implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		terminal.writeCenter("THAT STORY TELL US ABOUT BEGINNER CODER", 10);
		terminal.writeCenter("ON THIS WAY A BEGINNER CODER MEET MUCH TROUBLES, SO YOU NEED TO MAKE YOU PROJECT SUCCECEFUL", 12);
		terminal.writeCenter("MADE BY _pinky_Man_ from NaNi Team", 14);
		terminal.writeCenter("-- press f to start --", 32);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {

		return key.getKeyCode() == KeyEvent.VK_F ? new PlayScreen() : this;
	}
}
