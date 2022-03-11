// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrincipalPortfolioAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrincipalPortfolioAssociationArgs Empty = new PrincipalPortfolioAssociationArgs();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @InputImport(name="acceptLanguage")
      private final @Nullable Output<String> acceptLanguage;

    public Output<String> getAcceptLanguage() {
        return this.acceptLanguage == null ? Output.empty() : this.acceptLanguage;
    }

    /**
     * Portfolio identifier.
     * 
     */
    @InputImport(name="portfolioId", required=true)
      private final Output<String> portfolioId;

    public Output<String> getPortfolioId() {
        return this.portfolioId;
    }

    /**
     * Principal ARN.
     * 
     */
    @InputImport(name="principalArn", required=true)
      private final Output<String> principalArn;

    public Output<String> getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * Principal type. Setting this argument empty (e.g., `principal_type = ""`) will result in an error. Valid value is `IAM`. Default is `IAM`.
     * 
     */
    @InputImport(name="principalType")
      private final @Nullable Output<String> principalType;

    public Output<String> getPrincipalType() {
        return this.principalType == null ? Output.empty() : this.principalType;
    }

    public PrincipalPortfolioAssociationArgs(
        @Nullable Output<String> acceptLanguage,
        Output<String> portfolioId,
        Output<String> principalArn,
        @Nullable Output<String> principalType) {
        this.acceptLanguage = acceptLanguage;
        this.portfolioId = Objects.requireNonNull(portfolioId, "expected parameter 'portfolioId' to be non-null");
        this.principalArn = Objects.requireNonNull(principalArn, "expected parameter 'principalArn' to be non-null");
        this.principalType = principalType;
    }

    private PrincipalPortfolioAssociationArgs() {
        this.acceptLanguage = Output.empty();
        this.portfolioId = Output.empty();
        this.principalArn = Output.empty();
        this.principalType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrincipalPortfolioAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> acceptLanguage;
        private Output<String> portfolioId;
        private Output<String> principalArn;
        private @Nullable Output<String> principalType;

        public Builder() {
    	      // Empty
        }

        public Builder(PrincipalPortfolioAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.portfolioId = defaults.portfolioId;
    	      this.principalArn = defaults.principalArn;
    	      this.principalType = defaults.principalType;
        }

        public Builder acceptLanguage(@Nullable Output<String> acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = Output.ofNullable(acceptLanguage);
            return this;
        }

        public Builder portfolioId(Output<String> portfolioId) {
            this.portfolioId = Objects.requireNonNull(portfolioId);
            return this;
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = Output.of(Objects.requireNonNull(portfolioId));
            return this;
        }

        public Builder principalArn(Output<String> principalArn) {
            this.principalArn = Objects.requireNonNull(principalArn);
            return this;
        }

        public Builder principalArn(String principalArn) {
            this.principalArn = Output.of(Objects.requireNonNull(principalArn));
            return this;
        }

        public Builder principalType(@Nullable Output<String> principalType) {
            this.principalType = principalType;
            return this;
        }

        public Builder principalType(@Nullable String principalType) {
            this.principalType = Output.ofNullable(principalType);
            return this;
        }
        public PrincipalPortfolioAssociationArgs build() {
            return new PrincipalPortfolioAssociationArgs(acceptLanguage, portfolioId, principalArn, principalType);
        }
    }
}
