
package projeto;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author GabrielWeilBriskiews
 */
public class AppGraphicsAposta  extends javax.swing.JFrame{
    

    public AppGraphicsAposta() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_numero = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        txt_data_fim_ = new javax.swing.JTextField();
        txt_data_inicio_ = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Pesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Numero: ");

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Data de inicio da aposta:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cadastro da aposta");

        jLabel6.setText("Data de vencimento da aposta:");

        jButton7.setText("Atualizar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        txt_data_fim_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_data_fim_ActionPerformed(evt);
            }
        });

        txt_data_inicio_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_data_inicio_ActionPerformed(evt);
            }
        });

        jButton8.setText("Excluir");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("ID:");

        Pesquisar.setText("Pesquisar");
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(343, 343, 343))
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_data_fim_, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_data_inicio_, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8)
                                .addGap(18, 18, 18)
                                .addComponent(Pesquisar)))))
                .addGap(133, 133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_data_inicio_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_data_fim_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(Pesquisar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            txt_nome.setText("");
            txt_numero.setText("");
            txt_data_fim_.setText("");
            txt_data_inicio_.setText("");

        }
        catch (NumberFormatException ErrodeFormato){

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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {

            String driverName = "com.mysql.jdbc.Driver";

            Class.forName(driverName);

            // Configurando a nossa conexão com um banco de dados//
            String serverName = "viajuntos.sytes.net";    //caminho do servidor do BD

            String mydatabase = "progb2023";        //nome do seu banco de dados

            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useUnicode=true&characterEncoding=UTF8";

            String username = "admin_progb2023";        //nome de um usuário de seu BD

            String password = "admin_progb2023";      //sua senha de acesso

            Connection conn = (Connection) DriverManager.getConnection(url, username, password);

            Statement stmt = (Statement) conn.createStatement();

            //ResultSet rs = stmt.executeQuery( "SELECT nome FROM cliente WHERE color = 'blue'" );
            
            String nome = txt_nome.getText();
            String numero = txt_numero.getText();
            String data_fim_ = txt_data_fim_.getText();
            String data_inicio_ = txt_data_inicio_.getText();
            String id = txt_id.getText();

            stmt.execute("UPDATE gabriel_aposta SET nome = '"+nome+"', data_inicio_ = '"+data_inicio_+"', numero = '"+numero+"', "
                    + "data_fim_ = '"+data_fim_+"'  WHERE id = "+id);
            System.out.println("atualizado com sucesso");
            conn.close();

        }

        catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AppGraphicGerente.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO code application logic here

        catch (NumberFormatException ErrodeFormato){

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
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txt_data_fim_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_data_fim_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_data_fim_ActionPerformed

    private void txt_data_inicio_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_data_inicio_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_data_inicio_ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {

            String driverName = "com.mysql.jdbc.Driver";

            Class.forName(driverName);

            // Configurando a nossa conexão com um banco de dados//
            String serverName = "viajuntos.sytes.net";    //caminho do servidor do BD

            String mydatabase = "progb2023";        //nome do seu banco de dados

            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useUnicode=true&characterEncoding=UTF8";

            String username = "admin_progb2023";        //nome de um usuário de seu BD

            String password = "admin_progb2023";      //sua senha de acesso

            Connection conn = (Connection) DriverManager.getConnection(url, username, password);

            Statement stmt = (Statement) conn.createStatement();

            //ResultSet rs = stmt.executeQuery( "SELECT nome FROM cliente WHERE color = 'blue'" );
            String id  = txt_id.getText();;
            stmt.execute("DELETE FROM gabriel_aposta WHERE id = '"+id+"' ");
            System.out.println("Deletado com sucesso");
            conn.close();

        }

        catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
        }

        catch (NumberFormatException ErrodeFormato){

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
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            String driverName = "com.mysql.jdbc.Driver";
            try {
                Class.forName(driverName);
            } catch (ClassNotFoundException ex) {
                //Logger.getLogger(Pesquisar.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Configurando a nossa conexão com um banco de dados//
            String serverName = "viajuntos.sytes.net";    //caminho do servidor do BD

            String mydatabase = "progb2023";        //nome do seu banco de dados

            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useUnicode=true&characterEncoding=UTF8";

            String username = "admin_progb2023";        //nome de um usuário de seu BD

            String password = "admin_progb2023";      //sua senha de acesso

            Connection conn = (Connection) DriverManager.getConnection(url, username, password);

            Statement stmt = (Statement) conn.createStatement();

            
            String nome = txt_nome.getText();
            String numero = txt_numero.getText();
            String data_fim_ = txt_data_fim_.getText();
            String data_inicio_ = txt_data_inicio_.getText();

            stmt.execute("INSERT INTO gabriel_aposta(nome,numero,data_inicio_,data_fim_) VALUES('"+nome+"','"+data_inicio_+"',"
                + "'"+numero+"', '"+data_fim_+"');");  ///preparaco da insercao do registro

            conn.close();

            System.out.println("Salvo com sucesso ");

        }

        catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
        }

        try {

            //FileWriter arq = new FileWriter("c:\\Arquivos_java\\projeto.txt");
            //PrintWriter gravarArq = new PrintWriter(arq);
            String nome = txt_nome.getText();
            String data_inicio_ = txt_data_inicio_.getText();
            String nro = txt_numero.getText();
            String data_fim_ = txt_data_fim_.getText();
           

            //gravarArq.printf("Nome: \n"+nome+ "Data de inicio: \n"+data_inicio_+
               // "data de vencimento: \n"+data_fim_+ "numero: \n"+nro+"");
           // gravarArq.close();

        }
        catch (NumberFormatException ErrodeFormato){

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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        try {

            String driverName = "com.mysql.jdbc.Driver";
            try {
                Class.forName(driverName);
            } catch (ClassNotFoundException ex) {
                //Logger.getLogger(Pesquisar.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Configurando a nossa conexão com um banco de dados//
            String serverName = "viajuntos.sytes.net";    //caminho do servidor do BD

            String mydatabase = "progb2023";        //nome do seu banco de dados

            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useUnicode=true&characterEncoding=UTF8";

            String username = "admin_progb2023";        //nome de um usuário de seu BD

            String password = "admin_progb2023";      //sua senha de acesso

            Connection conn = (Connection) DriverManager.getConnection(url, username, password);

            Statement stmt = (Statement) conn.createStatement();
            
            String id_a = txt_id.getText();

            ResultSet rs = stmt.executeQuery( "SELECT * FROM gabriel_aposta WHERE id = "+id_a  );

            while (rs.next()) {
                String id = rs.getString("id");
                String nome = rs.getString("nome");
                String numero = rs.getString("numero");
                String data_fim_ = rs.getString("data_fim_");
                String data_inicio_ = rs.getString("data_inicio_");

                System.out.println("ID= "+id+" nome= "+nome);
                txt_nome.setText(nome);
                System.out.println("ID= "+id+" numero= "+numero);
                txt_numero.setText(numero);
                System.out.println("ID= "+id+" data_fim_= "+data_fim_);
                txt_data_fim_.setText(data_fim_);
                System.out.println("ID= "+id+" data_inicio_= "+data_inicio_);
                txt_data_inicio_.setText(data_inicio_);

            }

            conn.close();

        }

        catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
        }

        try {

        }
        catch (NumberFormatException ErrodeFormato){

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
    }//GEN-LAST:event_PesquisarActionPerformed
                                       

    private void txt_senhaActionPerformed(java.awt.event.ActionEvent evt) {                                          

        // TODO add your handling code here:

    }                                         

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                                        
    }                                        

    private void txt_mostrasenhaActionPerformed(java.awt.event.ActionEvent evt) {                                                
        

    }                                               

    private void txt_data_nascActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        try {

            String driverName = "com.mysql.jdbc.Driver";
            try {
                Class.forName(driverName);
            } catch (ClassNotFoundException ex) {
                //Logger.getLogger(Pesquisar.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Configurando a nossa conexão com um banco de dados//
            String serverName = "viajuntos.sytes.net";    //caminho do servidor do BD

            String mydatabase = "progb2023";        //nome do seu banco de dados

            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useUnicode=true&characterEncoding=UTF8";

            String username = "admin_progb2023";        //nome de um usuário de seu BD      

            String password = "admin_progb2023";      //sua senha de acesso

            Connection conn = (Connection) DriverManager.getConnection(url, username, password);

            Statement stmt = (Statement) conn.createStatement();      
            
            String numero = txt_numero.getText();
            String nome = txt_nome.getText();
            String data_inicio = txt_data_inicio_.getText();
            String data_fim = txt_data_fim_.getText();

            
            stmt.execute("INSERT INTO gabriel_aposta(nome,numero,data_inicio,data_fim) VALUES('"+nome+"','"+data_fim+"','"+data_inicio+"','"+numero+"' ");  ///preparaco da insercao do registro
            
            conn.close();
            
            System.out.println("Salvo com sucesso ");

        }         
          
           catch (SQLException e) {
               System.out.println(e.getLocalizedMessage());
           } 
        
        
        
        try {
        String nome = txt_nome.getText();
        txt_nome.setText("");

        if (nome.equals(""));
        {
            JOptionPane.showMessageDialog(null, "informe seu nome ");

        }
            } 
        
        catch (NumberFormatException ErrodeFormato){
        
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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       try {
            
        txt_nome.setText("");
        txt_numero.setText("");
        txt_data_inicio_.setText("");
        txt_data_fim_.setText("");
         
       }
       catch (NumberFormatException ErrodeFormato){
        
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

    private void txt_data_fimActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            String driverName = "com.mysql.jdbc.Driver";
            try {
                Class.forName(driverName);
            } catch (ClassNotFoundException ex) {
                //Logger.getLogger(Pesquisar.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Configurando a nossa conexão com um banco de dados//
            String serverName = "viajuntos.sytes.net";    //caminho do servidor do BD

            String mydatabase = "progb2023";        //nome do seu banco de dados

            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useUnicode=true&characterEncoding=UTF8";

            String username = "admin_progb2023";        //nome de um usuário de seu BD      

            String password = "admin_progb2023";      //sua senha de acesso

            Connection conn = (Connection) DriverManager.getConnection(url, username, password);

            Statement stmt = (Statement) conn.createStatement();

            ResultSet rs = stmt.executeQuery( "SELECT * FROM gabriel_aposta"  );
            
            
          while (rs.next()) {               
                String id = rs.getString("id");
                String nome = rs.getString("nome");
                System.out.println("ID= "+id+" Nome= "+nome);
                
                //String telefone = rs.getString("telefone");
                //System.out.println("nome = "+nome+"ID="+id);
                
                
            }
            
            
            
            conn.close();

        }         
          
           catch (SQLException e) {
               System.out.println(e.getLocalizedMessage());
           }

       catch (NumberFormatException ErrodeFormato){
        
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

    private void txt_nome1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppGraphicsAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppGraphicsAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppGraphicsAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppGraphicsAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppGraphicsAposta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
   
    // End of variables declaration                   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_data_fim_;
    private javax.swing.JTextField txt_data_inicio_;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_numero;
    // End of variables declaration//GEN-END:variables
}