<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Untitled Document</title>
        <link href="css/rodape.css" rel="stylesheet" type="text/css"/>
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
            <jsp:include page="slider.jsp" />
        </div>
    </br>        

        <div>
            <jsp:include page="menu.jsp"/>
        </div>
    <br />
    <br />

        <div name="produtos">
            <img src="img/Produto.jpg" alt="PCmonstro" /><br/>
                <div id="produto1">
                    <a href="PCmonstro.jsp">Computador GAMER Intel i7 Cosmos Power II (Corei7/16GB/SSD/2TB/GTX980) Water Cooler</a>
                </div>
        </div>
    <br />
    <br />
        <div id="rodape" align="center">
            <jsp:include page="rodape.jsp"/>    
        </div>

</body>
</html>
