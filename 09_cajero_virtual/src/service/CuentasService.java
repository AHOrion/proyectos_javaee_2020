package service;

import java.util.List;

import model.Cuenta;

public interface CuentasService {
	List<Cuenta> obtenerCuentasNoCliente(int dni);
	void actualizarCuenta(int numeroCuenta, int dni);
	void ingresarPruebaGit(int numeroCuenta, int dni);
	void extraerPruebaGit3(int numeroCuenta, int dni);
	
}
