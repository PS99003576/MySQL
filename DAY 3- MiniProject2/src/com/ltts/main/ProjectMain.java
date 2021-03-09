package com.ltts.main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Date;

import com.ltts.model.Player;
import com.ltts.model.Team;
import com.ltts.Dao.PlayerDao;
import com.ltts.Dao.TeamDao;
public class ProjectMain {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		System.out.println("Enter Your Choice"); 
		System.out.println("1. Insert Data"); 
		System.out.println("2. Search Data"); 
		System.out.println("3. Update Data"); 
		System.out.println("4. View all the Players"); 
		System.out.println("5. View Players"); 
		System.out.println("6. Logout");
		int option = Integer.parseInt(br.readLine());
		
		switch(option) {
		case 1:
			System.out.println("Enter the Team Id: "); 
			int tid=Integer.parseInt(br.readLine());
			System.out.println("Enter the Team Name: ");
		        String tname=br.readLine();
		        System.out.println("Enter the Owner Name: ");
		        String towner=br.readLine();
		        System.out.println("Enter the Coach Name: ");
		        String tcoach=br.readLine();
		    	Team t= new Team(tid,tname,towner,tcoach);
		    	TeamDao td=new TeamDao();
		    	td.insertTeam(t);
			


			System.out.println("Enter the Player Id: "); 
			int pid=Integer.parseInt(br.readLine());
			System.out.println("Enter the Player Name: ");
		    	String pname=br.readLine();
			System.out.println("Enter the Date of Birth: ");
		    	Date pdate=Date.valueOf(br.readLine());
		    	System.out.println("Enter the Player Nationality: ");
		    	String pnation=br.readLine();
		    	System.out.println("Enter the Player Skills: ");
		    	String pskills=br.readLine();
		    	System.out.println("Enter the Player runs: ");
		    	int pruns=Integer.parseInt(br.readLine());
		    	System.out.println("Enter the Player Wickets: ");
		    	int pwic=Integer.parseInt(br.readLine());
		    	System.out.println("Enter the Player Number of Matches: ");
		    	int pnum=Integer.parseInt(br.readLine());
		    	System.out.println("Enter Player Team Id: ");
		    	int pteam=Integer.parseInt(br.readLine());
		    
		    	Player p=new Player(pid,pname,pdate,pnation,pskills,pruns,pwic,pnum,pteam);
		    	PlayerDao pd=new PlayerDao();
		    	pd.insertPlayer(p);
			break;
			
		case 2:
			System.out.println("Enter the Player Name: "); 
			String name=br.readLine();
			PlayerDao pd1=new PlayerDao();
		        pd1.getAll(name);
			break;
		case 3:
			System.out.println("Enter table to update:");
			System.out.println("1.Team 2.Player");
			int update_option = Integer.parseInt(br.readLine());
		    	if(update_option == 1)
		    	{
		    		System.out.println("Enter Team ID: ");
		    		int id=Integer.parseInt(br.readLine());
		    		System.out.println("Enter new Team Name: ");
		    		String name1=br.readLine();
				TeamDao pd11=new TeamDao();
				pd11.updateTeam(id,name1);
			}
		    	else if(update_option == 2)		
		   	 {
		    		System.out.println("Enter Playet ID: ");
		    		int id=Integer.parseInt(br.readLine());
		    		System.out.println("Enter new Player Name: ");
		    		String name1=br.readLine();
				PlayerDao pd11=new PlayerDao();
				pd11.updatePlayer(id,name1);
		   	 }
			break;
		case 4:
			PlayerDao pd11=new PlayerDao();
		    	pd11.showPlayer();
			break;
		case 5:
			System.out.println("1. View Players based on Team");
			System.out.println("2. View Players based on Skills & Team");
			int view_option = Integer.parseInt(br.readLine());
			if(view_option == 1)
			{
				System.out.println("Enter Team Name: ");
				String tname1=br.readLine();
				TeamDao pd111=new TeamDao();
			    	pd111.teamPlayer(tname1);
			}
			else if(view_option == 2)
			{
				System.out.println("Enter Team Name: ");
				String tname1=br.readLine();
				System.out.println("Enter Player Skill: ");
				String tskill=br.readLine();
				TeamDao pd111=new TeamDao();
			    	pd111.skillPlayer(tname1,tskill);
			}
			break;
		case 6:
			System.out.println("Logged out succcessfully....");
			System.exit(0);
			break;
		}
		
}
}
}
