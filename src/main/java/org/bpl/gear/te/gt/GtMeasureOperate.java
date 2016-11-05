package org.bpl.gear.te.gt;

import org.bpl.gear.base.gear.spur.SpurGear;
import org.bpl.gear.te.error.spur.SpurGearError;
import org.bpl.gear.te.utility.FileOperate;

import java.io.IOException;
import java.util.List;

/**
 * The type GT测量结果处理类.
 *
 * @description
 * @create 2016 -11-03 下午9:03
 * @email gxz04220427 @163.com
 */
public class GtMeasureOperate {
    /**
     * Convert measure gt measure.
     *
     * @param leftPath   the left path
     * @param rightPath  the right path
     * @param drivingNo  the driving no
     * @param drivedNo   the drived no
     * @param drivinGear the drivin gear
     * @param drivedGear the drived gear
     * @param leftError  the left error
     * @param rightError the right error
     * @param load       the load
     * @param rpm        the rpm
     *
     * @return the gt measure
     */
    public GtMeasure ConvertMeasure(String leftPath, String rightPath, String drivingNo, String drivedNo, SpurGear drivinGear, SpurGear drivedGear, SpurGearError leftError, SpurGearError rightError,double load, double rpm) throws IOException {
        GtMeasure gtMeasure = new GtMeasure();
        FileOperate fileOperate = new FileOperate();
        List<Double> leftDatas = fileOperate.readFileLines(leftPath);
        List<Double> rightDatas = fileOperate.readFileLines(rightPath);
        gtMeasure.setDrivedGear(drivedGear).setDrivedGearNo(drivedNo).setDrivinGear(drivinGear).setDrivingGearNo(drivingNo).setLeftDatas(leftDatas).setLoad(load).setLeftError(leftError).setRightDatas(rightDatas).setRightError(rightError).setRpm(rpm);
        return gtMeasure;
    }
}
