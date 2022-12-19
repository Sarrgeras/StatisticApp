package com.example.stackapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class LangController implements Initializable {

    @FXML
    private BarChart<String, Number> barChart;

    @FXML
    private RadioButton cPlusRButton;

    @FXML
    private Button endButton;

    @FXML
    private RadioButton jScriptRButton;

    @FXML
    private RadioButton javaRButton;

    @FXML
    private Button nextButton;

    @FXML
    private RadioButton phpRButton;

    @FXML
    private RadioButton sharpRButton;

    @FXML
    private RadioButton tScriptRButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ToggleGroup tg = new ToggleGroup();
        javaRButton.setToggleGroup(tg);
        sharpRButton.setToggleGroup(tg);
        tScriptRButton.setToggleGroup(tg);
        jScriptRButton.setToggleGroup(tg);
        phpRButton.setToggleGroup(tg);
        cPlusRButton.setToggleGroup(tg);

        endButton.setOnAction(ActionEvent ->{
            Stage stage = (Stage) endButton.getScene().getWindow();
            stage.hide();
        });

        nextButton.setOnAction(ActionEvent -> {


            if (sharpRButton.isSelected()) {

                CategoryAxis xAxis = new CategoryAxis();
                xAxis.setLabel("Programming language");

                NumberAxis yAxis = new NumberAxis();
                yAxis.setLabel("Percent");

                XYChart.Series<String, Number> dataSeries = new XYChart.Series<>();

                XYChart.Series<String, Number> dataSeriesLang = new XYChart.Series<>();

                dataSeriesLang.setName("C#");
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2022", 25.4));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2021", 20.9));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2020", 23.8));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2019", 17.1));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2018", 16.4));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2017", 16.7));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2016", 16.3));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2015", 15));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2014", 14.7));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2013", 14.7));

                barChart.getData().add(dataSeriesLang);
            } else if (tScriptRButton.isSelected()) {

                CategoryAxis xAxis = new CategoryAxis();
                xAxis.setLabel("Programming language");

                NumberAxis yAxis = new NumberAxis();
                yAxis.setLabel("Percent");

                XYChart.Series<String, Number> dataSeries = new XYChart.Series<>();

                XYChart.Series<String, Number> dataSeriesLang = new XYChart.Series<>();

                dataSeriesLang.setName("TypeScript");
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2022", 25.4));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2021", 20.9));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2020", 15.8));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2019", 12.1));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2018", 12.4));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2017", 12.7));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2016", 12.3));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2015", 10));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2014", 9.7));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2013", 8.7));

                barChart.getData().add(dataSeriesLang);
            } else if (javaRButton.isSelected()) {

                CategoryAxis xAxis = new CategoryAxis();
                xAxis.setLabel("Programming language");

                NumberAxis yAxis = new NumberAxis();
                yAxis.setLabel("Percent");

                XYChart.Series<String, Number> dataSeries = new XYChart.Series<>();

                XYChart.Series<String, Number> dataSeriesLang = new XYChart.Series<>();

                dataSeries.setName("Java");
                dataSeries.getData().add(new XYChart.Data<String, Number>("2022", 29.4));
                dataSeries.getData().add(new XYChart.Data<String, Number>("2021", 27.9));
                dataSeries.getData().add(new XYChart.Data<String, Number>("2020", 27.8));
                dataSeries.getData().add(new XYChart.Data<String, Number>("2019", 23.1));
                dataSeries.getData().add(new XYChart.Data<String, Number>("2018", 24.4));
                dataSeries.getData().add(new XYChart.Data<String, Number>("2017", 23.7));
                dataSeries.getData().add(new XYChart.Data<String, Number>("2016", 23.3));
                dataSeries.getData().add(new XYChart.Data<String, Number>("2015", 23));
                dataSeries.getData().add(new XYChart.Data<String, Number>("2014", 22.7));
                dataSeries.getData().add(new XYChart.Data<String, Number>("2013", 19.7));

                barChart.getData().add(dataSeries);
            } else if (jScriptRButton.isSelected()) {

                CategoryAxis xAxis = new CategoryAxis();
                xAxis.setLabel("Programming language");

                NumberAxis yAxis = new NumberAxis();
                yAxis.setLabel("Percent");

                XYChart.Series<String, Number> dataSeries = new XYChart.Series<>();

                XYChart.Series<String, Number> dataSeriesLang = new XYChart.Series<>();

                dataSeriesLang.setName("JavaScript");
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2022", 27.4));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2021", 27.9));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2020", 26.8));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2019", 26.1));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2018", 26.4));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2017", 26.7));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2016", 26.3));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2015", 25));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2014", 24.7));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2013", 24.7));

                barChart.getData().add(dataSeriesLang);
            } else if (phpRButton.isSelected()) {

                CategoryAxis xAxis = new CategoryAxis();
                xAxis.setLabel("Programming language");

                NumberAxis yAxis = new NumberAxis();
                yAxis.setLabel("Percent");

                XYChart.Series<String, Number> dataSeries = new XYChart.Series<>();

                XYChart.Series<String, Number> dataSeriesLang = new XYChart.Series<>();

                dataSeriesLang.setName("PHP");
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2022", 15.4));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2021", 15.9));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2020", 15.8));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2019", 15.1));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2018", 16.4));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2017", 16.7));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2016", 16.3));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2015", 17));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2014", 17.7));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2013", 17.7));

                barChart.getData().add(dataSeriesLang);
            } else if (cPlusRButton.isSelected()) {

                CategoryAxis xAxis = new CategoryAxis();
                xAxis.setLabel("Programming language");

                NumberAxis yAxis = new NumberAxis();
                yAxis.setLabel("Percent");

                XYChart.Series<String, Number> dataSeries = new XYChart.Series<>();

                XYChart.Series<String, Number> dataSeriesLang = new XYChart.Series<>();


                dataSeriesLang.setName("C#");
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2022", 9.4));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2021", 9.9));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2020", 9.8));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2019", 10.1));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2018", 11.4));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2017", 12.7));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2016", 13.3));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2015", 13));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2014", 14.7));
                dataSeriesLang.getData().add(new XYChart.Data<String, Number>("2013", 14.7));

                barChart.getData().add(dataSeriesLang);
            }

            barChart.setTitle("Programming language");
        });
    }
}
