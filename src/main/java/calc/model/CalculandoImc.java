package calc.model;


public class CalculandoImc{

    private String messagem;
    private double resultadoImc;

    public CalculandoImc(){
        this.messagem = "";
        this.resultadoImc = 0;
    }

    public void CalcImc(double peso, double altura, String sexo) {
        
        resultadoImc  = peso / (altura * altura);

        mensagem = "";
        if (resultadoImc < 17) {
            messagem = "Seu peso está muito abaixo do normal!";
        }
        if (resultadoImc >= 17 && resultadoImc < 18.5) {
            messagem = "Seu peso está abaixo do normal!";
        }
        if (resultadoImc >= 18.5 && resultadoImc < 25) {
            messagem = "Parabéns seu peso está normal!";
        }
        if (resultadoImc >= 25 && resultadoImc < 30) {
            messagem = "Você está um pouco acima do peso!";
        }
        if (resultadoImc >= 30 && resultadoImc < 35) {
            messagem = "Cuidado! Você está com obesidade I!";
        }
        if (resultadoImc >= 35 && resultadoImc < 40) {
            messagem = "Cuidado! Você está com obesidade II (severa)!";
        }
        if (resultadoImc >= 40) {
            messagem = "Cuidado! Você está com obesidade III (mórbida)!";
        }
        System.out.println("Seu ICM é igual a: " + resultadoImc + " E " + messagem);

    }

    public String getMessagem() {
        return messagem;
    }

    public void setMessagem(String messagem) {
        this.messagem = messagem;
    }

    public double getCalcImc() {
        return resultadoImc;
    }

    public void setCalcImc(double resultadoImc) {
        this.resultadoImc = resultadoImc;
    }

}
