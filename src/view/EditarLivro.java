/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.LivroDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import main.main;
import static main.main.livroEditar;
import model.Livro;

/**
 *
 * @author Jorge Lucas
 */
public class EditarLivro extends javax.swing.JFrame {

    /**
     * Creates new form CadastroLivro
     */
    public EditarLivro() {
        initComponents();
        preencherCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jLAutor = new javax.swing.JLabel();
        jLIsbn = new javax.swing.JLabel();
        jLDescricao = new javax.swing.JLabel();
        jTFTitulo = new javax.swing.JTextField();
        jTFAutor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescricao = new javax.swing.JTextArea();
        jBAtualizar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jSQuantidadeLivros = new javax.swing.JSpinner();
        jLQuantidade = new javax.swing.JLabel();
        jTFIsbn = new javax.swing.JFormattedTextField();
        cadatrodelivro = new javax.swing.JLabel();
        livroicon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLTitulo.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLTitulo.setText("TÍTULO");

        jLAutor.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLAutor.setText("AUTOR(A)");

        jLIsbn.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLIsbn.setText("ISBN");

        jLDescricao.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLDescricao.setText("DESCRIÇÃO DO LIVRO");

        jTFTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFTituloMouseClicked(evt);
            }
        });
        jTFTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTituloActionPerformed(evt);
            }
        });
        jTFTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFTituloKeyPressed(evt);
            }
        });

        jTFAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFAutorMouseClicked(evt);
            }
        });
        jTFAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFAutorKeyPressed(evt);
            }
        });

        jTADescricao.setColumns(20);
        jTADescricao.setRows(5);
        jTADescricao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTADescricaoMouseClicked(evt);
            }
        });
        jTADescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTADescricaoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTADescricao);

        jBAtualizar.setText("Atualizar");
        jBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jSQuantidadeLivros.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLQuantidade.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 0, 18)); // NOI18N
        jLQuantidade.setText("QUANTIDADE");

        jTFIsbn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        cadatrodelivro.setBackground(new java.awt.Color(255, 255, 255));
        cadatrodelivro.setFont(new java.awt.Font("Ananda Black", 0, 36)); // NOI18N
        cadatrodelivro.setForeground(new java.awt.Color(255, 255, 255));
        cadatrodelivro.setText("    Cadastro de Livro");
        cadatrodelivro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 102), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        livroicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open-book.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLDescricao))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(217, 217, 217)
                                    .addComponent(jLAutor)
                                    .addGap(238, 238, 238))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLTitulo)
                                    .addGap(244, 244, 244))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(jLIsbn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLQuantidade))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTFIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSQuantidadeLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFAutor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBCancelar)
                                .addGap(127, 127, 127)
                                .addComponent(jBAtualizar)
                                .addGap(116, 116, 116)))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cadatrodelivro, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(livroicon)
                        .addGap(127, 127, 127))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(livroicon))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(cadatrodelivro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLAutor)
                .addGap(1, 1, 1)
                .addComponent(jTFAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIsbn)
                    .addComponent(jLQuantidade))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSQuantidadeLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jLDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar)
                    .addComponent(jBAtualizar))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void preencherCampos(){
        jTFTitulo.setText(livroEditar.getTitulo());
        jTFAutor.setText(livroEditar.getAutor());
        jTFIsbn.setText(Integer.toString(livroEditar.getIsbn()));
        jTADescricao.setText(livroEditar.getDescricaoDoLivro());
        jSQuantidadeLivros.setValue(livroEditar.getQuantidadeLivro());
    }
    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        if(jTFAutor.getText().equals("") || jTFIsbn.getText().equals("") || jTFTitulo.getText().equals("") || jTADescricao.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!",null,JOptionPane.ERROR_MESSAGE);
            if(jTFAutor.getText().equals(""))
                jTFAutor.setBackground(new Color(255,102,102));
            if(jTFIsbn.getText().equals(""))
                jTFIsbn.setBackground(new Color(255,102,102));
            if(jTFTitulo.getText().equals(""))
                jTFTitulo.setBackground(new Color(255,102,102));
            if(jTADescricao.getText().equals(""))
                jTADescricao.setBackground(new Color(255,102,102));
        }
        Livro livroAtual = new Livro(jTFTitulo.getText(),jTFAutor.getText(),Integer.parseInt(jTFIsbn.getText()),jTADescricao.getText(), (Integer)jSQuantidadeLivros.getValue());
        for(Livro livroCadastrado : new LivroDAO().getList()){
            if(livroCadastrado.getIsbn() == livroAtual.getIsbn() && livroCadastrado!= livroEditar ){
                JOptionPane.showMessageDialog(null, "Isbn já utilizado!",null,JOptionPane.ERROR_MESSAGE);
                jTFIsbn.setBackground(new Color(255,102,102));
                return;
            
            }else if(livroCadastrado.getTitulo().equals(livroAtual.getTitulo()) && livroCadastrado != livroEditar){
                JOptionPane.showMessageDialog(null, "Título já utilizado!",null,JOptionPane.ERROR_MESSAGE);
                jTFTitulo.setBackground(new Color(255,102,102));
                return;   
            }
        }
        livroEditar.setAutor(livroAtual.getAutor());
        livroEditar.setDescricaoDoLivro(livroAtual.getDescricaoDoLivro());
        livroEditar.setImagemCapa(livroAtual.getImagemCapa());
        livroEditar.setIsbn(livroAtual.getIsbn());
        livroEditar.setQuantidadeLivro(livroAtual.getQuantidadeLivro());
        livroEditar.setTitulo(livroAtual.getTitulo());
        JOptionPane.showMessageDialog(null,"Livro atualizado com sucesso!");   
        new TelaBibliotecario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBAtualizarActionPerformed

    private void jTFTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTituloActionPerformed
        jTFTitulo.setBackground(Color.white);
    }//GEN-LAST:event_jTFTituloActionPerformed

    private void jTFTituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTituloKeyPressed
        jTFTitulo.setBackground(Color.white);
    }//GEN-LAST:event_jTFTituloKeyPressed

    private void jTFAutorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAutorKeyPressed
        jTFAutor.setBackground(Color.white);
    }//GEN-LAST:event_jTFAutorKeyPressed

    private void jTADescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTADescricaoKeyPressed
        jTADescricao.setBackground(Color.white);
    }//GEN-LAST:event_jTADescricaoKeyPressed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        new TelaBibliotecario().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTFTituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFTituloMouseClicked
        jTFTitulo.setBackground(Color.white);
    }//GEN-LAST:event_jTFTituloMouseClicked

    private void jTFAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFAutorMouseClicked
        jTFAutor.setBackground(Color.white);
    }//GEN-LAST:event_jTFAutorMouseClicked

    private void jTADescricaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTADescricaoMouseClicked
        jTADescricao.setBackground(Color.white);
    }//GEN-LAST:event_jTADescricaoMouseClicked

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
            java.util.logging.Logger.getLogger(EditarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadatrodelivro;
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JLabel jLAutor;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLIsbn;
    private javax.swing.JLabel jLQuantidade;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSQuantidadeLivros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTADescricao;
    private javax.swing.JTextField jTFAutor;
    private javax.swing.JFormattedTextField jTFIsbn;
    private javax.swing.JTextField jTFTitulo;
    private javax.swing.JLabel livroicon;
    // End of variables declaration//GEN-END:variables
}
