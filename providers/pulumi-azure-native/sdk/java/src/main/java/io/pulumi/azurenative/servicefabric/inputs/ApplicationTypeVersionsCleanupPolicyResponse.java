// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;


public final class ApplicationTypeVersionsCleanupPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationTypeVersionsCleanupPolicyResponse Empty = new ApplicationTypeVersionsCleanupPolicyResponse();

    @InputImport(name="maxUnusedVersionsToKeep", required=true)
    private final Double maxUnusedVersionsToKeep;

    public Double getMaxUnusedVersionsToKeep() {
        return this.maxUnusedVersionsToKeep;
    }

    public ApplicationTypeVersionsCleanupPolicyResponse(Double maxUnusedVersionsToKeep) {
        this.maxUnusedVersionsToKeep = Objects.requireNonNull(maxUnusedVersionsToKeep, "expected parameter 'maxUnusedVersionsToKeep' to be non-null");
    }

    private ApplicationTypeVersionsCleanupPolicyResponse() {
        this.maxUnusedVersionsToKeep = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationTypeVersionsCleanupPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double maxUnusedVersionsToKeep;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationTypeVersionsCleanupPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxUnusedVersionsToKeep = defaults.maxUnusedVersionsToKeep;
        }

        public Builder setMaxUnusedVersionsToKeep(Double maxUnusedVersionsToKeep) {
            this.maxUnusedVersionsToKeep = Objects.requireNonNull(maxUnusedVersionsToKeep);
            return this;
        }

        public ApplicationTypeVersionsCleanupPolicyResponse build() {
            return new ApplicationTypeVersionsCleanupPolicyResponse(maxUnusedVersionsToKeep);
        }
    }
}
