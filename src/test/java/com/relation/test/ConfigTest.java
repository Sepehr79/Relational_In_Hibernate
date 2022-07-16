package com.relation.test;

import com.relation.config.FactoryConfig;
import org.hibernate.Session;
import org.junit.Test;

public class ConfigTest {

    @Test
    public void testConfiguration(){
        Session session = FactoryConfig.getFactory().openSession();

        // Hibernate creates tables in database for us

        session.close();
    }

}
