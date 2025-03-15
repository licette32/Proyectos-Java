package bytebank;

public class CrearCuenta {
    public static void main(String[] args) {
        // Creación de la primera cuenta
        Cuenta primeraCuenta = new Cuenta();
        
        // Asignación de saldo inicial a la primera cuenta
        primeraCuenta.saldo = 200;
        System.out.println(primeraCuenta.saldo); // Imprime el saldo: 200

        // Se incrementa el saldo en 100
        primeraCuenta.saldo += 100;
        System.out.println(primeraCuenta.saldo); // Imprime el saldo: 300

        // Creación de la segunda cuenta
        Cuenta segundaCuenta = new Cuenta();
        
        // Asignación de saldo inicial a la segunda cuenta
        segundaCuenta.saldo = 50;

        // Impresión de los saldos de ambas cuentas
        System.out.println("primera Cuenta tiene " + primeraCuenta.saldo); // 300
        System.out.println("segunda Cuenta tiene " + segundaCuenta.saldo); // 50

        // Imprime los valores de la agencia y el número de cuenta de la primera cuenta
        System.out.println(primeraCuenta.agencia); // Depende del valor por defecto de la clase Cuenta
        System.out.println(primeraCuenta.numero);  // Depende del valor por defecto de la clase Cuenta

        // Imprime el número de agencia de la segunda cuenta
        System.out.println(segundaCuenta.agencia); // Depende del valor por defecto

        // Se cambia la agencia de la segunda cuenta
        segundaCuenta.agencia = 146;
        System.out.println("Ahora la segunda cuenta esta en la agencia " + segundaCuenta.agencia);

        // Comparación de referencias entre las dos cuentas
        if(primeraCuenta == segundaCuenta) {
            System.out.println("misma cuenta");
        } else {
            System.out.println("cuentas diferentes"); // Se imprimirá esto porque son objetos distintos
        }

        // Imprime las referencias de memoria de los objetos
        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
    }
}
