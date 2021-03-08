package hu.bme.mit.train.tachograph;

import hu.bme.mit.train.interfaces.TrainTachograph;
import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;
import java.time.LocalDate;

public class TrainTachographImpl implements TrainTachograph {

    Table<LocalDate, Integer, Integer> table = HashBasedTable.create();

    @Override
    public void addRecord(int joystickPosition, int referenceSpeed) {
        table.put(LocalDate.now(), joystickPosition, referenceSpeed);
    }

    @Override
    public Table<LocalDate, Integer, Integer> getTable() {
        return table;
    }

}
