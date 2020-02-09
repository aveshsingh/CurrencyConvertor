
public class Interface extends javax.swing.JFrame {
String [] currencies ={"US_DOLLAR","NIGERIAN_NAIRA","BRAZILIAN_REAL","CANADIAN_DOLLAR","KENYAN_SHILLING","INDONESIAN_RUPIAH","INDIAN_RUPEE","PHILIPPINE_PISCO","PAKISTANI_RUPEE"};
double US_DOLLAR = 1.29;
double NIGERIAN_NAIRA=468.64;
double BRAZILIAN_REAL = 5.57;
double CANADIAN_DOLLAR=1.72;
double KENYAN_SHILLING =129.69;
double INDONESIAN_RUPIAH=17639.16;
double INDIAN_RUPEE =92.20;
double PHILIPPINE_PESO = 65.69;
double PAKISTANI_RUPEE =199.25;
   
    public Interface() {
        initComponents();
        setTitle("Currency Convertor");
        setLocationRelativeTo(null);
        comboBoxConvert.setModel(new javax.swing.DefaultComboBoxModel<>(currencies));
        comboBoxTo.setModel(new javax.swing.DefaultComboBoxModel<>(currencies));
        

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        labelConvert = new javax.swing.JLabel();
        comboBoxConvert = new javax.swing.JComboBox<>();
        labelTo = new javax.swing.JLabel();
        comboBoxTo = new javax.swing.JComboBox<>();
        convertButton = new javax.swing.JButton();
        amount = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        resultlabel = new javax.swing.JLabel();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelConvert.setText("Convert");

        comboBoxConvert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelTo.setText("To");

        comboBoxTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        convertButton.setText("Convert >>");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        amount.setText("Amount");

        amountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountFieldActionPerformed(evt);
            }
        });

        resultlabel.setText("Result");
        resultlabel.setName(""); // NOI18N
        resultlabel.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(amount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(comboBoxConvert, 0, 130, Short.MAX_VALUE)
                        .addComponent(comboBoxTo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(convertButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxConvert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelConvert))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTo))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount))
                .addGap(18, 18, 18)
                .addComponent(convertButton)
                .addGap(29, 29, 29)
                .addComponent(resultlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_amountFieldActionPerformed

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        // TODO add your handling code here:
      String convert = comboBoxConvert.getSelectedItem().toString();
      double value = Double.parseDouble(amountField.getText());
      if(value>-1){
      switch(convert){
          case "INDIAN_RUPEE":
             value = value/INDIAN_RUPEE;
             break;
          case "US_DOLLAR":
             value = value/US_DOLLAR;
             break;
          case "NIGERIAN_NAIRA":
             value = value/NIGERIAN_NAIRA;
             break;   
          case "BRAZILIAN_REAL":
             value = value/BRAZILIAN_REAL;
             break;
          case "CANADIAN_DOLLAR":
             value = value/CANADIAN_DOLLAR;
             break;
          case "KENYAN_SHILLING":
             value = value/KENYAN_SHILLING;
             break;
          case "INDONESIAN_RUPIAH":
             value = value/INDONESIAN_RUPIAH;
             break;
          case "PHILIPPINE_PISCO":
             value = value/PHILIPPINE_PESO;
             break;
          case "PAKISTANI_RUPEE":
             value = value/PAKISTANI_RUPEE;
             break;    
      }
      //now the second phase.......
            String to = comboBoxTo.getSelectedItem().toString();

      switch(to){
          case "US_DOLLAR":
            value = value*US_DOLLAR;
              break;
         case "INDIAN_RUPEE":           
            value = value*INDIAN_RUPEE;
              break;
         case "NIGERIAN_NAIRA":
            value = value*NIGERIAN_NAIRA;
              break;
         case "BRAZILIAN_REAL":
            value = value*BRAZILIAN_REAL;
              break;
         case "CANADIAN_DOLLAR":
            value = value*CANADIAN_DOLLAR;
              break;
         case "KENYAN_SHILLING":
            value = value*KENYAN_SHILLING;
              break;
         case "INDONESIAN_RUPIAH":
            value = value*INDONESIAN_RUPIAH;
              break;
         case "PHILIPPINE_PISCO":
            value = value*PHILIPPINE_PESO;
              break;
         case "PAKISTANI_RUPEE":
            value = value*PAKISTANI_RUPEE;
              break;
      }
      
      resultlabel.setText(comboBoxConvert.getSelectedItem().toString()+" "+"is"+"  "+String.valueOf(String.format("%.3f",value))+" "+comboBoxTo.getSelectedItem().toString());
              
      }
      else{
      resultlabel.setText("enter value greater than 0");
      }
      resultlabel.setVisible(true);
       
        
    }//GEN-LAST:event_convertButtonActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
               
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount;
    private javax.swing.JTextField amountField;
    private javax.swing.JComboBox<String> comboBoxConvert;
    private javax.swing.JComboBox<String> comboBoxTo;
    private javax.swing.JButton convertButton;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel labelConvert;
    private javax.swing.JLabel labelTo;
    private javax.swing.JLabel resultlabel;
    // End of variables declaration//GEN-END:variables
}
