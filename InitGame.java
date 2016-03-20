
package de.gamedev.java;
import javax.swing.*;
public class InitGame {
InitGame() {

}
public void init(){
	System.out.println("Please wait.. Test");
	String inputName = JOptionPane.showInputDialog("What is your name?");
	Player player = new Player(inputName);
	System.out.println("Hi, "+player.getName()+"!");
	while (JOptionPane.showInputDialog("Move (yes/no)?")=="yes"){
		player.moveAsk();
	}
}
}
