package br.com.cwi.reset.tcc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CpfAlreadyPersistedException extends RuntimeException {
    public CpfAlreadyPersistedException() {
        super("Não é possível atualizar o campo CPF de um USUARIO");
    }
}
