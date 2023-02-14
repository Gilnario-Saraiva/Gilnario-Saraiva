package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Dependentes;
import entities.Funcionario;
import entities.Setor;

public class Cadastro {
	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		List<Funcionario> funcionarios = new ArrayList<>();
		List<Dependentes> dependentes = new ArrayList<>();
		Setor setor = new Setor();

		System.out.print("Entre com o numero de funcionarios: ");
		int qtdFuncionarios = sc.nextInt();
		sc.nextLine();

		SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");

		for (int i = 1; i <= qtdFuncionarios; i++) {
			System.out.println("Entre com os dados do funcionario " + i);

			System.out.print("Digite o Nome: ");
			String nome = sc.nextLine();

			System.out.print("Digite a data de nascimento do funcionario: " + i + ": ");
			Date dataNascimentoFunc = fmt1.parse(sc.nextLine());

			System.out.print("Digite a matricula do funcionario " + i + ": ");
			int matricula = sc.nextInt();
			sc.nextLine();

			System.out.print("Digite o codigo do setor: ");
			int codSetor = sc.nextInt();
			sc.nextLine();

			String descricao = setor.getDescricao(codSetor);

			System.out.print("O funcionario " + i + " tem dependentes s/n? ");
			char resp = sc.next().charAt(0);
			sc.nextLine();

			if (resp == 's') {
				SimpleDateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
				System.out.print("Digite o numero de dependentes do funcionario " + i + ": ");
				int qtdDependentes = sc.nextInt();
				sc.nextLine();

				for (int j = 1; j <= qtdDependentes; j++) {
					System.out.print("Digite o nome do dependente " + j + ": ");
					String nomeDependente = sc.nextLine();

					System.out.print("Digite a data de nascimento do dependente " + j + ": ");
					Date dataNascimentoDependente = fmt2.parse(sc.nextLine());

					Dependentes dependente = new Dependentes(nomeDependente, dataNascimentoDependente);

					dependentes.add(dependente);

				}
				Funcionario funcionario = new Funcionario(nome, matricula, new Setor(codSetor, descricao),
						dataNascimentoFunc, dependentes);
				funcionarios.add(funcionario);

			} else {
				Funcionario funcionario = new Funcionario(nome, matricula, new Setor(codSetor, descricao),
						dataNascimentoFunc);
				funcionarios.add(funcionario);
			}

			System.out.println("-----------------------------------");

		}

		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}

		System.out.println("-----------------------------------");

		List<Funcionario> totalFuncionario = funcionarios.stream()
				.filter(funcionario -> funcionario.getSetor().getCodigo() == 1).collect(Collectors.toList());

		System.out
				.println("Quantidades de funcionarios no setor " +  1 + ": " + totalFuncionario.size() + " funcionarios -- descricao: " + setor.getDescricao(1));
		
		totalFuncionario = funcionarios.stream()
				.filter(funcionario -> funcionario.getSetor().getCodigo() == 2).collect(Collectors.toList());

		System.out
				.println("Quantidades de funcionarios no setor " +  2 + ": " + totalFuncionario.size() + " funcionarios -- descricao: " + setor.getDescricao(2));
		
		sc.close();

	}
}
