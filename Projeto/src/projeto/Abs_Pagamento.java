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
public abstract class Abs_Pagamento {
    
    //métodos abstratos
    public abstract void cadastrarPagamento(String nome, int id, String forma_pagamento, String data_pagamento,  float valor);
    public abstract void atualizar();
    public abstract void deletar();
    
    
    
}
