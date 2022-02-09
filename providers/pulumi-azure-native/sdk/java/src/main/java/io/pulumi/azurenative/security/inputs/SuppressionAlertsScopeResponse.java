// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.inputs.ScopeElementResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class SuppressionAlertsScopeResponse extends io.pulumi.resources.InvokeArgs {

    public static final SuppressionAlertsScopeResponse Empty = new SuppressionAlertsScopeResponse();

    @InputImport(name="allOf", required=true)
    private final List<ScopeElementResponse> allOf;

    public List<ScopeElementResponse> getAllOf() {
        return this.allOf;
    }

    public SuppressionAlertsScopeResponse(List<ScopeElementResponse> allOf) {
        this.allOf = Objects.requireNonNull(allOf, "expected parameter 'allOf' to be non-null");
    }

    private SuppressionAlertsScopeResponse() {
        this.allOf = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuppressionAlertsScopeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ScopeElementResponse> allOf;

        public Builder() {
    	      // Empty
        }

        public Builder(SuppressionAlertsScopeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allOf = defaults.allOf;
        }

        public Builder setAllOf(List<ScopeElementResponse> allOf) {
            this.allOf = Objects.requireNonNull(allOf);
            return this;
        }

        public SuppressionAlertsScopeResponse build() {
            return new SuppressionAlertsScopeResponse(allOf);
        }
    }
}
