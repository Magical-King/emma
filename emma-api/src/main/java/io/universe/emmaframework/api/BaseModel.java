package io.universe.emmaframework.api;

import io.universe.emmaframework.api.annotation.Field;
import io.universe.emmaframework.api.annotation.FieldType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Sir.D
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseModel<ID extends Serializable> extends RootModel<ID> {

    @Field(
            name = "创建时间",
            nullable = false,
            type = FieldType.DateTime
    )
    protected Date createdAt;

    @Field(
            name = "更新时间",
            nullable = false,
            type = FieldType.DateTime
    )
    protected Date updatedAt;

}
