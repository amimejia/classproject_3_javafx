package edu.guilford;

import java.io.File;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class sviPane extends GridPane {
    // Questions to ask

    // svidata attribute
    private svidata svi;

    // TextFields for name, address, and phone number
    private TextField nameField;
    private TextField addressField;
    private TextField phoneField;

    // Button Attribute
    private Button submitDataButton;

    //Image Attribute
    private ImageView sviImage;

    private String question1_pov;
    private String question2_umemp;
    private String question3_no_hs;
    private String question4_dis;
    private String question5_o65;
    private String question6_singlep;
    private String question7_min;
    private String question8_leng;
    private String question9_multi;
    private String question10_mobile;
    private String question11_crowd;
    private String question12_no_veh;

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

    // private boolean below_poverty_level;
    // private boolean unemployed;
    // private boolean no_highschool_diploma;
    // private boolean disabled;
    // private boolean over_65;
    // private boolean single_parent_household;
    // private boolean minority;
    // private boolean limited_english;
    // private boolean multi_unit_housing;
    // private boolean mobile_homes;
    // private boolean crowded_housing;
    // private boolean no_vehicle;

    // Constructor
    public sviPane(svidata svi) {
        // Set the svidata attribute to the svidata object passed in
        this.svi = svi;

        // Label titleLabel = new Label("My GridPane Title");
        // titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        // GridPane.setHalignment(titleLabel, HPos.CENTER);
        // sviPane.add(titleLabel, 0, 0, 2, 1);

        nameField = new TextField();
        this.add(new Label("Name: " + svi.getName()), 0, 1);
        addressField = new TextField();
        this.add(new Label("Address: " + svi.getAddress()), 0, 2);
        phoneField = new TextField();
        this.add(new Label("Phone Number: " + svi.getPhone_number()), 0, 3);

        // instanitate the submit button
        Button submitDataButton = new Button("Submit your Information");
        this.add(submitDataButton, 5, 20);

        // Add a label to the pane
        // I think I can create a loop to add all the questions to the pane but not sure
        // how, what VSC gave me didn't seem right
        this.add(new Label("Is your household below the poverty level?" + question1_pov), 0, 4);
        this.add(new Label("Are you unemployed?" + question2_umemp), 0, 5);
        this.add(new Label("Does you have a highschool diploma?" + question3_no_hs), 0, 6);
        this.add(new Label("Are you disabled?" + question4_dis), 0, 7);
        this.add(new Label("Are you over 65?" + question5_o65), 0, 8);
        this.add(new Label("Are you a single parent household?" + question6_singlep), 0, 9);
        this.add(new Label("Are you a minority?" + question7_min), 0, 10);
        this.add(new Label("Do you have limited english?" + question8_leng), 0, 11);
        this.add(new Label("Do you live in multi unit housing?" + question9_multi), 0, 12);
        this.add(new Label("Do you live in a mobile home?" + question10_mobile), 0, 13);
        this.add(new Label("Do you live in crowded housing?" + question11_crowd), 0, 14);
        this.add(new Label("Do you have a vehicle?" + question12_no_veh), 0, 15);

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
        no_vehicle_B = new RadioButton("No Vehicle");
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
        ToggleGroup tg2 = new ToggleGroup();
        tg2.getToggles().addAll(unemployed_B, unemployed_B_no);
        ToggleGroup tg3 = new ToggleGroup();
        tg3.getToggles().addAll(no_highschool_diploma_B, no_highschool_diploma_B_no);
        ToggleGroup tg4 = new ToggleGroup();
        tg4.getToggles().addAll(disabled_B, disabled_B_no);
        ToggleGroup tg5 = new ToggleGroup();
        tg5.getToggles().addAll(over_65_B, over_65_B_no);
        ToggleGroup tg6 = new ToggleGroup();
        tg6.getToggles().addAll(single_parent_household_B, single_parent_household_B_no);
        ToggleGroup tg7 = new ToggleGroup();
        tg7.getToggles().addAll(minority_B, minority_B_no);
        ToggleGroup tg8 = new ToggleGroup();
        tg8.getToggles().addAll(limited_english_B, limited_english_B_no);
        ToggleGroup tg9 = new ToggleGroup();
        tg9.getToggles().addAll(multi_unit_housing_B, multi_unit_housing_B_no);
        ToggleGroup tg10 = new ToggleGroup();
        tg10.getToggles().addAll(mobile_homes_B, mobile_homes_B_no);
        ToggleGroup tg11 = new ToggleGroup();
        tg11.getToggles().addAll(crowded_housing_B, crowded_housing_B_no);
        ToggleGroup tg12 = new ToggleGroup();
        tg12.getToggles().addAll(no_vehicle_B, no_vehicle_B_no);

        //Image file grab
        File thyou = new File(this.getClass().getResource("thankyou_resized.png").getPath());

        // Uniform Resource Identitfier and its similar to a URL
        sviImage = new ImageView(thyou.toURI().toString());
        
        //Event handler for the submit button to display image
        submitDataButton.setOnAction(event -> {
            Stage stage = new Stage();
            Scene scene = new Scene(new Group(sviImage));
            stage.setScene(scene);
            stage.show();
        });
    }

}
