

package complejos;

import vista.*;
import controladores.*;

public class InicioComplejosMate {

    
    public static void main(String[] args) {
    	
    
    	Pantalla pant = new Pantalla();
    	Calculos cal = new Calculos(pant);
    	cal.iniciar();
    	pant.setVisible(true);
     
       //llamada a la vista  Calculos calcu = new Calculos();        
        //ControladorCalcu ctrl = new ControladorCalcu(calcu);
        //ctrl.iniciar();
        //calcu.setVisible(true);
        
    }

}
