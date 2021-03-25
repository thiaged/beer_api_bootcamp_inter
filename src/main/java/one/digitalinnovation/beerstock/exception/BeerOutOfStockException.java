package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerOutOfStockException extends Exception {

    public BeerOutOfStockException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed will return negative stock capacity: %s", id, quantityToDecrement));
    }
}
