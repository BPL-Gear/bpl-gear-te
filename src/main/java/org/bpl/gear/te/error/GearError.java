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
    private double fic;
    /**
     * The 一齿切向综合偏差.
     */
    private double fica;
    /**
     * The 齿距累计偏差.
     */
    private double fp;
    /**
     * The 单个齿距偏差+.
     */
    private double fptp;
    /**
     * The 单个齿距偏差-.
     */
    private double fptn;

    /**
     * Gets fic.
     *
     * @return the fic
     */
    public double getFic() {
        return fic;
    }

    /**
     * Sets fic.
     *
     * @param fic the fic
     *
     * @return the fic
     */
    public GearError setFic(double fic) {
        this.fic = fic;
        return this;
    }

    /**
     * Gets fica.
     *
     * @return the fica
     */
    public double getFica() {
        return fica;
    }

    /**
     * Sets fica.
     *
     * @param fica the fica
     *
     * @return the fica
     */
    public GearError setFica(double fica) {
        this.fica = fica;
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
     * Gets fptp.
     *
     * @return the fptp
     */
    public double getFptp() {
        return fptp;
    }

    /**
     * Sets fptp.
     *
     * @param fptp the fptp
     *
     * @return the fptp
     */
    public GearError setFptp(double fptp) {
        this.fptp = fptp;
        return this;
    }

    /**
     * Gets fptn.
     *
     * @return the fptn
     */
    public double getFptn() {
        return fptn;
    }

    /**
     * Sets fptn.
     *
     * @param fptn the fptn
     *
     * @return the fptn
     */
    public GearError setFptn(double fptn) {
        this.fptn = fptn;
        return this;
    }
}
