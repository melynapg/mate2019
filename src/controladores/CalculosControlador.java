package controladores;

import java.text.DecimalFormat;

import javax.swing.JTextField;

import modelo.Complejos;
import vista.Pantalla;

public class CalculosControlador {
	
	public Pantalla  vista;
	
//    private Complejos z1  ;
//    private Complejos z2 ;

    
    
	public Complejos setBinomicaValues  (String pReal,
            String pImg) {
		
		Complejos z = new Complejos(0, 0);
        z.setpReal((Float) Float.parseFloat(pReal));
        z.setpImaginaria((Float) Float.parseFloat(pImg));
        return z;
        
    }
    
    public void imprime(Complejos z) {
 //       this.imprimeFasorial(z, this.vista.resFas);
        this.imprimeBinomica(z, this.vista.resultadoBinomica);
    }

    public void imprimePolar(Complejos z, JTextField fas) {
        z.aFasorial();
        DecimalFormat df = new DecimalFormat("#,###.##");
        fas.setText("[" 
                + df.format(z.modulo)
                + " , " + df.format(z.argumento) + " ]");
    }

    public void imprimeBinomica(Complejos z, JTextField bin) {

        DecimalFormat df = new DecimalFormat("#,###.##");
        bin.setText("" + df.format(z.pReal)
                + " + j(" + df.format(z.pImaginaria) + ")");
    }
    
    public Boolean validarBtnTransformar(String pReal , String pImg) {
    	
    	Boolean valido = true; 
    	
    	if ( pReal.isEmpty() || pImg.isEmpty() || pReal == "" || pImg=="") {
    		
                   valido = false;
    		
    	}
    	
    	    	
    	return valido; 
    	
    }
    

}
