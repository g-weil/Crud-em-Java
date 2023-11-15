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
public abstract class Abs_Pessoa {

    //métodos abstratos
    public abstract void cadastrarPessoa(int id, String nome, int idade, String cpf, String telefone, String data_nascimento, String email);
    public abstract void excluir();
    public abstract void atualizar();
    
    
}
