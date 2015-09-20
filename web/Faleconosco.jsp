<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>fale conosco</title>
        <link href="css/texte.css" rel="stylesheet" type="text/css"/>
    </head>

<body> 
    <div id="login">
            <form action="sei lah" method="post">
                <label>Login :</label>
                    <input type="text" name="login" />
                <label>Senha :</label>
                    <input type="password" name="login" maxlength="6" />
                    <input type="submit" name="Entrar" value="Entrar" /><br />
                <a href="Cadastro.jsp"><img src="img/boton-registrarse.png" alt="restro" /></a>
            </form>
    </div>
    <div>
        <jsp:include page="slider.jsp"/>
    </div>
                
		
</br>        

        <div>
            <jsp:include page="menu.jsp"/>
        </div>
<br/>
<br/>
    <div id="numeros">
        <h1>Numero de telefones :</h1>
            <br /><br />
        <strong>Tel :</strong> 9090-9090<br />
        <strong>End :</strong> R.Jose Antonio n.200<br /><br />

        <strong>Tel :</strong> 7070-7070<br />
        <strong>End :</strong> R.Jose Antonio n.400<br /><br />

        <strong>Tel :</strong> 7171-7171 <br />
        <strong>End :</strong> R. Jose Antonio n. 500<br />
    </div>

<br />
<br />

    <div id="rodape" align="center">
        <jsp:include page="rodape.jsp"/>
    </div>

</body>
</html>
