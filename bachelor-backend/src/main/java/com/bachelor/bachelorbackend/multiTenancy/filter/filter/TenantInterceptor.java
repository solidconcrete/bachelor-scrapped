package com.bachelor.bachelorbackend.multiTenancy.filter.filter;

import com.bachelor.bachelorbackend.multiTenancy.filter.exception.TenantAliasNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

@Slf4j
public class TenantInterceptor implements WebRequestInterceptor {

    private static final String TENANT_HEADER = "X-Tenant";

    @Override
    public void preHandle(WebRequest webRequest) {
        String tenantId = webRequest.getHeader(TENANT_HEADER);

        if (tenantId != null && !tenantId.isEmpty()) {
            TenantContext.setTenantId(tenantId);
            log.info("Tenant header get: {}", tenantId);
        } else {
            log.error("Tenant header not found.");
            throw new TenantAliasNotFoundException("Tenant header not found");
        }

    }

    @Override
    public void postHandle(WebRequest webRequest, ModelMap modelMap) throws Exception {
        TenantContext.clear();
    }

    @Override
    public void afterCompletion(WebRequest webRequest, Exception e) throws Exception {

    }
}
