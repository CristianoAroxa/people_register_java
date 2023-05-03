/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author dsm-2
 */
public class Pessoa {
    private String nome;
    private String telefone;
    private String contato;
    
    
    private Conexao conPessoa= new Conexao();
    
    public Pessoa(){
        this("","","");
}

    public Pessoa(String nome, String telefone, String contato) {
        this.nome = nome;
        this.telefone = telefone;
        this.contato = contato;
    }  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    public void Cadastrar(){
        String sql = "Insert into pessoa(Nome,Telefone,Contato) values" + "('"+getNome()+"', '"+getTelefone()+"', '" + getContato()+"')";
        conPessoa.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Cadstrado com Sucesso :)!!!");
    }
    
    public ResultSet consultar(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from pessoa";
        tabela = conPessoa.RetornarResultSet(sql);
        return tabela;
        
    }
            
    
}