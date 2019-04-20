package controladores;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

import modelo.Complejos;
import vista.Pantalla;


import javax.swing.JTextField;

public class Calculos implements ActionListener  {

	private Pantalla vista;

	
    @Override	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
     if (e.getSource() == this.vista.btnTransformarBinomica) {
          Complejos z1 = new Complejos(2, 2);
           this.setBinomicaValues(z1, this.vista.pReal, this.vista.pImg);
     //     this.imprimeFasorial(z1, this.vista.resTrans);
     //     this.imprimeParaMover(z1, this.vista.resTransmod, this.vista.resTransarg);
      

       }
	}

    public Calculos(Pantalla vista) {
        this.vista = vista;
        this.iniciarListener();
    }

	public void iniciarListener() {
		// TODO Auto-generated method stub
		this.vista.btnTransformarBinomica.addActionListener(this);
		
				
	}
	
    public void iniciar() {
        this.vista.setTitle("Calculadora de complejos");
        this.vista.setLocationRelativeTo(null);
        this.vista.setResizable(false);
        //ImageIcon imgicon = new ImageIcon(getClass().getResource("imagenes/iconocalculadora.png"));
        // Image myicon = Toolkit.getDefaultToolkit().
        // getImage(ClassLoader.getSystemResource("imagenes/iconocalculadora.png"));
       // this.calcu.setIconImage(myicon);
        
        
      //  this.vista.btnz1.setVisible(false);
    //    this.vista.btnz2.setVisible(false);
      //  this.calcu.resTransarg.setVisible(false);
        //this.calcu.resTransmod.setVisible(false);
       // this.calcu.btnz1Trans.setVisible(false);
        //this.calcu.btnz2Trans.setVisible(false);

        //this.calcu.setIconImage(new Image(''));
    }
	
	
    public void setBinomicaValues(Complejos z, JTextField jtfReal,
            JTextField jtfImg) {
        z.setpReal((Float) Float.parseFloat(jtfReal.getText()));
        z.setpImaginaria((Float) Float.parseFloat(jtfImg.getText()));
    }
    
    public void imprime(Complejos z) {
 //       this.imprimeFasorial(z, this.vista.resFas);
        this.imprimeBinomica(z, this.vista.resultadoBinomica);
    }

    public void imprimeFasorial(Complejos z, JTextField fas) {
        z.aFasorial();
        DecimalFormat df = new DecimalFormat("#,###.##");
        fas.setText(""
                + df.format(z.modulo)
                + "|" + df.format(z.argumento) + "°");
    }

    public void imprimeBinomica(Complejos z, JTextField bin) {

        DecimalFormat df = new DecimalFormat("#,###.##");
        bin.setText("" + df.format(z.pReal)
                + " + j(" + df.format(z.pImaginaria) + ")");
    }
    
	
}
