package com.facdjunior.vidracaria.util;

import org.hibernate.Session;
import org.junit.Test;

/**
 *
 * @author Francisco Junior 2019-07-24
 */
public class HibernateUtilTest {

    @Test
    public void conectar() {
        Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
        sessao.close();
        HibernateUtil.getFabricaDeSessoes().close();
    }
}
