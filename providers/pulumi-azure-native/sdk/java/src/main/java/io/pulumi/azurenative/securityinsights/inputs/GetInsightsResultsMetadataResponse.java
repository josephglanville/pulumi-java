// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.GetInsightsErrorResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInsightsResultsMetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final GetInsightsResultsMetadataResponse Empty = new GetInsightsResultsMetadataResponse();

    @InputImport(name="errors")
    private final @Nullable List<GetInsightsErrorResponse> errors;

    public List<GetInsightsErrorResponse> getErrors() {
        return this.errors == null ? List.of() : this.errors;
    }

    @InputImport(name="totalCount", required=true)
    private final Integer totalCount;

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetInsightsResultsMetadataResponse(
        @Nullable List<GetInsightsErrorResponse> errors,
        Integer totalCount) {
        this.errors = errors;
        this.totalCount = Objects.requireNonNull(totalCount, "expected parameter 'totalCount' to be non-null");
    }

    private GetInsightsResultsMetadataResponse() {
        this.errors = List.of();
        this.totalCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInsightsResultsMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetInsightsErrorResponse> errors;
        private Integer totalCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInsightsResultsMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.totalCount = defaults.totalCount;
        }

        public Builder setErrors(@Nullable List<GetInsightsErrorResponse> errors) {
            this.errors = errors;
            return this;
        }

        public Builder setTotalCount(Integer totalCount) {
            this.totalCount = Objects.requireNonNull(totalCount);
            return this;
        }

        public GetInsightsResultsMetadataResponse build() {
            return new GetInsightsResultsMetadataResponse(errors, totalCount);
        }
    }
}
