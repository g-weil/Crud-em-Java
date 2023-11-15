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
public class Funcionario extends Cliente{
    public Funcionario(){}
    
    int id_funcionario = 0;
    
    //Get e Set
    public int getId_funcionario(){
        return id_funcionario;
        
    }
    
    public void setId_funcionario(int id_funcionario){
        this.id_funcionario = id_funcionario;
        
    }
    
    //métodos
    public void cadastrarFuncionario(int id_funcionario, String nome, int idade, long cpf, long telefone, String data_nascimento){
    System.out.println("Funcionario cadastrado! \n Tipo id: "+ id +"\n Nome: " 
            +nome+"\n Idade: " + idade+"\n CPF: " + cpf+"\n Telefone: " + telefone+"\n Data de nascimento: " + data_nascimento);
    }
    
    public void excluir(){}    
    public void atualizar(){}
    protected void finalize(){}

}
   
    
   