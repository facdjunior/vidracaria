package com.facdjunior.vidracaria.dao;

import com.facdjunior.vidracaria.domain.ItemVenda;
import com.facdjunior.vidracaria.domain.Produto;
import com.facdjunior.vidracaria.domain.Venda;
import java.math.BigDecimal;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Francisco Junior 2019-07-25 às 17:41hs
 */
public class ItemVendaDAOTest {

    @Test
    @Ignore
    public void salvar() {

        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produto = produtoDAO.buscar(2L);

        VendaDAO vendaDAO = new VendaDAO();
        Venda venda = vendaDAO.buscar(2L);

        ItemVenda itemVenda = new ItemVenda();
        itemVenda.setPrecoParcial(new BigDecimal("18.40"));
        itemVenda.setProduto(produto);
        itemVenda.setQuantidade(new Short("1"));
        itemVenda.setVenda(venda);

        if (produto == null) {
            System.out.println("Produto inválido");
        } else if (venda == null) {
            System.out.println("Venda inválida!");
        } else {
            ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
            itemVendaDAO.salvar(itemVenda);
            System.out.println("Registro salvo com sucesso!");
        }
        /**
         * @author Francisco Junior 2019-07-26 às 09:00hs
         */
    }

    @Test
    @Ignore
    public void listar() {
        ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
        List<ItemVenda> resultado = itemVendaDAO.listar();

        for (ItemVenda itemVenda : resultado) {
            System.out.println("Venda: " + itemVenda.getVenda().getCodigo() + "Cliente:" + itemVenda.getVenda().getCliente().getPessoa().getNome() + " : Produto: "
                    + itemVenda.getProduto().getDescricao() + " Valor Total: " + itemVenda.getVenda().getPrecoTotal());
        }
    }

    @Test
    @Ignore
    public void buscar() {

        VendaDAO vendaDAO = new VendaDAO();
        Venda venda = vendaDAO.buscar(2L);

        ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
        ItemVenda itemVenda = itemVendaDAO.buscar(2L);

        if (venda == null) {
            System.out.println("Venda inválido");
        } else {

            System.out.println("Venda: " + itemVenda.getVenda().getCodigo() + "Cliente:" + itemVenda.getVenda().getCliente().getPessoa().getNome() + " : Produto: "
                    + itemVenda.getProduto().getDescricao() + " Valor Total: " + itemVenda.getVenda().getPrecoTotal());
        }
    }

    @Test
    @Ignore
    public void excluir() {

        VendaDAO vendaDAO = new VendaDAO();
        Venda venda = vendaDAO.buscar(3L);

        if (venda == null) {
            System.out.println("Código de venda incorreto");
        } else {

            ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
            ItemVenda itemVenda = itemVendaDAO.buscar(1L);
            System.out.println("Venda excluída com suceso");
        }
    }

    @Test
    @Ignore
    public void editar() {

        VendaDAO vendaDAO = new VendaDAO();
        Venda venda = vendaDAO.buscar(1L);

        if (venda == null) {
            System.out.println("Código de venda inválido!");
        } else {
            ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
            ItemVenda itemVenda = itemVendaDAO.buscar(1L);

            itemVenda.setPrecoParcial(new BigDecimal("26.00"));
            itemVendaDAO.editar(itemVenda);
            System.out.println("Venda: " + itemVenda.getVenda().getCodigo() + "Cliente:" + itemVenda.getVenda().getCliente().getPessoa().getNome() + " : Produto: "
                    + itemVenda.getProduto().getDescricao() + " Valor Total: " + itemVenda.getVenda().getPrecoTotal());

        }
    }
}
