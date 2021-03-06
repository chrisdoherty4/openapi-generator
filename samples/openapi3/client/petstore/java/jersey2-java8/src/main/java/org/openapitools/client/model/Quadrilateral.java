/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.client.model.ComplexQuadrilateral;
import org.openapitools.client.model.SimpleQuadrilateral;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;


@JsonDeserialize(using=Quadrilateral.QuadrilateralDeserializer.class)
public class Quadrilateral extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Quadrilateral.class.getName());

    public static class QuadrilateralDeserializer extends StdDeserializer<Quadrilateral> {
        public QuadrilateralDeserializer() {
            this(Quadrilateral.class);
        }

        public QuadrilateralDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public Quadrilateral deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();

            int match = 0;
            Object deserialized = null;
            // deserialize ComplexQuadrilateral
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(ComplexQuadrilateral.class);
                match++;
                log.log(Level.FINER, "Input data matches schema 'ComplexQuadrilateral'");
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ComplexQuadrilateral'", e);
            }

            // deserialize SimpleQuadrilateral
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(SimpleQuadrilateral.class);
                match++;
                log.log(Level.FINER, "Input data matches schema 'SimpleQuadrilateral'");
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SimpleQuadrilateral'", e);
            }

            if (match == 1) {
                Quadrilateral ret = new Quadrilateral();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for Quadrilateral: %d classes match result, expected 1", match));
        }
    }

    // store a list of schema names defined in oneOf
    public final static Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public Quadrilateral() {
        super("oneOf", Boolean.FALSE);
    }

    public Quadrilateral(ComplexQuadrilateral o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Quadrilateral(SimpleQuadrilateral o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ComplexQuadrilateral", new GenericType<ComplexQuadrilateral>() {
        });
        schemas.put("SimpleQuadrilateral", new GenericType<SimpleQuadrilateral>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return Quadrilateral.schemas;
    }

    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ComplexQuadrilateral) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SimpleQuadrilateral) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ComplexQuadrilateral, SimpleQuadrilateral");
    }



}

