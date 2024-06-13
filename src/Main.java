public class Main {
    public static void main(String[] args) {
        Banco santander= new Banco();
        santander.setNome("Santander");

        Cliente anderson= new Cliente(santander,"Anderson");
        //santander.adicionarContas(anderson);

        Conta cc= new ContaCorrente(anderson);
        Conta cp= new ContaPoupanca(anderson);

        cc.depositar(100);
		cc.transferir(cp, 100);
		
        santander.listaDeClientes();
        System.out.println("Cabou");
		/* cc.extrato();
		cp.extrato(); */
        

        
    }
}
