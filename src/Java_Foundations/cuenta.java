public class Cuenta { 


private int numeroDeCuenta; 
private Double saldo; 


//crear la funcion depositar y retirar aca 
public void depositar(Double cantidadDinero){ 
this.saldo = this.saldo+cantidadDinero; 
} 


public void retirar(Double cantidadDinero){ 
if(this.saldo>=cantidadDinero){ 
this.saldo = this.saldo-cantidadDinero; 
} 
} 


public Double getSaldo() { 
return this.saldo; 
} //no tocar esta funcion public void setSaldo(Double saldo) { this.saldo = saldo; } 
} 
