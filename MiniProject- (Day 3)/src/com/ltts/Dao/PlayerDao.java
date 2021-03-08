package com.ltts.Dao;

import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ltts.Configuration.MyConnection;
import com.ltts.model.Player;
import com.mysql.cj.xdevapi.Statement;

public class PlayerDao {
	public List<Player> getAllPlayers() throws Exception
	{
		//Connection mc=MyConnection.getConnection();
		//PreparedStatement ps=mc.prepareStatement("select * from player");
		
		Connection conn=MyConnection.getConnection();
	    java.sql.Statement stm;
	    stm = conn.createStatement();
	    String sql = "Select * From Customer";
	    ResultSet rst;
	    rst = ((java.sql.Statement) stm).executeQuery(sql);
	    ArrayList<Player> playerList = new ArrayList<>();
	    while (rst.next()) {
	        Player player = new Player(rst.getInt("playerId"),rst.getDate("dateOfBirt"),
	        		rst.getString("skill"),rst.getInt("teamId"),rst.getInt("noOfMatches"),rst.getInt("wickets"),
	        		rst.getString("nationality"),rst.getInt("runs"));
	        playerList.add(player);
	    }
	    return playerList;
		
		
		
		
		
		
		
		
		/*
		 * List<Player> li=new ArrayList<Player>(); Player
		 * 
		 * 
		 * 
		 * 
		 * Statement st=mc.createStatement(); ResultSet
		 * rs=st.executeQuery("select * from player"); PreparedStatement
		 * ps=mc.prepareStatement("select * from players"); while(ps.next()) {
		 * System.out.println( ps.getPlayerId()
		 * +"\t"+ps.getString(2)+"\t"+ps.getString(3)+"\t"+ps.getInt(4)+"\t"+ps.
		 * getString(5)); }
		 * 
		 * mc.close();
		 * 
		 * 
		 * return li;
		 */
	}
	public Player getPlayerById(int id)
	{
		Player p=new Player();
		/*
		 * Player p=new Player(); Connection con = DriverManager.getConnection(
		 * "jdbc:derby://localhost:1527/testDb","username", "password");
		 * 
		 * Statement stmt = (Statement) con.createStatement(); ResultSet rs =
		 * ((java.sql.Statement) stmt).executeQuery("SELECT * FROM employee"); //
		 * System.out.println("id  name    job");
		 * 
		 * while (rs.next()) { // int id = rs.getInt("id"); String name =
		 * rs.getString("name"); String job = rs.getString("job");
		 * System.out.println(id+"   "+name+"    "+job); } 
		 */
		 return p;
		 	}
	
	public boolean insertPlayer(Player p) throws Exception
	{
		Connection mc=MyConnection.getConnection();
		PreparedStatement ps=mc.prepareStatement("insert into player values(?,?,?,?,?,?,?,?)");
		ps.setInt(1, p.getPlayerId());
		ps.setDate(2, (Date) p.getDateOfBirth());
		ps.setString(3, p.getSkill());
		ps.setInt(4,p.getTeamId());
		ps.setInt(5, p.getNoOfMatches());
		ps.setInt(6, p.getWickets());
		ps.setString(7,p.getNationality());
		ps.setInt(8, p.getRuns());
		return ps.execute();
		
	}
	
	public boolean updatePlayer(Player p) throws Exception
	{
		Connection mc=MyConnection.getConnection();
		PreparedStatement ps=mc.prepareStatement("update player set age=? where id=?");
		return ps.execute();
	}
}
