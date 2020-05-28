package com.redhat.developers;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface DeveloperResource extends PanacheEntityResource<Developer, Long> {
}