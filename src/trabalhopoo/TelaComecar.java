package trabalhopoo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Ariel
 */
public class TelaComecar extends javax.swing.JFrame {
    private int perguntaAtual;
    private String dificuldade;
    private Jogador jogador;
    
    /**
     * Creates new form Tela2
     * @param jogador
     */
    public TelaComecar(Jogador jogador, String dificuldade) throws IOException {
        initComponents();
        this.perguntaAtual = 0;
        this.dificuldade = dificuldade;
        this.jogador = jogador;
        jLabel2.setText(this.jogador.getNome());
        jLabel3.setText(Integer.toString(this.jogador.getPontos()));        
        this.jogador.geraListaPerguntas();
        jLabelPergunta.setText(this.jogador.LeArquivo("Perguntas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)));
        jButtonR1.setText(this.jogador.LeArquivo("Alternativas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)).split(",")[0]);
        jButtonR2.setText(this.jogador.LeArquivo("Alternativas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)).split(",")[1]);
        jButtonR3.setText(this.jogador.LeArquivo("Alternativas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)).split(",")[2]);
        jButtonR4.setText(this.jogador.LeArquivo("Alternativas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)).split(",")[3]);
    }
    
    public int testeResposta() throws IOException {
        if (jButtonR1.isSelected()) {
            if (jButtonR1.getText().equals(this.jogador.LeArquivo("Respostas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)))) {
                return 1;
            } else {
                return 0;
            }
        } else if (jButtonR2.isSelected()) {
            if (jButtonR2.getText().equals(this.jogador.LeArquivo("Respostas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)))) {
                return 1;
            } else {
                return 0;
            }
        } else if (jButtonR3.isSelected()) {
            if (jButtonR3.getText().equals(this.jogador.LeArquivo("Respostas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)))) {
                return 1;
            } else {
                return 0;
            }
        } else if (jButtonR4.isSelected()) {
            if (jButtonR4.getText().equals(this.jogador.LeArquivo("Respostas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)))) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return -1;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelTextPergunta = new javax.swing.JLabel();
        jButtonMenu = new javax.swing.JButton();
        jButtonResposta = new javax.swing.JButton();
        jLabelScore = new javax.swing.JLabel();
        jButtonR1 = new javax.swing.JRadioButton();
        jButtonR2 = new javax.swing.JRadioButton();
        jButtonR3 = new javax.swing.JRadioButton();
        jButtonR4 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabelPergunta = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(null);

        jLabelTextPergunta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTextPergunta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTextPergunta.setText("Pergunta:");
        getContentPane().add(jLabelTextPergunta);
        jLabelTextPergunta.setBounds(10, 50, 70, 30);

        jButtonMenu.setText("Voltar ao Menu Principal");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu);
        jButtonMenu.setBounds(120, 10, 180, 23);

        jButtonResposta.setBackground(new java.awt.Color(255, 255, 255));
        jButtonResposta.setText("Resposta");
        jButtonResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRespostaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonResposta);
        jButtonResposta.setBounds(140, 260, 130, 23);

        jLabelScore.setForeground(new java.awt.Color(255, 255, 255));
        jLabelScore.setText("Score:");
        getContentPane().add(jLabelScore);
        jLabelScore.setBounds(310, 10, 40, 20);

        jButtonR1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jButtonR1);
        jButtonR1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonR1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonR1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonR1.setOpaque(false);
        getContentPane().add(jButtonR1);
        jButtonR1.setBounds(10, 140, 180, 50);

        buttonGroup1.add(jButtonR2);
        jButtonR2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonR2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonR2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonR2.setOpaque(false);
        getContentPane().add(jButtonR2);
        jButtonR2.setBounds(210, 140, 180, 50);

        buttonGroup1.add(jButtonR3);
        jButtonR3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonR3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonR3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonR3.setOpaque(false);
        getContentPane().add(jButtonR3);
        jButtonR3.setBounds(10, 200, 180, 50);

        buttonGroup1.add(jButtonR4);
        jButtonR4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonR4.setForeground(new java.awt.Color(255, 255, 255));
        jButtonR4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonR4.setOpaque(false);
        getContentPane().add(jButtonR4);
        jButtonR4.setBounds(210, 200, 180, 50);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jLabelPergunta.setEditable(false);
        jLabelPergunta.setColumns(20);
        jLabelPergunta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPergunta.setLineWrap(true);
        jLabelPergunta.setRows(5);
        jLabelPergunta.setBorder(null);
        jLabelPergunta.setOpaque(false);
        jScrollPane1.setViewportView(jLabelPergunta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 40, 290, 90);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 90, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 10, 40, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhopoo/Imagens/comecar.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -6, 420, 310);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        new TelaPrincipal().setVisible(true);
        this.jogador.limpaListaP();
        dispose();
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRespostaActionPerformed
        try {
            if (testeResposta() == 1) {
                JOptionPane.showMessageDialog(this, "Resposta Correta!", "Resposta", JOptionPane.INFORMATION_MESSAGE);
                this.jogador.setPontos(this.jogador.getPontos() + 1);
                perguntaAtual += 1;
                if (perguntaAtual < 15) {
                    jLabelPergunta.setText(this.jogador.LeArquivo("Perguntas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)));
                    jButtonR1.setText(this.jogador.LeArquivo("Alternativas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)).split(",")[0]);
                    jButtonR2.setText(this.jogador.LeArquivo("Alternativas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)).split(",")[1]);
                    jButtonR3.setText(this.jogador.LeArquivo("Alternativas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)).split(",")[2]);
                    jButtonR4.setText(this.jogador.LeArquivo("Alternativas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)).split(",")[3]);
                    jLabel3.setText(Integer.toString(this.jogador.getPontos()));
                    //buttonGroup1.clearSelection();
                }
            } else if (testeResposta() == 0) {
                JOptionPane.showMessageDialog(this, "Resposta Incorreta!", "Resposta", JOptionPane.INFORMATION_MESSAGE);
                perguntaAtual += 1;
                if (perguntaAtual < 15) {
                    jLabelPergunta.setText(this.jogador.LeArquivo("Perguntas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)));
                    jButtonR1.setText(this.jogador.LeArquivo("Alternativas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)).split(",")[0]);
                    jButtonR2.setText(this.jogador.LeArquivo("Alternativas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)).split(",")[1]);
                    jButtonR3.setText(this.jogador.LeArquivo("Alternativas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)).split(",")[2]);
                    jButtonR4.setText(this.jogador.LeArquivo("Alternativas.txt", this.jogador.getListaPerguntas().get(perguntaAtual)).split(",")[3]);
                    jLabel3.setText(Integer.toString(this.jogador.getPontos()));
                    //buttonGroup1.clearSelection();
                }
            } else if (testeResposta() == -1) {
                JOptionPane.showMessageDialog(this, "Por favor, selecione uma resposta.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(TelaComecar.class.getName()).log(Level.SEVERE, null, ex);
        }     
        
        if(perguntaAtual == 15) {
            JOptionPane.showMessageDialog(this, "Parabéns!\nSua Pontuação:" + this.jogador.getPontos(), "Fim de Jogo", JOptionPane.INFORMATION_MESSAGE);
            try {
                this.jogador.EscreveScore("\n" + this.jogador.getNome() + "," + Integer.toString(this.jogador.getPontos()) + "," + this.dificuldade);
            } catch (IOException ex) {
                Logger.getLogger(TelaComecar.class.getName()).log(Level.SEVERE, null, ex);
            }
            jButtonMenuActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonRespostaActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JRadioButton jButtonR1;
    private javax.swing.JRadioButton jButtonR2;
    private javax.swing.JRadioButton jButtonR3;
    private javax.swing.JRadioButton jButtonR4;
    private javax.swing.JButton jButtonResposta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextArea jLabelPergunta;
    private javax.swing.JLabel jLabelScore;
    private javax.swing.JLabel jLabelTextPergunta;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
