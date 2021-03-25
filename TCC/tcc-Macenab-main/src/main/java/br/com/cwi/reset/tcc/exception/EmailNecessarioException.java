package br.com.cwi.reset.tcc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmailNecessarioException extends RuntimeException {
    public EmailNecessarioException() {
        super("É necessário preencher o campo E-MAIL");
    }
}
