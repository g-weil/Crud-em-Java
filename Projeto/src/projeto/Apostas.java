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
public class Apostas extends Abs_Apostas {
    public Apostas(){}//construtor
    
    int id_Pessoa = 0;
    String nome = "";
    int numero = 0; //numero escolhido pelo apostador que deve ser a soma dos dois dados lançados
    String data_aposta_inicio = "";
    String data_aposta_fim = "";
    
    
    public void cadastrarAposta(String nome, int numero, String data_aposta_inicio, String data_aposta_fim, float valor){
        System.out.println("Aposta cadastrada! \n Nome: "+nome+ "\n Data da aposta: "+ data_aposta_inicio + 
                "\n Data de vencimento da aposta: "+data_aposta_fim+ "\n Valor apostado: "+valor+" \n Numero escolhido: "+numero+"\n Boa sorte "+ nome+ "!!!");
    }
    //Getters e Setters

    public int getId_Pessoa() {
        return id_Pessoa;
    }

    public void setId_Pessoa(int id_Pessoa) {
        this.id_Pessoa = id_Pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData_aposta_inicio() {
        return data_aposta_inicio;
    }

    public void setData_aposta_inicio(String data_aposta_inicio) {
        this.data_aposta_inicio = data_aposta_inicio;
    }

    public String getData_aposta_fim() {
        return data_aposta_fim;
    }

    public void setData_aposta_fim(String data_aposta_fim) {
        this.data_aposta_fim = data_aposta_fim;
    }
    

    public void excluir(){}
    public void atualizar(){}
    protected void finalize(){}
    
}
