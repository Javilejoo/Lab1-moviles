fun main(args: Array<String>) {
    val listaPerfiles: ArrayList<PerfilUsuario> = ArrayList()


    listaPerfiles.add(PerfilUsuario().apply {
        ID = 1
        Nombres = "Javier"
        Apellidos = "Prado"
        Edad = 21
        Correo = "javilejo02@gmail.com"
        Biografia = "21 savage years"
        estado = PerfilUsuario.Estados.ACTIVO
    })

    listaPerfiles.add(PerfilUsuario().apply {
        ID = 2
        Nombres = "Bryan"
        Apellidos = "España"
        Edad = 20
        Correo = "bryan2@gmail.com"
        estado = PerfilUsuario.Estados.ACTIVO
        Hobbies.add(Hobby("programar", "programo", "www.mifoto.com"))
    })

    //funcion crear perfil
    fun crearPerfil(): PerfilUsuario {
        val perfil = PerfilUsuario()

        print("Ingrese el ID del perfil: ")
        perfil.ID = readLine()?.toIntOrNull() ?: 0

        print("Ingrese los nombres del usuario: ")
        perfil.Nombres = readLine() ?: ""

        print("Ingrese los apellidos del usuario: ")
        perfil.Apellidos = readLine() ?: ""

        print("Ingrese la URL de la foto de perfil (deje vacío para no asignar foto): ")
        val urlPhotoInput = readLine()
        perfil.UrlPhoto = if (urlPhotoInput.isNullOrBlank()) null else urlPhotoInput

        print("Ingrese la edad del usuario: ")
        perfil.Edad = readLine()?.toIntOrNull() ?: 0

        print("Ingrese el correo del usuario: ")
        perfil.Correo = readLine() ?: ""

        print("Ingrese la biografía del usuario (deje vacío para no asignar biografía): ")
        val biografiaInput = readLine()
        perfil.Biografia = if (biografiaInput.isNullOrBlank()) null else biografiaInput

        return perfil
    }

    fun imprimirPerfilesCreados(listaPerfiles: List<PerfilUsuario>) {
        println("--- Lista de Perfiles ---")
        listaPerfiles.forEachIndexed { index, perfil ->
            println("Perfil $index:")
            println("ID: ${perfil.ID}")
            println("Nombres: ${perfil.Nombres}")
            println("Apellidos: ${perfil.Apellidos}")
            println("URL de la foto: ${perfil.UrlPhoto ?: "No asignado"}")
            println("Edad: ${perfil.Edad}")
            println("Correo: ${perfil.Correo}")
            println("Biografía: ${perfil.Biografia ?: "No asignada"}")
            println("Hobbies:")
            perfil.Hobbies.forEachIndexed { hobbyIndex, hobby ->
                println("  Hobby $hobbyIndex:")
                println("    Título: ${hobby.Titulo}")
                println("    Descripción: ${hobby.Descripcion}")
                println("    URL de la foto: ${hobby.UrlPhoto ?: "No asignado"}")
            }
            println("----------------------")
        }
    }

    fun buscarPerfil(listaPerfiles: List<PerfilUsuario>, id: Int? = null, nombres: String? = null, apellidos: String? = null) {
        var perfilEncontrado = false

        listaPerfiles.forEach { perfil ->
            if ((id == null || perfil.ID == id) &&
                (nombres == null || perfil.Nombres.equals(nombres, ignoreCase = true)) &&
                (apellidos == null || perfil.Apellidos.equals(apellidos, ignoreCase = true))
            ) {
                println("--- Perfil Encontrado ---")
                println("ID: ${perfil.ID}")
                println("Nombres: ${perfil.Nombres}")
                println("Apellidos: ${perfil.Apellidos}")
                println("URL de la foto: ${perfil.UrlPhoto ?: "No asignado"}")
                println("Edad: ${perfil.Edad}")
                println("Correo: ${perfil.Correo}")
                println("Biografía: ${perfil.Biografia ?: "No asignada"}")

                if (perfil.Hobbies.isNotEmpty()) {
                    println("Hobbies:")
                    perfil.Hobbies.forEachIndexed { index, hobby ->
                        println("  Hobby $index:")
                        println("    Título: ${hobby.Titulo}")
                        println("    Descripción: ${hobby.Descripcion}")
                        println("    URL de la foto: ${hobby.UrlPhoto ?: "No asignado"}")
                    }
                } else {
                    println("No tiene hobbies asignados.")
                }

                perfilEncontrado = true
            }
        }

        if (!perfilEncontrado) {
            println("No se encontró ningún perfil con la información ingresada.")
        }
    }



    var opcion: Int

    do {
        // Mostrar el menú
        println("\n--- MENÚ ---")
        println("1. Crear Perfil")
        println("2. buscar Perfil")
        println("3. Opción 3")
        println("4. Salir")
        print("Ingrese la opción deseada: ")


        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                println("Crear Perfil")
                listaPerfiles.add(crearPerfil())
                imprimirPerfilesCreados(listaPerfiles)
            }
            2 -> {
                println("Buscar Usuario")

                // Submenu para ubcar
                println("¿En base a qué desea buscar al usuario?")
                println("1. ID")
                println("2. Nombres")
                println("3. Apellidos")
                print("Ingrese la opción deseada: ")
                val opcionBusqueda = readLine()?.toIntOrNull() ?: 0

                // Pedir datos para buscar
                val idInput: Int?
                val nombresInput: String?
                val apellidosInput: String?
                when (opcionBusqueda) {
                    1 -> {
                        print("Ingrese el ID del perfil: ")
                        idInput = readLine()?.toIntOrNull()
                        nombresInput = null
                        apellidosInput = null
                    }
                    2 -> {
                        print("Ingrese los nombres del usuario: ")
                        idInput = null
                        nombresInput = readLine()
                        apellidosInput = null
                    }
                    3 -> {
                        print("Ingrese los apellidos del usuario: ")
                        idInput = null
                        nombresInput = null
                        apellidosInput = readLine()
                    }
                    else -> {
                        println("Opcion no vAlida. No se realizara la busqueda.")
                        idInput = null
                        nombresInput = null
                        apellidosInput = null
                    }
                }

                // Llamar a la función buscarPerfil con los datos de búsqueda
                buscarPerfil(listaPerfiles, idInput, nombresInput, apellidosInput)
            }
            3 -> {
                println("Seleccionaste la Opción 3.")
                // Agrega aquí la lógica de la Opción 3
            }
            4 -> println("¡Hasta luego!")
            else -> println("Opción no válida. Intente nuevamente.")
        }
    } while (opcion != 4)


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}