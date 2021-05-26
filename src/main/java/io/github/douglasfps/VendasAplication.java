package io.github.douglasfps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
/** Colocar uma classe para ser gerenciada pelo container do Spring
@ComponentScan(basePackages = {
                    "io.github.douglasfps.repository",
                    "io.github.douglasfps.service",
                    "br.com.outraconfiguracaobiblioteca.projeto"})

 * Adicionamos na notação @ConpomentScan os pacotes que queremos que o SpringBoot Scanei
 * */
public class VendasAplication {
    @Autowired
    @Qualifier("applicationName")
    private String aplicatioinName;

    @Autowired
    @Qualifier("version")
    private String version;

    @GetMapping("/hello")
    public String helloWord(){
        return aplicatioinName + " - " + version;
    }


    public static void main(String[] args) {
        SpringApplication.run(VendasAplication.class, args);
    }
}
