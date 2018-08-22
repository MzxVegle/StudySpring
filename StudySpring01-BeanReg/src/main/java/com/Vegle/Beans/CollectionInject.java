package com.Vegle.Beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInject {
    private List list;
    private Map map;
    private Set set;
    private Properties properties;

    public void setList(List list) {
        this.list = list;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List getList() {
        return list;
    }

    public Map getMap() {
        return map;
    }

    public Set getSet() {
        return set;
    }

    public Properties getProperties() {
        return properties;
    }
}
