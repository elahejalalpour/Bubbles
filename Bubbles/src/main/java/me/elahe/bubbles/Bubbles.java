/*
 * In The Name Of God
 * ========================================
 * [] File Name : Bubbles.java
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

import java.util.Random;


public class Bubbles {

	private int x, y, diameter, k, m, o;

	public Bubbles() {

		diameter = 100;
		Random random = new Random();
		o = random.nextInt(9);

		Random rand = new Random();
		int n = rand.nextInt(8);
		Random rando = new Random();
		int l = rando.nextInt(8);
		if (n > 0) {
			k = n;
		} else {
			rand = new Random();
			n = rand.nextInt(8);
			k = n;
		}
		if (l > 0) {
			m = l;
		} else {
			rando = new Random();
			l = rando.nextInt(8);
			m = l;
		}
	}

	public void move() {

		if (x < 550 && x > 0 && y < 550 && y > 0) {
			x = x + k;
			y = y + m;
		} else {
			k = -k;
			m = -m;
			x = x + k;
			y = y + m;
		}
	}

	public int getDiameter() {
		return diameter;
	}

	/**
	 * @param diameter the diameter to set
	 */
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the o
	 */
	public int getO() {
		return o;
	}

	/**
	 * @param o the o to set
	 */
	public void setO(int o) {
		this.o = o;
	}


}
