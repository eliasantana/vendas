package io.github.douglasfps;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
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
    @Value("${application.name}")
    private String aplicatioinName;


    @Cachorro
    private Animal animal ;

    @Gato
    Animal animal2;


    @Bean(name="executarAnimal")
    public CommandLineRunner executar(){
        return args -> {
            this.animal.fazerBarulho();
        };
    }

    @Bean
    public CommandLineRunner executarAnimal2(){
        return args -> {this.animal2.fazerBarulho();};
    }


    @GetMapping("/hello")
    public String helloWord(){
        return aplicatioinName;
    }


    public static void main(String[] args) {
        SpringApplication.run(VendasAplication.class, args);
    }
}
