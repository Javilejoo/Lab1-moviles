class PerfilUsuario {
    var ID: Int = 0
    var Nombres: String = ""
    var Apellidos: String = ""
    var UrlPhoto: String? = null
    var Edad: Int = 0
    var Correo: String = ""
    var Biografia: String? = null

    enum class Estados {
        ACTIVO,
        INACTIVO,
        PENDIENTE
    }
    var estado: Estados = Estados.PENDIENTE
    var Hobbies: ArrayList<Hobby> = ArrayList()


    fun AgregarHobby(Titulo: String, Descripcion: String, UrlPhoto: String?) {
        val hobby = Hobby(Titulo, Descripcion, UrlPhoto)
        Hobbies.add(hobby)
    }
}