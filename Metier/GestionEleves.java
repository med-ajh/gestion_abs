package Metier;
import DAO.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class GestionEleves extends DAO implements IDAO<Eleve>{
String sql="";
public int insert(Eleve E){
    int res=0;
        sql="insert into eleve (nom,prenom,email) values ('"+E.getNom()+"',"
                + "'"+E.getPrenom()+"','"+E.getEmail()+"')";
     try {
        res=super.Set(sql);

    } catch (Exception ex) {
       System.out.println(ex.getMessage());
    }
    return res;
}
public int update(Eleve E){
 int res=0;
        sql="update eleve set nom='"+E.getNom()+"',prenom='"+E.getPrenom()+"'"
                + ",email='"+E.getEmail()+"' where id="+E.getId();
     try {
        res=super.Set(sql);

    } catch (Exception ex) {
       System.out.println(ex.getMessage());
    }
    return res;   
} 
public int delete(int id) {
int res=0;
        sql="delete from eleve where id="+id;
     try {
        res=super.Set(sql);

    } catch (Exception ex) {
       System.out.println(ex.getMessage());
    }
    return res;   
}
public ArrayList<Eleve> Select(){
  
        ArrayList<Eleve> list=new ArrayList<>();
          try {
        ResultSet Rs=super.Get("select * from eleve");
        while(Rs.next()){
        list.add(new Eleve(Rs.getInt(1), Rs.getString(2), Rs.getString(3), Rs.getString(4)));
        }
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return list;
}  
}
