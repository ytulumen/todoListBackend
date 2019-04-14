package com.yasin.backend.usr.implementations;

import com.yasin.backend.usr.ItemDependenciesManager;
import com.yasin.backend.model.ItemDependencies;
import org.springframework.stereotype.Service;

@Service(value = "itemDependenciesManager")
public class ItemDependenciesManagerImpl extends BaseManager<ItemDependencies> implements ItemDependenciesManager {
}
