/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;
public class Main extends Canvas{
    public void paint(Graphics g){
        g.setColor(Color.black);
        
        g.drawRect(317,302,79, 88);
        g.setColor(Color.CYAN);
        
        g.fillOval(457, 295, 20, 85);
        g.fillOval(560, 295, 20, 85);
        g.drawOval(457, 295, 20, 85);
        g.drawOval(560, 295, 20, 85);
       
      
        g.setColor(Color.green);
        g.fillOval(50 , 206, 50, 50);
        g.fillOval(148, 206, 50, 50);
        g.fillOval(235, 206, 50, 50);
        g.drawOval(50,206,50,50);
        g.drawOval(148,206,50,50);
        g.drawOval(235,206,50,50);
        g.setColor(Color.ORANGE);
        g.fillArc(300, 70, 90, 120, 90, 270);
        g.setColor(Color.LIGHT_GRAY);
        g.setColor(Color.black);
        g.drawLine(27, 300, 27, 355);
        g.drawLine(302, 212, 307, 207);
        g.drawLine(2, 207, 5, 212);
        
        g.drawLine(27, 355, 106, 355);
       
        g.drawLine(106, 300, 106, 355);
        
        g.drawLine(67, 300, 67, 355);
        
        g.drawLine(118, 300, 118, 355);
        
        g.drawLine(118, 355, 196, 355);
       
        g.drawLine(196, 355, 196, 300);
        g.drawLine(157, 300, 157, 355);
        g.drawLine(4, 209, 154, 113);
        g.drawLine(6, 213, 156, 120);
        g.drawLine(154, 113, 310, 212);
        g.drawLine(301, 213, 156, 120);
        g.drawLine(7, 213, 9, 394);
        g.drawLine(301, 213, 301, 392);
        g.drawLine(301, 275, 418, 274);
        g.drawLine(418, 275, 419, 284);
        g.drawLine(418, 284, 301, 284);
        g.drawLine(411, 284, 411, 392);
        g.drawLine(411, 392, 9, 392);
        g.drawLine(222, 301, 301, 301);
        g.drawLine(222, 301, 222, 310);
        g.drawLine(222, 310, 301, 310);
        g.drawLine(228, 310, 228, 392);
        g.drawLine(236, 310, 236, 392);
        g.drawLine(354, 301, 355 , 392);
        g.drawLine(250, 320, 279, 320);
        g.drawLine(250, 392, 280, 392);
        g.drawLine(280, 320, 280, 392);
        g.drawLine(251, 320, 251, 392);
        g.drawLine(426, 6, 425, 392);
        g.drawLine(426, 392, 597, 392);
       
        g.drawLine(431, 271, 431, 392);
        g.drawLine(431, 271, 589, 271);
        g.drawLine(589, 271, 589, 392);
        g.drawLine(484, 287, 484, 387);
        g.drawLine(484, 387, 539, 387);
        g.drawLine(539, 287, 484, 286);
        g.drawLine(539, 387, 539, 287);
        g.drawLine(589, 272, 589, 391);
       g.drawLine(597, 392, 597, 6);
       g.drawLine(426, 6, 597, 6);
       g.drawLine(431, 280, 589, 280);
       g.setColor(Color.lightGray);
       g.fillRoundRect(434, 20, 50, 30, 10,100);
        g.fillRoundRect(490, 20, 50, 30, 10,100);
         g.fillRoundRect(545, 20, 50, 30, 10,100);
         g.fillRoundRect(434, 68, 50, 30, 10,120);
        g.fillRoundRect(490, 68, 50, 30, 10,120);
         g.fillRoundRect(545, 68, 50, 30, 10,120);
         g.fillRoundRect(434, 116, 50, 30, 10,120);
        g.fillRoundRect(490, 116, 50, 30, 10,120);
         g.fillRoundRect(545, 116, 50, 30, 10,120);
         g.fillRoundRect(434, 166, 50, 30, 10,120);
        g.fillRoundRect(490, 166, 50, 30, 10,120);
         g.fillRoundRect(545, 166, 50, 30, 10,120);
         g.fillRoundRect(434, 216, 50, 30, 10,120);
        g.fillRoundRect(490, 216, 50, 30, 10,120);
         g.fillRoundRect(545, 216, 50, 30, 10,120);
    }
    public static void main(String[] args){
        JFrame d=new JFrame("canvas");
        Main m=new Main();
        d.setSize(650,450);
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d.add(m);
    } 
}