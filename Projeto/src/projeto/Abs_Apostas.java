/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author NW Comunicação Ltda
 */
public abstract class Abs_Apostas {
    
    //métodos abstratos
    public abstract void cadastrarAposta(String nome, int numero, String data_aposta_inicio, String data_aposta_fim, float valor);
    public abstract void excluir();
    public abstract void atualizar();
    
    
}
