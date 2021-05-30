package io.github.douglasfps;

import io.github.douglasfps.domain.entity.Cliente;
import io.github.douglasfps.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes){
        return args -> {
           clientes.salvar(new Cliente("Madally"));
           clientes.salvar(new Cliente("Kauan"));

          List<Cliente> listaCliente =  clientes.obterTodos();
          listaCliente.forEach(System.out::println);
        };
    }

    @GetMapping("/hello")
    public String helloWord(){
        return aplicatioinName;
    }


    public static void main(String[] args) {
        SpringApplication.run(VendasAplication.class, args);
    }
}
