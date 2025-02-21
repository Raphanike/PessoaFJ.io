public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João", "Rua A, 123", "123.456.789-00");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa X", "Avenida B, 456", "12.345.678/0001-00");

        // Exibindo dados
        pessoaFisica.imprimirDados();
        System.out.println();
        pessoaJuridica.imprimirDados();
    }
}
