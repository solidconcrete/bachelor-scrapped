package com.bachelor.bachelorbl.tenant.service;

import tenant.entity.Tenant;

public interface MongoDataSourceService {

    Tenant findTenant(String alias);
}
