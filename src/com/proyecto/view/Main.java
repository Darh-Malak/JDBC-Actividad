package com.proyecto.view;

import com.proyecto.dao.UsuarioDAO;
import com.proyecto.model.Usuario;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();

        try {
            // 1. Probar Inserción
            System.out.println("Insertando nuevo usuario...");
            dao.insertar(new Usuario("Carlos Perez", "carlos@mail.com"));

            // 2. Probar Consulta
            System.out.println("Lista de usuarios en BD:");
            List<Usuario> lista = dao.listar();
            for (Usuario u : lista) {
                System.out.println("ID: " + u.getId() + " | Nombre: " + u.getNombre());
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
