public class CuentaBancaria implements Mesurable
{
    private int saldo;
    public CuentaBancaria(int saldo1)
    {
        saldo=saldo1;
    }
    public int regresaSaldo()
    {
        return saldo;
    }
    public float getMeasure()
    {
        return saldo;
    }

}
