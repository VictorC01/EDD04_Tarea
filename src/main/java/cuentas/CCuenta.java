package cuentas;
/**
 * Es la clase en la que se definen los objetos tipo CCuenta
 * @author Victor
 */
public class CCuenta {
    /**
     * Atributos del objeto CCuenta (ahora encapsulados)
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Método constructor vacío
     */
    public CCuenta()
    {
    }

    /**
     * Método constructor con datos a guardar
     * @param nom nombre de titular
     * @param cue identificador de cuenta
     * @param sal saldo inicial de la cuenta
     * @param tipo el tipo de cuenta
    */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return getSaldo();
    }
    

    /**
     * Método para ingresar dinero
     * @param cantidad a aumentar el saldo
     * @throws Exception si cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método para retirar dinero de la cuenta
     * @param cantidad a restar de saldo
     * @throws Exception si cantidad es negativa
     */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
