package modelo;

//import java.util.function.DoubleSupplier;

public class Complejos {
    public float pReal;
    public float pImaginaria;
    public float modulo;
    public float argumento;

    public float getpReal() {
        return pReal;
    }

    public void setpReal(float pReal) {
        this.pReal = pReal;
    }

    public float getpImaginaria() {
        return pImaginaria;
    }

    public void setpImaginaria(float pImaginaria) {
        this.pImaginaria = pImaginaria;
    }

    public float getModulo() {
        return modulo;
    }

    public void setModulo(float modulo) {
        this.modulo = modulo;
    }

    public float getArgumento() {
        return argumento;
    }

    public void setArgumento(float argumento) {
        this.argumento = argumento;
    }
       

   public Complejos(float modulo, float argumento) {
        this.aBinomica();
    }
    
    public Complejos(double pReal, double pImaginaria) {
         this.aFasorial();
        
    }

    public void aBinomica(){
        double phi = Math.toRadians(argumento);
        this.pReal = (float) (modulo* Math.cos(phi));
        this.pImaginaria = (float) (modulo* Math.sin(phi));}
   

    public void aFasorial(){
    	
    	float dosPhi = 360;
    	float dosphiRad = (float)Math.toRadians(dosPhi);
        this.modulo = (float) Math.sqrt((Math.pow(this.pReal, 2) + 
               Math.pow(this.pImaginaria, 2)));
      
         float argumentoGrado =   (float) 
      Math.toDegrees(Math.atan2(this.pImaginaria, this.pReal));
    		//   Math.atan2(this.pImaginaria, this.pReal)
         

         float argumentoRadianes =   (float) Math.toRadians(argumentoGrado);
         
    if (argumentoRadianes < 0 ) {
    	
    	this.argumento = dosphiRad + argumentoRadianes;
    	 
        	
    }else 
    {
    	this.argumento = argumentoRadianes;
    }
}
    
}
    
    

