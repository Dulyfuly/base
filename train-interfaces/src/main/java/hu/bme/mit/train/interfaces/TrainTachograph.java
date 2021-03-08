package hu.bme.mit.train.interfaces;

import java.time.LocalDate;
import com.google.common.collect.Table;

public interface TrainTachograph {

    void addRecord(int joystickPosition, int referenceSpeed);

    Table<LocalDate, Integer, Integer> getTable();

}