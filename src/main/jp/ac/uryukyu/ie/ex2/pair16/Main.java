package jp.ac.uryukyu.ie.ex4.pair16;

public class Main {
    public  static  void main(String[] args){
        Maze maze = new Maze("map.txt");
        Player player = new Player(maze.getStart);
        maze.setPosition();
        maze.print();
        player.go(-1,0);
        maze.setPosition();
        maze.print();
        player.go(0,-1);
        maze.setPosition();
        maze.print();
        player.go(1,0);
        maze.setPosition();
        maze.print();

    }
}
