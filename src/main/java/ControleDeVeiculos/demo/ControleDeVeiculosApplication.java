package ControleDeVeiculos.demo;

import ControleDeVeiculos.demo.dominio.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootApplication
@EnableFeignClients
public class ControleDeVeiculosApplication {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	Usuario use1 = new Usuario(null, "Herlander", "123@gmail.com", "79834762109", sdf.parse("22/05/1998 00:00"));




	public ControleDeVeiculosApplication() throws ParseException {
	}


	public static void main(String[] args) {
		SpringApplication.run(ControleDeVeiculosApplication.class, args);
	}

}
