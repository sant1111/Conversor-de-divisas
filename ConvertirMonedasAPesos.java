package ConvertirMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	
	public void ConvertirDolaresAPesos(double valor) {
		
		double monedaDolar = valor * 4025.76;

		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tu tienes $ " +monedaDolar+ " Pesos Colombianos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 4430.66;
		
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tu tienes $ " +monedaEuro+ " Pesos Colombianos");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 5146.68;
		
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tu tienes $ " +monedaLibra+ " Pesos Colombianos");
	}
	
	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor * 28.23;
		
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tu tienes $ " +monedaYen+ " Pesos Colombianos");
	}
	
	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor * 3.08;
		
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tu tienes $ " +monedaWon+ " Pesos Colombianos");
	}
}