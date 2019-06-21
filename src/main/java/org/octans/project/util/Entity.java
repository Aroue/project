package org.octans.project.util;

public class Entity {
    public <T> T to(Class<T> destinationClass) {
        return BeanMapper.getMapper().map(this, destinationClass);
    }
}
