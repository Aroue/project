package org.octans.project.util;

public class Entity {
    public <T> T to(Class<T> destinationClass) {
        T t = (new BeanMapper()).getMapper().map(this, destinationClass);
        return t;
    }
}
