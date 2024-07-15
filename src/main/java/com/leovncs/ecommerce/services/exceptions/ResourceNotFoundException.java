package com.leovncs.ecommerce.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = -8682563771130224990L;

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id: " + id);
    }
}
