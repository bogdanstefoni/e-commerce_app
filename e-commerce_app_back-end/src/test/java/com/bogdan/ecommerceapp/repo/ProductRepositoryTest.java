package com.bogdan.ecommerceapp.repo;

import com.bogdan.ecommerceapp.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.data.jpa.provider.HibernateUtils;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    @Resource
    private ProductRepository productRepository;

    private static SessionFactory sessionFactory;
    private Session session;



    @Test
    public void testGet() {
        System.out.println("Running testGet()...");

        Long id = 1L;

        Product product = productRepository.getById(id);

        assertEquals("JavaScript - The Fun Parts", product.getName());

    }
}