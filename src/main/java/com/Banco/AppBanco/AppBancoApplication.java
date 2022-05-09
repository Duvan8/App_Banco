package com.Banco.AppBanco;

import com.Banco.AppBanco.entidades.ClienteBanco;
import com.Banco.AppBanco.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppBancoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppBancoApplication.class, args);
	}

	@Autowired
	private ClienteRepositorio repositorio;

	@Override
	public void run(String... arg) throws Exception{
		ClienteBanco cliente1 = new ClienteBanco(100,"Duvan","perez","duvan@gmial.com",32132132);
		repositorio.save(cliente1);
	}

}
