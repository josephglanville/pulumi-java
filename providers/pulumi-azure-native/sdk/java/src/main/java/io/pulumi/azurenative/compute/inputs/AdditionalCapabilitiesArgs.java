// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Enables or disables a capability on the virtual machine or virtual machine scale set.
 * 
 */
public final class AdditionalCapabilitiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdditionalCapabilitiesArgs Empty = new AdditionalCapabilitiesArgs();

    /**
     * The flag that enables or disables a capability to have one or more managed data disks with UltraSSD_LRS storage account type on the VM or VMSS. Managed disks with storage account type UltraSSD_LRS can be added to a virtual machine or virtual machine scale set only if this property is enabled.
     * 
     */
    @Import(name="ultraSSDEnabled")
      private final @Nullable Output<Boolean> ultraSSDEnabled;

    public Output<Boolean> getUltraSSDEnabled() {
        return this.ultraSSDEnabled == null ? Output.empty() : this.ultraSSDEnabled;
    }

    public AdditionalCapabilitiesArgs(@Nullable Output<Boolean> ultraSSDEnabled) {
        this.ultraSSDEnabled = ultraSSDEnabled;
    }

    private AdditionalCapabilitiesArgs() {
        this.ultraSSDEnabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdditionalCapabilitiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> ultraSSDEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(AdditionalCapabilitiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ultraSSDEnabled = defaults.ultraSSDEnabled;
        }

        public Builder ultraSSDEnabled(@Nullable Output<Boolean> ultraSSDEnabled) {
            this.ultraSSDEnabled = ultraSSDEnabled;
            return this;
        }
        public Builder ultraSSDEnabled(@Nullable Boolean ultraSSDEnabled) {
            this.ultraSSDEnabled = Output.ofNullable(ultraSSDEnabled);
            return this;
        }        public AdditionalCapabilitiesArgs build() {
            return new AdditionalCapabilitiesArgs(ultraSSDEnabled);
        }
    }
}
