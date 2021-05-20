package io.universe.emmaframework.api;

import io.universe.emmaframework.api.annotation.Field;
import io.universe.emmaframework.api.annotation.FieldType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Sir.D
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RootModel<ID extends Serializable> implements Serializable {

    @Field(
            name = "标识",
            type = FieldType.Identifier,
            nullable = false
    )
    protected ID id;

}
