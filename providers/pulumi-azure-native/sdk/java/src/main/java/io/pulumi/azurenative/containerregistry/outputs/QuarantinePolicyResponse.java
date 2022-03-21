// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QuarantinePolicyResponse {
    /**
     * The value that indicates whether the policy is enabled or not.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private QuarantinePolicyResponse(@CustomType.Parameter("status") @Nullable String status) {
        this.status = status;
    }

    /**
     * The value that indicates whether the policy is enabled or not.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuarantinePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(QuarantinePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public QuarantinePolicyResponse build() {
            return new QuarantinePolicyResponse(status);
        }
    }
}
