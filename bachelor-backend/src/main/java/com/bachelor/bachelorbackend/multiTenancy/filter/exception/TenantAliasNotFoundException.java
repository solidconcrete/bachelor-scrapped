package com.bachelor.bachelorbackend.multiTenancy.filter.exception;

public class TenantAliasNotFoundException extends RuntimeException{

    public TenantAliasNotFoundException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

    public TenantAliasNotFoundException(String msg) {
        super(msg);
    }
}
