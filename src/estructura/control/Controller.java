package estructura.control;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import estructura.sort.Binary;
import estructura.sort.Merge;

public class Controller {

    @FXML
    private TextField txtAlphabet;
    @FXML
    private Label comparisonsMerge;
    @FXML
    private Label comparisonBinary;
    @FXML
    private Label labelOutput;


    @FXML
    private void handleSort(){
        String alphabet = txtAlphabet.getText().trim();
        alphabet = alphabet.replaceAll("[, ]", "");
        StringBuilder sortString1 = new StringBuilder(alphabet);
        Binary binarySolution = new Binary(sortString1, sortString1.length());
        StringBuilder sortString2 = new StringBuilder(alphabet);
        Merge mergeSolution = new Merge(sortString2, sortString2.length());

        labelOutput.setText(String.valueOf(mergeSolution.getAlphabet()));
        comparisonBinary.setText(Integer.toString(binarySolution.getComp()));
        comparisonsMerge.setText(Integer.toString(mergeSolution.getComp()));

    }
}
