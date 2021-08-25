
# TAREA INTRODUCCIÓN MVN-GITY HEROKU AREP
## Arquitectura Empresarial 24 Julio del 2021 


En esta laboratorio se pide construir una aplicación que demuestre una simple arquitectura de Microservicios desplegada en Heroku para uno de los clientes más importantes.

 Para ingresar al link de Heroku haga [click aqui](https://introduccionmaven.herokuapp.com/)

Para este laboratorio utilizamos  
  + Git 
  + Apavhe Maven 
  + Java 
  + Spark
  + Heroku
  

  # Diagrama de clases  

   ![Imagen](https://github.com/camilaFetecua/TallerHerokuAREP/blob/master/Imagenes/DiagramadeClases.PNG)
   
   Para este proyecto utilizamos 5 clases:
  + **AlphaAdvantageHttpStockService:** Clase donde retorna la Url con el stock de AlphaAdvantage con un intervalo
  + **IEXCloudHttpStockService:** Clase donde retorna la Url cloud.iexapis con el stock decon un intervalo
  + **HttpStockService:** Clase para invocar servicios get desde Java
  + **App:** Es la clase ejemplo de aplicación web mínima para Heroku usando SparkWe
  + **CientJS:** Clase de cliente escrita en JS que invoca los servicios REST

  
    
   # Licencia

  Para consultar la Licencia del proyecto haga [click aqui](https://github.com/camilaFetecua/TallerHerokuAREP/blob/master/LICENSE.md)
  
  
# Autor 
  **Maria Camila Fetecua Garcia** 

      


