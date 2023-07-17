public class ItemDataJ {
    Object originalValue;

    public ItemDataJ(Object originalValue){
        this.originalValue = originalValue;
    }

    public String getType(){
        if (originalValue instanceof String) {
            return "cadena";
        } else if (originalValue instanceof Integer) {
            return "entero";
        } else if (originalValue instanceof Boolean){
            return "booleano";
        } else {
            return null;
        }
    }

    public String getInfo(){
        if (getType() == "cadena") {
            String cadena = (String) originalValue;
            int longitud = cadena.length();
            return "L" + longitud;
        } else if (getType() == "entero") {
            if ((Integer) originalValue % 10 == 0) {
                return "M10";
            } else if ((Integer) originalValue % 5 == 0) {
                return "M5";
            } else if ((Integer) originalValue % 2 == 0) {
                return "M2";
            } else {
                return null;
            }
        } else if (getType() == "booleano") {
            if (originalValue instanceof Boolean) {
                if ((Boolean) originalValue) {
                    return "Verdadero";
                } else {
                    return "Falso";
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}