/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.AlunoDAO;
import DAO.LivroDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.main;
import static main.main.identificacao;
import model.Aluno;
import model.Livro;

/**
 *
 * @author Jorge Lucas
 */
public class TelaBibliotecario extends javax.swing.JFrame {

    /**
     * Creates new form TelaBibliotecario
     */
    public TelaBibliotecario() {
        initComponents();
        configurarBemVindo();
        configurarTabelaLivro();
        limparTabelaAluno();
        limparTabelaLivro();
        inserirNaTabelaLivro();
        inserirNaTabelaAluno();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbLivros = new javax.swing.JTable();
        jBCadastrar = new javax.swing.JButton();
        jBRemoverLivro = new javax.swing.JButton();
        jLProcurar = new javax.swing.JLabel();
        jCBLivro = new javax.swing.JComboBox<>();
        jTFProcurarLivro = new javax.swing.JTextField();
        jLLupaLivro = new javax.swing.JLabel();
        jBEditarLivro = new javax.swing.JButton();
        jBVisualizarLivro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBRemoverAluno = new javax.swing.JButton();
        jCBAluno = new javax.swing.JComboBox<>();
        jBCadastrar1 = new javax.swing.JButton();
        jLProcurar1 = new javax.swing.JLabel();
        jBEditarAluno = new javax.swing.JButton();
        jTFProcurarAluno = new javax.swing.JTextField();
        jLLupaAluno = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbAluno = new javax.swing.JTable();
        jBVisualizarAluno = new javax.swing.JButton();
        jLBemVindo = new javax.swing.JLabel();
        jLSair = new javax.swing.JLabel();
        livroicon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane3.setBackground(new java.awt.Color(102, 255, 102));

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jTbLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Descrição", "Qtd"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTbLivros);

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBRemoverLivro.setText("Remover");
        jBRemoverLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBRemoverLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemoverLivroActionPerformed(evt);
            }
        });

        jLProcurar.setText("Procurar:");

        jCBLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione ...", "Título", "Descrição" }));

        jLLupaLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lupa.png"))); // NOI18N
        jLLupaLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLLupaLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLLupaLivroMouseClicked(evt);
            }
        });

        jBEditarLivro.setText("Editar");
        jBEditarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarLivroActionPerformed(evt);
            }
        });

        jBVisualizarLivro.setText("Visualizar");
        jBVisualizarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisualizarLivroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLProcurar)
                        .addGap(18, 18, 18)
                        .addComponent(jTFProcurarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLLupaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCBLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jBRemoverLivro)
                .addGap(32, 32, 32)
                .addComponent(jBVisualizarLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBEditarLivro)
                .addGap(47, 47, 47)
                .addComponent(jBCadastrar)
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFProcurarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLProcurar)
                        .addComponent(jCBLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLLupaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBRemoverLivro)
                        .addComponent(jBVisualizarLivro))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBEditarLivro)
                        .addComponent(jBCadastrar)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Livros", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        jBRemoverAluno.setText("Remover");
        jBRemoverAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBRemoverAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemoverAlunoActionPerformed(evt);
            }
        });

        jCBAluno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione ...", "Nome", "Matrícula" }));
        jCBAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAlunoActionPerformed(evt);
            }
        });

        jBCadastrar1.setText("Cadastrar");
        jBCadastrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrar1ActionPerformed(evt);
            }
        });

        jLProcurar1.setText("Procurar:");

        jBEditarAluno.setText("Editar");
        jBEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarAlunoActionPerformed(evt);
            }
        });

        jTFProcurarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFProcurarAlunoActionPerformed(evt);
            }
        });

        jLLupaAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lupa.png"))); // NOI18N
        jLLupaAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLLupaAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLLupaAlunoMouseClicked(evt);
            }
        });

        jTbAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTbAluno);

        jBVisualizarAluno.setText("Visualizar");
        jBVisualizarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisualizarAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLProcurar1)
                        .addGap(18, 18, 18)
                        .addComponent(jTFProcurarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLLupaAluno)
                        .addGap(18, 18, 18)
                        .addComponent(jCBAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jBRemoverAluno)
                        .addGap(40, 40, 40)
                        .addComponent(jBVisualizarAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBEditarAluno)
                        .addGap(47, 47, 47)
                        .addComponent(jBCadastrar1)
                        .addGap(60, 60, 60))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLProcurar1)
                        .addComponent(jTFProcurarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCBAluno)
                    .addComponent(jLLupaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRemoverAluno)
                    .addComponent(jBEditarAluno)
                    .addComponent(jBCadastrar1)
                    .addComponent(jBVisualizarAluno))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Aluno", jPanel2);

        jLBemVindo.setBackground(new java.awt.Color(255, 204, 102));
        jLBemVindo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBemVindo.setText("Olá Bibliotecario(a) ");
        jLBemVindo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 102), new java.awt.Color(255, 204, 102)));

        jLSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSair.setText("Sair");
        jLSair.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLSairMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLSairMouseReleased(evt);
            }
        });

        livroicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open-book.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(livroicon)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLSair, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(livroicon, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void configurarTabelaLivro(){
  
        jTbLivros.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTbLivros.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTbLivros.getColumnModel().getColumn(2).setPreferredWidth(25);
       
      
        jTbAluno.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTbAluno.getColumnModel().getColumn(1).setPreferredWidth(250);
        jTbAluno.getColumnModel().getColumn(2).setPreferredWidth(250);
    
    }
    private void inserirNaTabelaAlunoCom(){
         String nomeDesejado = jTFProcurarAluno.getText().toLowerCase();
         DefaultTableModel tabela = (DefaultTableModel) jTbAluno.getModel();
         
        if(jCBAluno.getSelectedItem().equals("Nome")){
            for(Aluno alunoAtual : new AlunoDAO().getList()){
                Object[] linha ={alunoAtual.getMatricula(),
                                 alunoAtual.getNome(),
                                 alunoAtual.getCurso()
                                 };
                if(alunoAtual.getNome().toLowerCase().contains(nomeDesejado))
                    tabela.addRow(linha);

            }
        }
        if(jCBAluno.getSelectedItem().equals("Matrícula")){
            for(Aluno alunoAtual : new AlunoDAO().getList()){
                Object[] linha ={alunoAtual.getMatricula(),
                                 alunoAtual.getNome(),
                                 alunoAtual.getCurso()
                                 };
                if(alunoAtual.getNome().toLowerCase().contains(nomeDesejado))
                    tabela.addRow(linha);

            }
        }
         
    }
    
 
    private void inserirNaTabelaLivroCom(){
        String nomeDesejado = jTFProcurarLivro.getText().toLowerCase();
       
         
        DefaultTableModel tabela = (DefaultTableModel) jTbLivros.getModel();
        
        
        if(jCBLivro.getSelectedItem().equals("Título")){
          for(Livro livroAtual : new LivroDAO().getList()){
                Object[] linha ={livroAtual.getTitulo(),
                                 livroAtual.getDescricaoDoLivro(),
                                 livroAtual.getQuantidadeLivro()};
                if(livroAtual.getTitulo().toLowerCase().contains(nomeDesejado))
                    tabela.addRow(linha);
                    
            }  
        }
        
        if(jCBLivro.getSelectedItem().equals("Descrição")){
          for(Livro livroAtual : new LivroDAO().getList()){
                Object[] linha ={livroAtual.getTitulo(),
                                 livroAtual.getDescricaoDoLivro(),
                                 livroAtual.getQuantidadeLivro()};
                if(livroAtual.getDescricaoDoLivro().toLowerCase().contains(nomeDesejado))
                    tabela.addRow(linha);
                    
            }  
        }      
            
    }

     
    
    private void inserirNaTabelaAluno(){
        DefaultTableModel tabela = (DefaultTableModel) jTbAluno.getModel();
            for(Aluno alunoAtual : new AlunoDAO().getList()){
                 Object[] linha ={alunoAtual.getMatricula(),
                                  alunoAtual.getNome(),
                                  alunoAtual.getCurso()
                                 };
                tabela.addRow(linha);
                    
            } 
        
    }
    
    private void inserirNaTabelaLivro(){
        DefaultTableModel tabela = (DefaultTableModel) jTbLivros.getModel();
            for(Livro livroAtual : new LivroDAO().getList()){
                Object[] linha ={livroAtual.getTitulo(),
                                 livroAtual.getDescricaoDoLivro(),
                                 livroAtual.getQuantidadeLivro()};
                tabela.addRow(linha);
                    
            }                
    }
    
    private void limparTabelaAluno(){
        DefaultTableModel tabela = (DefaultTableModel) jTbAluno.getModel();
        tabela.setNumRows(0);
    }
    
    private void limparTabelaLivro(){
        DefaultTableModel tabela = (DefaultTableModel) jTbLivros.getModel();
        tabela.setNumRows(0);
    }
    private void configurarBemVindo(){
        jLBemVindo.setText(""+jLBemVindo.getText()+identificacao+"");
    }
    private void jLSairMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSairMouseReleased

    }//GEN-LAST:event_jLSairMouseReleased

    private void jLSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSairMouseEntered
        jLSair.setForeground(Color.blue);
        jLSair.setText("<html><u>Sair</u>");
    }//GEN-LAST:event_jLSairMouseEntered

    private void jLSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSairMouseExited
        jLSair.setForeground(Color.black);
        jLSair.setText("Sair");
    }//GEN-LAST:event_jLSairMouseExited

    private void jLSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSairMouseClicked
        new telaLogin1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLSairMouseClicked

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        new CadastroLivro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jLLupaLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLupaLivroMouseClicked
        limparTabelaLivro();
        if(jTFProcurarLivro.getText().equals(""))
            inserirNaTabelaLivro();
        else if(jCBLivro.getSelectedItem().equals("Selecione ..."))
            JOptionPane.showMessageDialog(null, "Selecione uma opção",null,JOptionPane.ERROR_MESSAGE);
        else
            inserirNaTabelaLivroCom();
    }//GEN-LAST:event_jLLupaLivroMouseClicked

    private void jBRemoverLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoverLivroActionPerformed
        if(jTbLivros.getSelectedRowCount() == 0)
            JOptionPane.showMessageDialog(null, "Selecione uma linha",null,JOptionPane.ERROR_MESSAGE);
        else if(jTbLivros.getSelectedRowCount() > 1)
            JOptionPane.showMessageDialog(null, "Selecione apenas uma linha",null,JOptionPane.ERROR_MESSAGE);
        else{
            if(JOptionPane.showConfirmDialog(null,"Você quer remover o livro "+jTbLivros.getValueAt(jTbLivros.getSelectedRow(),0)) == 0)
                new LivroDAO().removerLivro(new LivroDAO().livroPorTitulo((String)jTbLivros.getValueAt(jTbLivros.getSelectedRow(),0)));
            limparTabelaLivro();
            inserirNaTabelaLivro();
        }
    }//GEN-LAST:event_jBRemoverLivroActionPerformed

    private void jBEditarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarLivroActionPerformed
        if(jTbLivros.getSelectedRowCount() == 0)
            JOptionPane.showMessageDialog(null, "Selecione uma linha",null,JOptionPane.ERROR_MESSAGE);
        else if(jTbLivros.getSelectedRowCount() > 1)
            JOptionPane.showMessageDialog(null, "Selecione apenas uma linha",null,JOptionPane.ERROR_MESSAGE);
        else{
            main.livroEditar =new LivroDAO().livroPorTitulo((String)jTbLivros.getValueAt(jTbLivros.getSelectedRow(),0));
            new EditarLivro().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jBEditarLivroActionPerformed

    private void jBCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrar1ActionPerformed
        new CadastroAluno().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBCadastrar1ActionPerformed

    private void jBRemoverAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoverAlunoActionPerformed
        if(jTbAluno.getSelectedRowCount() == 0)
            JOptionPane.showMessageDialog(null, "Selecione uma linha",null,JOptionPane.ERROR_MESSAGE);
        else if(jTbAluno.getSelectedRowCount() > 1)
            JOptionPane.showMessageDialog(null, "Selecione apenas uma linha",null,JOptionPane.ERROR_MESSAGE);
        else{
            main.alunoEditar = new AlunoDAO().alunoComMatricula((Integer)jTbAluno.getValueAt(jTbAluno.getSelectedRow(), 0));
            if(JOptionPane.showConfirmDialog(null,"Deseja remover o aluno "+main.alunoEditar.getNome()+" ?") == 0){
                new AlunoDAO().removerAluno(main.alunoEditar);
                limparTabelaAluno();
                inserirNaTabelaAluno();
            }
        }  
    }//GEN-LAST:event_jBRemoverAlunoActionPerformed

    private void jLLupaAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLupaAlunoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLLupaAlunoMouseClicked

    private void jBEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarAlunoActionPerformed
        if(jTbAluno.getSelectedRowCount() == 0)
            JOptionPane.showMessageDialog(null, "Selecione uma linha",null,JOptionPane.ERROR_MESSAGE);
        else if(jTbAluno.getSelectedRowCount() > 1)
            JOptionPane.showMessageDialog(null, "Selecione apenas uma linha",null,JOptionPane.ERROR_MESSAGE);
        else{
            main.alunoEditar = new AlunoDAO().alunoComMatricula((Integer)jTbAluno.getValueAt(jTbAluno.getSelectedRow(), 0));
            new EditarAluno().setVisible(true);
            this.dispose();
        }  
    }//GEN-LAST:event_jBEditarAlunoActionPerformed

    private void jTFProcurarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFProcurarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFProcurarAlunoActionPerformed

    private void jCBAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBAlunoActionPerformed

    private void jBVisualizarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualizarAlunoActionPerformed
        if(jTbAluno.getSelectedRowCount() == 0)
            JOptionPane.showMessageDialog(null, "Selecione uma linha",null,JOptionPane.ERROR_MESSAGE);
        else if(jTbAluno.getSelectedRowCount() > 1)
            JOptionPane.showMessageDialog(null, "Selecione apenas uma linha",null,JOptionPane.ERROR_MESSAGE);
        else{
            main.alunoEditar = new AlunoDAO().alunoComMatricula((Integer)jTbAluno.getValueAt(jTbAluno.getSelectedRow(), 0));
            new VisualizarAluno().setVisible(true);
            this.dispose();
        }  
    }//GEN-LAST:event_jBVisualizarAlunoActionPerformed

    private void jBVisualizarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualizarLivroActionPerformed
        if(jTbLivros.getSelectedRowCount() == 0)
            JOptionPane.showMessageDialog(null, "Selecione uma linha",null,JOptionPane.ERROR_MESSAGE);
        else if(jTbLivros.getSelectedRowCount() > 1)
            JOptionPane.showMessageDialog(null, "Selecione apenas uma linha",null,JOptionPane.ERROR_MESSAGE);
        else{
            main.livroEditar =new LivroDAO().livroPorTitulo((String)jTbLivros.getValueAt(jTbLivros.getSelectedRow(),0));
            new VisualizarLivro().setVisible(true);
            this.dispose();
        }  
    }//GEN-LAST:event_jBVisualizarLivroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBibliotecario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCadastrar1;
    private javax.swing.JButton jBEditarAluno;
    private javax.swing.JButton jBEditarLivro;
    private javax.swing.JButton jBRemoverAluno;
    private javax.swing.JButton jBRemoverLivro;
    private javax.swing.JButton jBVisualizarAluno;
    private javax.swing.JButton jBVisualizarLivro;
    private javax.swing.JComboBox<String> jCBAluno;
    private javax.swing.JComboBox<String> jCBLivro;
    private javax.swing.JLabel jLBemVindo;
    private javax.swing.JLabel jLLupaAluno;
    private javax.swing.JLabel jLLupaLivro;
    private javax.swing.JLabel jLProcurar;
    private javax.swing.JLabel jLProcurar1;
    private javax.swing.JLabel jLSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFProcurarAluno;
    private javax.swing.JTextField jTFProcurarLivro;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTbAluno;
    private javax.swing.JTable jTbLivros;
    private javax.swing.JLabel livroicon;
    // End of variables declaration//GEN-END:variables
}