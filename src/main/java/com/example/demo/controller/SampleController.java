package com.example.demo.controller;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

//https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#getting-started

//Anotación que identifica la clase como un controlador, en nuestro caso al ser una aplicacion web
//considera la clase al manejar las solicitudes web entrantes.
@Controller
//Esta anotación le dice a Spring Boot que "adivine" cómo desea configurar Spring, en base a las dependencias de jar que ha agregado. 
//Desde que Spring-boot-starter-web agregó Tomcat y Spring MVC, la autoconfiguración asumirá que está desarrollando 
//una aplicación web y configura Spring en consecuencia.
@EnableAutoConfiguration
public class SampleController {

	//La anotación @RequestMapping proporciona información de "enrutamiento". 
	//Le está diciendo a Spring que cualquier solicitud HTTP con la ruta "/" debería ser asignada al método home. 
	//La anotación @RestController le dice a Spring que devuelva la cadena resultante directamente al llamador.
	//Las anotaciones @RestController y @RequestMapping son anotaciones de Spring MVC (no son específicas de Spring Boot). 
	//Consulta la sección MVC en la documentación de referencia de Spring para obtener más detalles.
	//https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/web.html#mvc
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
