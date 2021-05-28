import java.util.*;
public class snakeAndLadderUc3
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int playerPosition = 0;
int rollDice = (int)(Math.floor(Math.random()*10)%6)+1;
int ladderSimulation = (int)(Math.floor(Math.random()*10)%3);

int snakeSimulation = (int)(Math.floor(Math.random()*10)%3);

System.out.println(rollDice);
int ladder = 14;
int ladder2 = 6;
int snake = -14;
int snake2 = -6;
if(playerPosition <= 0)
System.out.println("No play");
if(ladderSimulation == 1)
playerPosition+=ladder;
if(ladderSimulation == 2)
playerPosition+=ladder2;
if(snakeSimulation == 1)
playerPosition-=snake;
if(snakeSimulation == 2)
playerPosition-=snake2;
}
}