package ConvertirMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	public void ConvertirPesosADolares(double valor) {
		double monedaDolar = valor / 4025.76;
		
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tu tienes $ " +monedaDolar+ " Dolares");
	}
	
	public void ConvertirPesosAEuros(double valor) {
		double monedaEuro = valor / 4430.66;
		
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tu tienes $ " +monedaEuro+ " Euros");
	}
	
	public void ConvertirPesosALibras(double valor) {
		double monedaLibra = valor / 5146.68;
		
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tu tienes $ " +monedaLibra+ " Libras Esterlinas");
	}
	
	public void ConvertirPesosAYen(double valor) {
		double monedaYen = valor / 28.23;
		
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tu tienes $ " +monedaYen+ " Yuanes");
	}
	
	public void ConvertirPesosAWon(double valor) {
		double monedaWon = valor / 3.08;
		
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tu tienes $ " +monedaWon+ " Wons");
	}
}
