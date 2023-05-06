package edu.guilford;

import java.io.File;
import java.util.Scanner;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class sviPane extends GridPane {
    // Questions to ask

    // svidata attribute
    private DataSvi svi;

    // Button Attribute
    // private Button submitDataButton;

    // Image Attribute
    private ImageView sviImage;

    // Title Label
    private Label titleLabel;

    private RadioButton below_poverty_level_B;
    private RadioButton unemployed_B;
    private RadioButton no_highschool_diploma_B;
    private RadioButton disabled_B;
    private RadioButton over_65_B;
    private RadioButton single_parent_household_B;
    private RadioButton minority_B;
    private RadioButton limited_english_B;
    private RadioButton multi_unit_housing_B;
    private RadioButton mobile_homes_B;
    private RadioButton crowded_housing_B;
    private RadioButton no_vehicle_B;

    private RadioButton below_poverty_level_B_no;
    private RadioButton unemployed_B_no;
    private RadioButton no_highschool_diploma_B_no;
    private RadioButton disabled_B_no;
    private RadioButton over_65_B_no;
    private RadioButton single_parent_household_B_no;
    private RadioButton minority_B_no;
    private RadioButton limited_english_B_no;
    private RadioButton multi_unit_housing_B_no;
    private RadioButton mobile_homes_B_no;
    private RadioButton crowded_housing_B_no;
    private RadioButton no_vehicle_B_no;

    // TextFields for name, address, and phone number
    private TextField nameField;
    private TextField addressField;
    private TextField phoneField;

    // Labels for name, address, and phone number
    private Label nameLabel;
    private Label addressLabel;
    private Label phoneLabel;

    // Constructor
    public sviPane(DataSvi svi) {
        // Set the svidata attribute to the svidata object passed in
        this.svi = svi;

        // Label titleLabel = new Label("My GridPane Title");
        // titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        // GridPane.setHalignment(titleLabel, HPos.CENTER);
        // sviPane.add(titleLabel, 0, 0, 2, 1);

        // Instantiate titleLabel
        titleLabel = new Label("Social Vulnerability Index");
        titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        this.add(titleLabel, 0, 28);

        // Instantiate textfield atributes
        nameField = new TextField(svi.getName());
        addressField = new TextField(svi.getAddress());
        phoneField = new TextField(svi.getPhone_number());

        // Instantiate label atributes
        nameLabel = new Label("Name");
        addressLabel = new Label("Address");
        phoneLabel = new Label("Phone Number");

        // Add label to pane
        this.add(nameLabel, 0, 1);
        this.add(addressLabel, 0, 2);
        this.add(phoneLabel, 0, 3);

        // Add textfield to pane
        this.add(nameField, 1, 1);
        this.add(addressField, 1, 2);
        this.add(phoneField, 1, 3);

        // instanitate the submit button
        Button submitDataButton = new Button("Submit your Information");
        this.add(submitDataButton, 5, 20);

        // Add a label to the pane
        // I think I can create a loop to add all the questions to the pane but not sure
        // how, what VSC gave me didn't seem right
        this.add(new Label("Is your household below the poverty level?"), 0, 4);
        this.add(new Label("Are you unemployed?"), 0, 5);
        this.add(new Label("Does you have a highschool diploma?"), 0, 6);
        this.add(new Label("Are you disabled?"), 0, 7);
        this.add(new Label("Are you over 65?"), 0, 8);
        this.add(new Label("Are you a single parent household?"), 0, 9);
        this.add(new Label("Are you a minority?"), 0, 10);
        this.add(new Label("Do you have limited english?"), 0, 11);
        this.add(new Label("Do you live in multi unit housing?"), 0, 12);
        this.add(new Label("Do you live in a mobile home?"), 0, 13);
        this.add(new Label("Do you live in crowded housing?"), 0, 14);
        this.add(new Label("Do you have a vehicle?"), 0, 15);

        // Give pane a border
        this.setStyle("-fx-border-color: blue");
        // background color
        this.setStyle("-fx-background-color: lightblue");

        // Instantiate all the radio buttons
        below_poverty_level_B = new RadioButton("Below Povery Level");
        this.add(below_poverty_level_B, 1, 4);
        unemployed_B = new RadioButton("Unemployed");
        this.add(unemployed_B, 1, 5);
        no_highschool_diploma_B = new RadioButton("No Highschool Diploma");
        this.add(no_highschool_diploma_B, 1, 6);
        disabled_B = new RadioButton("Disabled");
        this.add(disabled_B, 1, 7);
        over_65_B = new RadioButton("Over 65");
        this.add(over_65_B, 1, 8);
        single_parent_household_B = new RadioButton("Single Parent Household");
        this.add(single_parent_household_B, 1, 9);
        minority_B = new RadioButton("Minority");
        this.add(minority_B, 1, 10);
        limited_english_B = new RadioButton("Limited English");
        this.add(limited_english_B, 1, 11);
        multi_unit_housing_B = new RadioButton("Multi Unit Housing");
        this.add(multi_unit_housing_B, 1, 12);
        mobile_homes_B = new RadioButton("Mobile Homes");
        this.add(mobile_homes_B, 1, 13);
        crowded_housing_B = new RadioButton("Crowded Housing");
        this.add(crowded_housing_B, 1, 14);
        no_vehicle_B = new RadioButton("Vehicle");
        this.add(no_vehicle_B, 1, 15);

        // Give me a button that have the option to click "No" next to each question
        below_poverty_level_B_no = new RadioButton("No");
        this.add(below_poverty_level_B_no, 2, 4);
        unemployed_B_no = new RadioButton("No");
        this.add(unemployed_B_no, 2, 5);
        no_highschool_diploma_B_no = new RadioButton("No");
        this.add(no_highschool_diploma_B_no, 2, 6);
        disabled_B_no = new RadioButton("No");
        this.add(disabled_B_no, 2, 7);
        over_65_B_no = new RadioButton("No");
        this.add(over_65_B_no, 2, 8);
        single_parent_household_B_no = new RadioButton("No");
        this.add(single_parent_household_B_no, 2, 9);
        minority_B_no = new RadioButton("No");
        this.add(minority_B_no, 2, 10);
        limited_english_B_no = new RadioButton("No");
        this.add(limited_english_B_no, 2, 11);
        multi_unit_housing_B_no = new RadioButton("No");
        this.add(multi_unit_housing_B_no, 2, 12);
        mobile_homes_B_no = new RadioButton("No");
        this.add(mobile_homes_B_no, 2, 13);
        crowded_housing_B_no = new RadioButton("No");
        this.add(crowded_housing_B_no, 2, 14);
        no_vehicle_B_no = new RadioButton("No");
        this.add(no_vehicle_B_no, 2, 15);

        // Create a toggle group for each question
        ToggleGroup toggleGroup = new ToggleGroup();
        toggleGroup.getToggles().addAll(below_poverty_level_B, below_poverty_level_B_no);
        if (below_poverty_level_B.isSelected()) {
            below_poverty_level_B_no.setSelected(false);
        } else {
            below_poverty_level_B_no.setSelected(true);
        }

        ToggleGroup tg2 = new ToggleGroup();
        tg2.getToggles().addAll(unemployed_B, unemployed_B_no);
        if (unemployed_B.isSelected()) {
            unemployed_B_no.setSelected(false);
        } else {
            unemployed_B_no.setSelected(true);
        }
        ToggleGroup tg3 = new ToggleGroup();
        tg3.getToggles().addAll(no_highschool_diploma_B, no_highschool_diploma_B_no);
        if (no_highschool_diploma_B.isSelected()) {
            no_highschool_diploma_B_no.setSelected(false);
        } else {
            no_highschool_diploma_B_no.setSelected(true);
        }
        ToggleGroup tg4 = new ToggleGroup();
        tg4.getToggles().addAll(disabled_B, disabled_B_no);
        if (disabled_B.isSelected()) {
            disabled_B_no.setSelected(false);
        } else {
            disabled_B_no.setSelected(true);
        }
        ToggleGroup tg5 = new ToggleGroup();
        tg5.getToggles().addAll(over_65_B, over_65_B_no);
        if (over_65_B.isSelected()) {
            over_65_B_no.setSelected(false);
        } else {
            over_65_B_no.setSelected(true);
        }
        ToggleGroup tg6 = new ToggleGroup();
        tg6.getToggles().addAll(single_parent_household_B, single_parent_household_B_no);
        if (single_parent_household_B.isSelected()) {
            single_parent_household_B_no.setSelected(false);
        } else {
            single_parent_household_B_no.setSelected(true);
        }
        ToggleGroup tg7 = new ToggleGroup();
        tg7.getToggles().addAll(minority_B, minority_B_no);
        if (minority_B.isSelected()) {
            minority_B_no.setSelected(false);
        } else {
            minority_B_no.setSelected(true);
        }
        ToggleGroup tg8 = new ToggleGroup();
        tg8.getToggles().addAll(limited_english_B, limited_english_B_no);
        if (limited_english_B.isSelected()) {
            limited_english_B_no.setSelected(false);
        } else {
            limited_english_B_no.setSelected(true);
        }
        ToggleGroup tg9 = new ToggleGroup();
        tg9.getToggles().addAll(multi_unit_housing_B, multi_unit_housing_B_no);
        if (multi_unit_housing_B.isSelected()) {
            multi_unit_housing_B_no.setSelected(false);
        } else {
            multi_unit_housing_B_no.setSelected(true);
        }
        ToggleGroup tg10 = new ToggleGroup();
        tg10.getToggles().addAll(mobile_homes_B, mobile_homes_B_no);
        if (mobile_homes_B.isSelected()) {
            mobile_homes_B_no.setSelected(false);
        } else {
            mobile_homes_B_no.setSelected(true);
        }
        ToggleGroup tg11 = new ToggleGroup();
        tg11.getToggles().addAll(crowded_housing_B, crowded_housing_B_no);
        if (crowded_housing_B.isSelected()) {
            crowded_housing_B_no.setSelected(false);
        } else {
            crowded_housing_B_no.setSelected(true);
        }

        ToggleGroup tg12 = new ToggleGroup();
        tg12.getToggles().addAll(no_vehicle_B, no_vehicle_B_no);
        if (no_vehicle_B.isSelected()) {
            no_vehicle_B_no.setSelected(false);
        } else {
            no_vehicle_B_no.setSelected(true);
        }

        // Image file grab
        File thyou = new File(this.getClass().getResource("thankyou_resized.png").getPath());

        // Uniform Resource Identitfier and its similar to a URL
        sviImage = new ImageView(thyou.toURI().toString());

        // Event handler for the submit button to display image
        
        submitDataButton.setOnAction(event -> {
            try{
            if (nameField.getText().isEmpty() || addressField.getText().isEmpty() || phoneField.getText().isEmpty()) {
                // show an alert or a message to fill all fields
            throw new Exception("User left empty fields. Please fill all fields");
            }
            if (!below_poverty_level_B.isSelected() && !unemployed_B.isSelected() && !no_highschool_diploma_B.isSelected() && !disabled_B.isSelected()
                    && !over_65_B.isSelected() && !single_parent_household_B.isSelected() && !minority_B.isSelected()
                    && !limited_english_B.isSelected() && !multi_unit_housing_B.isSelected() && !mobile_homes_B.isSelected()
                    && !crowded_housing_B.isSelected() && !no_vehicle_B.isSelected()) {
                // show an alert or a message to select at least one option
                throw new Exception("This currently at default. Ensure your answers.");
            }
        //  } catch (Exception ex) {
        //         // handle the exception by showing an alert or a message to the user
        //         ex.printStackTrace();
        //         // https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Alert.AlertType.html
        //         Alert alert = new Alert(AlertType.ERROR, "Please fill out all fields before submitting the form");
        //         alert.show();
        //     }
                // if user puts a space it will be null as well (if you trim all the spaces, and
                // there's nothing left)
                if ((nameField.getText() == null)) {
                    throw new Exception("Name is empty");
                }
                if ((nameField.getText().trim().isEmpty())) {
                    throw new Exception("There are spaces in the beginning of the name text field");
                }
                if (nameField.getText().matches(".*\\d.*")) {
                    // d stands for digit here, it's looking for a digit that's surounding by any
                    // (zero or more) characters (.*) representing
                    throw new Exception("There are numbers in your name");
                }
                if ((addressField.getText() == null)) {
                    throw new Exception("Addrress is empty");
                }
                if (addressField.getText().trim().isEmpty()) {
                    throw new Exception("There are spaces in your address");
                }
            // }  catch (Exception ex) {
            //     // handle the exception by showing an alert or a message to the user
            //     ex.printStackTrace();
            //     // https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Alert.AlertType.html
            //     Alert alert = new Alert(AlertType.ERROR, "Name and address fields cannot be empty or have extra spaces");
            //     alert.show();
            //}
                if (phoneField.getText() == null) {
                    throw new Exception("Phone number is empty");
                }
                if (phoneField.getText().trim().isEmpty()) {
                    throw new Exception("There are spaces in your phone number");
                }
                if (phoneField.getText().matches(".*[a-zA-Z]+.*")) {
                    // a-zA-Z stands for any letter, it's looking for a letter that's surounding by
                    // any (zero or more) characters (.*) representing
                    throw new Exception("There are letters in your phone number");
                }
                if (phoneField.getText().length() != 10) {
                    throw new Exception("Your phone number is not 10 digits");
                }
            // } catch (Exception e) {
            //     System.out.println("Error: " + e.getMessage());
            // }
                if (addressField.getText() == null) {
                    throw new Exception("Address is empty");
                }
                Stage stage = new Stage();

            Scene scene = new Scene(new Group(sviImage));
            stage.setScene(scene);
            stage.show();

            System.out.println("The following data has been stored: ");

            }catch (Exception ex) {
                // handle the exception by showing an alert or a message to the user
                ex.printStackTrace();
                // https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Alert.AlertType.html
                Alert alert = new Alert(AlertType.ERROR, "Name and address fields cannot be empty or have extra spaces");
                alert.show();
            }

        
            System.out.println(nameField.getText());
            System.out.println(phoneField.getText());
            System.out.println(addressField.getText());
            System.out.println(below_poverty_level_B.isSelected());
            System.out.println(unemployed_B.isSelected());
            System.out.println(no_highschool_diploma_B.isSelected());
            System.out.println(disabled_B.isSelected());
            System.out.println(over_65_B.isSelected());
            System.out.println(single_parent_household_B.isSelected());
            System.out.println(minority_B.isSelected());
            System.out.println(limited_english_B.isSelected());
            System.out.println(multi_unit_housing_B.isSelected());
            System.out.println(mobile_homes_B.isSelected());
            System.out.println(crowded_housing_B.isSelected());
            System.out.println(no_vehicle_B.isSelected());
            
        });
    }

    // Getter and setter for SviData
    public DataSvi getSviData() {
        return svi;
    }

    public void setSviData(DataSvi sviData) {
        this.svi = svi;
    }

    // Getter and setter for nameField
    public TextField getNameField() {
        return nameField;
    }

    public void setNameField(TextField nameField) {
        this.nameField = nameField;
    }

    // Getter and setter for addressField
    public TextField getAddressField() {
        return addressField;
    }

    public void setAddressField(TextField addressField) {
        this.addressField = addressField;
    }

    // Getter and setter for phoneField
    public TextField getPhoneField() {
        return phoneField;
    }

    public void setPhoneField(TextField phoneField) {
        this.phoneField = phoneField;
    }

}
