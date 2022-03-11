// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.DiskSecurityTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains the security related information for the resource.
 * 
 */
public final class DiskSecurityProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskSecurityProfileArgs Empty = new DiskSecurityProfileArgs();

    /**
     * Specifies the SecurityType of the VM. Applicable for OS disks only.
     * 
     */
    @InputImport(name="securityType")
      private final @Nullable Output<Either<String,DiskSecurityTypes>> securityType;

    public Output<Either<String,DiskSecurityTypes>> getSecurityType() {
        return this.securityType == null ? Output.empty() : this.securityType;
    }

    public DiskSecurityProfileArgs(@Nullable Output<Either<String,DiskSecurityTypes>> securityType) {
        this.securityType = securityType;
    }

    private DiskSecurityProfileArgs() {
        this.securityType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskSecurityProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,DiskSecurityTypes>> securityType;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskSecurityProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityType = defaults.securityType;
        }

        public Builder securityType(@Nullable Output<Either<String,DiskSecurityTypes>> securityType) {
            this.securityType = securityType;
            return this;
        }

        public Builder securityType(@Nullable Either<String,DiskSecurityTypes> securityType) {
            this.securityType = Output.ofNullable(securityType);
            return this;
        }
        public DiskSecurityProfileArgs build() {
            return new DiskSecurityProfileArgs(securityType);
        }
    }
}
