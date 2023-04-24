
package projeto4;


public class Faturamento
{
    private String estado;
    private Float valor;
    
    public Faturamento(String estado, Float valor)
    {
        this.estado = estado;
        this.valor = valor;
    }
    
    public void CalcularPorcentagem(Faturamento F1, Faturamento F2, Faturamento F3, Faturamento F4, Faturamento F5)
    {
        Float percentual = (F1.valor + F2.valor + F3.valor + F4.valor + F5.valor)/100;
        System.out.println("Valores percentuais:\n"+F1.estado+" = "+F1.valor/percentual+"%\n"+F2.estado+" = "+F2.valor/percentual+"%\n"+F3.estado+" = "+F3.valor/percentual+"%\n"+F4.estado+" = "+F4.valor/percentual+"%\n"+F5.estado+" = "+F5.valor/percentual+"%");
    }
}
