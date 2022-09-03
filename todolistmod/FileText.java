/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolistmod;
import java.lang.Object;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Double;
import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 *
 * @author Martin
 */
public class FileText extends javax.swing.JFrame {

    /**
     * Creates new form FileText
     */
    public FileText() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextDisplayScrollPane = new javax.swing.JScrollPane();
        TextFileDisplay = new javax.swing.JTextArea();
        FileName = new javax.swing.JLabel();
        ModifyButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        ProgressDisplay = new javax.swing.JLabel();
        CalcProgressButton = new javax.swing.JButton();
        ClearListButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TextFileDisplay.setEditable(false);
        TextFileDisplay.setBackground(new java.awt.Color(204, 204, 204));
        TextFileDisplay.setColumns(20);
        TextFileDisplay.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        TextFileDisplay.setRows(5);
        TextDisplayScrollPane.setViewportView(TextFileDisplay);

        FileName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FileName.setText(FileInfo.filename);
        FileName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ModifyButton.setText("Modify List");
        ModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Close");
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        SaveButton.setText("Save File");
        SaveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        ProgressDisplay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ProgressDisplay.setText(Double.toString(FileInfo.percent)+ " %");
        ProgressDisplay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CalcProgressButton.setText("Calculate Progress");
        CalcProgressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcProgressButtonActionPerformed(evt);
            }
        });

        ClearListButton.setText("Clear List");
        ClearListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextDisplayScrollPane)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FileName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ModifyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SaveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CalcProgressButton)
                        .addGap(18, 18, 18)
                        .addComponent(ProgressDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(ClearListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FileName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextDisplayScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ModifyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CalcProgressButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProgressDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClearListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FileInfo.filename));
            TextFileDisplay.read(reader, evt);
            reader.close();
            TextFileDisplay.requestFocus();
        } catch (IOException ex) {
            Logger.getLogger(FileText.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{ 
            BufferedReader reader = new BufferedReader(new FileReader(FileInfo.filename));
            String line = reader.readLine();
        
            while(line != null){
                if(line.contains("[]"))
                    FileInfo.remainder+=1.0;
                else if(line.contains("[x]"))
                    FileInfo.progress+=1.0;
                line = reader.readLine();
            }
            reader.close();
            FileInfo.percent = FileInfo.progress/(FileInfo.progress + FileInfo.remainder)*100.0;
        } catch (IOException ex) {
            Logger.getLogger(FileText.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyButtonActionPerformed
        TextFileDisplay.setEditable(true);
    }//GEN-LAST:event_ModifyButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(FileInfo.filename));
            writer.write(TextFileDisplay.getText());
            writer.close();
        }
        catch(IOException ex){
            Logger.getLogger(FileText.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void CalcProgressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcProgressButtonActionPerformed
        
        
        Double d = BigDecimal.valueOf(new Double(FileInfo.percent))
        .setScale(2, RoundingMode.HALF_UP).doubleValue();
        
        ProgressDisplay.setText(Double.toString(d)+" %");
    }//GEN-LAST:event_CalcProgressButtonActionPerformed

    private void ClearListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearListButtonActionPerformed
        String s = TextFileDisplay.getText();
        s = s.replaceAll("\\[x\\]", "\\[\\]");
        
        TextFileDisplay.setText(s);
        TextFileDisplay.setCaretPosition(0);
    }//GEN-LAST:event_ClearListButtonActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getIns