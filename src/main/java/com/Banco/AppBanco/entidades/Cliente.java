package com.Banco.AppBanco.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clintes")
public class Cliente {


  @Id
  private  long documento;
  @Column(length =30 )
  private  String nombre;
  @Column(length = 30)
  private  String apellido;
  @Column (length = 50)
  private  String correo;
  @Column (length =15)
  private  long celular;

  public Cliente() {

  }

  public Cliente(long documento, String nombre, String apellido, String correo, long celular) {
    this.documento = documento;
    this.nombre = nombre;
    this.apellido = apellido;
    this.correo = correo;
    this.celular = celular;
  }

  public long getDocumento() {
    return documento;
  }

  public void setDocumento(long documento) {
    this.documento = documento;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public long getCelular() {
    return celular;
  }

  public void setCelular(long celular) {
    this.celular = celular;
  }
}
