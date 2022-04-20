package construtores;

public class Usuario {
	private String usuario;
	private String user;
	private int senha;
	private int pwd;
	
	public Usuario() {
		System.out.println("*--Construtor Usuário--*");
		user = "Teste123";
		pwd = 123;
	}

	public boolean validarUsuario(String user, int pwd, String usuario, int senha) {
		System.out.println("*--Validação de Usuário--*");
		
		if ((user.equals(usuario)) && (pwd == senha)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void imprimirStatus(boolean status) {
		System.out.println("*--Imprime Status--*");
		if(status == true) {
			System.out.println("Login efetuado com susseso!!");
		}else {
			System.out.println("Tente novamente");
		}
	}
	//getSenha()
	public int obterSenha() {
		return senha;
	}
	//setSenha()
	public void alterarSenha(int senha) {
		this.senha = senha;
	}
	//getPwD
	public int obterPwD() {
		return pwd;
	}
	//setPwd
	public void alterarPwD(int pwd) {
		this.pwd = pwd;
	}
	//getUsuario()
	public String obterUsuario() {
		return usuario;
	}
	//setUsuario()
	public void alterarUsuario(String usuario) {
		this.usuario = usuario;
	}
	//getUser()
	public String obterUser() {
		return user;
	}
	//setUser()
	public void obterUser() {
		this.user = user;
	}

}

package construtores;

import java.util.Scanner;

public class TesteUsuario {
public static void main(String[] args) {
	//criando um objeto Scanner
	Scanner input = new Scanner(System.in);
	
	//criando um objeto Usuario
	Usuario user1 = new Usuario();
	
	//Entrada de dados pelo teclado
	System.out.println("Usuário: ");
	String login = input.next();
	System.out.println("Senha: ");
	int password = input.nextInt();
	
	//configurando o usuario e senha
	user1.alterarUsuario(login);
	user1.alterarSenha(password);
	
	//recebendo dados
	String user = user1.obterUser();
	int pwd = user1.obterPwD();
	String usuario = user1.obterUsuario();
	int senha = user1.obterSenha();
	
	//validando o usuario		
	boolean status = user1.validarUsuario(user, pwd, usuario,senha);
	user1.imprimirStatus(status);
	
	//imprimindo o status
	user1.imprimirStatus(status);
   }
}