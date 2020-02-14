package com.apirest.efi.controllers;

import java.util.List;

import com.apirest.efi.models.entity.Usuarios;
import com.apirest.efi.models.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/efi/")
public class UsuariosController {

   @Autowired
  private UsuarioService usuarioService;
   
    @Autowired
    private PasswordEncoder passwordEncoder;




  @GetMapping("usuarios")
  public List<Usuarios> findAll() {
    return usuarioService.findAll();
  }

  @GetMapping("usuarios/{id}")
  public Usuarios findById(@PathVariable("id") Long id) {
    return usuarioService.findById(id);
  }

  @PostMapping("usuarios")
  public Usuarios save(@RequestBody Usuarios usuarios) {
      usuarios.setPassword(passwordEncoder.encode(usuarios.getPassword()));
    return usuarioService.save(usuarios);
  }

  @PutMapping("usuarios")
  public Usuarios edit(@RequestBody Usuarios usuarios) {
    Usuarios usuariosActual = new Usuarios();
    Usuarios usuariosUpdate = new Usuarios();
    usuariosActual = usuarioService.findById(usuarios.getId());

    if (usuariosActual != null) {
      usuariosUpdate = usuarioService.save(usuarios);
    }
    return usuariosUpdate;
  }

  @PutMapping("usuarios/estado")
  public Usuarios cambiarEstado(@RequestBody Usuarios usuarios) {
    Usuarios usuariosUpdate = null;
    Usuarios usuariosActual = usuarioService.findById(usuarios.getId());

    if (usuariosActual != null) {
      if (usuarios.getEnabled() == true) {
        usuarios.setEnabled(false);
      } else {
        usuarios.setEnabled(true);
      }
      usuariosUpdate = usuarioService.save(usuarios);
    }
    return usuariosUpdate;
  }
}
