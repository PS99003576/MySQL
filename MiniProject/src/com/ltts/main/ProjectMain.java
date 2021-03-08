package com.ltts.main;
  
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.sql.Date;

import com.ltts.Dao.PlayerDao;
import com.ltts.Dao.TeamDao;
import com.ltts.model.Player;
import com.ltts.model.Team;
  
public class ProjectMain {
  
public static void main(String[] args) throws Exception { 
	
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the option you want to proceed");
  System.out.println("1. Player Entry");
  System.out.println("2. Team Entry");
  
  int option = Integer.parseInt(br.readLine());
    
  if(option == 1) 
  {
	  System.out.println("1. Add Players");
	  System.out.println("2. Update Players");
	  System.out.println("3. Fetch specific Player Details");
	  System.out.println("4. View all players");
	  int option1 = Integer.parseInt(br.readLine());
	  switch(option1)
	  { 
	  	case 1:
	  			System.out.println("Enter the player details");
	  			
	  			System.out.println("Enter the player ID"); 
	  			int p_num=Integer.parseInt(br.readLine());
	  			
	  			System.out.println("Enter the player name");
	  			String p_name = br.readLine();
	  			
	  			System.out.println("Enter the player Date of Birth");
	  			String p_dateofbirth = br.readLine();
	  			Date date=Date.valueOf(p_dateofbirth);
	  		    
	  			System.out.println("Enter the player skill");
	  			String p_skill = br.readLine();
	  			
	  			System.out.println("Enter the Team id");
	  			int p_id=Integer.parseInt(br.readLine());
	  			
	  			
	  			
	  			System.out.println("Enter the no of matches");
	  			int p_numofmatches=Integer.parseInt(br.readLine());
	  			
	  			
	  			System.out.println("Enter the wickets");
	  			int p_wickets = Integer.parseInt(br.readLine());
	  			
	  			System.out.println("Enter the nationality");
	  			String p_nationality = br.readLine();
	  			
	  			System.out.println("Enter the runs"); 
	  			int p_runs=Integer.parseInt(br.readLine());
  
	  			Player p=new Player(p_num,date,p_name,p_skill,p_id,p_numofmatches,p_wickets,p_nationality,p_runs);
	  			PlayerDao pd=new PlayerDao();
	  			pd.insertPlayer(p);
	  			
	  			break;
	  	case 2: 
		    	System.out.println("Enter Playet ID: ");
		    	int id=Integer.parseInt(br.readLine());
		    	System.out.println("Enter new Player Name: ");
		    	String name=br.readLine();
				PlayerDao pd1=new PlayerDao();
			    pd1.updatePlayer(id,name);
	  			
	  			break;
	  	case 3:
	  			System.out.println("Enter the Player Name: "); 
	  			String name1=br.readLine();
	  			PlayerDao pd2=new PlayerDao();
	  			pd2.getAll(name1);
	  			break;
	  			
	  	case 4:
	  			PlayerDao pd3=new PlayerDao();
	  			pd3.showPlayer();
	  		    break;
	  } 
  }
  else {
	  System.out.println("1. Add team");
	  System.out.println("2. Update Players");
	  int option1 = Integer.parseInt(br.readLine());
	  switch(option1) {
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
  }}

  
  }
  
  }
