package hu.bme.mit.train.tachograph;

import com.google.common.collect.Table;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hu.bme.mit.train.interfaces.TrainTachograph;

public class TrainTachographTest {

	@Test
	public void TestTrainTachographRecording() {
		TrainTachograph trainTachograph = new TrainTachographImpl();
		trainTachograph.addRecord(2, 3);
		Assert.assertFalse(trainTachograph.getTable().isEmpty());
	}

}
