// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SeedNodeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SeedNodeArgs Empty = new SeedNodeArgs();

    /**
     * IP address of this seed node.
     * 
     */
    @InputImport(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Output.empty() : this.ipAddress;
    }

    public SeedNodeArgs(@Nullable Output<String> ipAddress) {
        this.ipAddress = ipAddress;
    }

    private SeedNodeArgs() {
        this.ipAddress = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SeedNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(SeedNodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Output.ofNullable(ipAddress);
            return this;
        }
        public SeedNodeArgs build() {
            return new SeedNodeArgs(ipAddress);
        }
    }
}
