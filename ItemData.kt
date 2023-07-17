class ItemData(var originalValue: Any) {
    val type: String?
        get() = when (originalValue) {
            is String -> "cadena"
            is Int -> "entero"
            is Boolean -> "booleano"
            else -> null
        }

    val info: String?
        get() = when (type) {
            "cadena" -> {
                val cadena = originalValue as String
                "L${cadena.length}"
            }
            "entero" -> {
                val valorEntero = originalValue as Int
                when {
                    valorEntero % 10 == 0 -> "M10"
                    valorEntero % 5 == 0 -> "M5"
                    valorEntero % 2 == 0 -> "M2"
                    else -> null
                }
            }
            "booleano" -> {
                val valorBooleano = originalValue as Boolean
                if (valorBooleano) "Verdadero" else "Falso"
            }
            else -> null
        }
}
