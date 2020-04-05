package escalonamento;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Menu extends JFrame{

	JButton fifo;
	JButton robin;
	JButton sjf;
	JButton srt;
    JButton mn;
	Menu(){
		Container tela = getContentPane();
		tela.setLayout(null);

		this.fifo = new JButton("FCFS");

		tela.add(this.fifo);

		this.fifo.setBounds(100,20,200,50);

		setSize(450,450);
		setVisible(true);
		fifo_Click();
		
	}
	private void fifo_Click(){
        fifo.addMouseListener( new MouseAdapter() {
            public void mouseClicked(MouseEvent evento) {
                   Fifo fifo = new Fifo();	 
            }
       });
	}
	
	 public static void main(String[] args) {
		Menu menu = new Menu();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
