public class Telefone {
    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Telefone other = (Telefone) obj;
        if (codigoArea == null){
            if (other.codigoArea != null)
                return false;
        } else if (!codigoArea.equals(other.codigoArea))
            return false;
        if (numero == null){
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        return true;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 7;
        result = prime * result + ((codigoArea == null) ? 0 : codigoArea.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "(" + codigoArea + ") " + numero;
    }
}