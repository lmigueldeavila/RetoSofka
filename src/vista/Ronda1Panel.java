package vista;

import controller.PreguntaJpaController;
import controller.PartidaJpaController;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import modelo.Pregunta;
import java.util.Random;
import modelo.Partida;

public class Ronda1Panel extends javax.swing.JPanel {
    
    private PreguntaJpaController preguntaJpaC;
    private PartidaJpaController partidaJpaC;
    private Pregunta p;
    private Partida par;
    private EntityManagerFactory emf;
    
    
    public Ronda1Panel() {
        initComponents();
        
        emf = Persistence.createEntityManagerFactory("RetoSofkaPU");
        preguntaJpaC = new PreguntaJpaController(emf);
        r2JBtn.setVisible(false);
        r3JBtn.setVisible(false);
        r4JBtn.setVisible(false);
        r5JBtn.setVisible(false);
        r1JL.setVisible(false);
        r2JL.setVisible(false);
        r3JL.setVisible(false);
        r4JL.setVisible(false);
        r5JL.setVisible(false);
        finalJBtn.setVisible(false);
        nombreJL.setVisible(false);
        nombreJTF.setVisible(false);
        regisJBtn.setVisible(false);
        jLabel7.setVisible(false);
        retirarJBtn.setVisible(false);
        respJCB.setVisible(false);
        mirespJCB.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        r1JL = new javax.swing.JLabel();
        r1JBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        opcion1JL = new javax.swing.JLabel();
        opcion2JL = new javax.swing.JLabel();
        opcion3JL = new javax.swing.JLabel();
        opcion4JL = new javax.swing.JLabel();
        preguntaJL = new javax.swing.JLabel();
        r2JL = new javax.swing.JLabel();
        r3JL = new javax.swing.JLabel();
        r4JL = new javax.swing.JLabel();
        r5JL = new javax.swing.JLabel();
        r2JBtn = new javax.swing.JButton();
        r3JBtn = new javax.swing.JButton();
        r4JBtn = new javax.swing.JButton();
        r5JBtn = new javax.swing.JButton();
        finalJBtn = new javax.swing.JButton();
        retirarJBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        alcanzadaJL = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        acumJL = new javax.swing.JLabel();
        nombreJL = new javax.swing.JLabel();
        nombreJTF = new javax.swing.JTextField();
        regisJBtn = new javax.swing.JButton();
        mirespJCB = new javax.swing.JComboBox<>();
        respJCB = new javax.swing.JComboBox<>();

        r1JL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        r1JL.setText("RONDA 1");

        r1JBtn.setText("Iniciar");
        r1JBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1JBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Opción 1");

        jLabel2.setText("Opción 2");

        jLabel3.setText("Opción 3");

        jLabel4.setText("Opción 4");

        opcion1JL.setText(".");

        opcion2JL.setText(".");

        opcion3JL.setText(".");

        opcion4JL.setText(".");

        preguntaJL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        preguntaJL.setText("Pregunta");

        r2JL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        r2JL.setText("RONDA 2");

        r3JL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        r3JL.setText("RONDA 3");

        r4JL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        r4JL.setText("RONDA 4");

        r5JL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        r5JL.setText("RONDA 5");

        r2JBtn.setText("Continuar");
        r2JBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2JBtnActionPerformed(evt);
            }
        });

        r3JBtn.setText("Continuar");
        r3JBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3JBtnActionPerformed(evt);
            }
        });

        r4JBtn.setText("Continuar");
        r4JBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4JBtnActionPerformed(evt);
            }
        });

        r5JBtn.setText("Continuar");
        r5JBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5JBtnActionPerformed(evt);
            }
        });

        finalJBtn.setText("Finalizar");
        finalJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalJBtnActionPerformed(evt);
            }
        });

        retirarJBtn.setText("Retirarse");
        retirarJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarJBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Presiona para responder y avanzar ");

        jLabel7.setText("Tu respuesta es la opción #");

        jLabel8.setText("Ronda alcanzada");

        alcanzadaJL.setText("0");

        jLabel10.setText("Puntaje");

        acumJL.setText("0");

        nombreJL.setText("Registra tu nombre");

        regisJBtn.setText("Registrar partida");
        regisJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisJBtnActionPerformed(evt);
            }
        });

        mirespJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        respJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(opcion4JL, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(opcion3JL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opcion2JL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opcion1JL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(nombreJL))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(alcanzadaJL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(acumJL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(regisJBtn)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(r1JL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r2JL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r3JL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r4JL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r5JL))
                            .addComponent(preguntaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mirespJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(retirarJBtn)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(r1JBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r2JBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r3JBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r4JBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r5JBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(finalJBtn)))
                        .addGap(0, 130, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(respJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r1JL)
                            .addComponent(r2JL)
                            .addComponent(r3JL)
                            .addComponent(r4JL)
                            .addComponent(r5JL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(preguntaJL)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(opcion1JL, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(opcion2JL, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(opcion3JL, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(alcanzadaJL, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(acumJL))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreJL)
                            .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regisJBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(opcion4JL, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(mirespJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1JBtn)
                    .addComponent(r2JBtn)
                    .addComponent(r3JBtn)
                    .addComponent(r4JBtn)
                    .addComponent(r5JBtn)
                    .addComponent(finalJBtn))
                .addGap(18, 18, 18)
                .addComponent(retirarJBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(respJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Función que elige número al azar que vendrá representando el idPregunta que 
    //coincida con una pregunta de la categoría correspondiente al nivel de dificultad.
    public int RandomFunc(int categoria){
        Random rand = new Random();
        int num;
        
        List<Pregunta> list = preguntaJpaC.findPreguntaEntities(100, 1);
        int size = list.size();
        //int size = preguntaJpaC.getPreguntaCount();
        
        
        //Se generan números hasta encontrar uno que corresponda a un id de pregunta
        //en la categoría del parametro ingresado. Se suma 1 para evitar id = 0.
        do{
            num = rand.nextInt(size) + 1;
            p = preguntaJpaC.findPregunta(num);
        }while(p.getCategoria()!= categoria);
        return num;       
    }
    
    
    private void r1JBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1JBtnActionPerformed
        int idpreg1;
        idpreg1 = RandomFunc(1);
        jLabel7.setVisible(true);
        retirarJBtn.setVisible(true);
        mirespJCB.setVisible(true);
        
               
        r1JL.setVisible(true);
        try{
            p = preguntaJpaC.findPregunta(idpreg1);
            preguntaJL.setText(p.getPreguntaText());
            opcion1JL.setText(p.getOpcion1());
            opcion2JL.setText(p.getOpcion2());
            opcion3JL.setText(p.getOpcion3());
            opcion4JL.setText(p.getOpcion4());
            respJCB.setSelectedIndex(p.getRespuesta());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ha ocurrido la excepción " + e);
        }
        
        r1JBtn.setVisible(false);
        r2JBtn.setVisible(true);
    }//GEN-LAST:event_r1JBtnActionPerformed

    private void r2JBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2JBtnActionPerformed
        
        if((mirespJCB.getSelectedIndex()+1)== respJCB.getSelectedIndex()){
            JOptionPane.showMessageDialog(this, "Respuesta Correcta +30 puntos");
            acumJL.setText("30");
            alcanzadaJL.setText("1");
            int idpreg2;
            idpreg2 = RandomFunc(2);
            r2JBtn.setVisible(false);
            r3JBtn.setVisible(true);
            r1JL.setVisible(false);
            r2JL.setVisible(true);

            try{
                p = preguntaJpaC.findPregunta(idpreg2);
                preguntaJL.setText(p.getPreguntaText());
                opcion1JL.setText(p.getOpcion1());
                opcion2JL.setText(p.getOpcion2());
                opcion3JL.setText(p.getOpcion3());
                opcion4JL.setText(p.getOpcion4());
                respJCB.setSelectedIndex(p.getRespuesta());
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Ha ocurrido la excepción " + e);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Respuesta incorrecta, no llegaste muy lejos esta vez");
            nombreJL.setVisible(true);
            nombreJTF.setVisible(true);
            regisJBtn.setVisible(true);
            r2JBtn.setVisible(false);
            jLabel5.setVisible(false);
            retirarJBtn.setVisible(false);
            
        }    
    }//GEN-LAST:event_r2JBtnActionPerformed

    private void r3JBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3JBtnActionPerformed
        if((mirespJCB.getSelectedIndex()+1)== respJCB.getSelectedIndex()){
            JOptionPane.showMessageDialog(this, "Respuesta Correcta +40 puntos");
            acumJL.setText("70");
            alcanzadaJL.setText("2");
            int idpreg3;
            idpreg3 = RandomFunc(3);
            r3JBtn.setVisible(false);
            r4JBtn.setVisible(true);
            r2JL.setVisible(false);
            r3JL.setVisible(true);
            try{
                p = preguntaJpaC.findPregunta(idpreg3);
                preguntaJL.setText(p.getPreguntaText());
                opcion1JL.setText(p.getOpcion1());
                opcion2JL.setText(p.getOpcion2());
                opcion3JL.setText(p.getOpcion3());
                opcion4JL.setText(p.getOpcion4());
                respJCB.setSelectedIndex(p.getRespuesta());
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Ha ocurrido la excepción " + e);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Respuesta incorrecta !Googlea un poco¡");
            nombreJL.setVisible(true);
            nombreJTF.setVisible(true);
            acumJL.setText("0");
            regisJBtn.setVisible(true);
            r3JBtn.setVisible(false);
            jLabel5.setVisible(false);
            retirarJBtn.setVisible(false);
        } 
    }//GEN-LAST:event_r3JBtnActionPerformed

    private void r4JBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4JBtnActionPerformed
        if((mirespJCB.getSelectedIndex()+1)== respJCB.getSelectedIndex()){
            JOptionPane.showMessageDialog(this, "Respuesta Correcta +50 puntos");
            acumJL.setText("120");
            alcanzadaJL.setText("3");
            int idpreg4;
            idpreg4 = RandomFunc(4);
            r4JBtn.setVisible(false);
            r5JBtn.setVisible(true);
            r3JL.setVisible(false);
            r4JL.setVisible(true);
            try{
                p = preguntaJpaC.findPregunta(idpreg4);
                preguntaJL.setText(p.getPreguntaText());
                opcion1JL.setText(p.getOpcion1());
                opcion2JL.setText(p.getOpcion2());
                opcion3JL.setText(p.getOpcion3());
                opcion4JL.setText(p.getOpcion4());
                respJCB.setSelectedIndex(p.getRespuesta());
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Ha ocurrido la excepción " + e);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Respuesta incorrecta, te quedaste a mitad de camino");
            nombreJL.setVisible(true);
            nombreJTF.setVisible(true);
            acumJL.setText("0");
            regisJBtn.setVisible(true);
            r4JBtn.setVisible(false);
            jLabel5.setVisible(false);
            retirarJBtn.setVisible(false);
        }
    }//GEN-LAST:event_r4JBtnActionPerformed

    private void r5JBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5JBtnActionPerformed
        if((mirespJCB.getSelectedIndex()+1)== respJCB.getSelectedIndex()){
            JOptionPane.showMessageDialog(this, "Respuesta Correcta +80 puntos");
            acumJL.setText("200");
            alcanzadaJL.setText("4");
            int idpreg5;
            idpreg5  = RandomFunc(5);
            r5JBtn.setVisible(false);
            finalJBtn.setVisible(true);
            r4JL.setVisible(false);
            r5JL.setVisible(true);
            try{
                p = preguntaJpaC.findPregunta(idpreg5);
                preguntaJL.setText(p.getPreguntaText());
                opcion1JL.setText(p.getOpcion1());
                opcion2JL.setText(p.getOpcion2());
                opcion3JL.setText(p.getOpcion3());
                opcion4JL.setText(p.getOpcion4());
                respJCB.setSelectedIndex(p.getRespuesta());
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Ha ocurrido la excepción " + e);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Respuesta incorrecta, ibas muy bien");
            nombreJL.setVisible(true);
            nombreJTF.setVisible(true);
            acumJL.setText("0");
            r5JBtn.setVisible(false);
            jLabel5.setVisible(false);
            retirarJBtn.setVisible(false);
            regisJBtn.setVisible(true);
        }
    }//GEN-LAST:event_r5JBtnActionPerformed

    private void finalJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalJBtnActionPerformed
        if((mirespJCB.getSelectedIndex()+1)== respJCB.getSelectedIndex()){
            JOptionPane.showMessageDialog(this, "Felicidades has completado el juego +200 puntos");
            acumJL.setText("400");
            alcanzadaJL.setText("5");
            nombreJL.setVisible(true);
            nombreJTF.setVisible(true);
            regisJBtn.setVisible(true);
            finalJBtn.setVisible(false);
            jLabel5.setVisible(false);
            retirarJBtn.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this, "Te faltó poco");
            nombreJL.setVisible(true);
            nombreJTF.setVisible(true);
            acumJL.setText("0");
            regisJBtn.setVisible(true);
            jLabel5.setVisible(false);
            finalJBtn.setVisible(false);
            retirarJBtn.setVisible(false);
        }
    }//GEN-LAST:event_finalJBtnActionPerformed

    private void retirarJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarJBtnActionPerformed
        r1JBtn.setVisible(false);
        r2JBtn.setVisible(false);
        r3JBtn.setVisible(false);
        r4JBtn.setVisible(false);
        r5JBtn.setVisible(false);
        finalJBtn.setVisible(false);
        jLabel5.setVisible(false);
        retirarJBtn.setVisible(false);
        
        nombreJL.setVisible(true);
        nombreJTF.setVisible(true);
        regisJBtn.setVisible(true);
    }//GEN-LAST:event_retirarJBtnActionPerformed

    private void regisJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisJBtnActionPerformed
        if(nombreJTF.getText().equals("") != true){
            par = new Partida();
            emf = Persistence.createEntityManagerFactory("RetoSofkaPU");
            partidaJpaC = new PartidaJpaController(emf);
            par.setNombreJugador(nombreJTF.getText());
            par.setAcumulado(Integer.parseInt(acumJL.getText()));
            par.setRondaAlcanzada(Integer.parseInt(alcanzadaJL.getText()));
            nombreJTF.setText("");
            try{
                partidaJpaC.create(par);
                JOptionPane.showMessageDialog(this, "Partida guardada");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Ha ocurrido la excepción " + e);
            }
            r1JBtn.setVisible(true);
            regisJBtn.setVisible(false);
            nombreJTF.setVisible(false);
            r1JL.setVisible(false);
            r2JL.setVisible(false);
            r3JL.setVisible(false);
            r4JL.setVisible(false);
            r5JL.setVisible(false);
            jLabel5.setVisible(true);
            retirarJBtn.setVisible(true);
            opcion1JL.setText(".");
            opcion2JL.setText(".");
            opcion3JL.setText(".");
            opcion4JL.setText(".");
            preguntaJL.setText("Pregunta");
            nombreJL.setVisible(false);
            alcanzadaJL.setText("0");
            acumJL.setText("0");
            finalJBtn.setVisible(false);
            jLabel7.setVisible(false);
            retirarJBtn.setVisible(false);
            mirespJCB.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this, "Ingresa tu nombre de jugador");
        }
    }//GEN-LAST:event_regisJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acumJL;
    private javax.swing.JLabel alcanzadaJL;
    private javax.swing.JButton finalJBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> mirespJCB;
    private javax.swing.JLabel nombreJL;
    private javax.swing.JTextField nombreJTF;
    private javax.swing.JLabel opcion1JL;
    private javax.swing.JLabel opcion2JL;
    private javax.swing.JLabel opcion3JL;
    private javax.swing.JLabel opcion4JL;
    private javax.swing.JLabel preguntaJL;
    private javax.swing.JButton r1JBtn;
    private javax.swing.JLabel r1JL;
    private javax.swing.JButton r2JBtn;
    private javax.swing.JLabel r2JL;
    private javax.swing.JButton r3JBtn;
    private javax.swing.JLabel r3JL;
    private javax.swing.JButton r4JBtn;
    private javax.swing.JLabel r4JL;
    private javax.swing.JButton r5JBtn;
    private javax.swing.JLabel r5JL;
    private javax.swing.JButton regisJBtn;
    private javax.swing.JComboBox<String> respJCB;
    private javax.swing.JButton retirarJBtn;
    // End of variables declaration//GEN-END:variables
}
