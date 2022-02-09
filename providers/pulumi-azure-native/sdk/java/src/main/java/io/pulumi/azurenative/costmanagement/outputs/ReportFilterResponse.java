// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.ReportComparisonExpressionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReportFilterResponse {
    private final @Nullable List<ReportFilterResponse> and;
    private final @Nullable ReportComparisonExpressionResponse dimension;
    private final @Nullable ReportFilterResponse not;
    private final @Nullable List<ReportFilterResponse> or;
    private final @Nullable ReportComparisonExpressionResponse tag;

    @OutputCustomType.Constructor({"and","dimension","not","or","tag"})
    private ReportFilterResponse(
        @Nullable List<ReportFilterResponse> and,
        @Nullable ReportComparisonExpressionResponse dimension,
        @Nullable ReportFilterResponse not,
        @Nullable List<ReportFilterResponse> or,
        @Nullable ReportComparisonExpressionResponse tag) {
        this.and = and;
        this.dimension = dimension;
        this.not = not;
        this.or = or;
        this.tag = tag;
    }

    public List<ReportFilterResponse> getAnd() {
        return this.and == null ? List.of() : this.and;
    }
    public Optional<ReportComparisonExpressionResponse> getDimension() {
        return Optional.ofNullable(this.dimension);
    }
    public Optional<ReportFilterResponse> getNot() {
        return Optional.ofNullable(this.not);
    }
    public List<ReportFilterResponse> getOr() {
        return this.or == null ? List.of() : this.or;
    }
    public Optional<ReportComparisonExpressionResponse> getTag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ReportFilterResponse> and;
        private @Nullable ReportComparisonExpressionResponse dimension;
        private @Nullable ReportFilterResponse not;
        private @Nullable List<ReportFilterResponse> or;
        private @Nullable ReportComparisonExpressionResponse tag;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.and = defaults.and;
    	      this.dimension = defaults.dimension;
    	      this.not = defaults.not;
    	      this.or = defaults.or;
    	      this.tag = defaults.tag;
        }

        public Builder setAnd(@Nullable List<ReportFilterResponse> and) {
            this.and = and;
            return this;
        }

        public Builder setDimension(@Nullable ReportComparisonExpressionResponse dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setNot(@Nullable ReportFilterResponse not) {
            this.not = not;
            return this;
        }

        public Builder setOr(@Nullable List<ReportFilterResponse> or) {
            this.or = or;
            return this;
        }

        public Builder setTag(@Nullable ReportComparisonExpressionResponse tag) {
            this.tag = tag;
            return this;
        }

        public ReportFilterResponse build() {
            return new ReportFilterResponse(and, dimension, not, or, tag);
        }
    }
}
