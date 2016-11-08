package org.bpl.gear.te.error;

/**
 * The type 通用齿轮误差类.
 *
 * @description
 * @create 2016 -11-03 下午8:23
 * @email gxz04220427 @163.com
 */
public abstract class GearError {
    /**
     * The 切向综合偏差.
     */
    private double fi;
    /**
     * The 一齿切向综合偏差.
     */
    private double fia;
    /**
     * The 齿距累计偏差.
     */
    private double fp;
    /**
     * The 单个齿距偏差+.
     */
    private double fpa;

    /**
     * Gets fi.
     *
     * @return the fi
     */
    public double getFi() {
        return fi;
    }

    /**
     * Sets fi.
     *
     * @param fi the fi
     *
     * @return the fi
     */
    public GearError setFi(double fi) {
        this.fi = fi;
        return this;
    }

    /**
     * Gets fia.
     *
     * @return the fia
     */
    public double getFia() {
        return fia;
    }

    /**
     * Sets fia.
     *
     * @param fia the fia
     *
     * @return the fia
     */
    public GearError setFia(double fia) {
        this.fia = fia;
        return this;
    }

    /**
     * Gets fp.
     *
     * @return the fp
     */
    public double getFp() {
        return fp;
    }

    /**
     * Sets fp.
     *
     * @param fp the fp
     *
     * @return the fp
     */
    public GearError setFp(double fp) {
        this.fp = fp;
        return this;
    }

    /**
     * Gets fpa.
     *
     * @return the fpa
     */
    public double getFpa() {
        return fpa;
    }

    /**
     * Sets fpa.
     *
     * @param fpa the fpa
     *
     * @return the fpa
     */
    public GearError setFpa(double fpa) {
        this.fpa = fpa;
        return this;
    }
}
