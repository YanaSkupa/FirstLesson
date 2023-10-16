package org.example.distrubutor.persistence;

import lombok.Data;

import java.util.UUID;

@Data
public abstract class ObjectWithData {
    private UUID id;
}