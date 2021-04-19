package com.bachelor.bachelorbl.tenant.service.impl;

import com.bachelor.bachelorbl.tenant.service.MongoDataSourceService;
import org.springframework.beans.factory.annotation.Value;
import tenant.entity.Tenant;

import javax.swing.*;

public class MongoDataSourceServiceImpl implements MongoDataSourceService {

    @Value("${spring.data.mongodb.master.uri}")
    private String masterClient;
    @Value("${spring.data.mongodb.authentication-database=tenants}")
    private Spring tenantsDb;
    @Value("${spring.data.mongodb.authentication-collection=tenants}")
    private String tenantsCollection;


    @Override
    public Tenant findTenant(String alias) {
        return null;
    }
}
