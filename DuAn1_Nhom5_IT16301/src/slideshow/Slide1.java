/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slideshow;

import javax.swing.JOptionPane;

/**
 *
 * @author raven
 */
public class Slide1 extends javax.swing.JPanel {

    /**
     * Creates new form Slide1
     */
    public Slide1() {
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

        pictureBox1 = new slideshow.PictureBox();
        panelTransparent1 = new slideshow.PanelTransparent();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/banner4.jpg"))); // NOI18N

        panelTransparent1.setBackground(new java.awt.Color(255, 255, 255));
        panelTransparent1.setAlpha(0.5F);

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 70, 100));
        jLabel1.setText("Trang sức Toản Huyền");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 55, 111));
        jLabel2.setText("This is sample slideshow using java swing");

        jLabel3.setFont(new java.awt.Font("sansserif", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 55, 111));
        jLabel3.setText(" - Timing Framework library");

        jLabel4.setFont(new java.awt.Font("sansserif", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 55, 111));
        jLabel4.setText(" - Miglayout library");

        javax.swing.GroupLayout panelTransparent1Layout = new javax.swing.GroupLayout(panelTransparent1);
        panelTransparent1.setLayout(panelTransparent1Layout);
        panelTransparent1Layout.setHorizontalGroup(
            panelTransparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparent1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTransparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        panelTransparent1Layout.setVerticalGroup(
            panelTransparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparent1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pictureBox1.setLayer(panelTransparent1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pictureBox1Layout = new javax.swing.GroupLayout(pictureBox1);
        pictureBox1.setLayout(pictureBox1Layout);
        pictureBox1Layout.setHorizontalGroup(
            pictureBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pictureBox1Layout.createSequentialGroup()
                .addComponent(panelTransparent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        pictureBox1Layout.setVerticalGroup(
            pictureBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTransparent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private slideshow.PanelTransparent panelTransparent1;
    private slideshow.PictureBox pictureBox1;
    // End of variables declaration//GEN-END:variables
}
