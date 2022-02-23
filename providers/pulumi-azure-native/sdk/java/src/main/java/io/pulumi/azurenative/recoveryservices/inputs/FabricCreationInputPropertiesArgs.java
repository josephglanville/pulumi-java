// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.AzureFabricCreationInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.InMageRcmFabricCreationInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.VMwareV2FabricCreationInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of site details provided during the time of site creation
 * 
 */
public final class FabricCreationInputPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FabricCreationInputPropertiesArgs Empty = new FabricCreationInputPropertiesArgs();

    /**
     * Fabric provider specific creation input.
     * 
     */
    @InputImport(name="customDetails")
      private final @Nullable Input<Object> customDetails;

    public Input<Object> getCustomDetails() {
        return this.customDetails == null ? Input.empty() : this.customDetails;
    }

    public FabricCreationInputPropertiesArgs(@Nullable Input<Object> customDetails) {
        this.customDetails = customDetails;
    }

    private FabricCreationInputPropertiesArgs() {
        this.customDetails = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FabricCreationInputPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> customDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(FabricCreationInputPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customDetails = defaults.customDetails;
        }

        public Builder setCustomDetails(@Nullable Input<Object> customDetails) {
            this.customDetails = customDetails;
            return this;
        }

        public Builder setCustomDetails(@Nullable Object customDetails) {
            this.customDetails = Input.ofNullable(customDetails);
            return this;
        }
        public FabricCreationInputPropertiesArgs build() {
            return new FabricCreationInputPropertiesArgs(customDetails);
        }
    }
}
