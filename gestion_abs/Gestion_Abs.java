
package gestion_abs;

import Metier.*;
import java.util.ArrayList;

public class Gestion_Abs {

   
    public static void main(String[] args) {
        GestionEleves GE=new GestionEleves();
        ArrayList<Eleve> LE=GE.Select();
        for(Eleve E: LE)
        System.out.println(E);
       // if(GE.delete(15)!=0)
       //     System.out.println("l'opération de suppression est passée avec réussite");
    }
    
}
