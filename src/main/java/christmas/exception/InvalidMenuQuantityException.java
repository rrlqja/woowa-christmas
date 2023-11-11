package christmas.exception;

public class InvalidMenuQuantityException extends IllegalArgumentException {
    public InvalidMenuQuantityException() {
        super("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
    }
}
