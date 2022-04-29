// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.ApiGateway.outputs.DeploymentSpecificationRouteRequestPoliciesBodyValidationContent;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentSpecificationRouteRequestPoliciesBodyValidation {
    /**
     * @return (Updatable) The content of the request body.
     * 
     */
    private final @Nullable List<DeploymentSpecificationRouteRequestPoliciesBodyValidationContent> contents;
    /**
     * @return (Updatable) Determines if the parameter is required in the request.
     * 
     */
    private final @Nullable Boolean required;
    /**
     * @return (Updatable) Validation behavior mode.
     * 
     */
    private final @Nullable String validationMode;

    @CustomType.Constructor
    private DeploymentSpecificationRouteRequestPoliciesBodyValidation(
        @CustomType.Parameter("contents") @Nullable List<DeploymentSpecificationRouteRequestPoliciesBodyValidationContent> contents,
        @CustomType.Parameter("required") @Nullable Boolean required,
        @CustomType.Parameter("validationMode") @Nullable String validationMode) {
        this.contents = contents;
        this.required = required;
        this.validationMode = validationMode;
    }

    /**
     * @return (Updatable) The content of the request body.
     * 
     */
    public List<DeploymentSpecificationRouteRequestPoliciesBodyValidationContent> contents() {
        return this.contents == null ? List.of() : this.contents;
    }
    /**
     * @return (Updatable) Determines if the parameter is required in the request.
     * 
     */
    public Optional<Boolean> required() {
        return Optional.ofNullable(this.required);
    }
    /**
     * @return (Updatable) Validation behavior mode.
     * 
     */
    public Optional<String> validationMode() {
        return Optional.ofNullable(this.validationMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentSpecificationRouteRequestPoliciesBodyValidation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DeploymentSpecificationRouteRequestPoliciesBodyValidationContent> contents;
        private @Nullable Boolean required;
        private @Nullable String validationMode;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentSpecificationRouteRequestPoliciesBodyValidation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contents = defaults.contents;
    	      this.required = defaults.required;
    	      this.validationMode = defaults.validationMode;
        }

        public Builder contents(@Nullable List<DeploymentSpecificationRouteRequestPoliciesBodyValidationContent> contents) {
            this.contents = contents;
            return this;
        }
        public Builder contents(DeploymentSpecificationRouteRequestPoliciesBodyValidationContent... contents) {
            return contents(List.of(contents));
        }
        public Builder required(@Nullable Boolean required) {
            this.required = required;
            return this;
        }
        public Builder validationMode(@Nullable String validationMode) {
            this.validationMode = validationMode;
            return this;
        }        public DeploymentSpecificationRouteRequestPoliciesBodyValidation build() {
            return new DeploymentSpecificationRouteRequestPoliciesBodyValidation(contents, required, validationMode);
        }
    }
}
