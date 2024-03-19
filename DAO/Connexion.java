
package DAO;

import java.sql.*; 
public class Connexion { 
private static String driver="com.mysql.jdbc.Driver"; 
private static String url="jdbc:mysql://localhost/gestion_ecole"; 
private static String user="root"; 
private static String password=""; 
public static Connection con=null; 
private Connexion()
{
}
public static Connection getConnection()throws Exception{ 
Class.forName(driver); 
if(con==null)
 con = DriverManager.getConnection(url, user,password); 
return con;
} 
public static void Sedeconnecter() throws Exception{ 
if(con!=null) 
con.close(); 
} 
} 

