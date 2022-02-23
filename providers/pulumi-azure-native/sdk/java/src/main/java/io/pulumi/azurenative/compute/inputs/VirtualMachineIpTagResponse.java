// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains the IP tag associated with the public IP address.
 * 
 */
public final class VirtualMachineIpTagResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineIpTagResponse Empty = new VirtualMachineIpTagResponse();

    /**
     * IP tag type. Example: FirstPartyUsage.
     * 
     */
    @InputImport(name="ipTagType")
      private final @Nullable String ipTagType;

    public Optional<String> getIpTagType() {
        return this.ipTagType == null ? Optional.empty() : Optional.ofNullable(this.ipTagType);
    }

    /**
     * IP tag associated with the public IP. Example: SQL, Storage etc.
     * 
     */
    @InputImport(name="tag")
      private final @Nullable String tag;

    public Optional<String> getTag() {
        return this.tag == null ? Optional.empty() : Optional.ofNullable(this.tag);
    }

    public VirtualMachineIpTagResponse(
        @Nullable String ipTagType,
        @Nullable String tag) {
        this.ipTagType = ipTagType;
        this.tag = tag;
    }

    private VirtualMachineIpTagResponse() {
        this.ipTagType = null;
        this.tag = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineIpTagResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipTagType;
        private @Nullable String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineIpTagResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipTagType = defaults.ipTagType;
    	      this.tag = defaults.tag;
        }

        public Builder setIpTagType(@Nullable String ipTagType) {
            this.ipTagType = ipTagType;
            return this;
        }

        public Builder setTag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }
        public VirtualMachineIpTagResponse build() {
            return new VirtualMachineIpTagResponse(ipTagType, tag);
        }
    }
}
