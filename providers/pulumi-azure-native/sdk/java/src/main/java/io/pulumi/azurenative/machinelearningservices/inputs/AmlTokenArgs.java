// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * AML Token identity configuration.
 * 
 */
public final class AmlTokenArgs extends io.pulumi.resources.ResourceArgs {

    public static final AmlTokenArgs Empty = new AmlTokenArgs();

    /**
     * Enum to determine identity framework.
     * Expected value is 'AMLToken'.
     * 
     */
    @InputImport(name="identityType", required=true)
      private final Input<String> identityType;

    public Input<String> getIdentityType() {
        return this.identityType;
    }

    public AmlTokenArgs(Input<String> identityType) {
        this.identityType = Objects.requireNonNull(identityType, "expected parameter 'identityType' to be non-null");
    }

    private AmlTokenArgs() {
        this.identityType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmlTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> identityType;

        public Builder() {
    	      // Empty
        }

        public Builder(AmlTokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityType = defaults.identityType;
        }

        public Builder setIdentityType(Input<String> identityType) {
            this.identityType = Objects.requireNonNull(identityType);
            return this;
        }

        public Builder setIdentityType(String identityType) {
            this.identityType = Input.of(Objects.requireNonNull(identityType));
            return this;
        }
        public AmlTokenArgs build() {
            return new AmlTokenArgs(identityType);
        }
    }
}
