
package projeto4;

public class Projeto4 {


    public static void main(String[] args)
    {
        Faturamento sp = new Faturamento("SP",67836.43f);
        Faturamento rj = new Faturamento("RJ",36678.66f);
        Faturamento mg = new Faturamento("MG",29229.88f);
        Faturamento es = new Faturamento("ES",27165.48f);
        Faturamento outros = new Faturamento("Outros",19849.53f);
        
        sp.CalcularPorcentagem(sp, rj, mg, es, outros);
    }
    
}
