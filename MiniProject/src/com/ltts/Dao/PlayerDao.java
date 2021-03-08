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

public class PlayerDao {
	public List<Player> getAllPlayers() throws Exception
	{
		
		List<Player> list = new ArrayList<Player>();
		return list;
	
	}
	public Player getPlayerById(int id)
	{
		Player p=new Player();
		return p;
	}
	
	public boolean insertPlayer(Player p) throws Exception
	{
		Connection mc=MyConnection.getConnection();
		PreparedStatement ps=mc.prepareStatement("insert into player values(?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, p.getPlayerId());
		ps.setString(2, p.getName());
		ps.setDate(3, (Date) p.getDateOfBirth());
		ps.setString(4, p.getSkill());
		ps.setInt(5,p.getTeamId());
		ps.setInt(6, p.getNoOfMatches());
		ps.setInt(7, p.getWickets());
		ps.setString(8,p.getNationality());
		ps.setInt(9, p.getRuns());
		System.out.println("Data successfully appended");
		return ps.execute();
		
	}
	
	public boolean updatePlayer(Player p) throws Exception
	{
		Connection mc=MyConnection.getConnection();
		PreparedStatement ps=mc.prepareStatement("update player set age=? where id=?");
		return ps.execute();
	}
	
	public boolean updatePlayer(int id, String name) throws Exception {
		// TODO Auto-generated method stub
		Connection c = MyConnection.getConnection();
		PreparedStatement ps = c.prepareStatement("update player set name=? where playerId = ?");
		ps.setString(1, name);
		ps.setInt(2, id);
		System.out.println("Data Updated Succesfully");
		return ps.execute();
	}
	
	public void getAll(String name) throws Exception {
		// TODO Auto-generated method stub
		Connection c= MyConnection.getConnection();
		PreparedStatement ps=c.prepareStatement("Select p.playername,t.teamname,t.coachname,TIMESTAMPDIFF(YEAR, dateOfBirth, CURDATE()) AS age from player as p inner join team as t on p.teamid=t.teamid where p.name=?");
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			String name1=rs.getNString(1);
			String n=rs.getString(2);
			String cn=rs.getString(3);
			String dob=rs.getString(4);
			System.out.println("Player Name: "+name1+" Team Name: "+n+" Coach Name: "+cn+" Age: "+dob);
			
		}
	}
	
}
