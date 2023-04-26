package View;

import Controller.Rec;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int N = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas vezes quer realizar a soma"));
		Rec R = new Rec();
		if (N < 0){
			System.out.println(0);
		}else {
			System.out.println("A soma é igual a "+R.RecN(N));
		}
	}

}
