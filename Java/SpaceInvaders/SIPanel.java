package src;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class SIPanel extends JPanel {

	private Font font = new Font("Consolas", Font.PLAIN, 18);
	private Font font2 = new Font("Arial", Font.BOLD, 48);
	private SImissile missile, missile2, missile3;
	private SIbase base;
	private SItop t0, t1, t2, t3, t4, t5, t6, t7, t8, t9;
	private SImiddle m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, M0, M1, M2, M3, M4, M5, M6, M7, M8, M9;
	private SIbottom b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9;
	private SImystery mystery;
	private boolean moveRight, gameOver, left, right;
	private double invaderCount=0, pulse=40;
	private int scoreNum=0, moveCount=15, mysteryCount =0,minx0, minx1, minx2, minx3, minx4, minx5, minx6, minx7, minx8, minx9; 
	private int missileCount, missilecount2, miny0, miny1, miny2, miny3, miny4, miny5, miny6, miny7, miny8, miny9, rando, randomys;
	private Random rand = new Random();
	private Timer timer;
	public SIPanel() {

		// initialize base and invaders
		restart();
		
		setFocusable(true); // allow keyListener to work
		 timer = new Timer(10, new ActionListener() {
			//@Override
			public void actionPerformed(ActionEvent e) {

				// Every pulse
				if (missile != null) {
					missile.moveYBy(-5);
					
					// Invader shot
					
					if(intersect(missile, b5)){
						b5.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						b5.hitShip();
					}
					else if(intersect(missile, b6)){
						b6.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						b6.hitShip();
					}
					else if(intersect(missile, b7)){
						b7.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						b7.hitShip();
					}
					else if(intersect(missile, b8)){
						b8.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						b8.hitShip();
					}
					else if(intersect(missile, b9)){
						b9.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						b9.hitShip();
					}
					else if(intersect(missile, b0)){
						b0.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						b0.hitShip();
					}
					else if(intersect(missile, b1)){
						b1.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						b1.hitShip();
					}
					else if(intersect(missile, b2)){
						b2.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						b2.hitShip();
					}
					else if(intersect(missile, b3)){
						b3.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						b3.hitShip();
					}
					else if(intersect(missile, b4)){
						b4.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						b4.hitShip();
					}
					else if(intersect(missile, B5)){
						B5.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						B5.hitShip();
					}
					else if(intersect(missile, B6)){
						B6.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						B6.hitShip();
					}
					else if(intersect(missile, B7)){
						B7.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						B7.hitShip();
					}
					else if(intersect(missile, B8)){
						B8.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						B8.hitShip();
					}
					else if(intersect(missile, B9)){
						B9.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						B9.hitShip();
					}
					else if(intersect(missile, B0)){
						B0.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						B0.hitShip();
					}
					else if(intersect(missile, B1)){
						B1.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						B1.hitShip();
					}
					else if(intersect(missile, B2)){
						B2.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						B2.hitShip();
					}
					else if(intersect(missile, B3)){
						B3.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						B3.hitShip();
					}
					else if(intersect(missile, B4)){
						B4.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(10);
						B4.hitShip();
					}
					else if(intersect(missile, m0)){
						m0.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						m0.hitShip();
					}
					else if(intersect(missile, m1)){
						m1.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						m1.hitShip();
					}
					else if(intersect(missile, m2)){
						m2.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						m2.hitShip();
					}
					else if(intersect(missile, m3)){
						m3.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						m3.hitShip();
					}
					else if(intersect(missile, m4)){
						m4.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						m4.hitShip();
					}
					else if(intersect(missile, m5)){
						m5.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						m5.hitShip();
					}
					else if(intersect(missile, m6)){
						m6.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						m6.hitShip();
					}
					else if(intersect(missile, m7)){
						m7.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						m7.hitShip();
					}
					else if(intersect(missile, m8)){
						m8.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						m8.hitShip();
					}
					else if(intersect(missile, m9)){
						m9.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						m9.hitShip();
					}
					else if(intersect(missile, M0)){
						M0.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						M0.hitShip();
					}
					else if(intersect(missile, M1)){
						M1.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						M1.hitShip();
					}
					else if(intersect(missile, M2)){
						M2.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						M2.hitShip();
					}
					else if(intersect(missile, M3)){
						M3.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						M3.hitShip();
					}
					else if(intersect(missile, M4)){
						M4.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						M4.hitShip();
					}
					else if(intersect(missile, M5)){
						M5.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						M5.hitShip();
					}
					else if(intersect(missile, M6)){
						M6.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						M6.hitShip();
					}
					else if(intersect(missile, M7)){
						M7.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						M7.hitShip();
					}
					else if(intersect(missile, M8)){
						M8.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						M8.hitShip();
					}
					else if(intersect(missile, M9)){
						M9.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(20);
						M9.hitShip();
					}
					else if(intersect(missile, t0)){
						t0.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(30);
						t0.hitShip();
					}
					else if(intersect(missile, t1)){
						t1.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(30);
						t1.hitShip();
					}
					else if(intersect(missile, t2)){
						t2.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(30);
						t2.hitShip();
					}
					else if(intersect(missile, t3)){
						t3.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(30);
						t3.hitShip();
					}
					else if(intersect(missile, t4)){
						t4.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(30);
						t4.hitShip();
					}
					else if(intersect(missile, t5)){
						t5.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(30);
						t5.hitShip();
					}
					else if(intersect(missile, t6)){
						t6.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(30);
						t6.hitShip();
					}
					else if(intersect(missile, t7)){
						t7.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(30);
						t7.hitShip();
					}
					else if(intersect(missile, t8)){
						t8.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(30);
						t8.hitShip();
					}
					else if(intersect(missile, t9)){
						t9.changeImage("SIinvaderBlast.gif");
						missile = null;
						updateScore(30);
						t9.hitShip();
					}
					else if(intersect(missile, mystery)){
						updateScore(mystery.points);
						mystery.stopSound();
						mystery = null;
						missile = null;
					}
					else if (missile.getY() == 0)
						missile = null;
				}
				if (left && base.getX() >= 5)
					base.moveXBy(-5);
				if (right && base.getX() <= 460)
					base.moveXBy(5);

				invaderCount++;

				// invaders move right and change every 40 pulses
				if (moveRight) {
					if (invaderCount == pulse) {
						if (t0 != null){
							t0.changeImage("SItop1.gif");
							if(t0.isShipHit()) t0 = null;
						}
						if (t1 != null){
							t1.changeImage("SItop1.gif");
							if(t1.isShipHit()) t1 = null;
						}
						if (t2 != null){
							t2.changeImage("SItop1.gif");
							if(t2.isShipHit()) t2 = null;
						}
						if (t3 != null){
							t3.changeImage("SItop1.gif");
							if(t3.isShipHit()) t3 = null;
						}
						if (t4 != null){
							t4.changeImage("SItop1.gif");
							if(t4.isShipHit()) t4 = null;
						}
						if (t5 != null){
							t5.changeImage("SItop1.gif");
							if(t5.isShipHit()) t5 = null;
						}
						if (t6 != null){
							t6.changeImage("SItop1.gif");
							if(t6.isShipHit()) t6 = null;
						}
						if (t7 != null){
							t7.changeImage("SItop1.gif");
							if(t7.isShipHit()) t7 = null;
						}
						if (t8 != null){
							t8.changeImage("SItop1.gif");
							if(t8.isShipHit()) t8 = null;
						}
						if (t9 != null){
							t9.changeImage("SItop1.gif");
							if(t9.isShipHit()) t9 = null;
						}
						if (m0 != null){
							m0.changeImage("SImiddle1.gif");
							if(m0.isShipHit()) m0 = null;
						}
						if (m1 != null){
							m1.changeImage("SImiddle1.gif");
							if(m1.isShipHit()) m1 = null;
						}
						if (m2 != null){
							m2.changeImage("SImiddle1.gif");
							if(m2.isShipHit()) m2 = null;
						}
						if (m3 != null){
							m3.changeImage("SImiddle1.gif");
							if(m3.isShipHit()) m3 = null;
						}
						if (m4 != null){
							m4.changeImage("SImiddle1.gif");
							if(m4.isShipHit()) m4 = null;
						}
						if (m5 != null){
							m5.changeImage("SImiddle1.gif");
							if(m5.isShipHit()) m5 = null;
						}
						if (m6 != null){
							m6.changeImage("SImiddle1.gif");
							if(m6.isShipHit()) m6 = null;
						}
						if (m7 != null){
							m7.changeImage("SImiddle1.gif");
							if(m7.isShipHit()) m7 = null;
						}
						if (m8 != null){
							m8.changeImage("SImiddle1.gif");
							if(m8.isShipHit()) m8 = null;
						}
						if (m9 != null){
							m9.changeImage("SImiddle1.gif");
							if(m9.isShipHit()) m9 = null;
						}
						if (M0 != null){
							M0.changeImage("SImiddle1.gif");
							if(M0.isShipHit()) M0 = null;
						}
						if (M1 != null){
							M1.changeImage("SImiddle1.gif");
							if(M1.isShipHit()) M1 = null;
						}
						if (M2 != null){
							M2.changeImage("SImiddle1.gif");
							if(M2.isShipHit()) M2 = null;
						}
						if (M3 != null){
							M3.changeImage("SImiddle1.gif");
							if(M3.isShipHit()) M3 = null;
						}
						if (M4 != null){
							M4.changeImage("SImiddle1.gif");
							if(M4.isShipHit()) M4 = null;
						}
						if (M5 != null){
							M5.changeImage("SImiddle1.gif");
							if(M5.isShipHit()) M5 = null;
						}
						if (M6 != null){
							M6.changeImage("SImiddle1.gif");
							if(M6.isShipHit()) M6 = null;
						}
						if (M7 != null){
							M7.changeImage("SImiddle1.gif");
							if(M7.isShipHit()) M7 = null;
						}
						if (M8 != null){
							M8.changeImage("SImiddle1.gif");
							if(M8.isShipHit()) M8 = null;
						}
						if (M9 != null){
							M9.changeImage("SImiddle1.gif");
							if(M9.isShipHit()) M9 = null;
						}
						if (b0 != null){
							b0.changeImage("SIbottom1.gif");
							if(b0.isShipHit()) b0 = null;
						}
						if (b1 != null){
							b1.changeImage("SIbottom1.gif");
							if(b1.isShipHit()) b1 = null;
						}
						if (b2 != null){
							b2.changeImage("SIbottom1.gif");
							if(b2.isShipHit()) b2 = null;
						}
						if (b3 != null){
							b3.changeImage("SIbottom1.gif");
							if(b3.isShipHit()) b3 = null;
						}
						if (b4 != null){
							b4.changeImage("SIbottom1.gif");
							if(b4.isShipHit()) b4 = null;
						}
						if (b5 != null){
							b5.changeImage("SIbottom1.gif");
							if(b5.isShipHit()) b5 = null;
						}
						if (b6 != null){
							b6.changeImage("SIbottom1.gif");
							if(b6.isShipHit()) b6 = null;
						}
						if (b7 != null){
							b7.changeImage("SIbottom1.gif");
							if(b7.isShipHit()) b7 = null;
						}
						if (b8 != null){
							b8.changeImage("SIbottom1.gif");
							if(b8.isShipHit()) b8 = null;
						}
						if (b9 != null){
							b9.changeImage("SIbottom1.gif");
							if(b9.isShipHit()) b9 = null;
						}
						if (B0 != null){
							B0.changeImage("SIbottom1.gif");
							if(B0.isShipHit()) B0 = null;
						}
						if (B1 != null){
							B1.changeImage("SIbottom1.gif");
							if(B1.isShipHit()) B1 = null;
						}
						if (B2 != null){
							B2.changeImage("SIbottom1.gif");
							if(B2.isShipHit()) B2 = null;
						}
						if (B3 != null){
							B3.changeImage("SIbottom1.gif");
							if(B3.isShipHit()) B3 = null;
						}
						if (B4 != null){
							B4.changeImage("SIbottom1.gif");
							if(B4.isShipHit()) B4 = null;
						}
						if (B5 != null){
							B5.changeImage("SIbottom1.gif");
							if(B5.isShipHit()) B5 = null;
						}
						if (B6 != null){
							B6.changeImage("SIbottom1.gif");
							if(B6.isShipHit()) B6 = null;
						}
						if (B7 != null){
							B7.changeImage("SIbottom1.gif");
							if(B7.isShipHit()) B7 = null;
						}
						if (B8 != null){
							B8.changeImage("SIbottom1.gif");
							if(B8.isShipHit()) B8 = null;
						}
						if (B9 != null){
							B9.changeImage("SIbottom1.gif");
							if(B9.isShipHit()) B9 = null;
						}
						/*for(SItop top : tops){
							top.changeImage("SItop1.gif");
							if(top.isShipHit()) top = null;
						}
						
						for(SImiddle mid : mids){
							mid.changeImage("SImiddle1.gif");
							if(mid.isShipHit()) mid = null;
						}
						for(int k = 0; k < btms.length; k++){
							if(btms[k] != null){
								btms[k].changeImage("SIbottom1.gif");
								if(btms[k].isShipHit()) btms[k] = null;
							}
						}*/
						/*for(SIbottom btm : btms){
							if(btm != null){
								btm.changeImage("SIbottom1.gif");
								if(btm.isShipHit()) btm = null;
							}
						}*/
						
						moveSideways(5);
						moveCount++;
						
					} else if (invaderCount == pulse*2) {
						invaderCount = 0;
						if (t0 != null){
							t0.changeImage("SItop0.gif");
							if(t0.isShipHit()) t0 = null;
						}
						if (t1 != null){
							t1.changeImage("SItop0.gif");
							if(t1.isShipHit()) t1 = null;
						}
						if (t2 != null){
							t2.changeImage("SItop0.gif");
							if(t2.isShipHit()) t2 = null;
						}
						if (t3 != null){
							t3.changeImage("SItop0.gif");
							if(t3.isShipHit()) t3 = null;
						}
						if (t4 != null){
							t4.changeImage("SItop0.gif");
							if(t4.isShipHit()) t4 = null;
						}
						if (t5 != null){
							t5.changeImage("SItop0.gif");
							if(t5.isShipHit()) t5 = null;
						}
						if (t6 != null){
							t6.changeImage("SItop0.gif");
							if(t6.isShipHit()) t6 = null;
						}
						if (t7 != null){
							t7.changeImage("SItop0.gif");
							if(t7.isShipHit()) t7 = null;
						}
						if (t8 != null){
							t8.changeImage("SItop0.gif");
							if(t8.isShipHit()) t8 = null;
						}
						if (t9 != null){
							t9.changeImage("SItop0.gif");
							if(t9.isShipHit()) t9 = null;
						}
						if (m0 != null){
							m0.changeImage("SImiddle0.gif");
							if(m0.isShipHit()) m0 = null;
						}
						if (m1 != null){
							m1.changeImage("SImiddle0.gif");
							if(m1.isShipHit()) m1 = null;
						}
						if (m2 != null){
							m2.changeImage("SImiddle0.gif");
							if(m2.isShipHit()) m2 = null;
						}
						if (m3 != null){
							m3.changeImage("SImiddle0.gif");
							if(m3.isShipHit()) m3 = null;
						}
						if (m4 != null){
							m4.changeImage("SImiddle0.gif");
							if(m4.isShipHit()) m4 = null;
						}
						if (m5 != null){
							m5.changeImage("SImiddle0.gif");
							if(m5.isShipHit()) m5 = null;
						}
						if (m6 != null){
							m6.changeImage("SImiddle0.gif");
							if(m6.isShipHit()) m6 = null;
						}
						if (m7 != null){
							m7.changeImage("SImiddle0.gif");
							if(m7.isShipHit()) m7 = null;
						}
						if (m8 != null){
							m8.changeImage("SImiddle0.gif");
							if(m8.isShipHit()) m8 = null;
						}
						if (m9 != null){
							m9.changeImage("SImiddle0.gif");
							if(m9.isShipHit()) m9 = null;
						}
						if (M0 != null){
							M0.changeImage("SImiddle0.gif");
							if(M0.isShipHit()) M0 = null;
						}
						if (M1 != null){
							M1.changeImage("SImiddle0.gif");
							if(M1.isShipHit()) M1 = null;
						}
						if (M2 != null){
							M2.changeImage("SImiddle0.gif");
							if(M2.isShipHit()) M2 = null;
						}
						if (M3 != null){
							M3.changeImage("SImiddle0.gif");
							if(M3.isShipHit()) M3 = null;
						}
						if (M4 != null){
							M4.changeImage("SImiddle0.gif");
							if(M4.isShipHit()) M4 = null;
						}
						if (M5 != null){
							M5.changeImage("SImiddle0.gif");
							if(M5.isShipHit()) M5 = null;
						}
						if (M6 != null){
							M6.changeImage("SImiddle0.gif");
							if(M6.isShipHit()) M6 = null;
						}
						if (M7 != null){
							M7.changeImage("SImiddle0.gif");
							if(M7.isShipHit()) M7 = null;
						}
						if (M8 != null){
							M8.changeImage("SImiddle0.gif");
							if(M8.isShipHit()) M8 = null;
						}
						if (M9 != null){
							M9.changeImage("SImiddle0.gif");
							if(M9.isShipHit()) M9 = null;
						}
						if (b0 != null){
							b0.changeImage("SIbottom0.gif");
							if(b0.isShipHit()) b0 = null;
						}
						if (b1 != null){
							b1.changeImage("SIbottom0.gif");
							if(b1.isShipHit()) b1 = null;
						}
						if (b2 != null){
							b2.changeImage("SIbottom0.gif");
							if(b2.isShipHit()) b2 = null;
						}
						if (b3 != null){
							b3.changeImage("SIbottom0.gif");
							if(b3.isShipHit()) b3 = null;
						}
						if (b4 != null){
							b4.changeImage("SIbottom0.gif");
							if(b4.isShipHit()) b4 = null;
						}
						if (b5 != null){
							b5.changeImage("SIbottom0.gif");
							if(b5.isShipHit()) b5 = null;
						}
						if (b6 != null){
							b6.changeImage("SIbottom0.gif");
							if(b6.isShipHit()) b6 = null;
						}
						if (b7 != null){
							b7.changeImage("SIbottom0.gif");
							if(b7.isShipHit()) b7 = null;
						}
						if (b8 != null){
							b8.changeImage("SIbottom0.gif");
							if(b8.isShipHit()) b8 = null;
						}
						if (b9 != null){
							b9.changeImage("SIbottom0.gif");
							if(b9.isShipHit()) b9 = null;
						}
						if (B0 != null){
							B0.changeImage("SIbottom0.gif");
							if(B0.isShipHit()) B0 = null;
						}
						if (B1 != null){
							B1.changeImage("SIbottom0.gif");
							if(B1.isShipHit()) B1 = null;
						}
						if (B2 != null){
							B2.changeImage("SIbottom0.gif");
							if(B2.isShipHit()) B2 = null;
						}
						if (B3 != null){
							B3.changeImage("SIbottom0.gif");
							if(B3.isShipHit()) B3 = null;
						}
						if (B4 != null){
							B4.changeImage("SIbottom0.gif");
							if(B4.isShipHit()) B4 = null;
						}
						if (B5 != null){
							B5.changeImage("SIbottom0.gif");
							if(B5.isShipHit()) B5 = null;
						}
						if (B6 != null){
							B6.changeImage("SIbottom0.gif");
							if(B6.isShipHit()) B6 = null;
						}
						if (B7 != null){
							B7.changeImage("SIbottom0.gif");
							if(B7.isShipHit()) B7 = null;
						}
						if (B8 != null){
							B8.changeImage("SIbottom0.gif");
							if(B8.isShipHit()) B8 = null;
						}
						if (B9 != null){
							B9.changeImage("SIbottom0.gif");
							if(B9.isShipHit()) B9 = null;
						}
						/*for(SItop top : tops){
							top.changeImage("SItop0.gif");
							if(top.isShipHit()) top = null;
						}
						
						for(SImiddle mid : mids){
							mid.changeImage("SImiddle0.gif");
							if(mid.isShipHit()) mid = null;
						}
						for(int k = 0; k < btms.length; k++){
							if(btms[k] != null){
								btms[k].changeImage("SIbottom0.gif");
								if(btms[k].isShipHit()) btms[k] = null;
							}
						}*/
						/*for(SIbottom btm : btms){
							if(btm != null){
								btm.changeImage("SIbottom0.gif");
								if(btm.isShipHit()) btm = null;
							}
						}*/
						
						moveSideways(5);
						moveCount++;
					}

					// reach the right side and turn around
					if (moveCount == 30) {
						moveRight = false;
						moveCount = 0;
						moveDown();
					}
				}

				// invaders move left and change every 40 pulses
				else {
					if (invaderCount == pulse) {
						if (t0 != null){
							t0.changeImage("SItop1.gif");
							if(t0.isShipHit()) t0 = null;
						}
						if (t1 != null){
							t1.changeImage("SItop1.gif");
							if(t1.isShipHit()) t1 = null;
						}
						if (t2 != null){
							t2.changeImage("SItop1.gif");
							if(t2.isShipHit()) t2 = null;
						}
						if (t3 != null){
							t3.changeImage("SItop1.gif");
							if(t3.isShipHit()) t3 = null;
						}
						if (t4 != null){
							t4.changeImage("SItop1.gif");
							if(t4.isShipHit()) t4 = null;
						}
						if (t5 != null){
							t5.changeImage("SItop1.gif");
							if(t5.isShipHit()) t5 = null;
						}
						if (t6 != null){
							t6.changeImage("SItop1.gif");
							if(t6.isShipHit()) t6 = null;
						}
						if (t7 != null){
							t7.changeImage("SItop1.gif");
							if(t7.isShipHit()) t7 = null;
						}
						if (t8 != null){
							t8.changeImage("SItop1.gif");
							if(t8.isShipHit()) t8 = null;
						}
						if (t9 != null){
							t9.changeImage("SItop1.gif");
							if(t9.isShipHit()) t9 = null;
						}
						if (m0 != null){
							m0.changeImage("SImiddle1.gif");
							if(m0.isShipHit()) m0 = null;
						}
						if (m1 != null){
							m1.changeImage("SImiddle1.gif");
							if(m1.isShipHit()) m1 = null;
						}
						if (m2 != null){
							m2.changeImage("SImiddle1.gif");
							if(m2.isShipHit()) m2 = null;
						}
						if (m3 != null){
							m3.changeImage("SImiddle1.gif");
							if(m3.isShipHit()) m3 = null;
						}
						if (m4 != null){
							m4.changeImage("SImiddle1.gif");
							if(m4.isShipHit()) m4 = null;
						}
						if (m5 != null){
							m5.changeImage("SImiddle1.gif");
							if(m5.isShipHit()) m5 = null;
						}
						if (m6 != null){
							m6.changeImage("SImiddle1.gif");
							if(m6.isShipHit()) m6 = null;
						}
						if (m7 != null){
							m7.changeImage("SImiddle1.gif");
							if(m7.isShipHit()) m7 = null;
						}
						if (m8 != null){
							m8.changeImage("SImiddle1.gif");
							if(m8.isShipHit()) m8 = null;
						}
						if (m9 != null){
							m9.changeImage("SImiddle1.gif");
							if(m9.isShipHit()) m9 = null;
						}
						if (M0 != null){
							M0.changeImage("SImiddle1.gif");
							if(M0.isShipHit()) M0 = null;
						}
						if (M1 != null){
							M1.changeImage("SImiddle1.gif");
							if(M1.isShipHit()) M1 = null;
						}
						if (M2 != null){
							M2.changeImage("SImiddle1.gif");
							if(M2.isShipHit()) M2 = null;
						}
						if (M3 != null){
							M3.changeImage("SImiddle1.gif");
							if(M3.isShipHit()) M3 = null;
						}
						if (M4 != null){
							M4.changeImage("SImiddle1.gif");
							if(M4.isShipHit()) M4 = null;
						}
						if (M5 != null){
							M5.changeImage("SImiddle1.gif");
							if(M5.isShipHit()) M5 = null;
						}
						if (M6 != null){
							M6.changeImage("SImiddle1.gif");
							if(M6.isShipHit()) M6 = null;
						}
						if (M7 != null){
							M7.changeImage("SImiddle1.gif");
							if(M7.isShipHit()) M7 = null;
						}
						if (M8 != null){
							M8.changeImage("SImiddle1.gif");
							if(M8.isShipHit()) M8 = null;
						}
						if (M9 != null){
							M9.changeImage("SImiddle1.gif");
							if(M9.isShipHit()) M9 = null;
						}
						if (b0 != null){
							b0.changeImage("SIbottom1.gif");
							if(b0.isShipHit()) b0 = null;
						}
						if (b1 != null){
							b1.changeImage("SIbottom1.gif");
							if(b1.isShipHit()) b1 = null;
						}
						if (b2 != null){
							b2.changeImage("SIbottom1.gif");
							if(b2.isShipHit()) b2 = null;
						}
						if (b3 != null){
							b3.changeImage("SIbottom1.gif");
							if(b3.isShipHit()) b3 = null;
						}
						if (b4 != null){
							b4.changeImage("SIbottom1.gif");
							if(b4.isShipHit()) b4 = null;
						}
						if (b5 != null){
							b5.changeImage("SIbottom1.gif");
							if(b5.isShipHit()) b5 = null;
						}
						if (b6 != null){
							b6.changeImage("SIbottom1.gif");
							if(b6.isShipHit()) b6 = null;
						}
						if (b7 != null){
							b7.changeImage("SIbottom1.gif");
							if(b7.isShipHit()) b7 = null;
						}
						if (b8 != null){
							b8.changeImage("SIbottom1.gif");
							if(b8.isShipHit()) b8 = null;
						}
						if (b9 != null){
							b9.changeImage("SIbottom1.gif");
							if(b9.isShipHit()) b9 = null;
						}
						if (B0 != null){
							B0.changeImage("SIbottom1.gif");
							if(B0.isShipHit()) B0 = null;
						}
						if (B1 != null){
							B1.changeImage("SIbottom1.gif");
							if(B1.isShipHit()) B1 = null;
						}
						if (B2 != null){
							B2.changeImage("SIbottom1.gif");
							if(B2.isShipHit()) B2 = null;
						}
						if (B3 != null){
							B3.changeImage("SIbottom1.gif");
							if(B3.isShipHit()) B3 = null;
						}
						if (B4 != null){
							B4.changeImage("SIbottom1.gif");
							if(B4.isShipHit()) B4 = null;
						}
						if (B5 != null){
							B5.changeImage("SIbottom1.gif");
							if(B5.isShipHit()) B5 = null;
						}
						if (B6 != null){
							B6.changeImage("SIbottom1.gif");
							if(B6.isShipHit()) B6 = null;
						}
						if (B7 != null){
							B7.changeImage("SIbottom1.gif");
							if(B7.isShipHit()) B7 = null;
						}
						if (B8 != null){
							B8.changeImage("SIbottom1.gif");
							if(B8.isShipHit()) B8 = null;
						}
						if (B9 != null){
							B9.changeImage("SIbottom1.gif");
							if(B9.isShipHit()) B9 = null;
						}
						moveSideways(-5);
						moveCount++;
					} else if (invaderCount == pulse*2) {
						invaderCount = 0;
						if (t0 != null){
							t0.changeImage("SItop0.gif");
							if(t0.isShipHit()) t0 = null;
						}
						if (t1 != null){
							t1.changeImage("SItop0.gif");
							if(t1.isShipHit()) t1 = null;
						}
						if (t2 != null){
							t2.changeImage("SItop0.gif");
							if(t2.isShipHit()) t2 = null;
						}
						if (t3 != null){
							t3.changeImage("SItop0.gif");
							if(t3.isShipHit()) t3 = null;
						}
						if (t4 != null){
							t4.changeImage("SItop0.gif");
							if(t4.isShipHit()) t4 = null;
						}
						if (t5 != null){
							t5.changeImage("SItop0.gif");
							if(t5.isShipHit()) t5 = null;
						}
						if (t6 != null){
							t6.changeImage("SItop0.gif");
							if(t6.isShipHit()) t6 = null;
						}
						if (t7 != null){
							t7.changeImage("SItop0.gif");
							if(t7.isShipHit()) t7 = null;
						}
						if (t8 != null){
							t8.changeImage("SItop0.gif");
							if(t8.isShipHit()) t8 = null;
						}
						if (t9 != null){
							t9.changeImage("SItop0.gif");
							if(t9.isShipHit()) t9 = null;
						}
						if (m0 != null){
							m0.changeImage("SImiddle0.gif");
							if(m0.isShipHit()) m0 = null;
						}
						if (m1 != null){
							m1.changeImage("SImiddle0.gif");
							if(m1.isShipHit()) m1 = null;
						}
						if (m2 != null){
							m2.changeImage("SImiddle0.gif");
							if(m2.isShipHit()) m2 = null;
						}
						if (m3 != null){
							m3.changeImage("SImiddle0.gif");
							if(m3.isShipHit()) m3 = null;
						}
						if (m4 != null){
							m4.changeImage("SImiddle0.gif");
							if(m4.isShipHit()) m4 = null;
						}
						if (m5 != null){
							m5.changeImage("SImiddle0.gif");
							if(m5.isShipHit()) m5 = null;
						}
						if (m6 != null){
							m6.changeImage("SImiddle0.gif");
							if(m6.isShipHit()) m6 = null;
						}
						if (m7 != null){
							m7.changeImage("SImiddle0.gif");
							if(m7.isShipHit()) m7 = null;
						}
						if (m8 != null){
							m8.changeImage("SImiddle0.gif");
							if(m8.isShipHit()) m8 = null;
						}
						if (m9 != null){
							m9.changeImage("SImiddle0.gif");
							if(m9.isShipHit()) m9 = null;
						}
						if (M0 != null){
							M0.changeImage("SImiddle0.gif");
							if(M0.isShipHit()) M0 = null;
						}
						if (M1 != null){
							M1.changeImage("SImiddle0.gif");
							if(M1.isShipHit()) M1 = null;
						}
						if (M2 != null){
							M2.changeImage("SImiddle0.gif");
							if(M2.isShipHit()) M2 = null;
						}
						if (M3 != null){
							M3.changeImage("SImiddle0.gif");
							if(M3.isShipHit()) M3 = null;
						}
						if (M4 != null){
							M4.changeImage("SImiddle0.gif");
							if(M4.isShipHit()) M4 = null;
						}
						if (M5 != null){
							M5.changeImage("SImiddle0.gif");
							if(M5.isShipHit()) M5 = null;
						}
						if (M6 != null){
							M6.changeImage("SImiddle0.gif");
							if(M6.isShipHit()) M6 = null;
						}
						if (M7 != null){
							M7.changeImage("SImiddle0.gif");
							if(M7.isShipHit()) M7 = null;
						}
						if (M8 != null){
							M8.changeImage("SImiddle0.gif");
							if(M8.isShipHit()) M8 = null;
						}
						if (M9 != null){
							M9.changeImage("SImiddle0.gif");
							if(M9.isShipHit()) M9 = null;
						}
						if (b0 != null){
							b0.changeImage("SIbottom0.gif");
							if(b0.isShipHit()) b0 = null;
						}
						if (b1 != null){
							b1.changeImage("SIbottom0.gif");
							if(b1.isShipHit()) b1 = null;
						}
						if (b2 != null){
							b2.changeImage("SIbottom0.gif");
							if(b2.isShipHit()) b2 = null;
						}
						if (b3 != null){
							b3.changeImage("SIbottom0.gif");
							if(b3.isShipHit()) b3 = null;
						}
						if (b4 != null){
							b4.changeImage("SIbottom0.gif");
							if(b4.isShipHit()) b4 = null;
						}
						if (b5 != null){
							b5.changeImage("SIbottom0.gif");
							if(b5.isShipHit()) b5 = null;
						}
						if (b6 != null){
							b6.changeImage("SIbottom0.gif");
							if(b6.isShipHit()) b6 = null;
						}
						if (b7 != null){
							b7.changeImage("SIbottom0.gif");
							if(b7.isShipHit()) b7 = null;
						}
						if (b8 != null){
							b8.changeImage("SIbottom0.gif");
							if(b8.isShipHit()) b8 = null;
						}
						if (b9 != null){
							b9.changeImage("SIbottom0.gif");
							if(b9.isShipHit()) b9 = null;
						}
						if (B0 != null){
							B0.changeImage("SIbottom0.gif");
							if(B0.isShipHit()) B0 = null;
						}
						if (B1 != null){
							B1.changeImage("SIbottom0.gif");
							if(B1.isShipHit()) B1 = null;
						}
						if (B2 != null){
							B2.changeImage("SIbottom0.gif");
							if(B2.isShipHit()) B2 = null;
						}
						if (B3 != null){
							B3.changeImage("SIbottom0.gif");
							if(B3.isShipHit()) B3 = null;
						}
						if (B4 != null){
							B4.changeImage("SIbottom0.gif");
							if(B4.isShipHit()) B4 = null;
						}
						if (B5 != null){
							B5.changeImage("SIbottom0.gif");
							if(B5.isShipHit()) B5 = null;
						}
						if (B6 != null){
							B6.changeImage("SIbottom0.gif");
							if(B6.isShipHit()) B6 = null;
						}
						if (B7 != null){
							B7.changeImage("SIbottom0.gif");
							if(B7.isShipHit()) B7 = null;
						}
						if (B8 != null){
							B8.changeImage("SIbottom0.gif");
							if(B8.isShipHit()) B8 = null;
						}
						if (B9 != null){
							B9.changeImage("SIbottom0.gif");
							if(B9.isShipHit()) B9 = null;
						}
						moveSideways(-5);
						moveCount++;
						
					}
					// reach the left side and turn around
					if (moveCount == 30) {
						moveRight = true;
						moveCount = 0;
						moveDown();
					}
					
					if(pulse == 1){
						gameOver = true;
					}
				}
				if(!gameOver){
					// Mystery ship
					if (mystery == null) {
						randomys = rand.nextInt(1000) + 1;
						if (randomys >= 997) {
							randomys = rand.nextInt(2) + 1;
							if (randomys == 1) {
								mystery = new SImystery(500, 50);
	
							} else {
								mystery = new SImystery(0, 50);
							}
							mystery.playSound();
						}
					} else {
						mysteryCount++;
						if (randomys == 1) {
							if (mystery.getX() == 0) {
								mystery.stopSound();
								mystery = null;
							} else if (mysteryCount == 2) {
								mystery.moveXBy(-5);
								mysteryCount = 0;
							}
						} else {
							if (mystery.getX() == 500) {
								mystery.stopSound();
								mystery = null;
							} else if (mysteryCount == 2) {
								mystery.moveXBy(5);
								mysteryCount = 0;
	
							}
						}
					}
	
					// Invader missiles
	
					if (missile2 == null) {
						rando = rand.nextInt(100) + 1;
						if (rando <= 80) {
							checkMin();
							rando = rand.nextInt(10) + 1;
							if    (rando == 10 && minx0 != -1) missile2 = new SImissile(minx0 + 10, miny0 + 10);
							else if(rando == 1 && minx1 != -1) missile2 = new SImissile(minx1 + 10, miny1 + 10);
							else if(rando == 2 && minx2 != -1) missile2 = new SImissile(minx2 + 10, miny2 + 10);
							else if(rando == 3 && minx3 != -1) missile2 = new SImissile(minx3 + 10, miny3 + 10);
							else if(rando == 4 && minx4 != -1) missile2 = new SImissile(minx4 + 10, miny4 + 10);
							else if(rando == 5 && minx5 != -1) missile2 = new SImissile(minx5 + 10, miny5 + 10);
							else if(rando == 6 && minx6 != -1) missile2 = new SImissile(minx6 + 10, miny6 + 10);
							else if(rando == 7 && minx7 != -1) missile2 = new SImissile(minx7 + 10, miny7 + 10);
							else if(rando == 8 && minx8 != -1) missile2 = new SImissile(minx8 + 10, miny8 + 10);
							else if(rando == 9 && minx9 != -1) missile2 = new SImissile(minx9 + 10, miny9 + 10);
						}
					}
	
					else {
						missileCount++;
						if (missile2.getY() >= 450) {
							missile2 = null;
						} else if (missileCount == 2) {
							missile2.moveYBy(5);
							missileCount = 0;
							if(intersectBase(missile2)){
								base.changeImage("SIbaseBlast.gif");		// Change base image
								missile2 = null;
							}
						}
					}
	
					if (missile3 == null) {
						rando = rand.nextInt(100) + 1;
						if (rando <= 80) {
							checkMin();
							rando = rand.nextInt(10) + 1;
							if    (rando == 10 && minx0 != -1) missile3 = new SImissile(minx0 + 10, miny0 + 10);
							else if(rando == 1 && minx1 != -1) missile3 = new SImissile(minx1 + 10, miny1 + 10);
							else if(rando == 2 && minx2 != -1) missile3 = new SImissile(minx2 + 10, miny2 + 10);
							else if(rando == 3 && minx3 != -1) missile3 = new SImissile(minx3 + 10, miny3 + 10);
							else if(rando == 4 && minx4 != -1) missile3 = new SImissile(minx4 + 10, miny4 + 10);
							else if(rando == 5 && minx5 != -1) missile3 = new SImissile(minx5 + 10, miny5 + 10);
							else if(rando == 6 && minx6 != -1) missile3 = new SImissile(minx6 + 10, miny6 + 10);
							else if(rando == 7 && minx7 != -1) missile3 = new SImissile(minx7 + 10, miny7 + 10);
							else if(rando == 8 && minx8 != -1) missile3 = new SImissile(minx8 + 10, miny8 + 10);
							else if(rando == 9 && minx9 != -1) missile3 = new SImissile(minx9 + 10, miny9 + 10);
						}
					}
	
					else {
						missilecount2++;
						if (missile3.getY() >= 450) {
							missile3 = null;
						} else if (missilecount2 == 2) {
							missile3.moveYBy(5);
							missilecount2 = 0;
							if(intersectBase(missile3)){
								base.changeImage("SIbaseBlast.gif"); // Change base image
								missile3 = null;
							}
						}
					}
				}
				if(t0 == null && t1 == null && t2 == null && t3 == null && t4 == null && t5 == null && t6 == null && t7 == null && t8 == null && t9 == null && 
				   m0 == null && m1 == null && m2 == null && m3 == null && m4 == null && m5 == null && m6 == null && m7 == null && m8 == null && m8 == null && 
				   M0 == null && M1 == null && M2 == null && M3 == null && M4 == null && M5 == null && M6 == null && M7 == null && M8 == null && M8 == null && 
				   b0 == null && b1 == null && b2 == null && b3 == null && b4 == null && b5 == null && b6 == null && b7 == null && b8 == null && b8 == null && 
				   B0 == null && B1 == null && B2 == null && B3 == null && B4 == null && B5 == null && B6 == null && B7 == null && B8 == null && B8 == null){
					
					if(missile == null && missile2 == null && missile3 == null && mystery == null){
						restart();
					}
				}


				repaint();
			}
		});
		
		timer.start();
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				// space bar creates missile and makes sound
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					if (missile == null) {
						missile = new SImissile(base.getX() + 11, base.getY() + 55);
						base.playSound();
					}
				}

				// base moves left or right
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					left = true;
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right = true;
				}
				
				
			}

			// base stops
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					left = false;
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right = false;
				}

			}

		});

	}
	

	// moves all invaders by the given number of pixels
	private void moveSideways(int pix) {

		if(t0 != null) t0.moveXBy(pix);
		if(t1 != null) t1.moveXBy(pix);
		if(t2 != null) t2.moveXBy(pix);
		if(t3 != null) t3.moveXBy(pix);
		if(t4 != null) t4.moveXBy(pix);
		if(t5 != null) t5.moveXBy(pix);
		if(t6 != null) t6.moveXBy(pix);
		if(t7 != null) t7.moveXBy(pix);
		if(t8 != null) t8.moveXBy(pix);
		if(t9 != null) t9.moveXBy(pix);
		if(m0 != null) m0.moveXBy(pix);
		if(m1 != null) m1.moveXBy(pix);
		if(m2 != null) m2.moveXBy(pix);
		if(m3 != null) m3.moveXBy(pix);
		if(m4 != null) m4.moveXBy(pix);
		if(m5 != null) m5.moveXBy(pix);
		if(m6 != null) m6.moveXBy(pix);
		if(m7 != null) m7.moveXBy(pix);
		if(m8 != null) m8.moveXBy(pix);
		if(m9 != null) m9.moveXBy(pix);
		if(M0 != null) M0.moveXBy(pix);
		if(M1 != null) M1.moveXBy(pix);
		if(M2 != null) M2.moveXBy(pix);
		if(M3 != null) M3.moveXBy(pix);
		if(M4 != null) M4.moveXBy(pix);
		if(M5 != null) M5.moveXBy(pix);
		if(M6 != null) M6.moveXBy(pix);
		if(M7 != null) M7.moveXBy(pix);
		if(M8 != null) M8.moveXBy(pix);
		if(M9 != null) M9.moveXBy(pix);
		if(b0 != null) b0.moveXBy(pix);
		if(b1 != null) b1.moveXBy(pix);
		if(b2 != null) b2.moveXBy(pix);
		if(b3 != null) b3.moveXBy(pix);
		if(b4 != null) b4.moveXBy(pix);
		if(b5 != null) b5.moveXBy(pix);
		if(b6 != null) b6.moveXBy(pix);
		if(b7 != null) b7.moveXBy(pix);
		if(b8 != null) b8.moveXBy(pix);
		if(b9 != null) b9.moveXBy(pix);
		if(B0 != null) B0.moveXBy(pix);
		if(B1 != null) B1.moveXBy(pix);
		if(B2 != null) B2.moveXBy(pix);
		if(B3 != null) B3.moveXBy(pix);
		if(B4 != null) B4.moveXBy(pix);
		if(B5 != null) B5.moveXBy(pix);
		if(B6 != null) B6.moveXBy(pix);
		if(B7 != null) B7.moveXBy(pix);
		if(B8 != null) B8.moveXBy(pix);
		if(B9 != null) B9.moveXBy(pix);
	}
	
	
	
	
	//Moves invaders down by given number of pixels 
	private void moveDown(){
		int pix = 12;
		if(t0 != null) t0.moveYBy(pix);
		if(t1 != null) t1.moveYBy(pix);
		if(t2 != null) t2.moveYBy(pix);
		if(t3 != null) t3.moveYBy(pix);
		if(t4 != null) t4.moveYBy(pix);
		if(t5 != null) t5.moveYBy(pix);
		if(t6 != null) t6.moveYBy(pix);
		if(t7 != null) t7.moveYBy(pix);
		if(t8 != null) t8.moveYBy(pix);
		if(t9 != null) t9.moveYBy(pix);
		if(m0 != null) m0.moveYBy(pix);
		if(m1 != null) m1.moveYBy(pix);
		if(m2 != null) m2.moveYBy(pix);
		if(m3 != null) m3.moveYBy(pix);
		if(m4 != null) m4.moveYBy(pix);
		if(m5 != null) m5.moveYBy(pix);
		if(m6 != null) m6.moveYBy(pix);
		if(m7 != null) m7.moveYBy(pix);
		if(m8 != null) m8.moveYBy(pix);
		if(m9 != null) m9.moveYBy(pix);
		if(M0 != null) M0.moveYBy(pix);
		if(M1 != null) M1.moveYBy(pix);
		if(M2 != null) M2.moveYBy(pix);
		if(M3 != null) M3.moveYBy(pix);
		if(M4 != null) M4.moveYBy(pix);
		if(M5 != null) M5.moveYBy(pix);
		if(M6 != null) M6.moveYBy(pix);
		if(M7 != null) M7.moveYBy(pix);
		if(M8 != null) M8.moveYBy(pix);
		if(M9 != null) M9.moveYBy(pix);
		if(b0 != null) b0.moveYBy(pix);
		if(b1 != null) b1.moveYBy(pix);
		if(b2 != null) b2.moveYBy(pix);
		if(b3 != null) b3.moveYBy(pix);
		if(b4 != null) b4.moveYBy(pix);
		if(b5 != null) b5.moveYBy(pix);
		if(b6 != null) b6.moveYBy(pix);
		if(b7 != null) b7.moveYBy(pix);
		if(b8 != null) b8.moveYBy(pix);
		if(b9 != null) b9.moveYBy(pix);
		if(B0 != null) B0.moveYBy(pix);
		if(B1 != null) B1.moveYBy(pix);
		if(B2 != null) B2.moveYBy(pix);
		if(B3 != null) B3.moveYBy(pix);
		if(B4 != null) B4.moveYBy(pix);
		if(B5 != null) B5.moveYBy(pix);
		if(B6 != null) B6.moveYBy(pix);
		if(B7 != null) B7.moveYBy(pix);
		if(B8 != null) B8.moveYBy(pix);
		if(B9 != null) B9.moveYBy(pix);
		pulse = (int)(pulse*.8);
		checkMin();
		
	}

	private void checkMin() {
		if(B0 != null){
			minx0 = B0.getX();
			miny0 = B0.getY();
		}
		else if (B0 == null && b0 != null) {
			minx0 = b0.getX();
			miny0 = b0.getY();
		} else if (b0 == null && M0 != null) {
			miny0 = M0.getY();
			minx0 = M0.getX();
		} else if (M0 == null && m0 != null) {
			miny0 = m0.getY();
			minx0 = m0.getX();
		} else if (m0 == null && t0 != null) {
			miny0 = t0.getY();
			minx0 = t0.getX();
		} else {
			miny0 = -1;
			minx0 = -1;
		}
		if(B1 != null){
			minx1 = B1.getX();
			miny1 = B1.getY();
		}
		else if (B1 == null && b1 != null) {
			minx1 = b1.getX();
			miny1 = b1.getY();
		} else if (b1 == null && M1 != null) {
			miny1 = M1.getY();
			minx1 = M1.getX();
		} else if (M1 == null && m1 != null) {
			miny1 = m1.getY();
			minx1 = m1.getX();
		} else if (m1 == null && t1 != null) {
			miny1 = t1.getY();
			minx1 = t1.getX();
		} else {
			miny1 = -1;
			minx1 = -1;
		}
		if(B2 != null){
			minx2 = B2.getX();
			miny2 = B2.getY();
		}
		else if (B2 == null && b2 != null) {
			minx2 = b2.getX();
			miny2 = b2.getY();
		} else if (b2 == null && M2 != null) {
			miny2 = M2.getY();
			minx2 = M2.getX();
		} else if (M2 == null && m2 != null) {
			miny2 = m2.getY();
			minx2 = m2.getX();
		} else if (m2 == null && t2 != null) {
			miny2 = t2.getY();
			minx2 = t2.getX();
		} else {
			miny2 = -1;
			minx2 = -1;
		}
		if(B3 != null){
			minx3 = B3.getX();
			miny3 = B3.getY();
		}
		else if (B3 == null && b3 != null) {
			minx3 = b3.getX();
			miny3 = b3.getY();
		} else if (b3 == null && M3 != null) {
			miny3 = M3.getY();
			minx3 = M3.getX();
		} else if (M3 == null && m3 != null) {
			miny3 = m3.getY();
			minx3 = m3.getX();
		} else if (m3 == null && t3 != null) {
			miny3 = t3.getY();
			minx3 = t3.getX();
		} else {
			miny3 = -1;
			minx3 = -1;
		}
		if(B4 != null){
			minx4 = B4.getX();
			miny4 = B4.getY();
		}
		else if (B4 == null && b4 != null) {
			minx4 = b4.getX();
			miny4 = b4.getY();
		} else if (b4 == null && M4 != null) {
			miny4 = M4.getY();
			minx4 = M4.getX();
		} else if (M4 == null && m4 != null) {
			miny4 = m4.getY();
			minx4 = m4.getX();
		} else if (m4 == null && t4 != null) {
			miny4 = t4.getY();
			minx4 = t4.getX();
		} else {
			miny4 = -1;
			minx4 = -1;
		}
		if(B5 != null){
			minx5 = B5.getX();
			miny5 = B5.getY();
		}
		else if (B5 == null && b5 != null) {
			minx5 = b5.getX();
			miny5 = b5.getY();
		} else if (b5 == null && M5 != null) {
			miny5 = M5.getY();
			minx5 = M5.getX();
		} else if (M5 == null && m5 != null) {
			miny5 = m5.getY();
			minx5 = m5.getX();
		} else if (m5 == null && t5 != null) {
			miny5 = t5.getY();
			minx5 = t5.getX();
		} else {
			miny5 = -1;
			minx5 = -1;
		}
		if(B6 != null){
			minx6 = B6.getX();
			miny6 = B6.getY();
		}
		else if (B6 == null && b6 != null) {
			minx6 = b6.getX();
			miny6 = b6.getY();
		} else if (b6 == null && M6 != null) {
			miny6 = M6.getY();
			minx6 = M6.getX();
		} else if (M6 == null && m6 != null) {
			miny6 = m6.getY();
			minx6 = m6.getX();
		} else if (m6 == null && t6 != null) {
			miny6 = t6.getY();
			minx6 = t6.getX();
		} else {
			miny6 = -1;
			minx6 = -1;
		}
		if(B7 != null){
			minx7 = B7.getX();
			miny7 = B7.getY();
		}
		else if (B7 == null && b7 != null) {
			minx7 = b7.getX();
			miny7 = b7.getY();
		} else if (b7 == null && M7 != null) {
			miny7 = M7.getY();
			minx7 = M7.getX();
		} else if (M7 == null && m7 != null) {
			miny7 = m7.getY();
			minx7 = m7.getX();
		} else if (m7 == null && t7 != null) {
			miny7 = t7.getY();
			minx7 = t7.getX();
		} else {
			miny7 = -1;
			minx7 = -1;
		}
		if(B8 != null){
			minx8 = B8.getX();
			miny8 = B8.getY();
		}
		else if (B8 == null && b8 != null) {
			minx8 = b8.getX();
			miny8 = b8.getY();
		} else if (b8 == null && M8 != null) {
			miny8 = M8.getY();
			minx8 = M8.getX();
		} else if (M8 == null && m8 != null) {
			miny8 = m8.getY();
			minx8 = m8.getX();
		} else if (m8 == null && t8 != null) {
			miny8 = t8.getY();
			minx8 = t8.getX();
		} else {
			miny8 = -1;
			minx8 = -1;
		}
		if(B9 != null){
			minx9 = B9.getX();
			miny9 = B9.getY();
		}
		else if (B9 == null && b9 != null) {
			minx9 = b9.getX();
			miny9 = b9.getY();
		} else if (b9 == null && M9 != null) {
			miny9 = M9.getY();
			minx9 = M9.getX();
		} else if (M9 == null && m9 != null) {
			miny9 = m9.getY();
			minx9 = m9.getX();
		} else if (m9 == null && t9 != null) {
			miny9 = t9.getY();
			minx9 = t9.getX();
		} else {
			miny9 = -1;
			minx9 = -1;
		}
		
	}
	
	// Intersections
	private boolean intersectBase(SImissile missile){
		
		if((missile.getX()+1)>base.getX() && (missile.getX()+1) < (base.getX()+30) && missile.getY()>= (base.getY()+65)){
			base.hitShip();
			gameOver = true;
			pauseTimer();
			return true;
			
		}
		return false;
		
	}
	private boolean intersect(SImissile missile, SIinvader invader){
		if(invader != null){
			if(missile.getX()>= invader.getX() && missile.getX() <= invader.getX() + 22
					&& missile.getY() >= invader.getY() && missile.getY() <= invader.getY() +10){
				return true;
			}
		}
		return false;
	}
	private void updateScore(int increment){
		scoreNum += increment;
	}
	
	// Pausing
	public void pauseTimer(){
		timer.stop();
		if(mystery != null) mystery.stopSound();
	}
	
	public void resumeTimer(){
		timer.start();
		if(mystery != null) mystery.playSound();
	}
	
	public void newTimer(){
		pauseTimer();
		int result = JOptionPane.showConfirmDialog(this, "Start a new game?");
		if(result == JOptionPane.NO_OPTION){
			if(!gameOver)
				resumeTimer();
		}
		if(result == JOptionPane.YES_OPTION){
			resumeTimer();
			restart();
		}
		if(result==JOptionPane.CANCEL_OPTION){
			if(!gameOver)
				resumeTimer();
		}
	}
	public void restart(){
		moveRight = true;
		gameOver = false;
		right = false;
		left = false;
		missile = missile2 = missile3 = null;
		mystery = null;
		scoreNum = 0;
		moveCount = 15;
		pulse = 40;
		invaderCount = 0;
		base = new SIbase(250, 300);
		t5 = new SItop(250           , 80);
		t4 = new SItop(t5.getX() - 35, 80);
		t3 = new SItop(t4.getX() - 35, 80);
		t2 = new SItop(t3.getX() - 35, 80);
		t1 = new SItop(t2.getX() - 35, 80);
		t0 = new SItop(t1.getX() - 35, 80);
		t6 = new SItop(t5.getX() + 35, 80);
		t7 = new SItop(t6.getX() + 35, 80);
		t8 = new SItop(t7.getX() + 35, 80);
		t9 = new SItop(t8.getX() + 35, 80);
		m0 = new SImiddle(t0.getX(), t0.getY() + 25);
		m1 = new SImiddle(t1.getX(), t0.getY() + 25);
		m2 = new SImiddle(t2.getX(), t0.getY() + 25);
		m3 = new SImiddle(t3.getX(), t0.getY() + 25);
		m4 = new SImiddle(t4.getX(), t0.getY() + 25);
		m5 = new SImiddle(t5.getX(), t0.getY() + 25);
		m6 = new SImiddle(t6.getX(), t0.getY() + 25);
		m7 = new SImiddle(t7.getX(), t0.getY() + 25);
		m8 = new SImiddle(t8.getX(), t0.getY() + 25);
		m9 = new SImiddle(t9.getX(), t0.getY() + 25);
		M0 = new SImiddle(t0.getX(), m0.getY() + 25);
		M1 = new SImiddle(t1.getX(), m0.getY() + 25);
		M2 = new SImiddle(t2.getX(), m0.getY() + 25);
		M3 = new SImiddle(t3.getX(), m0.getY() + 25);
		M4 = new SImiddle(t4.getX(), m0.getY() + 25);
		M5 = new SImiddle(t5.getX(), m0.getY() + 25);
		M6 = new SImiddle(t6.getX(), m0.getY() + 25);
		M7 = new SImiddle(t7.getX(), m0.getY() + 25);
		M8 = new SImiddle(t8.getX(), m0.getY() + 25);
		M9 = new SImiddle(t9.getX(), m0.getY() + 25);
		b0 = new SIbottom(t0.getX(), M0.getY() + 25);
		b1 = new SIbottom(t1.getX(), M0.getY() + 25);
		b2 = new SIbottom(t2.getX(), M0.getY() + 25);
		b3 = new SIbottom(t3.getX(), M0.getY() + 25);
		b4 = new SIbottom(t4.getX(), M0.getY() + 25);
		b5 = new SIbottom(t5.getX(), M0.getY() + 25);
		b6 = new SIbottom(t6.getX(), M0.getY() + 25);
		b7 = new SIbottom(t7.getX(), M0.getY() + 25);
		b8 = new SIbottom(t8.getX(), M0.getY() + 25);
		b9 = new SIbottom(t9.getX(), M0.getY() + 25);
		B0 = new SIbottom(t0.getX(), b0.getY() + 25);
		B1 = new SIbottom(t1.getX(), b0.getY() + 25);
		B2 = new SIbottom(t2.getX(), b0.getY() + 25);
		B3 = new SIbottom(t3.getX(), b0.getY() + 25);
		B4 = new SIbottom(t4.getX(), b0.getY() + 25);
		B5 = new SIbottom(t5.getX(), b0.getY() + 25);
		B6 = new SIbottom(t6.getX(), b0.getY() + 25);
		B7 = new SIbottom(t7.getX(), b0.getY() + 25);
		B8 = new SIbottom(t8.getX(), b0.getY() + 25);
		B9 = new SIbottom(t9.getX(), b0.getY() + 25);
		miny0 = B0.getY();
		miny1 = B1.getY();
		miny2 = B2.getY();
		miny3 = B3.getY();
		miny4 = B4.getY();
		miny5 = B5.getY();
		miny6 = B6.getY();
		miny7 = B7.getY();
		miny8 = B8.getY();
		miny9 = B9.getY();
		minx0 = B0.getX();
		minx1 = B1.getX();
		minx2 = B2.getX();
		minx3 = B3.getX();
		minx4 = B4.getX();
		minx5 = B5.getX();
		minx6 = B6.getX();
		minx7 = B7.getX();
		minx8 = B8.getX();
		minx9 = B9.getX();
		
	}


	@Override
	protected void paintComponent(Graphics g) {
		// draw score
		super.paintComponent(g);
		setBackground(Color.BLACK);
		g.setColor(Color.GREEN);
		String scoreStr = "Score: ";

		int panelHeight = getHeight();
		int panelWidth = getWidth();
		FontMetrics fm = g.getFontMetrics(font);
		int sWidth = fm.stringWidth(scoreStr + scoreNum);
		float x = panelWidth - sWidth - 10;
		g.drawString(scoreStr + scoreNum, (int) x, 15);
		
		
		String overStr = "Game Over";
		FontMetrics fm2 = g.getFontMetrics(font2);
		int overWidth = fm2.stringWidth(overStr);
		
		

		// draw all images
		x = panelWidth / 2f;
		float y = panelHeight - 20;
		Graphics2D g2 = (Graphics2D) g;
		base.paintMe(g2, base.image, base.getX(), (int) y);
		if(t0 != null) t0.paintMe(g2, t0.image, t0.getX(), t0.getY());
		if(t1 != null) t1.paintMe(g2, t1.image, t1.getX(), t1.getY());
		if(t2 != null) t2.paintMe(g2, t2.image, t2.getX(), t2.getY());
		if(t3 != null) t3.paintMe(g2, t3.image, t3.getX(), t3.getY());
		if(t4 != null) t4.paintMe(g2, t4.image, t4.getX(), t4.getY());
		if(t5 != null) t5.paintMe(g2, t5.image, t5.getX(), t5.getY());
		if(t6 != null) t6.paintMe(g2, t6.image, t6.getX(), t6.getY());
		if(t7 != null) t7.paintMe(g2, t7.image, t7.getX(), t7.getY());
		if(t8 != null) t8.paintMe(g2, t8.image, t8.getX(), t8.getY());
		if(t9 != null) t9.paintMe(g2, t9.image, t9.getX(), t9.getY());
		if(m0 != null) m0.paintMe(g2, m0.image, m0.getX(), m0.getY());
		if(m1 != null) m1.paintMe(g2, m1.image, m1.getX(), m1.getY());
		if(m2 != null) m2.paintMe(g2, m2.image, m2.getX(), m2.getY());
		if(m3 != null) m3.paintMe(g2, m3.image, m3.getX(), m3.getY());
		if(m4 != null) m4.paintMe(g2, m4.image, m4.getX(), m4.getY());
		if(m5 != null) m5.paintMe(g2, m5.image, m5.getX(), m5.getY());
		if(m6 != null) m6.paintMe(g2, m6.image, m6.getX(), m6.getY());
		if(m7 != null) m7.paintMe(g2, m7.image, m7.getX(), m7.getY());
		if(m8 != null) m8.paintMe(g2, m8.image, m8.getX(), m8.getY());
		if(m9 != null) m9.paintMe(g2, m9.image, m9.getX(), m9.getY());
		if(M0 != null) M0.paintMe(g2, M0.image, M0.getX(), M0.getY());
		if(M1 != null) M1.paintMe(g2, M1.image, M1.getX(), M1.getY());
		if(M2 != null) M2.paintMe(g2, M2.image, M2.getX(), M2.getY());
		if(M3 != null) M3.paintMe(g2, M3.image, M3.getX(), M3.getY());
		if(M4 != null) M4.paintMe(g2, M4.image, M4.getX(), M4.getY());
		if(M5 != null) M5.paintMe(g2, M5.image, M5.getX(), M5.getY());
		if(M6 != null) M6.paintMe(g2, M6.image, M6.getX(), M6.getY());
		if(M7 != null) M7.paintMe(g2, M7.image, M7.getX(), M7.getY());
		if(M8 != null) M8.paintMe(g2, M8.image, M8.getX(), M8.getY());
		if(M9 != null) M9.paintMe(g2, M9.image, M9.getX(), M9.getY());
		if(b0 != null) b0.paintMe(g2, b0.image, b0.getX(), b0.getY());
		if(b1 != null) b1.paintMe(g2, b1.image, b1.getX(), b1.getY());
		if(b2 != null) b2.paintMe(g2, b2.image, b2.getX(), b2.getY());
		if(b3 != null) b3.paintMe(g2, b3.image, b3.getX(), b3.getY());
		if(b4 != null) b4.paintMe(g2, b4.image, b4.getX(), b4.getY());
		if(b5 != null) b5.paintMe(g2, b5.image, b5.getX(), b5.getY());
		if(b6 != null) b6.paintMe(g2, b6.image, b6.getX(), b6.getY());
		if(b7 != null) b7.paintMe(g2, b7.image, b7.getX(), b7.getY());
		if(b8 != null) b8.paintMe(g2, b8.image, b8.getX(), b8.getY());
		if(b9 != null) b9.paintMe(g2, b9.image, b9.getX(), b9.getY());
		if(B0 != null) B0.paintMe(g2, B0.image, B0.getX(), B0.getY());
		if(B1 != null) B1.paintMe(g2, B1.image, B1.getX(), B1.getY());
		if(B2 != null) B2.paintMe(g2, B2.image, B2.getX(), B2.getY());
		if(B3 != null) B3.paintMe(g2, B3.image, B3.getX(), B3.getY());
		if(B4 != null) B4.paintMe(g2, B4.image, B4.getX(), B4.getY());
		if(B5 != null) B5.paintMe(g2, B5.image, B5.getX(), B5.getY());
		if(B6 != null) B6.paintMe(g2, B6.image, B6.getX(), B6.getY());
		if(B7 != null) B7.paintMe(g2, B7.image, B7.getX(), B7.getY());
		if(B8 != null) B8.paintMe(g2, B8.image, B8.getX(), B8.getY());
		if(B9 != null) B9.paintMe(g2, B9.image, B9.getX(), B9.getY());

		if (missile != null)
			missile.paintMe(g2);
		if (missile2 != null)
			missile2.paintMe(g2);
		if (missile3 != null)
			missile3.paintMe(g2);
		if (mystery != null)
			mystery.paintMe(g2, mystery.image, mystery.getX(), mystery.getY());
		if(gameOver){
			g.setFont(font2);
			g.setColor(Color.GREEN);
			g.drawString(overStr, (int)(panelWidth/2)- (int)(overWidth/2), 200);
		}
		

	}

}
