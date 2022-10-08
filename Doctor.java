package IMC;


import java.util.Observable;
import java.util.Observer;


public class Doctor implements Observer{
    double altura;
    double peso;
    
    public void update(double peso, double altura) {
	this.peso = peso;
	this.altura = altura;
	
    }

    public String calculaImc() {
	double imc = (this.peso /((this.altura)*(this.altura)));
	String mensagem = "";
	if (imc < 18.5) {
            mensagem = "IMC -> " + String.valueOf(imc) + " Abaixo do Peso";
	} else if (imc <= 24.9 || imc >= 18.5) {
            mensagem = "IMC -> " + String.valueOf(imc) + " Peso normal";
	} else if (imc <= 29.9 || imc >= 25.0) {
            mensagem = "IMC -> " + String.valueOf(imc) + " Pré-obesidade";
	} else if (imc <= 34.9 || imc >= 30.0) {
            mensagem = "IMC -> " + String.valueOf(imc) + " Obesidade Grau 1";
	} else if (imc <= 39.9 || imc >= 35.0) {
            mensagem = "IMC -> " + String.valueOf(imc) + " Obesidade Grau 2";
	} else if (imc >= 40) {
            mensagem = "IMC -> " + String.valueOf(imc) + " Obesidade Grau 3";
	}
	return mensagem;
	}

	
    @Override
    public void update(Observable o, Object arg) {
    }

    void registroObserver(Pessoa pessoa) {
    }

    void setMesurements(double d, double d0) {
    }
    
}
