/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author pcagf1
 */

public class Cliente extends Pessoa {
    public Cliente(){}
    
    int id_cliente = 0;
    
    //Get e Set
    public int getId_cliente(){
        return id_cliente;
        
    }
    
    public void setId_cliente(int Id_cliente){
        this.id_cliente = id_cliente;
        
    }
    
    //métodos
    public void cadastrarCliente(int id_cliente, String nome, int idade, long cpf, long telefone, String data_nascimento){
    System.out.println("Cliente cadastrado! \n Tipo id: "+ id +"\n Nome: " +nome+"\n Idade: " + 
                idade+"\n CPF: " + cpf+"\n Telefone: " + telefone+"\n Data de nascimento: " + data_nascimento);
    }
    
    public void excluir(){}
    public void atualizar(){}
    protected void finalize(){}
  
}
