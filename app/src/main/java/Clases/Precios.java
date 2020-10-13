package Clases;

public class Precios
{
   private int precioFarenheith;
   private int precioRevival;
   private int precioAlquimista;

   public Precios()
   {
       precioFarenheith = 5000;
       precioRevival = 12000;
       precioAlquimista = 45000;
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
        return precioAlquimista;
    }

    public void setPrecioFarenheith(int precioFarenheith)
    {
        this.precioFarenheith = precioFarenheith;
    }

    public void setPrecioRevival(int precioRevival)
    {
        this.precioRevival = precioRevival;
    }

    public void setPrecioAlquimista(int precioAlquimista)
    {
        this.precioAlquimista = precioAlquimista;
    }

}
