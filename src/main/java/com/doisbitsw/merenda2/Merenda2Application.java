package com.doisbitsw.merenda2;

import java.util.Arrays;

import com.doisbitsw.merenda2.domains.*;
import com.doisbitsw.merenda2.domains.enuns.TipoCliente;
import com.doisbitsw.merenda2.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Merenda2Application implements CommandLineRunner {

	@Autowired
	private CategoriaRepository repCategoria;
	@Autowired
	private ProdutoRepository repProduto;
	@Autowired
	private EstadoRepository repEstado;
	@Autowired
	private CidadeRepository repCidade;
	@Autowired
	private EnderecoRepository repEndereco;
	@Autowired
	private  ClienteRepository repCliente;


	public static void main(String[] args) {
		SpringApplication.run(Merenda2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null,"Escritório");

		Produto p1 = new Produto(null,"Computador", 2000.00);
		Produto p2 = new Produto(null,"Impressora", 800.00);
		Produto p3 = new Produto(null,"Mouse", 75.00);

		Estado est1 = new Estado(null,"MInas Gerais");
		Estado est2 = new Estado(null,"São Paulo");

		Cidade c1 = new Cidade(null,"UberLândia",est1);
		Cidade c2 = new Cidade(null,"Santos",est2);
		Cidade c3 = new Cidade(null,"Campinas",est2);


		Cliente cli1 = new Cliente(null,"Maria Silva","Maria@gmail.com","363564865", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("3547-0526","3547-0985"));

		Endereco e1 = new Endereco(null,"Rua flores","300","Apto 303","Jardins","85294-852",cli1,c1);
		Endereco e2 = new Endereco(null,"Rua Matos","450","Apto 142","Jardins","85294-852",cli1,c2);

		cli1.getEnderecos().addAll(Arrays.asList(e1,e2));

		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2,c3));

		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));


		repCategoria.saveAll(Arrays.asList(cat1,cat2));
		repProduto.saveAll(Arrays.asList(p1,p2,p3));
		repEstado.saveAll(Arrays.asList(est1,est2));
		repCidade.saveAll(Arrays.asList(c1,c2,c3));
		repCliente.saveAll(Arrays.asList(cli1));
		repEndereco.saveAll(Arrays.asList(e1,e2));



	}
}
