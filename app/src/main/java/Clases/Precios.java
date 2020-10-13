package Clases;

public class Precios
{
   private int precioFarenheith;
   private int precioRevival;
   private int precioElAlquimista;
   private int precioElPoder;
   private int precioDespertar;

   public Precios()
   {
       precioFarenheith = 5000;
       precioRevival = 12000;
       precioElAlquimista = 45000;
       precioElPoder = 88000;
       precioDespertar = 156000;
   }

    public int getPrecioFarenheith()
    {
        return precioFarenheith;
    }

    public int getPrecioRevival()
    {
        return precioRevival;
    }

    public int getPrecioAlquimista()
    {
        return precioElAlquimista;
    }

    public int getPrecioElPoder()
    {
        return precioElPoder;
    }

    public int getPrecioDespertar()
    {
        return precioDespertar;
    }

    public void setPrecioFarenheith(int precioFarenheith)
    {
        this.precioFarenheith = precioFarenheith;
    }

    public void setPrecioRevival(int precioRevival)
    {
        this.precioRevival = precioRevival;
    }

    public void setPrecioAlquimista(int precioElAlquimista)
    {
        this.precioElAlquimista = precioElAlquimista;
    }

    public void setPrecioElPoder(int precioElPoder)
    {
        this.precioElPoder = precioElPoder;
    }

    public void setPrecioDespertar(int precioDespertar)
    {
        this.precioDespertar = precioDespertar;
    }

}
