package com.facdjunior.vidracaria.dao;

import com.facdjunior.vidracaria.domain.ItemVenda;
import com.facdjunior.vidracaria.domain.Produto;
import com.facdjunior.vidracaria.domain.Venda;
import java.math.BigDecimal;
import org.junit.Test;

/**
 *
 * @author Francisco Junior 2019-07-25 às 17:41hs
 */
public class ItemVendaDAOTest {
    
    @Test
    public void salvar(){
        
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produto = produtoDAO.buscar(1L);
        
        VendaDAO vendaDAO = new VendaDAO();
        Venda venda = vendaDAO.buscar(1L);
        
        ItemVenda itemVenda = new ItemVenda();
        itemVenda.setPrecoParcial(new BigDecimal("22.50"));
        itemVenda.setProduto(produto);
        itemVenda.setQuantidade(new Short("1"));
        
        ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
        itemVendaDAO.salvar(itemVenda);
        
        System.out.println("Registro salvo com sucesso!");
        
    }
    
}
