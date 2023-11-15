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
public class Pessoa extends Abs_Pessoa{
    public Pessoa(){}//sobrecarga //contrutor
    
    int id = 0;
    int idade = 0;
    String nome = "";
    String cpf = "";
    String telefone = "";
    String data_nascimento = "";
    String email = "";
 
    public void cadastrarPessoa(int id, String nome, int idade, String cpf, String telefone, String data_nascimento, String email){
        System.out.println("Pessoa cadastrada! \n Tipo id: "+ id +"\n Nome: " +nome+"\n Idade: " + 
                idade+"\n CPF: " + cpf+"\n Telefone: " + telefone+"\n Data de nascimento: " + data_nascimento+"\n E-mail: "+email);
    }
    
    //Getters e Setters
    public String getData_nascimento(){
        return data_nascimento;
  
    }
    
    public void setData_nascimento(String Data_nascimento){
        this.data_nascimento = data_nascimento;
        
    }
    
    public String getNome(){
        return nome;
        
    }
    
    public void setNome(String Nome){
        this.nome = nome;
        
    }
    
    public int getId(){
        return id;
        
    }
    
    public void setId(int Id){
        this.id= id;
        
    }
   
    
    public String getCpf(){
        return cpf;
        
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
        
    }
    public String getTelefone(){
        return telefone;
        
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
        
    }
    public String getEmail(){
        return email;
  
    }
    
    public void setEmail(String Email){
        this.email = email;
        
    }
    
    public void excluir(){}
    public void imprime(){}
    public void atualizar(){}
    
    protected void finalize(){}

}