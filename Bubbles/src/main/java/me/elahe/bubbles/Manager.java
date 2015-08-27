/*
 * In The Name Of God
 * ========================================
 * [] File Name : Manager.java
 *
 * [] Creation Date : 27-08-2015
 *
 * [] Created By : Elahe Jalalpour (el.jalalpour@gmail.com)
 * =======================================
*/
/**
 * @author Elahe Jalalpour
 */
package me.elahe.bubbles;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.awt.Color.*;

public class Manager extends JPanel implements Runnable {

	public static ArrayList<Bubbles> b;
	Color[] colors = new Color[]{BLACK, GRAY, BLACK, PINK, RED, ORANGE, YELLOW,
		GREEN, BLUE, CYAN};
	BufferedImage desktop;

	public Manager() {
		b = new ArrayList();
		Bubbles bubble = new Bubbles();
		b.add(bubble);
		bubble.setX(300);
		bubble.setY(300);
		try {
			desktop = ImageIO.read(new File("images.jpg"));
		} catch (IOException ex) {
			Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(desktop, 0, 0, 650, 650, null);
		for (Bubbles bu : b) {
			g.setColor(colors[bu.getO()]);
			g.fillOval(bu.getX(), bu.getY(), bu.getDiameter(), bu.getDiameter());

		}
	}

	@Override
	public void run() {

		for (Bubbles bubble : b) {
			bubble.move();
		}
		repaint();

		try {
			Thread.sleep(40);
		} catch (InterruptedException ex) {
			Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
		}


	}
}