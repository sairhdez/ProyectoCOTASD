package vista;

import controlador.ConvertirAudio;
import controlador.DescargaHilo;
import controlador.GestionAudio;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InicioCota extends javax.swing.JFrame {

    public InicioCota() {
        initComponents();

        File carpetaGuardarAudios = new File("audio\\");
        String[] listado = carpetaGuardarAudios.list();
        if (listado == null || listado.length == 0) {
            System.out.println("No hay archivos");
            return;
        } else {
            for (int i = 0; i < listado.length; i++) {
                System.out.println(listado[i]);
                File fichero = new File("audio\\" + listado[i]);
                if (fichero.delete()) {
                    System.out.println("FICHERO ELIMINADO");
                } else {
                    System.out.println("FICHERO NO PUDO SER ELIMINADO");
                }
            }
        }
        listarTablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTextFieldRutaCarpetaSeleccionada = new javax.swing.JTextField();
        jBAbrirBuscador = new javax.swing.JButton();
        jPanelSesionConvertirTexto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAudioConvertidos = new javax.swing.JTable();
        jBConvertirAAudios = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonActualizarTablaAudios = new javax.swing.JButton();
        jButtonReproducirAudio = new javax.swing.JButton();
        jLabelNombreAudioSeleccionadoTabla1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanelSesionBuscarAudios = new javax.swing.JPanel();
        jTextFieldBuscadorPalabrasClaves = new javax.swing.JTextField();
        jBBuscarAudio = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableBuscar = new javax.swing.JTable();
        jButtonPlayAudiosBuscados = new javax.swing.JButton();
        jLabelNombreAudioBuscado = new javax.swing.JLabel();
        jButtonAbrirUbicación = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 29, -1));

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("T");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 29, -1));

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("E");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 29, -1));

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("O");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 29, -1));

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("T");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 100, 30, -1));

        jLabel7.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("U");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 29, -1));

        jLabel8.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("A");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 29, -1));

        jLabel9.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("A");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 29, -1));

        jLabel13.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("O");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 29, -1));

        jLabel14.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("I ");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 30, -1));

        jLabel15.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("D");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 29, -1));

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Footlight MT Light", 0, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("CONVERTIDOR DE:");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 410, 40));

        jPanel6.setForeground(new java.awt.Color(204, 204, 204));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccionar una carpeta del ordenador:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jTextFieldRutaCarpetaSeleccionada.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N

        jBAbrirBuscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cecar/edu/co/Img/archivos.png"))); // NOI18N
        jBAbrirBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAbrirBuscadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTextFieldRutaCarpetaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBAbrirBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldRutaCarpetaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAbrirBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanelSesionConvertirTexto.setBackground(new java.awt.Color(204, 204, 204));
        jPanelSesionConvertirTexto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Convertir texto(s) de carpeta seleccionada:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 51, 255))); // NOI18N

        jTableAudioConvertidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableAudioConvertidos.setFont(new java.awt.Font("Digital-7 Mono", 1, 11)); // NOI18N
        jTableAudioConvertidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre:"
            }
        ));
        jTableAudioConvertidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAudioConvertidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAudioConvertidos);

        jBConvertirAAudios.setFont(new java.awt.Font("Dungeon", 0, 12)); // NOI18N
        jBConvertirAAudios.setText(" Convertir a audio");
        jBConvertirAAudios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBConvertirAAudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConvertirAAudiosActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cecar/edu/co/Img/convertir.png"))); // NOI18N

        jButtonActualizarTablaAudios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cecar/edu/co/Img/actualizar.png"))); // NOI18N
        jButtonActualizarTablaAudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarTablaAudiosActionPerformed(evt);
            }
        });

        jButtonReproducirAudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cecar/edu/co/Img/tocar.png"))); // NOI18N
        jButtonReproducirAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReproducirAudioActionPerformed(evt);
            }
        });

        jLabelNombreAudioSeleccionadoTabla1.setFont(new java.awt.Font("Digital-7 Mono", 0, 11)); // NOI18N
        jLabelNombreAudioSeleccionadoTabla1.setText("Nombre audio");

        javax.swing.GroupLayout jPanelSesionConvertirTextoLayout = new javax.swing.GroupLayout(jPanelSesionConvertirTexto);
        jPanelSesionConvertirTexto.setLayout(jPanelSesionConvertirTextoLayout);
        jPanelSesionConvertirTextoLayout.setHorizontalGroup(
            jPanelSesionConvertirTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSesionConvertirTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonActualizarTablaAudios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelSesionConvertirTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSesionConvertirTextoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jBConvertirAAudios)
                        .addGap(36, 36, 36))
                    .addGroup(jPanelSesionConvertirTextoLayout.createSequentialGroup()
                        .addGroup(jPanelSesionConvertirTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSesionConvertirTextoLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel4))
                            .addGroup(jPanelSesionConvertirTextoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonReproducirAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNombreAudioSeleccionadoTabla1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanelSesionConvertirTextoLayout.setVerticalGroup(
            jPanelSesionConvertirTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSesionConvertirTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSesionConvertirTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonActualizarTablaAudios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSesionConvertirTextoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jBConvertirAAudios, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelSesionConvertirTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonReproducirAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombreAudioSeleccionadoTabla1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        jLabel19.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Buscar audio por texto.");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cecar/edu/co/Img/fuente.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cecar/edu/co/Img/lupa.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cecar/edu/co/Img/sube-el-volumen.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanelSesionBuscarAudios.setBackground(new java.awt.Color(204, 204, 204));
        jPanelSesionBuscarAudios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digitar palabras claves para buscar audio(s)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 51, 255))); // NOI18N

        jBBuscarAudio.setFont(new java.awt.Font("Dungeon", 0, 11)); // NOI18N
        jBBuscarAudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cecar/edu/co/Img/buscar.png"))); // NOI18N
        jBBuscarAudio.setText("BUSCAR");
        jBBuscarAudio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBBuscarAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarAudioActionPerformed(evt);
            }
        });

        jTableBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableBuscar.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        jTableBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre:"
            }
        ));
        jTableBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBuscarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableBuscar);

        jButtonPlayAudiosBuscados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cecar/edu/co/Img/boton-de-play.png"))); // NOI18N
        jButtonPlayAudiosBuscados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayAudiosBuscadosActionPerformed(evt);
            }
        });

        jLabelNombreAudioBuscado.setFont(new java.awt.Font("Digital-7 Mono", 0, 11)); // NOI18N
        jLabelNombreAudioBuscado.setText("Nombre audio");
        jLabelNombreAudioBuscado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelSesionBuscarAudiosLayout = new javax.swing.GroupLayout(jPanelSesionBuscarAudios);
        jPanelSesionBuscarAudios.setLayout(jPanelSesionBuscarAudiosLayout);
        jPanelSesionBuscarAudiosLayout.setHorizontalGroup(
            jPanelSesionBuscarAudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSesionBuscarAudiosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSesionBuscarAudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldBuscadorPalabrasClaves)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSesionBuscarAudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSesionBuscarAudiosLayout.createSequentialGroup()
                        .addComponent(jButtonPlayAudiosBuscados, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNombreAudioBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBBuscarAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSesionBuscarAudiosLayout.setVerticalGroup(
            jPanelSesionBuscarAudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSesionBuscarAudiosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSesionBuscarAudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscarAudio)
                    .addComponent(jTextFieldBuscadorPalabrasClaves, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelSesionBuscarAudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSesionBuscarAudiosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSesionBuscarAudiosLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanelSesionBuscarAudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNombreAudioBuscado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPlayAudiosBuscados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSesionBuscarAudios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelSesionConvertirTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSesionConvertirTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSesionBuscarAudios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonAbrirUbicación.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cecar/edu/co/Img/abrircarpeta.png"))); // NOI18N
        jButtonAbrirUbicación.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAbrirUbicaciónMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        jLabel16.setText("ABRIR UBICACIÓN");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel17.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        jLabel17.setText("-----DE AUDIOS-----");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonAbrirUbicación, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(1, 1, 1)
                        .addComponent(jButtonAbrirUbicación, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(734, 718));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAbrirBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAbrirBuscadorActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jf.setMultiSelectionEnabled(false);
        jf.showOpenDialog(this);
        File seleccion_ruta = jf.getSelectedFile();

        if (seleccion_ruta != null) {
            jTextFieldRutaCarpetaSeleccionada.setText(seleccion_ruta.getAbsolutePath());
        }
    }//GEN-LAST:event_jBAbrirBuscadorActionPerformed

    private void jButtonReproducirAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReproducirAudioActionPerformed
        if (nombreAudio != null) {
            try {
                File directory = new File(".audio");
                System.out.println(directory.getAbsolutePath().replaceAll("[.]", ""));
                GestionAudio sonar = new GestionAudio();
                sonar.reproducirAudio(directory.getAbsolutePath().replaceAll("[.]", "") + "/" + nombreAudio);
            } catch (Exception e) {

            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla");
        }

    }//GEN-LAST:event_jButtonReproducirAudioActionPerformed

    private void jBConvertirAAudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConvertirAAudiosActionPerformed

        System.err.println(jTextFieldRutaCarpetaSeleccionada.getText());
        DescargaHilo hilo1 = new DescargaHilo();
        hilo1.rutaAudio = jTextFieldRutaCarpetaSeleccionada.getText();
        hilo1.start();

    }//GEN-LAST:event_jBConvertirAAudiosActionPerformed
    public static DefaultTableModel modelo;

    public void listarTablas() {
        String[] titulos = {"Nombre archivo", "Estado"};
        String[] registros = new String[2];
        modelo = new DefaultTableModel(null, titulos);

        File directorioCarpeta = new File(".audio");
        File carpeta = new File(directorioCarpeta.getAbsolutePath().replaceAll("[.]", ""));
        String[] listaCarpeta = carpeta.list();
        
        if (listaCarpeta == null || listaCarpeta.length == 0) {
            JOptionPane.showMessageDialog(null, "Pasos a seguir: \n\n 1. Seleccione una ubicación \n 2. Presione en CONVERTIR A AUDIO. \n 3. Listar la tabla nuevamente");
        } else {
            for (int i = 0; i < listaCarpeta.length; i++) {
                System.out.println(listaCarpeta[i]);
                try {
                    registros[0] = listaCarpeta[i];
                    registros[1] = "Convertido";
                    modelo.addRow(registros);

                    jTableAudioConvertidos.setModel(modelo);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
    private void jButtonActualizarTablaAudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarTablaAudiosActionPerformed
        listarTablas();
    }//GEN-LAST:event_jButtonActualizarTablaAudiosActionPerformed
    public static String nombreAudio;
    private void jTableAudioConvertidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAudioConvertidosMouseClicked

        int filaSeleccionada = jTableAudioConvertidos.rowAtPoint(evt.getPoint());
        nombreAudio = String.valueOf(jTableAudioConvertidos.getValueAt(filaSeleccionada, 0));
        jLabelNombreAudioSeleccionadoTabla1.setText("Audio: " + nombreAudio);
    }//GEN-LAST:event_jTableAudioConvertidosMouseClicked

    private void jBBuscarAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarAudioActionPerformed
        
        String[] titulos = {"Nombre de audio", "Estado"};
        String[] registros = new String[2];
        modelo = new DefaultTableModel(null, titulos);

        if(jTextFieldBuscadorPalabrasClaves.getText().length()==0){
             JOptionPane.showMessageDialog(null, "Rellene primero el campo para buscar");
        }
        
        for (int i = 0; i < ConvertirAudio.audio.size(); i++) {
            System.out.println(ConvertirAudio.audio.get(i).getNombre());
            try {
                String archivo = ConvertirAudio.audio.get(i).getNombre().substring(0, ConvertirAudio.audio.get(i).getNombre().lastIndexOf("."));
                if (ConvertirAudio.audio.get(i).getContenido().toUpperCase().contains(jTextFieldBuscadorPalabrasClaves.getText().toUpperCase())) {
                    registros[0] = archivo + ".wav";
                    registros[1] = "Encontrado";
                    modelo.addRow(registros);
                }
                jTableBuscar.setModel(modelo);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_jBBuscarAudioActionPerformed

    private void jButtonAbrirUbicaciónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAbrirUbicaciónMouseClicked

        try {
            Desktop.getDesktop().open(new File("./audio"));
        } catch (IOException ex) {
            Logger.getLogger(InicioCota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAbrirUbicaciónMouseClicked
    public static String sonidoBuscador;
    private void jTableBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBuscarMouseClicked

        int seleccion = jTableBuscar.rowAtPoint(evt.getPoint());
        sonidoBuscador = String.valueOf(jTableBuscar.getValueAt(seleccion, 0));
        jLabelNombreAudioBuscado.setText("Audio: " + sonidoBuscador);
        System.err.println(nombreAudio);
    }//GEN-LAST:event_jTableBuscarMouseClicked

    private void jButtonPlayAudiosBuscadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayAudiosBuscadosActionPerformed

        if (sonidoBuscador != null) {
            try {
                File directory = new File(".audio");
                System.out.println(directory.getAbsolutePath().replaceAll("[.]", ""));
                GestionAudio sonar = new GestionAudio();
                sonar.reproducirAudio(directory.getAbsolutePath().replaceAll("[.]", "") + "/" + sonidoBuscador);
            } catch (Exception e) {

            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla");
        }


    }//GEN-LAST:event_jButtonPlayAudiosBuscadosActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAbrirBuscador;
    private javax.swing.JButton jBBuscarAudio;
    private javax.swing.JButton jBConvertirAAudios;
    private javax.swing.JButton jButtonAbrirUbicación;
    private javax.swing.JButton jButtonActualizarTablaAudios;
    private javax.swing.JButton jButtonPlayAudiosBuscados;
    private javax.swing.JButton jButtonReproducirAudio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNombreAudioBuscado;
    private javax.swing.JLabel jLabelNombreAudioSeleccionadoTabla1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelSesionBuscarAudios;
    private javax.swing.JPanel jPanelSesionConvertirTexto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAudioConvertidos;
    private javax.swing.JTable jTableBuscar;
    private javax.swing.JTextField jTextFieldBuscadorPalabrasClaves;
    private javax.swing.JTextField jTextFieldRutaCarpetaSeleccionada;
    // End of variables declaration//GEN-END:variables
}
