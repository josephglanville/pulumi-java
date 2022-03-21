// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CidrBlock contains an optional name and one CIDR block.
 * 
 */
public final class CidrBlockArgs extends io.pulumi.resources.ResourceArgs {

    public static final CidrBlockArgs Empty = new CidrBlockArgs();

    /**
     * cidr_block must be specified in CIDR notation.
     * 
     */
    @Import(name="cidrBlock")
      private final @Nullable Output<String> cidrBlock;

    public Output<String> getCidrBlock() {
        return this.cidrBlock == null ? Output.empty() : this.cidrBlock;
    }

    /**
     * display_name is an optional field for users to identify CIDR blocks.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    public CidrBlockArgs(
        @Nullable Output<String> cidrBlock,
        @Nullable Output<String> displayName) {
        this.cidrBlock = cidrBlock;
        this.displayName = displayName;
    }

    private CidrBlockArgs() {
        this.cidrBlock = Output.empty();
        this.displayName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CidrBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cidrBlock;
        private @Nullable Output<String> displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(CidrBlockArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.displayName = defaults.displayName;
        }

        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Output.ofNullable(cidrBlock);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }        public CidrBlockArgs build() {
            return new CidrBlockArgs(cidrBlock, displayName);
        }
    }
}
