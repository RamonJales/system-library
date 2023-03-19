package business.entities;
import java.time.LocalDate;

import business.enums.Status;
    public class Usuario extends Pessoa {
    	
        private String login;
        private String password;
        private String numeroDeCadastro;
        private Recibo recibo;
        private boolean isAdmin;

        private Status status;
        
        public Usuario() {}
        
        public Usuario(String nome, String cpf, LocalDate idade, String endereco, String login, String password,
                       Status status, String numeroDeCadastro, Recibo recibo, boolean isAdmin) {
            super(nome, cpf, idade, endereco);
            this.login = login;
            this.password = password;
            this.status = status;
            this.numeroDeCadastro = numeroDeCadastro;
            this.recibo = recibo;
            this.isAdmin = isAdmin;
        }

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Status getStatus() {
			return status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public String getNumeroDeCadastro() {
			return numeroDeCadastro;
		}

		public void setNumeroDeCadastro(String numeroDeCadastro) {
			this.numeroDeCadastro = numeroDeCadastro;
		}
		
		public Recibo getRecibo() {
			return recibo;
		}

		public void setRecibo(Recibo recibo) {
			this.recibo = recibo;
		}

		public boolean isAdmin() {
			return isAdmin;
		}

		public void setAdmin(boolean isAdmin) {
			this.isAdmin = isAdmin;
		}

		@Override
		public String toString() {
			return "Usuario [login=" + login + ", password=" + password + ", status=" + status + ", numeroDeCadastro="
					+ numeroDeCadastro + ", isAdmin=" + isAdmin + "]";
		}

}
