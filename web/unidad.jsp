<%@page import="model.UnidadAbstractaInformacion"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Unidades</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body background="fondo.jpg">
        <h1>Inserte la unidad</h1>
        <form action="Unidades" method="POST">
            id Tabla:
            <input type="text" name="idTabla"/>
            Id Contexto:
            <input type="text" name="idContexto"/>
            <br>
            <br>  
            <input type="submit" class="btn btn-info" name="enviar"/>
            
            <a class="btn btn-info" href="index.jsp" role="button">Inicio</a>
        </form>

        <h1>Unidades</h1>
        <div class="container">
            <div class="row">  
                <div class="col-sm-12">
                    <table class="table table-hover table-condensed table-bordered">
                        <tr>
                            <td>Id</td>
                            <td>Id Tabla</td>
                            <td>Id Contexto</td>
                            

                        </tr>
                        <% if (request.getAttribute("listaUnidades") != null) {
                                ArrayList<UnidadAbstractaInformacion> list = (ArrayList<UnidadAbstractaInformacion>) request.getAttribute("listaUnidades");
                                if (list != null)
                                    for (UnidadAbstractaInformacion unidad : list) {


                        %>
                        <tr>
                            <td><%=unidad.getId_unidad()%></td>
                            <td><%= unidad.getTabla()%></td>
                            <td><%=unidad.getId_contexto()%></td>
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
