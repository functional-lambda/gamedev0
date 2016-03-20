package de.gamedev.java;
import javax.swing.*;
public class Player {
	private String name;
	final int id = 0;
	private int x = 0;
	private int y = 0;
	// int z = 0;
	//nur für 3D
	private int xp = 0;
	private int level = 1;
	private Equipment inventory[] = new Equipment[30];
	Player(String inputname) {
		setX(0);
		setY(0);
		setName(inputname);
		setXp(0);
		setLevel(1);
		setInventory(new Equipment[30]);
		
		
	}
	public void moveAsk()
	{
		String inputMove = JOptionPane.showInputDialog("WASD");
		if (inputMove == "w")
		{ moveUp();}
		else if (inputMove == "s")
		{moveDown();}
		else if (inputMove == "a")
		{moveLeft();}
		else if (inputMove == "d")
		{moveRight();}
		else
		{System.out.println("You didn't move. Use WASD");
		printPos();
		}
		printPos();	
		
	}
	public void printPos() {
		System.out.print( "X: ");
		System.out.println(this.getX());
		System.out.print( "Y: ");
		System.out.println(this.getY());
		
	}
	public void moveUp()
	{ this.setY(-++y);}
	public void moveDown()
	{ this.setY(--y);}
	public void moveLeft()
	{ this.setY(--x);}
	public void moveRight()
	{ this.setY(++x);}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Equipment[] getInventory() {
		return inventory;
	}
	public void setInventory(Equipment inventory[]) {
		this.inventory = inventory;
	}
}
