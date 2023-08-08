import javax.swing.JOptionPane;
import ConvertirMonedas.LogicaMonedas;

public class Logica {
 public static void main(String[] args) {

	 LogicaMonedas monedas = new LogicaMonedas();
          
     while(true) {
     	
     	String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda"}, "Seleccion")).toString();

     	switch(opciones) {
     	case "Conversor de Moneda":
     		 String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir: ");
              if(ValidarNumero(input) == true) {
                  double Minput = Double.parseDouble(input);
                  monedas.ConvertirMonedas(Minput);

                  int respuesta=JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversión?");
                  if (JOptionPane.OK_OPTION == respuesta){
                  	System.out.println("Seleccione opción Afirmativa");
                  }else{
                     	JOptionPane.showMessageDialog(null, "Programa terminado");                         
                  }

                 } else {
                     JOptionPane.showMessageDialog(null, "Valor inválido");                
                 }
                  	break;
     	

     
     }                
 }
            
}
 public static boolean ValidarNumero(String input) {
     try {
         double x = Double.parseDouble(input);
         if(x >= 0 || x < 0);
             return true;
         } catch (NumberFormatException e) {
             return false;
         }
 }
}

