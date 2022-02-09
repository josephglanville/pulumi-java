// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.MoveCollectionPropertiesResponseErrors;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MoveCollectionPropertiesResponse {
    private final MoveCollectionPropertiesResponseErrors errors;
    private final String provisioningState;
    private final String sourceRegion;
    private final String targetRegion;

    @OutputCustomType.Constructor({"errors","provisioningState","sourceRegion","targetRegion"})
    private MoveCollectionPropertiesResponse(
        MoveCollectionPropertiesResponseErrors errors,
        String provisioningState,
        String sourceRegion,
        String targetRegion) {
        this.errors = Objects.requireNonNull(errors);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.sourceRegion = Objects.requireNonNull(sourceRegion);
        this.targetRegion = Objects.requireNonNull(targetRegion);
    }

    public MoveCollectionPropertiesResponseErrors getErrors() {
        return this.errors;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }
    public String getTargetRegion() {
        return this.targetRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MoveCollectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MoveCollectionPropertiesResponseErrors errors;
        private String provisioningState;
        private String sourceRegion;
        private String targetRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(MoveCollectionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sourceRegion = defaults.sourceRegion;
    	      this.targetRegion = defaults.targetRegion;
        }

        public Builder setErrors(MoveCollectionPropertiesResponseErrors errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSourceRegion(String sourceRegion) {
            this.sourceRegion = Objects.requireNonNull(sourceRegion);
            return this;
        }

        public Builder setTargetRegion(String targetRegion) {
            this.targetRegion = Objects.requireNonNull(targetRegion);
            return this;
        }

        public MoveCollectionPropertiesResponse build() {
            return new MoveCollectionPropertiesResponse(errors, provisioningState, sourceRegion, targetRegion);
        }
    }
}
