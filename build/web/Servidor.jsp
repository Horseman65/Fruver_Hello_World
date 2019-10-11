<%-- 
    Document   : Servidor
    Created on : 10-oct-2019, 19:34:32
    Author     : anton
--%>

<%@page import="Model.Contacto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guardado</title>
        <style>
            a{
                text-decoration: none;
            }
        </style>
    </head>
    <body>
        <%
        
            Contacto C = new Contacto();
            
            C.setEmail(request.getParameter("Email").toString().trim());
            C.setNombre(request.getParameter("Name"));
            C.setApellido(request.getParameter("Last_Name"));
            C.setTelefono(Integer.parseInt(request.getParameter("Phone")));
            C.setDescripcion_Duda(request.getParameter("Description"));
            
            if(C.Guardar_Contacto()){
            
                out.println("Guargado correctamente.");
                
            }else{
                
                out.println("Error: No se guardo correctamente.");
                        
            }

        %>
        <br>
        <br>
        <br>
        <br>
        <a href="index.html">Guardar otro contacto</a>
        
    </body>
</html>
