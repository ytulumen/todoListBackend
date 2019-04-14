package com.yasin.backend.resource;

import com.yasin.backend.model.ItemDependencies;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

@Component
@Path("/itemDependencies")
public class ItemDependenciesService extends BaseService<ItemDependencies> {
}
