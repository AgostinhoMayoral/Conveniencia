/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.classes;

import br.com.hibernate.mapping.RelatorioDeAcesso;
import br.com.hibernate.mapping.HistoricoVendas;
import br.com.hibernate.mapping.CadastroUsuario;
import br.com.hibernate.mapping.CadastroRetiradaProduto;
import br.com.hibernate.mapping.CadastroEntradaProduto;
import br.com.hibernate.mapping.CadastroAdministrador;
import br.com.hibernate.mapping.CadastroProduto;
import br.com.hibernate.mapping.NewHibernateUtil;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author tinho
 */
public class ConexoesBanco {

    public List<CadastroAdministrador> listaCadastroAdministrador() {
        Session bancoConveniencia = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = bancoConveniencia.beginTransaction();

        SQLQuery consultaCadastroAdm = bancoConveniencia.createSQLQuery("select * from cadastro_administrador");
        consultaCadastroAdm.addEntity(CadastroAdministrador.class);
        List<CadastroAdministrador> listaCadastroAdm = (List<CadastroAdministrador>) consultaCadastroAdm.list();

        t.commit();
        bancoConveniencia.close();

        return listaCadastroAdm;
    }

    public List<CadastroProduto> listaCadastroProduto() {
        Session bancoConveniencia = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = bancoConveniencia.beginTransaction();

        SQLQuery consultaCadastroProduto = bancoConveniencia.createSQLQuery("select * from cadastro_produto");
        consultaCadastroProduto.addEntity(CadastroProduto.class);
        List<CadastroProduto> listaCadastroProduto = (List<CadastroProduto>) consultaCadastroProduto.list();

        t.commit();
        bancoConveniencia.close();
        return listaCadastroProduto;
    }

    public List<CadastroEntradaProduto> listaCadastroEntradaProduto() {
        Session bancoConveniencia = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = bancoConveniencia.beginTransaction();

        SQLQuery consultaCadastroEntradaProduto = bancoConveniencia.createSQLQuery("select * from cadastro_entrada_produto");
        consultaCadastroEntradaProduto.addEntity(CadastroAdministrador.class);
        List<CadastroEntradaProduto> listaCadastroEntradaProduto = (List<CadastroEntradaProduto>) consultaCadastroEntradaProduto.list();

        t.commit();
        bancoConveniencia.close();

        return listaCadastroEntradaProduto;
    }

    public List<CadastroRetiradaProduto> listaCadastroRetiradaProduto() {
        Session bancoConveniencia = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = bancoConveniencia.beginTransaction();

        SQLQuery consultaCadastroRetiradaProduto = bancoConveniencia.createSQLQuery("select * from cadastro_retirada_produto");
        consultaCadastroRetiradaProduto.addEntity(CadastroRetiradaProduto.class);
        List<CadastroRetiradaProduto> listaCadastroRetiradaProduto = (List<CadastroRetiradaProduto>) consultaCadastroRetiradaProduto.list();

        t.commit();
        bancoConveniencia.close();

        return listaCadastroRetiradaProduto;
    }

    public List<CadastroUsuario> listaCadastroUsuario() {
        Session bancoConveniencia = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = bancoConveniencia.beginTransaction();

        SQLQuery consultaCadastroUsuario = bancoConveniencia.createSQLQuery("select * from cadastro_usuario");
        consultaCadastroUsuario.addEntity(CadastroUsuario.class);
        List<CadastroUsuario> listaCadastroUsuario = (List<CadastroUsuario>) consultaCadastroUsuario.list();

        t.commit();
        bancoConveniencia.close();

        return listaCadastroUsuario;
    }

    public List<HistoricoVendas> listaHistoricoVendas(String nomeDaTabelaNoBanco) {
        Session bancoConveniencia = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = bancoConveniencia.beginTransaction();

        SQLQuery consultaCadastroHistoricoVendas = bancoConveniencia.createSQLQuery("select * from historico_vendas");
        consultaCadastroHistoricoVendas.addEntity(HistoricoVendas.class);
        List<HistoricoVendas> listaCadastroHistoricoVendas = (List<HistoricoVendas>) consultaCadastroHistoricoVendas.list();

        t.commit();
        bancoConveniencia.close();

        return listaCadastroHistoricoVendas;
    }

    public List<RelatorioDeAcesso> listaRelatorioDeAcesso(String nomeDaTabelaNoBanco) {
        Session bancoConveniencia = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = bancoConveniencia.beginTransaction();

        SQLQuery consultaCadastroRelatorioAcesso = bancoConveniencia.createSQLQuery("select * from relatorio_de_acesso");
        consultaCadastroRelatorioAcesso.addEntity(RelatorioDeAcesso.class);
        List<RelatorioDeAcesso> listaCadastroRelatorioAcesso = (List<RelatorioDeAcesso>) consultaCadastroRelatorioAcesso.list();

        t.commit();
        bancoConveniencia.close();

        return listaCadastroRelatorioAcesso;
    }

}
