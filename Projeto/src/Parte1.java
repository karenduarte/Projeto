import java.util.Scanner;

public class Parte1 {

	public static void main(String[] args) {

		// Inciando com as variaveis

		// Realizando a leitura dos valores atraves do Scanner
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);

		// CONTAS
		int valor1 = 0;
		int valor2 = 0;
		int soma = 0;
		int subtracao;
		int divisao;
		int opcao = 0;

		// FAIXA ETARIA

		int idadegeral = 0;
		int idade = 0;
		float idademasculino = 0;
		float idadefeminina = 0;
		int sexo = 0;
		int contM = 0;
		int contF = 0;
		float mediageral = 0;
		float mediamasculina = 0;
		float mediafeminina = 0;

		do {

			// Menu de opera��es:

			System.out.println("1: Soma");
			System.out.println("2: Subtra��o");
			System.out.println("3:Divis�o");
			System.out.println("4:Faixa Et�ria");
			System.out.println("5: Numeros Primos");
			System.out.println("6:Mudan�a de Base");
			System.out.println("7: Sair");
			opcao = num.nextInt();

			switch (opcao) {

			case 1:
				// SOMANDO
				System.out.println("Digite um valor : ");
				valor1 = num.nextInt();
				System.out.println("Digite outro valor : ");
				valor2 = num.nextInt();
				soma = valor1 + valor2;
				System.out.println("O resultado da Soma dos dois valores informados � : " + soma);

				// Op��o para retornar ao menu principal
				while (opcao != 0) {
					System.out.println(" Digite (0) para voltar ao menu!");
					opcao = num.nextInt();
					if (opcao == 0) {
						opcao = 0;
					} else {
						System.out.println(" Erro! Digite novamente.");
					}
				}
				// Fim da opera��o de retorno ao menu
				break;

			case 2:

				// SUBTRAINDO
				System.out.println("Digite um valor : ");
				valor1 = num.nextInt();
				System.out.println("Digite outro valor : ");
				valor2 = num.nextInt();
				subtracao = valor1 - valor2;
				System.out.println("O resultado da Subtra��o dos valores informados � : " + subtracao);

				// Op��o para retornar ao menu principal
				while (opcao != 0) {
					System.out.println(" Digite (0) para voltar ao menu!");
					opcao = num.nextInt();
					if (opcao == 0) {
						opcao = 0;
					} else {
						System.out.println(" Erro! Digite novamente.");
					}
				}
				// Fim da op��oo de retorno ao menu
				break;

			case 3:

				// DIVIDINDO
				System.out.println("Digite um valor : ");
				valor1 = num.nextInt();
				System.out.println("Digite outro valor : ");
				valor2 = num.nextInt();
				divisao = valor1 / valor2;
				System.out.println("O resultado da Divis�o dos valores informados �  : " + divisao);

				// Op��o para retornar ao menu principal
				while (opcao != 0) {
					System.out.println(" Digite (0) para voltar ao menu!");
					opcao = num.nextInt();
					if (opcao == 0) {
						opcao = 0;
					} else {
						System.out.println(" Erro! Digite novamente.");
					}
				}
				// Fim da op��o de retorno ao menu
				break;

			case 4:
				System.out.println("Digite o numero de pessoas: ");
				int numeropessoas = num.nextInt();
				for (int i = 0; i < numeropessoas; i++) {
					System.out.println("Informe sua idade : ");
					idade = num.nextInt();
					System.out.println("Informando o sexo, por favor digite (1) para masculino e (2) para feminino");
					sexo = num.nextInt();

					idadegeral = idade + idadegeral;

					if (sexo == 1) {
						contM++;
						idademasculino = idade + idademasculino;
					} else if (sexo == 2) {
						contF++;
						idadefeminina = idade + idadefeminina;
					}
				}
				mediageral = idadegeral / numeropessoas;
				mediamasculina = idademasculino / contM;
				mediafeminina = idadefeminina / contF;
				System.out.println("media geral = " + mediageral);
				System.out.println("sexo masculino =  " + mediamasculina);
				System.out.println("sexo feminino = " + mediafeminina);

				// Op��o para retornar ao menu principal
				while (opcao != 0) {
					System.out.println(" Digite (0) para voltar ao menu!");
					opcao = num.nextInt();
					if (opcao == 0) {
						opcao = 0;
					} else {
						System.out.println(" Erro! Digite novamente.");
					}
				}
				// Fim da op��o de retorno ao menu
				break;

			case 5:
				// Scanner num = new Scanner(System.in);
				soma = 0;
				boolean p = false;
				System.out.println("Informe um n�mero : ");
				int n = num.nextInt();

				for (int i = 2; i <= n; i++) {
					if (i == 2 || i == 3) {
						p = true;
					} else {
						for (int j = 2; j < i; j++) {
							if (i % j == 0) {
								p = false;
								break;
							} else {
								p = true;
							}

						}

					}

					if (p)
						soma = soma + i;

				}
				System.out.println("A Soma dos numeros primos at� " + n + " � = " + soma);

				// Op��o para retornar ao menu principal
				while (opcao != 0) {
					System.out.println(" Digite (0) para voltar ao menu!");
					opcao = num.nextInt();
					if (opcao == 0) {
						opcao = 0;
					} else {
						System.out.println(" Erro! Digite novamente.");
					}
				}

				break;

			case 6:
				// MUDAN�A DE BASE

				Scanner in = new Scanner(System.in);
				System.out.println("+ + MUDAN�A DE BASE + + ");
				System.out
						.println(" Digite [1] para informar um n�mero bin�rio e [2] para informar um n�mero decimal: ");
				int bindec = in.nextInt(); // Opcao para o menu (binario ou decimal)

				switch (bindec) {
				case 1:
					System.out.println(" Digite o valor em bin�rio ");
					String entrada = in.next();
					int potencia = 0;
					int decimal = 0;

					for (int i = entrada.length() - 1; i >= 0; i--) {
						decimal += Math.pow(2, potencia) * Character.getNumericValue(entrada.charAt(i));
						potencia++;

					}
					System.out.println(" O n�mero informado em decimal �: " + decimal);
					break;

				case 2:
					int dec, mod;
					String bin = "";
					System.out.println(" Digite um n�mero em decimal ");
					dec = in.nextInt();

					while (dec > 0) {
						mod = (dec % 2);
						bin = mod + bin;
						dec = dec / 2;
					}
					System.out.println(" O valor do n�mero informado em bin�rio � " + bin);

				}
				// Op��o para retornar ao menu principal
				while (opcao != 0) {
					System.out.println(" Digite 0 para voltar ao MENU inicial");
					opcao = in.nextInt();
					if (opcao == 0) {
						opcao = 0;
					} else {
						System.out.println(" Op��o inv�lida.");
					}
				}
				// Fim da op��o de retorno ao menu
				break;

			}
		} while (opcao == 0);

	}

}
