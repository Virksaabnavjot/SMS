/**
 *
 * @author Navjot Singh 
 * Edited by: Soffyan Ali
 */

package nsv.clientsms;

import com.google.gson.Gson;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import javax.jmdns.JmDNS;
import nsv.sms.Laptop;
import nsv.sms.*;

/**
 *
 * @author navNav
 */
public class ClientManager extends javax.swing.JFrame {

    private static Laptop laptop;
    private static MobilePhone mobile;
    private static Light light;
    private static Printer printer;
    private static Projector projector;

    private static Gson gson;
    private static JmDNS jmdns;
    private static PrintWriter out;
    private static BufferedReader in;
    private  static Socket socket;
    private static HashMap<String, Socket> servicePorts;
    /**
     * Creates new form ClientManager
     */
    public ClientManager() {
        initComponents();
        
        laptopPanel.setVisible(false);

        ProjectorPanel.setVisible(false);
        MobilePanel.setVisible(false);
        PrinterPanel.setVisible(false);
        laptopPanel.setVisible(false);  
        LightPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoLbl = new javax.swing.JTextArea();
        deviceListPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        laptopBtn = new javax.swing.JButton();
        lightBtn = new javax.swing.JButton();
        mobilePhoneBtn = new javax.swing.JButton();
        printerBtn = new javax.swing.JButton();
        projectorBtn = new javax.swing.JButton();
        laptopPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        laptopVolumeSlider = new javax.swing.JSlider();
        jLabel11 = new javax.swing.JLabel();
        LightPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lightTogbutton = new javax.swing.JToggleButton();
        PrinterPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dnTF = new javax.swing.JTextField();
        ProjectorPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        MobilePanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        VolumeSlider = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        infoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Info Panel");

        infoLbl.setColumns(20);
        infoLbl.setRows(5);
        jScrollPane1.setViewportView(infoLbl);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 257, Short.MAX_VALUE)))
                .addContainerGap())
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        deviceListPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Device List Panel");

        laptopBtn.setText("Laptop");
        laptopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laptopBtnActionPerformed(evt);
            }
        });

        lightBtn.setText("Light");
        lightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightBtnActionPerformed(evt);
            }
        });

        mobilePhoneBtn.setText("MobilePhone");
        mobilePhoneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobilePhoneBtnActionPerformed(evt);
            }
        });

        printerBtn.setText("Printer");
        printerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printerBtnActionPerformed(evt);
            }
        });

        projectorBtn.setText("Projector");
        projectorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectorBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deviceListPanelLayout = new javax.swing.GroupLayout(deviceListPanel);
        deviceListPanel.setLayout(deviceListPanelLayout);
        deviceListPanelLayout.setHorizontalGroup(
            deviceListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deviceListPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(deviceListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(mobilePhoneBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lightBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(laptopBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(printerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(projectorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        deviceListPanelLayout.setVerticalGroup(
            deviceListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deviceListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(laptopBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lightBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mobilePhoneBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(printerBtn)
                .addGap(18, 18, 18)
                .addComponent(projectorBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        laptopPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Laptop Panel");

        laptopVolumeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                laptopVolumeSliderStateChanged(evt);
            }
        });

        jLabel11.setText("Brightness");

        javax.swing.GroupLayout laptopPanelLayout = new javax.swing.GroupLayout(laptopPanel);
        laptopPanel.setLayout(laptopPanelLayout);
        laptopPanelLayout.setHorizontalGroup(
            laptopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laptopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(laptopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(laptopVolumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        laptopPanelLayout.setVerticalGroup(
            laptopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laptopPanelLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(laptopVolumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        LightPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        LightPanel.setName("LightPanel"); // NOI18N

        jLabel5.setText("Light Panel");

        lightTogbutton.setText("ON/OFF");
        lightTogbutton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lightTogbuttonItemStateChanged(evt);
            }
        });
        lightTogbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightTogbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LightPanelLayout = new javax.swing.GroupLayout(LightPanel);
        LightPanel.setLayout(LightPanelLayout);
        LightPanelLayout.setHorizontalGroup(
            LightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lightTogbutton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LightPanelLayout.setVerticalGroup(
            LightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LightPanelLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addComponent(lightTogbutton)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PrinterPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel8.setText("Printer");

        jLabel9.setText("Document Name: ");

        dnTF.setText("enter document name");

        javax.swing.GroupLayout PrinterPanelLayout = new javax.swing.GroupLayout(PrinterPanel);
        PrinterPanel.setLayout(PrinterPanelLayout);
        PrinterPanelLayout.setHorizontalGroup(
            PrinterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrinterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrinterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrinterPanelLayout.createSequentialGroup()
                        .addComponent(dnTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PrinterPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(115, 115, 115))
                    .addGroup(PrinterPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PrinterPanelLayout.setVerticalGroup(
            PrinterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrinterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(dnTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ProjectorPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Projector");

        jToggleButton2.setText("ON/OFF");

        javax.swing.GroupLayout ProjectorPanelLayout = new javax.swing.GroupLayout(ProjectorPanel);
        ProjectorPanel.setLayout(ProjectorPanelLayout);
        ProjectorPanelLayout.setHorizontalGroup(
            ProjectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ProjectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ProjectorPanelLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jToggleButton2)
                    .addContainerGap(35, Short.MAX_VALUE)))
        );
        ProjectorPanelLayout.setVerticalGroup(
            ProjectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ProjectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ProjectorPanelLayout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jToggleButton2)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        MobilePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Mobile");

        VolumeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                VolumeSliderStateChanged(evt);
            }
        });

        jLabel3.setText("Volume");

        javax.swing.GroupLayout MobilePanelLayout = new javax.swing.GroupLayout(MobilePanel);
        MobilePanel.setLayout(MobilePanelLayout);
        MobilePanelLayout.setHorizontalGroup(
            MobilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VolumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(MobilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MobilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MobilePanelLayout.setVerticalGroup(
            MobilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MobilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(VolumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(PrinterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProjectorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(laptopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MobilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addComponent(deviceListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deviceListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(laptopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrinterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProjectorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MobilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void laptopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laptopBtnActionPerformed

        laptopPanel.setVisible(true);
        ProjectorPanel.setVisible(false);
        MobilePanel.setVisible(false);
        PrinterPanel.setVisible(false);
        LightPanel.setVisible(false);
    }//GEN-LAST:event_laptopBtnActionPerformed

    private void laptopVolumeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_laptopVolumeSliderStateChanged
        infoLbl.setText("Brightness value= "+String.valueOf(laptopVolumeSlider.getValue()));
         
       try {
             laptop.setBrightness(laptopVolumeSlider.getValue());
             socket = servicePorts.get("LaptopService");      
            out = new PrintWriter(socket.getOutputStream(), true);
            out.println(gson.toJson(laptop));
        } catch (Exception e) {
        }        
    }//GEN-LAST:event_laptopVolumeSliderStateChanged

    private void lightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightBtnActionPerformed

  laptopPanel.setVisible(false);
        ProjectorPanel.setVisible(false);
        MobilePanel.setVisible(false);
        PrinterPanel.setVisible(false);
        laptopPanel.setVisible(false);  
        LightPanel.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_lightBtnActionPerformed

    private void mobilePhoneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobilePhoneBtnActionPerformed
  laptopPanel.setVisible(false);

        ProjectorPanel.setVisible(false);
        MobilePanel.setVisible(true);
        PrinterPanel.setVisible(false);
        laptopPanel.setVisible(false);  
        LightPanel.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_mobilePhoneBtnActionPerformed

    private void printerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printerBtnActionPerformed
  laptopPanel.setVisible(false);

        ProjectorPanel.setVisible(false);
        MobilePanel.setVisible(false);
        PrinterPanel.setVisible(true);
        laptopPanel.setVisible(false);  
        LightPanel.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_printerBtnActionPerformed

    private void projectorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectorBtnActionPerformed
  laptopPanel.setVisible(false);

        ProjectorPanel.setVisible(true);
        MobilePanel.setVisible(false);
        PrinterPanel.setVisible(false);
        laptopPanel.setVisible(false);  
        LightPanel.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_projectorBtnActionPerformed

    private void VolumeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_VolumeSliderStateChanged
        // TODO add your handling code here:
        infoLbl.setText("Mobile Volumn value= "+String.valueOf(VolumeSlider.getValue()));
        try {
            mobile.setVolume(laptopVolumeSlider.getValue());
            socket = servicePorts.get("MobileService");      
            out = new PrintWriter(socket.getOutputStream(), true);
            out.println(gson.toJson(mobile));
        } catch (Exception e) {
        }  
    }//GEN-LAST:event_VolumeSliderStateChanged

    private void lightTogbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightTogbuttonActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_lightTogbuttonActionPerformed

    private void lightTogbuttonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lightTogbuttonItemStateChanged
        // TODO add your handling code here:
        boolean flag=false;
        if(evt.getStateChange()==ItemEvent.SELECTED){
        System.out.println("Light is ON");
        flag=true;
      } else if(evt.getStateChange()==ItemEvent.DESELECTED){
        System.out.println("Light is OFF");
        flag=false;
      }
        
     try {
            light.setSwichedOn(flag);
            socket = servicePorts.get("LightService");      
            out = new PrintWriter(socket.getOutputStream(), true);
            out.println(gson.toJson(light));
        } catch (Exception e) {
        }  
   
    }//GEN-LAST:event_lightTogbuttonItemStateChanged

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
            java.util.logging.Logger.getLogger(ClientManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientManager().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LightPanel;
    private javax.swing.JPanel MobilePanel;
    private javax.swing.JPanel PrinterPanel;
    private javax.swing.JPanel ProjectorPanel;
    private javax.swing.JSlider VolumeSlider;
    private javax.swing.JPanel deviceListPanel;
    private javax.swing.JTextField dnTF;
    private javax.swing.JTextArea infoLbl;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JButton laptopBtn;
    private javax.swing.JPanel laptopPanel;
    private javax.swing.JSlider laptopVolumeSlider;
    private javax.swing.JButton lightBtn;
    private javax.swing.JToggleButton lightTogbutton;
    private javax.swing.JButton mobilePhoneBtn;
    private javax.swing.JButton printerBtn;
    private javax.swing.JButton projectorBtn;
    // End of variables declaration//GEN-END:variables
}
