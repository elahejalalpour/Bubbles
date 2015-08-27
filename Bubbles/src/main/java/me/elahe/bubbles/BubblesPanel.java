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

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static java.awt.Color.*;

public class BubblesPanel extends JPanel {

	Color[] colors = new Color[]{BLACK, GRAY, BLACK, PINK, RED, ORANGE, YELLOW,
		GREEN, BLUE, CYAN};
	private ArrayList<Bubble> bubbles;

	public BubblesPanel(ArrayList<Bubble> bubbles) {
		this.bubbles = bubbles;
		setBackground(new Color(0, 0, 0, 10));
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (Bubble bubble : bubbles) {
			g.setColor(colors[bubble.getColor()]);
			g.fillOval(bubble.getX(), bubble.getY(), bubble.getDiameter(), bubble.getDiameter());
		}
	}
}