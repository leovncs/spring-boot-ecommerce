package com.leovncs.ecommerce.services.exceptions;

import java.io.Serial;

public class DatabaseException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = -5203234664425339609L;

    public DatabaseException(String msg){
        super(msg);
    }
}
