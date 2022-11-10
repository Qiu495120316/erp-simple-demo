package com.zjqiu.erp.examination.model.respond;

import com.zjqiu.erp.examination.constants.MainConstant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RespondEntity {

    private Object body;
    private String message;
    private HttpStatus code;

    public static RespondEntity OK(Object body ){
        RespondEntity respondEntity = new RespondEntity();
        respondEntity.setBody( body );
        respondEntity.setCode( HttpStatus.OK );
        respondEntity.setMessage( MainConstant.RESPOND_MESSAGE_SUCCESS );
        return respondEntity;
    }

}
