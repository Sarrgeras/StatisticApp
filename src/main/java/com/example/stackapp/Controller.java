package com.example.stackapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private BarChart<String, Number> barChart;

    @FXML
    private Button aboutProgram;

    @FXML
    private Button langStatButton;

    @FXML
    private PieChart pieChart;

    @FXML
    private Button statButton;

    @FXML
    void initialize(){
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Programming language");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Percent");

        XYChart.Series<String, Number> dataSeries = new XYChart.Series<>();

        statButton.setOnAction(ActionEvent ->{


            dataSeries.setName("2022");
            dataSeries.getData().add(new XYChart.Data<String, Number>("Java", 29.4));
            dataSeries.getData().add(new XYChart.Data<String, Number>("PHP", 17.9));
            dataSeries.getData().add(new XYChart.Data<String, Number>("C#", 17.8));
            dataSeries.getData().add(new XYChart.Data<String, Number>("Python", 13.1));
            dataSeries.getData().add(new XYChart.Data<String, Number>("Go", 4.4));
            dataSeries.getData().add(new XYChart.Data<String, Number>("Ruby", 3.7));
            dataSeries.getData().add(new XYChart.Data<String, Number>("TypeScript", 3.3));
            dataSeries.getData().add(new XYChart.Data<String, Number>("JavaScript", 3));
            dataSeries.getData().add(new XYChart.Data<String, Number>("C++", 2.7));
            dataSeries.getData().add(new XYChart.Data<String, Number>("Scala", 1.7));



            barChart.getData().add(dataSeries);

            barChart.setTitle("Programming language on Back-end");

            PieChart.Data sliceBackEnd = new PieChart.Data("Back-End", 39.8);
            PieChart.Data sliceFullStack = new PieChart.Data("FullStack", 22);
            PieChart.Data sliceFrontEnd = new PieChart.Data("Front-End", 19.2);
            PieChart.Data sliceMobile = new PieChart.Data("Mobile", 9.3);
            PieChart.Data sliceDataDev = new PieChart.Data("DataDev", 5.3);
            PieChart.Data sliceDevOps = new PieChart.Data("DevOps", 2.1);

            pieChart.getData().add(sliceBackEnd);
            pieChart.getData().add(sliceFullStack);
            pieChart.getData().add(sliceFrontEnd);
            pieChart.getData().add(sliceMobile);
            pieChart.getData().add(sliceDataDev);
            pieChart.getData().add(sliceDevOps);
        });

        aboutProgram.setOnAction(actionEvent -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Разработчик");
            alert.setHeaderText(null);
            alert.setContentText("Разработали студенты БНТУ, группы 10702221" +
                    '\n' + "Млинников Владислав Вячеславович" +
                    '\n' + "Левшунов Илья Сергеевич" +
                    '\n' + "GitHub: https://github.com/Sarrgeras");

            alert.showAndWait();
        });

        langStatButton.setOnAction(ActionEvent ->{
            Stage stage = new Stage();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("langSample.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            stage.setTitle("Выбор языка");
            stage.setScene(new Scene(root, 1020, 620));

            stage.show();
        });
    }

}
