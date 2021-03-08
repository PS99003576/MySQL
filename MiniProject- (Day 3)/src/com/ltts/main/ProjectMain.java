package com.ltts.main;
  
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.sql.Date;

import com.ltts.Dao.PlayerDao;
import com.ltts.model.Player;
  
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
	  System.out.println("3. Fetch Player Details"); 
	  int option1 = Integer.parseInt(br.readLine());
	  switch(option1)
	  { 
	  	case 1:
	  			System.out.println("Enter the player details");
	  			
	  			System.out.println("Enter the player ID"); 
	  			int p_num=Integer.parseInt(br.readLine());
	  			
	  			System.out.println("Enter the player Date of Birth");
	  			String p_dateofbirth = br.readLine();
	  			
	  		    Date date=Date.valueOf(p_dateofbirth);
	  			
	  			
	  			
	  			//Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(p_dateofbirth); 
	  			
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
  
	  			Player p=new Player(p_num,date,p_skill,p_id,p_numofmatches,p_wickets,p_nationality,p_runs);
	  			PlayerDao pd=new PlayerDao();
	  			boolean b=pd.insertPlayer(p);
	  			//pd.getPlayerById(p_id)
	  			System.out.println(b);
	  			System.out.println(p);
	  			break;
	  	case 2: 
	  			PlayerDao pd1=new PlayerDao();
	  			System.out.println(pd1.getAllPlayers());
	  			break;
	  	case 3:
	  			break;
	  } 
  }
  
  
  }
  
  }
