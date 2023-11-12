package christmas.domain.discount.discountbenefit;

import christmas.utils.FormatUtil;

import java.util.Objects;

public class GiftDiscountBenefit implements DiscountBenefit {
    public static final String DISCOUNT_DESCRIPTION = "증정 이벤트";
    public static final int DISCOUNT_AMOUNT = 25000;
    private final String description;
    private final Integer discountAmount;

    public GiftDiscountBenefit() {
        this.description = DISCOUNT_DESCRIPTION;
        this.discountAmount = DISCOUNT_AMOUNT;
    }
    @Override
    public String getBenefit() {
        StringBuilder sb = new StringBuilder();
        return sb.append(description)
                .append(": -")
                .append(getFormattedAmount())
                .append("원")
                .toString();
    }

    @Override
    public Integer getDiscountAmount() {
        return this.discountAmount;
    }

    private String getFormattedAmount() {
        return FormatUtil.formatNumber(discountAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(description);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof GiftDiscountBenefit)) return false;
        GiftDiscountBenefit other = (GiftDiscountBenefit) obj;
        return Objects.equals(description, other.description);
    }
}