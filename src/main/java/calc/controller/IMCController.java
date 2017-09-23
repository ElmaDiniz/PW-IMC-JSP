package calc.controller;

import calc.model.CalculandoImc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/imc")
public class IMCController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double peso = Double.parseDouble(req.getParameter("peso"));
        if (peso < 1) {
            throw new ServletException("Informe o peso válido: " + peso);
        }
        double altura = Double.parseDouble(req.getParameter("altura"));
        if (altura < 0 || altura > 3) {
            throw new ServletException("Informe uma altura válida: " + altura);
        }
        String sexo = req.getParameter("sexo");
        if (sexo == null || "".equals(sexo)) {
            throw new ServletException("EInforme o sexo válido: " + sexo);
        }

        CalculandoImc resposta = new CalculandoImc();
        resposta.CalcImc(peso, altura, sexo);
        req.setAttribute("resultadoImc", resposta.getResultadoImc());
        req.setAttribute("messagem", resposta.getMessagem());
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

}
