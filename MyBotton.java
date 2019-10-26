package ForTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class MyBotton {
	public static void main(String args[]){
		JFrame w = new JFrame() ;
		w.setSize(400 , 300) ;
		w.getContentPane().setBackground(Color.RED) ;
		
		JButton x1 = new JButton("B1") ;
		JButton x2 = new JButton("B2") ;
		JButton x3 = new JButton("B3") ;
		JButton x4 = new JButton("B4") ;
		JButton x5 = new JButton("B5") ;
		
		w.setLayout(new FlowLayout());
		w.add(x1) ;
		w.add(x2);
		w.add(x3);
		w.add(x4);
		w.add(x5);
		
		w.setVisible(true);
	}
}
