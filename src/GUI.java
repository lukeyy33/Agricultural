
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUI extends javax.swing.JFrame {

    public Field[] selectedFields;
    //public Farm[] selectedFarms;
    public Farm selectedFarm;
    //public FieldStation[] selectedFieldStations;
    public FieldStation selectedFieldStation;
    public SetOfFarms theFarms;
    public Data[] resultData;
    public ConnectionHandler handler;
    public SetOfFarmers theFarmers;
    //public Farmer theFarmers;
    public Location[] locations = new Location[8];

    public GUI() throws ParseException {
        initComponents();
        initLocations();
        initFarms();
        initFields();
        initFarmers();
        cmbFields.removeAllItems();
        cmbFarms.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String farmName = (String) cmbFarms.getSelectedItem();
                selectedFarm = theFarms.getFarmByName(farmName);
            }
        });
        
        Field[] tmp = theFarms.getAllFarms().get(0).getAllFields();
        for(int i =0; i < theFarms.getAllFarms().get(0).getAllFields().length; i++){
            cmbFields.addItem(tmp[i].getName());
        }
        
          //repopulates the fields box with the currently selected farm
//        cmbFields.removeAllItems();
//        String tmpString = cmbFarms.getSelectedItem().toString();
//        Field[] tmp = theFarms.getFarmByName(tmpString).getAllFields();
//        for(int i =0; i < tmp.length; i++){
//            cmbFields.addItem(tmp[i].getName());
//        }

    }

    /**
     * The user clicks on buttons/images, which then populate the relevant
     * fields such as 'selectedFarms'. once that object is in scope (i.e.
     * selected), the user can do various operations on it by clicking
     * buttons/images on the GUI that perform the functions listed
     */

    //the user will select a farm from the gui which will then get the farm from setOfFarms using the farmno
    /**
     * The user clicks on buttons/images, which then populate the relevant
     * fields such as 'selectedFarms'.once that object is in scope (i.e.
     * selected), the user can do various operations on it by clicking
     * buttons/images on the GUI that perform the functions listed
     *
     * @param farmNo
     * @return
     */
    public Farm selectFarm(int farmNo) {
        // TODO implement here
        return null;
    }
    //The user will select a field from the gui which will get the field by the fieldno from the fields within the selected farm

    public Field selectField(int fieldNo) {
        // TODO implement here
        return null;
    }
     //user selects a fieldStation from the gui and gets the fieldStation from the set of fields using the fieldstationno

    public FieldStation selectFieldStation(int fieldStationNo) {
        // TODO implement here
        return null;
    }

    /**
     * Output the array of resultData in a formatted way (E.g Table, Graph)
     * based on the user requested output type type (e.g. Graph, Table, etc)
     *
     * @param showResultsPopup
     */
    public void showResultsPopup(String showResultsPopup) {
        // TODO implement here

    }

    /**
     * calls getSelectedFieldStationData(), if a single field station(s) is not
     * selected then walk down the tree of farms,fields,fieldStations to
     * retrieve the fieldSations. Once the data has been retrieved the
     * selectedFarms/Fields/FieldStations arrays would be cleared If the user
     * has selected to view rainfall data across the entire farm the method
     * would iterate over all the fields in that farm and add the fieldStations
     * within those fields to the selecteFieldStations array. Once all fields
     * have been iterated over we have a complete list of all the fieldStations
     * we need to call getFieldStationData() on
     *
     * @return
     */
    public Data[] selectData() {
        // TODO implement here
        return null;
    }

    //allows the user to select multiple farms at once by setting the data from their clicks (i.e. what farms they've selected) into the relevant arrays e.g. selectedfarms[]
    public void setSelectedFarms() {
        // TODO implement here
    }

    public void setSelectedFields() {
        // TODO implement here
    }

    public void setSelectedFieldStations() {
        // TODO implement here
    }

    //triggers a "backup" in a real system, but here could just trigger serialization at a specific interval e.g. daily 
    public void backupData() {
        // TODO implement here
    }

    //displays the results in a map view
    public void showDevices() {
        // TODO implement here
    }

    /**
     * provides a graphical representation of all farms in a scaled view The
     * user will be able to interact with the view, i.e. clicking on farms,
     * which adds that to 'selectedfarms[]' and switches to the showFarmView()
     * view, which then allows the relevant operations to be done to it (such as
     * selecting a field, etc.)
     */
    public void showHomeView() {
        // TODO implement here
    }

    public void showFarmView() {
        // TODO implement here
        //MAYBE CLICK A BUTTON TO OPEN A 
        //NEW GUI WITH PICTURES OF FARMS
    }

    public void showFieldView() {
        // TODO implement here
        //MAYBE CLICK A BUTTON TO OPEN A 
        //NEW GUI WITH PICTURES OF FIELD
    }

    public void showFieldStationView() {
        // TODO implement here
        //MAYBE CLICK A BUTTON TO OPEN A 
        //NEW GUI WITH PICTURES OF STATIONS
    }

    /**
     * brings up a list of farmers currently registered in the system. The user
     * can search for farmers using the various methods displayed in
     * SetOfFarmers
     */
    public void showFarmersView() {
        // TODO implement here
        //Open  up a GUI of list of farmers
    }

    /**
     * pop up allowing users to add/edit fields for farmers. this is also the
     * case for FarmPopup, FieldPopup, etc. if it has a parameter, then edit
     * that parameter, if not then create a new object of the relevant type.
     *
     * @param farmerPopup
     */
    public void showFarmerPopup(Farmer farmerPopup) {
        // TODO implement here
        String farmerName = (String)cmbFarmers.getSelectedItem();
        Farmer selectedFarmer = theFarmers.getFarmerByName(farmerName);
        
        farmerDialog.setVisible(true);
        farmerDialog.pack();
    }

    public void showFarmStatusPopup(Farm farmPopup) {
        String farmName = (String) cmbFarms.getSelectedItem();
        selectedFarm = theFarms.getFarmByName(farmName);

        farmsDialog.setVisible(true);
        farmsDialog.pack();
    }

    public void showFieldPopup() {
        // TODO implement here
        String farmName = (String) cmbFarms.getSelectedItem();
        selectedFarm = theFarms.getFarmByName(farmName);
        
        Field[] selectedFields = selectedFarm.getAllFields();

        fieldsDialog.setVisible(true);
        comboFields.removeAllItems();
        for (Field f: selectedFields) {
            comboFields.addItem(f.getName());
        }
        fieldsDialog.pack();

    }

    public void showFieldStationPopup(FieldStation fieldStation) {
        String fieldStationName = (String) cmbFarms.getSelectedItem();
        //selectedFieldStation = theFarms.getFarmByName(fieldStationName);
        
        Field[] selectedFields = selectedFarm.getAllFields();

        fieldsDialog.setVisible(true);
        comboFields.removeAllItems();
        for (Field f: selectedFields) {
            comboFields.addItem(f.getName());
        }
        fieldsDialog.pack();
    }

    public void showSensorPopup(Sensor sensor) {
        // TODO implement here

    }

    /**
     * Takes the user back to the previous view e.g. If the user is in the
     * fieldStation view, return to the field view - i.e., call showFieldView()
     * again with the relevant params from before
     */
    public void goBack() {
        // TODO implement here

    }

    public void exportToPDF() {
        // TODO implement here

    }

    private void initLocations() {
        locations[0] = new Location(1, 2, "Asparagus");
        locations[1] = new Location(3, 4, "Mushrooms");
        locations[2] = new Location(5, 6, "Potato");
        locations[3] = new Location(7, 8, "Carrot");
        locations[4] = new Location(9, 10, "Cucumber");
        locations[5] = new Location(11, 12, "Papaya");
        locations[6] = new Location(13, 14, "Chicken");
        locations[7] = new Location(15, 16, "Tomato");
    }
    
       private void initFarms() {
        theFarms = new SetOfFarms();
        theFarms.addFarm("Love Factory", locations[0]);
        theFarms.addFarm("Ganja Factory", locations[1]);
        theFarms.addFarm("Nandos", locations[2]);
        theFarms.addFarm("Bee Farm", locations[3]);
        theFarms.addFarm("Bugs Bunny", locations[4]);
        theFarms.addFarm("Shreks Skin", locations[5]);
        theFarms.addFarm("Potato Potatoe", locations[6]);
        theFarms.addFarm("Tomato Tomatoe", locations[7]);
        cmbFarms.removeAllItems();
        for (Farm f : theFarms.getAllFarms()) {
            cmbFarms.addItem(f.getName());
        }    
    }
    
    
    private void initFarmers() {
        theFarmers = new SetOfFarmers(); 
    }
    
    
    
    private void initFields() throws ParseException {
        //5 fields per farm
        Field[] temp = new Field[5];
        
        temp[0] = new Field("Field 1", "Greenhouse", 1, "Asparagus", 8);
        temp[1] = new Field("Field 2", "Greenhouse", 2, "Mushrooms", 12);
        temp[2] = new Field("Field 3", "Outdoor", 3, "Potato", 14);
        temp[3] = new Field("Field 4", "Outdoor", 4, "Carrot", 10);
        temp[4] = new Field("Field 5", "Outdoor", 5, "Papaya", 18);

        for (Farm f : theFarms.getAllFarms()) {
            f.setFields(temp);
        }
        
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        Date june = fmt.parse("2015-06-01");
        Date august = fmt.parse("2015-08-16");
        
        
        
        Crop asparagus = new Crop("Asparagus", 12f, june );
        Crop tomato = new Crop("Tomato", 8f, june );
        Crop potato = new Crop("Potato", 10f, june );
        Crop beans = new Crop("Beans", 11f, june );
        Crop wheat = new Crop("Wheat", 15f ,june );
                

        Planting[] tempPlantings = {
        new Planting(asparagus, june, august, 20),
        new Planting(tomato, june, august, 15),
        new Planting(potato, june, august, 35),
        new Planting(beans, june, august, 23),
        new Planting(wheat, june, august, 20)
        };
        for (Farm farm : theFarms.getAllFarms()) {
            for (Field field: farm.getAllFields()) {
                field.setPlantings(tempPlantings);
            }
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

        farmsDialog = new javax.swing.JDialog();
        dialogComboFields = new javax.swing.JComboBox();
        farmerDialog = new javax.swing.JDialog();
        farmerNameLbl = new javax.swing.JLabel();
        farmerEmailLbl = new javax.swing.JLabel();
        fieldsDialog = new javax.swing.JDialog();
        comboFields = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        lblFieldType = new javax.swing.JLabel();
        lblFieldCrop = new javax.swing.JLabel();
        lblFieldPlantings = new javax.swing.JLabel();
        cmbFarms = new javax.swing.JComboBox();
        farmsLbl = new javax.swing.JLabel();
        btnFarmStatus = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnShowFieldStatus = new javax.swing.JButton();
        btnShowFields = new javax.swing.JButton();
        fieldsLbl = new javax.swing.JLabel();
        cmbFields = new javax.swing.JComboBox<String>();
        farnersLbl = new javax.swing.JLabel();
        cmbFarmers = new javax.swing.JComboBox<String>();
        btnShowFarmers = new javax.swing.JButton();
        btnShowFarmerStatus = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        dialogComboFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dialogComboFieldsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout farmsDialogLayout = new javax.swing.GroupLayout(farmsDialog.getContentPane());
        farmsDialog.getContentPane().setLayout(farmsDialogLayout);
        farmsDialogLayout.setHorizontalGroup(
            farmsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(farmsDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dialogComboFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );
        farmsDialogLayout.setVerticalGroup(
            farmsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(farmsDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dialogComboFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        farmerNameLbl.setText("Farmer Name:");

        farmerEmailLbl.setText("Farmer Email:");

        javax.swing.GroupLayout farmerDialogLayout = new javax.swing.GroupLayout(farmerDialog.getContentPane());
        farmerDialog.getContentPane().setLayout(farmerDialogLayout);
        farmerDialogLayout.setHorizontalGroup(
            farmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(farmerDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(farmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(farmerNameLbl)
                    .addComponent(farmerEmailLbl))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        farmerDialogLayout.setVerticalGroup(
            farmerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(farmerDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(farmerNameLbl)
                .addGap(18, 18, 18)
                .addComponent(farmerEmailLbl)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        comboFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFieldsActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Field");

        lblFieldType.setText("Type:");

        lblFieldCrop.setText("Crop:");

        lblFieldPlantings.setText("Plantings:");

        javax.swing.GroupLayout fieldsDialogLayout = new javax.swing.GroupLayout(fieldsDialog.getContentPane());
        fieldsDialog.getContentPane().setLayout(fieldsDialogLayout);
        fieldsDialogLayout.setHorizontalGroup(
            fieldsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsDialogLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(fieldsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFieldPlantings)
                    .addComponent(lblFieldCrop)
                    .addComponent(lblFieldType)
                    .addComponent(jLabel1)
                    .addComponent(comboFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        fieldsDialogLayout.setVerticalGroup(
            fieldsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(comboFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFieldType)
                .addGap(18, 18, 18)
                .addComponent(lblFieldCrop)
                .addGap(18, 18, 18)
                .addComponent(lblFieldPlantings)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbFarms.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        farmsLbl.setText("Farms");
        farmsLbl.setName(""); // NOI18N

        btnFarmStatus.setText("Show Farm Status");
        btnFarmStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarmStatusActionPerformed(evt);
            }
        });

        btnShowFieldStatus.setText("Show Field Status");

        btnShowFields.setText("Show fields");
        btnShowFields.setMaximumSize(new java.awt.Dimension(101, 23));
        btnShowFields.setMinimumSize(new java.awt.Dimension(101, 23));
        btnShowFields.setPreferredSize(new java.awt.Dimension(101, 23));
        btnShowFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowFieldsActionPerformed(evt);
            }
        });

        fieldsLbl.setText("Fields");

        cmbFields.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFieldsActionPerformed(evt);
            }
        });

        farnersLbl.setText("Farmers");

        cmbFarmers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnShowFarmers.setText("Show Farmers");
        btnShowFarmers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowFarmersActionPerformed(evt);
            }
        });

        btnShowFarmerStatus.setText("Show Farmer Status");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator1)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldsLbl)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(farnersLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbFarmers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(btnShowFarmers)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShowFarmerStatus)))
                .addGap(0, 408, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(farmsLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbFarms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnShowFields, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnFarmStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(btnShowFieldStatus)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(farmsLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFarms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFarmStatus)
                    .addComponent(btnShowFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(fieldsLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowFieldStatus)
                    .addComponent(cmbFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(farnersLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFarmers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowFarmers)
                    .addComponent(btnShowFarmerStatus))
                .addGap(16, 16, 16)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnSave)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(269, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFarmStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarmStatusActionPerformed
        showFarmStatusPopup(selectedFarm);
    }//GEN-LAST:event_btnFarmStatusActionPerformed

    private void btnShowFarmersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFarmersActionPerformed
        String farmerName = (String)cmbFarmers.getSelectedItem();
        showFarmerPopup(theFarmers.getFarmerByName(farmerName));
    }//GEN-LAST:event_btnShowFarmersActionPerformed

    private void dialogComboFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dialogComboFieldsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dialogComboFieldsActionPerformed

    private void cmbFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFieldsActionPerformed
        
    }//GEN-LAST:event_cmbFieldsActionPerformed

    private void comboFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFieldsActionPerformed
        String selectedFieldName = (String)comboFields.getSelectedItem();
        Field selectedField = selectedFarm.getFieldByName(selectedFieldName);
        lblFieldType.setText("Type: " + selectedField.getType());
        lblFieldCrop.setText("Crop: " + selectedField.getCrop().getName());
        lblFieldPlantings.setText("Latest Planting: " + selectedField.getLatestPlanting());
    }//GEN-LAST:event_comboFieldsActionPerformed

    private void btnShowFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFieldsActionPerformed
        showFieldPopup();
    }//GEN-LAST:event_btnShowFieldsActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //TODO add your handling code here;
        FileOutputStream fOut = null;
        try {
            fOut = new FileOutputStream("Farms.ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fOut);
            
            objOut.writeObject(objOut);
            
            objOut.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fOut.close();
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new GUI().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFarmStatus;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnShowFarmerStatus;
    private javax.swing.JButton btnShowFarmers;
    private javax.swing.JButton btnShowFieldStatus;
    private javax.swing.JButton btnShowFields;
    private javax.swing.JComboBox<String> cmbFarmers;
    private javax.swing.JComboBox cmbFarms;
    private javax.swing.JComboBox<String> cmbFields;
    private javax.swing.JComboBox comboFields;
    private javax.swing.JComboBox dialogComboFields;
    private javax.swing.JDialog farmerDialog;
    private javax.swing.JLabel farmerEmailLbl;
    private javax.swing.JLabel farmerNameLbl;
    private javax.swing.JDialog farmsDialog;
    private javax.swing.JLabel farmsLbl;
    private javax.swing.JLabel farnersLbl;
    private javax.swing.JDialog fieldsDialog;
    private javax.swing.JLabel fieldsLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblFieldCrop;
    private javax.swing.JLabel lblFieldPlantings;
    private javax.swing.JLabel lblFieldType;
    // End of variables declaration//GEN-END:variables


}
