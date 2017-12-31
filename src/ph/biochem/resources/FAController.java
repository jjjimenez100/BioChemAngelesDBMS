package ph.biochem.resources;

import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import ph.biochem.modules.DataHolder;

public class FAController {
    public String color, consistency, grossOther, occultBlood, pusCells, FARBC, microscopicOther, FARemarks;

    @FXML
    public JFXTextField inputColor, inputConsistency, inputGrossOther, inputOccult, inputPus, inputRBC, inputMicroscopicOther;

    @FXML
    public TextArea inputFARemarks;

    @FXML
    public Button btnSave, btnClose;

    public void initialize(){
        setValues();
    }

    private void setValues(){
        inputColor.setText(DataHolder.color);
        inputConsistency.setText(DataHolder.consistency);
        inputGrossOther.setText(DataHolder.grossOther);
        inputOccult.setText(DataHolder.occultBlood);
        inputPus.setText(DataHolder.pusCells);
        inputRBC.setText(DataHolder.FARBC);
        inputMicroscopicOther.setText(DataHolder.microscopicOther);
        inputFARemarks.setText(DataHolder.FARemarks);
    }

    private void resetValues(){
        DataHolder.color=DataHolder.consistency=DataHolder.grossOther=DataHolder.occultBlood=DataHolder.pusCells=DataHolder.FARBC=
        DataHolder.microscopicOther=DataHolder.FARemarks="";
    }

    public void onClickBtnSave(){
        color = inputColor.getText();
        consistency = inputConsistency.getText();
        grossOther = inputGrossOther.getText();
        occultBlood = inputOccult.getText();
        pusCells = inputPus.getText();
        FARBC = inputRBC.getText();
        microscopicOther = inputMicroscopicOther.getText();
        FARemarks = inputFARemarks.getText();
        onClose();
    }

    public void onClose(){
        resetValues();
        Stage FAForm = (Stage) btnClose.getScene().getWindow();
        FAForm.close();
    }
}
