package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import main.screens.Screen;
import main.screens.StartScreen;
import asciiPanel.AsciiPanel;
import main.screens.ThreadSound;

public class MainApplication extends JFrame implements KeyListener {
// to fix: (***NOTHING***) SOOOOUUUND

	private AsciiPanel terminal;
	private Screen screen;


	public MainApplication() {
		super();
		terminal = new AsciiPanel(100,42);
		add(terminal);
		pack();
		screen = new StartScreen();
		addKeyListener(this);
		repaint();
	}

	@Override
	public void repaint() {
		terminal.clear();
		screen.displayOutput(terminal);
		super.repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		screen = screen.respondToUserInput(e);
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	public static void main(String[] args) {
		MainApplication app = new MainApplication();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	//	ThreadSound ts = new ThreadSound(); убери комментарии и удали while если музыка проигрывается 1 раз;
	//	ts.run();
		while (true) {
			Sound.playSound("src/gameTheme.wav").join();
		}
	}
}
