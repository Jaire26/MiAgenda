fun main()
{
    val agenda= Agenda();
    var  seleccion:Int;


    do{
        println("\n 1. Agregar contacto \n 2. Mostrar contacto \n 3.Buscar contacto \n 4.Salir \n Eliga una opción: ");

        seleccion= readln().toInt();//Lee la seleccion tipo Int
        when(seleccion)
        {
            1->{println("Nombre:");
                val nombre= readln();
                println ("Telefono:");
                val telefono= readln();
                agenda.agregarContactos(nombre,telefono);//Llamando a la funcion

            }
            2-> {agenda.mostrarTodosLosContactos()}//Se llama a la funcion

            3-> { println("Buscar:")
                val nombre= readln();
                val c= agenda.buscarContacto(nombre)//Se llama a la funcion con la variable c
                if(c != null)
                {
                    println("Se encontro: ${c.nombre} >> ${c.telefono}\n");

                }
                else
                {
                    println("No existe el contacto\n");
                }
            }
            4-> {println ("Usted salió de la agenda\n")}
        }

    }while(seleccion!= 4);
}