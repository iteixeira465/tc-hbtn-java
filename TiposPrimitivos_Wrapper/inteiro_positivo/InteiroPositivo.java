public class InteiroPositivo {

    private int valor;

    public InteiroPositivo(int valor) {
        this.valor = valor;
        testInt(this.valor);
    }

    public InteiroPositivo(String valor) {
        this.valor = Integer.parseInt(valor);
        testInt(this.valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    private void testInt(Integer i) {
        try{
            if (i < 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }
    public InteiroPositivo(String valor) throws Exception{
        this.valor = Integer.valueOf(valor);
        testInt(this.valor);
    }

    public  Boolean ehPrimo(){
        if (this.valor <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(this.valor); i++) {
            if (this.valor % i == 0) {
                return false;
            }
        }
        return true;
    }
}