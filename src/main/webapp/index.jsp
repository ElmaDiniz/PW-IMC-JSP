
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <!--Import Google Icon Font-->
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons"
          rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="css/materialize.min.css"
          media="screen,projection"/>
    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Calculando IMC</title>
</head>
<body class="row">

    <nav>
        <div class="nav-wrapper teal darken-2">
            <a href="#" class="brand-logo center">Calculadora de IMC
                simplificada</a>
        </div>
    </nav>


    <% if(request.getAttribute("resultadoImc") != null) {
        java.util.Formatter formatter = new java.util.Formatter();
        %>
    <div class="col s6 offset-s3 card-panel teal lighten-2">
        <p> Resultado do cálculo IMC: ${resultadoImc}
        </p>
        <b>${messagem}</b>
    </div>
    <% } %>

    <form id="form" class="col s6 offset-s3" action="imc">
        <div class="row">
            <div class="input-field col s12">
                <input id="peso" name="peso" type="text"
                       class="validate">
                <label for="peso">Peso</label>
            </div>
        </div>

        <div class="row">
            <div class="input-field col s12">
                <input id="altura" type="text" name="altura" class="validate">
                <label for="altura">Altura</label>
            </div>
        </div>

        <div class="row">
            <div class="input-field col offset-s4">
                <button class="twaves-effect waves-light btn-large">
                    Calcular IMC
                </button>
            </div>
        </div>

    </form>

    <script type="text/javascript"
            src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="js/materialize.min.js"></script>

    <script type="text/javascript"> 
    $(document).ready(function () {
        $('select').material_select();
    });
    </script>
</body>
</html>
