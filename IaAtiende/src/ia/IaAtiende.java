package ia;

import javax.swing.JFrame;


public class IaAtiende {

	public static void main(String[] args) {
		atiende();
		
		//creamos una ventana
		Ventana v = new Ventana();
		atiende();
		v.setVisible(true);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void atiende(){
		System.out.println("Ia esta atendiendo!!!!!");
	}

}
