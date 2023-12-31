package christmas.domain.orderresult.strategy;

import christmas.domain.orderresult.OrderResult;

import static christmas.utils.FormatUtil.formatNumber;

public class OrderResultTotalAmountStrategy implements OrderResultStrategy {
    private static final String TITLE = "<할인 전 총주문 금액>";
    private static final String LINE_BREAK = System.lineSeparator();
    private static final String CURRENCY_SUFFIX = "원";

    @Override
    public String output(OrderResult orderResult) {
        Integer totalAmount = orderResult.getTotalAmount();

        return getOutput(totalAmount);
    }

    private String getOutput(Integer totalAmount) {
        StringBuilder sb = new StringBuilder();

        return sb.append(TITLE)
                .append(LINE_BREAK)
                .append(formatNumber(totalAmount))
                .append(CURRENCY_SUFFIX)
                .append(LINE_BREAK)
                .toString();
    }
}
