class Agenda {
    val contactos= mutableListOf<Contacto>()//se declara la lista y se llama a al data class Contacto

    fun agregarContactos(nombre:String, telefono:String)
    {
        val newcontacto= Contacto(nombre,telefono);
        contactos.add(newcontacto);//Se agrega otro contacto
        print("Contacto agregado\n");

    }

    fun mostrarTodosLosContactos()
    {
        if(contactos.size==0)//indica cuantos elementos tiene la lista si 0 es porque no existe
        {
            print("Contacto no encontrado\n");

        }
        else
        {
            for((i, c) in  contactos.withIndex())//Recorre la agenda si es que existen los contactos
            {
                print("${i+1}. ${c.nombre} > ${c.telefono}");
            }
            //el for (i,c) INICIA DESDE 0 hasta el numero de contactos en este caso C
        }
    }

    fun buscarContacto(nombre:String):Contacto?
    {
        return contactos.find{ it.nombre.equals(nombre)} //Find busca ul elemento que cumpla la condicion y lo devuelve
    }
    //Equals compara dos datos tipo string y ver si son iguales
}