import java.util.Scanner;

class Player{
     private int id ,runs;
     private String player_name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getRuns() {
        return runs;
    }
    public void setRuns(int runs) {
        this.runs = runs;
    }
    public String getPlayer_name() {
        return player_name;
    }
    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }
     
}
class Team{
    Player play[];
    void addPlayer(Player p[])
    {
       this.play=p;  
    }
    void show_player_details()
    {   System.out.println("-------------------------------Player Details-----------------------------");
        System.out.printf("Player id\tPlayer name\tPlayer runs\n");
        for(Player play:play)
        {
            System.out.printf("%d\t\t%s\t\t%d\n",play.getId(),play.getPlayer_name(),play.getRuns());
        }
        System.out.println("-------------------------------Player Details-----------------------------");
    }
}
public class TeamApp{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the size of player data\n");
        int ply_size=sc.nextInt();
        Player ply[]= new Player[ply_size];

        for(int i=0;i<ply.length;i++)
        {
            ply[i]=new Player();
          System.out.printf("Enter the player id\n");
          int player_id=sc.nextInt();
          sc.nextLine();
          System.out.printf("Enter the player name\n");
          String player_name=sc.nextLine();
          System.out.printf("Enter the player runs\n");
          int player_runs=sc.nextInt();

          ply[i].setId(player_id);
          ply[i].setPlayer_name(player_name);
          ply[i].setRuns(player_runs);
        }
         Team t=new Team();
         t.addPlayer(ply);
         t.show_player_details();

        sc.close();

    }
}