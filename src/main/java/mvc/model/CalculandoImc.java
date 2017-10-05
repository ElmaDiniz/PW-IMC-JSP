package mvc.model;


public class CalculandoImc{

    private String mensagem;
    private double resultadoImc;

    public CalculandoImc(){
        this.mensagem = "";
        this.resultadoImc = 0;
    }

    public void CalcImc(double peso, double altura, String sexo) {
        
        resultadoImc  = peso / (altura * altura);

        mensagem = "";
        if (resultadoImc < 17) {
        	mensagem = "Seu peso está muito abaixo do normal!";
        }
        if (resultadoImc >= 17 && resultadoImc < 18.5) {
        	mensagem = "Seu peso está abaixo do normal!";
        }
        if (resultadoImc >= 18.5 && resultadoImc < 25) {
        	mensagem = "Parabéns seu peso está normal!";
        }
        if (resultadoImc >= 25 && resultadoImc < 30) {
        	mensagem = "Você está um pouco acima do peso!";
        }
        if (resultadoImc >= 30 && resultadoImc < 35) {
        	mensagem = "Cuidado! Você está com obesidade I!";
        }
        if (resultadoImc >= 35 && resultadoImc < 40) {
        	mensagem = "Cuidado! Você está com obesidade II (severa)!";
        }
        if (resultadoImc >= 40) {
        	mensagem = "Cuidado! Você está com obesidade III (mórbida)!";
        }
        System.out.println("Seu ICM é igual a: " + resultadoImc + " E " + mensagem);

    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public double getCalcImc() {
        return resultadoImc;
    }

    public void setCalcImc(double resultadoImc) {
        this.resultadoImc = resultadoImc;
    }

}
