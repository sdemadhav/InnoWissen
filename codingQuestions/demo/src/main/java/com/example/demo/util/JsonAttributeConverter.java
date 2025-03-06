package com.example.demo.util;

import java.sql.SQLException;

import org.postgresql.util.PGobject;

import jakarta.persistence.AttributeConverter;

@jakarta.persistence.Converter
public class JsonAttributeConverter implements AttributeConverter<String, PGobject> {

    @Override
    public PGobject convertToDatabaseColumn(String attribute) {
        PGobject jsonObject = new PGobject();
        jsonObject.setType("json");
        try {
            jsonObject.setValue(attribute);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to convert String to PGobject", e);
        }
        return jsonObject;
    }

    @Override
    public String convertToEntityAttribute(PGobject dbData) {
        return dbData.getValue();
    }
}
