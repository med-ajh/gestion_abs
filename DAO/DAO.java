
package DAO;
import java.sql.*; 
public class DAO { 
Statement stm=null; 
public DAO(){ 
try { 
 Connection con=Connexion.getConnection();
 stm=con.createStatement(); 
} catch (Exception ex) { 
System.out.println(ex.getMessage()); 
} 
} 

public int Set(String sql) throws SQLException, Exception { 
return stm.executeUpdate(sql); 
} 
public ResultSet Get(String sql) throws SQLException { 
return stm.executeQuery(sql);
} 
} 


