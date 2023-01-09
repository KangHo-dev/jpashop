package jpabook.jpashop.exception;

public class NotEnoughStockExceptioin extends RuntimeException{
    public NotEnoughStockExceptioin() {
        super();
    }

    public NotEnoughStockExceptioin(String message) {
        super(message);
    }

    public NotEnoughStockExceptioin(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughStockExceptioin(Throwable cause) {
        super(cause);
    }

}
