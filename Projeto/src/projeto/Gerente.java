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
public class Gerente extends Funcionario{
    public Gerente(){}
    
    int id_gerente = 0;
    
    //Get e Set
    public int getId_gerente(){
        return id_gerente;
        
    }
    
    public void setId_Gerente(int Id_Gerente){
        this.id_gerente = id_gerente;
        
    }
    
    //métodos
    public void cadastrarGerente(int id_gerente, String nome, int idade, long cpf, long telefone, String data_nascimento){
    System.out.println("Gerente cadastrado! \n Tipo id: "+ id +"\n Nome: " +nome+
            "\n Idade: " + idade+"\n CPF: " + cpf+"\n Telefone: " + telefone+"\n Data de nascimento: " + data_nascimento);
    }
    
    public void excluir(){}     
    public void atualizar(){}
    protected void finalize(){}

}
