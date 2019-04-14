package com.yasin.backend.dao.implementations;

import com.yasin.backend.dao.ItemDependenciesDAO;
import com.yasin.backend.model.ItemDependencies;
import org.springframework.stereotype.Service;

@Service
public class ItemDependenciesDAOImpl extends DAOImpl<ItemDependencies> implements ItemDependenciesDAO {
    public ItemDependenciesDAOImpl() {
        super.setClassType(ItemDependencies.class);
        //super.setQuery("findUserRoleByName"); // TODO: 9.04.2019 set named query
    }
}
