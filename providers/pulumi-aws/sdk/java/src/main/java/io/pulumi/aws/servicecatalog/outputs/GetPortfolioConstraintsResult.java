// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.outputs;

import io.pulumi.aws.servicecatalog.outputs.GetPortfolioConstraintsDetail;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPortfolioConstraintsResult {
    private final @Nullable String acceptLanguage;
    /**
     * List of information about the constraints. See details below.
     * 
     */
    private final List<GetPortfolioConstraintsDetail> details;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Identifier of the portfolio the product resides in. The constraint applies only to the instance of the product that lives within this portfolio.
     * 
     */
    private final String portfolioId;
    /**
     * Identifier of the product the constraint applies to. A constraint applies to a specific instance of a product within a certain portfolio.
     * 
     */
    private final @Nullable String productId;

    @CustomType.Constructor
    private GetPortfolioConstraintsResult(
        @CustomType.Parameter("acceptLanguage") @Nullable String acceptLanguage,
        @CustomType.Parameter("details") List<GetPortfolioConstraintsDetail> details,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("portfolioId") String portfolioId,
        @CustomType.Parameter("productId") @Nullable String productId) {
        this.acceptLanguage = acceptLanguage;
        this.details = details;
        this.id = id;
        this.portfolioId = portfolioId;
        this.productId = productId;
    }

    public Optional<String> getAcceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }
    /**
     * List of information about the constraints. See details below.
     * 
    */
    public List<GetPortfolioConstraintsDetail> getDetails() {
        return this.details;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Identifier of the portfolio the product resides in. The constraint applies only to the instance of the product that lives within this portfolio.
     * 
    */
    public String getPortfolioId() {
        return this.portfolioId;
    }
    /**
     * Identifier of the product the constraint applies to. A constraint applies to a specific instance of a product within a certain portfolio.
     * 
    */
    public Optional<String> getProductId() {
        return Optional.ofNullable(this.productId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortfolioConstraintsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acceptLanguage;
        private List<GetPortfolioConstraintsDetail> details;
        private String id;
        private String portfolioId;
        private @Nullable String productId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPortfolioConstraintsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.details = defaults.details;
    	      this.id = defaults.id;
    	      this.portfolioId = defaults.portfolioId;
    	      this.productId = defaults.productId;
        }

        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }
        public Builder details(List<GetPortfolioConstraintsDetail> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }
        public Builder details(GetPortfolioConstraintsDetail... details) {
            return details(List.of(details));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder portfolioId(String portfolioId) {
            this.portfolioId = Objects.requireNonNull(portfolioId);
            return this;
        }
        public Builder productId(@Nullable String productId) {
            this.productId = productId;
            return this;
        }        public GetPortfolioConstraintsResult build() {
            return new GetPortfolioConstraintsResult(acceptLanguage, details, id, portfolioId, productId);
        }
    }
}
