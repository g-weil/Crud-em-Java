/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author GabrielWeilBriskiews
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //encapsuladores 
        
        Pessoa pessoa = new Pessoa();
        pessoa.cadastrarPessoa(0, "", 0, "", "", "", "");
        
        Gerente gerente = new Gerente();
        gerente.cadastrarGerente(0, "maria", 28, 1893002405, 991019111, "17/06/1974");
        
        Funcionario funcionario = new Funcionario();
        funcionario.cadastrarFuncionario(1, "lianderson", 35, 868801070, 519999999, "08/08/1988");
        
        Cliente cliente = new Cliente();
        cliente.cadastrarCliente(2, "paulo", 58, 89445864, 54267125, "01/08/1912");
        
        Pagamento pagamento = new Pagamento();
        pagamento.cadastrarPagamento("gabriel", 2, "cartao", "05/05/2023", (float) 50.00);
        
        Apostas apostas = new Apostas();
        apostas.cadastrarAposta("joao", 0, "", "", 0);
        
        try {
        int a = 0;
        int b = 45/a;
        System.out.println(""+b);

    }   catch (NumberFormatException ErrodeFormato){
        
        System.out.println("erro de formatação ");
        System.out.println("falha geral = "+ErrodeFormato.getMessage());
        System.out.println("causa = "+ErrodeFormato.getCause());
        System.out.println("localizando mensagem = "+ErrodeFormato.getLocalizedMessage());
        System.out.println("stack trace = "+ErrodeFormato.getStackTrace());

        }
        
        
        catch (ArithmeticException ErroMatematico){
        
        System.out.println("erro matematico ");
        System.out.println("falha geral = "+ErroMatematico.getMessage());
        System.out.println("causa = "+ErroMatematico.getCause());
        System.out.println("localizando mensagem = "+ErroMatematico.getLocalizedMessage());
        System.out.println("stack trace = "+ErroMatematico.getStackTrace());

        }
        
        catch (Exception ErroGenerico){
        
        System.out.println("erro matematico ");
        System.out.println("falha geral = "+ErroGenerico.getMessage());
        System.out.println("causa = "+ErroGenerico.getCause());
        System.out.println("localizando mensagem = "+ErroGenerico.getLocalizedMessage());
        System.out.println("stack trace = "+ErroGenerico.getStackTrace());
        
    }
    }
}