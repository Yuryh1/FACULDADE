 package PRATICA5;

public class Funcionario {

	 private String nome, departamento,banco,rg;
	    private double salario;
	    private boolean statusFunc=true;

	    public Funcionario(String nome, String departamento, String banco, String rg, double salario) {
	        this.nome = nome;
	        this.departamento = departamento;
	        this.banco = banco;
	        this.rg = rg;
	        this.salario = salario;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getDepartamento() {
	        return departamento;
	    }

	    public void setDepartamento(String departamento) {
	        this.departamento = departamento;
	    }

	    public String getBanco() {
	        return banco;
	    }

	    public void setBanco(String banco) {
	        this.banco = banco;
	    }

	    public String getRg() {
	        return rg;
	    }

	    public void setRg(String rg) {
	        this.rg = rg;
	    }

	    public double getSalario() {
	        return salario;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
	    }

	    public boolean isStatusFun() {
	        return statusFunc;
	    }

	    public void setStatusFun(boolean statusFun) {
	        this.statusFunc = statusFun;
	    }

	    public void bonificar(double valBonificacao){
	        salario+=valBonificacao;
	    }
	    public void demitir(){
	        statusFunc=false;
	    }
	    public String mostrarDados(){
	        String statusFun;
	        if (isStatusFun() == true){
	            statusFun = "Na empresa";
	        }else {
	            statusFun = "Contrato Encerrado";
	        }
	        return " Nome: "+getNome()+"\n Banco: "+getBanco()+"\n Departamento: "+getDepartamento()+
	                "\n RG: "+getRg()+"\n Salario: "+getSalario()+"\n Situação do Funcionario: "
	                +statusFun+"\n ===========================";
	    }
	}
