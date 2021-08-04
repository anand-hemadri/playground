/**
 * 
 */
package net.matrix.petclinic.repositories.inmemory;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import net.matrix.petclinic.model.BaseEntity;
import net.matrix.petclinic.providers.CrudServiceProvider;

/**
 * An abstract implementation of In-memory {@link CrudServiceProvider}.
 * 
 * @author anand.hemadri
 *
 */
public abstract class AbstractMapServiceRepository<T extends BaseEntity> implements CrudServiceProvider<T> {
    protected final Map<Long, T> dataSet = new HashMap<>();

    @Override
    public Set<T> findAll() {
        return Collections.unmodifiableSet(new HashSet<>(dataSet.values()));
    }

    @Override
    public T findById(Long id) {
        return dataSet.getOrDefault(id, emptyObject());
    }

    @Override
    public void delete(T data) {
        dataSet.entrySet().removeIf(e -> e.getValue().equals(data));
    }

    abstract T emptyObject();

    /**
     * Save the entity with the given identity.
     * 
     * @param id the primary key identity
     * @param data the data
     * @return the data
     */
    @Override
    public T save(T data) {
        if (data == null) {
            throw new IllegalArgumentException("Cannot save null data");
        }

        if (data.isNew()) {
            data.setId(nextId());
        }

        dataSet.put(data.getId(), data);
        return data;
    }

    private Long nextId() {
        return dataSet.keySet().isEmpty() ? 1L : Collections.max(dataSet.keySet()) + 1;
    }
}
