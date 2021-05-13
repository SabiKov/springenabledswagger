package hu.sabi11.enabledswagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "Details about the user")
@Data
public class User {

    @ApiModelProperty(notes = "The unique id of the user",
            example = "123",
            dataType = "Long"
    )
    private Long id;
    private int age;
    private String name;
    private String email;
}
