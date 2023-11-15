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
public class Pagamento extends Abs_Pagamento {
    public Pagamento(){}//contrutor 
    
    String data_pagamento;
    String forma_pagamento;
    float valor = 0;
    
    public void cadastrarPagamento(String nome, int id, String forma_pagamento, String data_pagamento, float valor) {
       System.out.println("Pagamento cadastrado! \n Tipo id: "+ id+ "\n Nome: "+nome+
               "\n Forma de pagamento: "+forma_pagamento+"\n Data de pagamento: "+data_pagamento+"\n Valor do pagamento: "+valor);
   }
    
    //Getters e Setters    
    public String getdata_pagamento(){
        return data_pagamento;
        
    }
    
    public void setdata_pagamento(String data_pagamento){
        this.data_pagamento = data_pagamento;
        
    }
    public String getforma_pagamento(){
        return forma_pagamento;
        
    }
    
    public void setforma_pagamento_id(String forma_pagamento){
        this.forma_pagamento= forma_pagamento;
        
    }
  
     public float getvalor(){
        return valor;
        
    }
    
    public void setvalor(float valor){
        this.valor = valor;
        
    }
    public void deletar(){}
    public void atualizar(){}
    protected void finalize(){}
    
    
}
