
package DAO;

import java.util.ArrayList; 
public interface IDAO<T> { 
public int insert(T Obj) ; 
public int update(T Obj) ; 
public int delete(int id) ; 
public ArrayList<T> Select() ; 
}  
