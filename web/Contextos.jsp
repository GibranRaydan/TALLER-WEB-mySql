<%@page import="model.ContextoNavegacion"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Contexto</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body background="fondo.jpg">
        <h1>Inserte el Contexto</h1>
        <form action="Contextos" method="POST">
            Id:
            <input type="text" name="id"/>
            Link:
            <input type="text" name="link"/>
            Id Modelo:
            <input type="text" name="idModelo"/>
            <br>
            <br>  
            <input type="submit" class="btn btn-info" name="enviar"/>
            <%--<a class="btn btn-info" href="Columna.jsp" role="button">Crear Columna</a>--%>
            <a class="btn btn-info" href="index.jsp" role="button">Inicio</a>
        </form>

        <h1>Contextos</h1>
        <div class="container">
            <div class="row">  
                <div class="col-sm-12">
                    <table class="table table-hover table-condensed table-bordered">
                        <tr>
                            <td>Id</td>
                            <td>Link</td>
                            <td>IdModelo</td>
                           

                        </tr>
                        <% if (request.getAttribute("listaContextos") != null) {
                                ArrayList<ContextoNavegacion> list = (ArrayList<ContextoNavegacion>) request.getAttribute("listaContextos");
                                if (list != null)
                                    for (ContextoNavegacion contexto : list) {


                        %>
                        <tr>
                            <td><%=contexto.getId_contexto()%></td>
                            <td><%=contexto.getLink()%></td>
                            <td><%=contexto.getId_modelo()%></td>
                            <td>
                                <%-- <button onclick="window.location.href = 'EditarTablas?id=<%=tabla.getId_tabla()%>'" class="btn btn-warning">Editar</button>
                                <button onclick="window.location.href = 'BorrarTablas?id=<%=tabla.getId_tabla()%>'" class="btn btn-danger">Borrar</button>
                                --%>
                            </td>
                        </tr>
                        <% }
                            }
                        %>

                    </table>

                </div>
            </div>
        </div>

    </body>
</html>
