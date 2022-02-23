// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SeedNodeResponse extends io.pulumi.resources.InvokeArgs {

    public static final SeedNodeResponse Empty = new SeedNodeResponse();

    /**
     * IP address of this seed node.
     * 
     */
    @InputImport(name="ipAddress")
      private final @Nullable String ipAddress;

    public Optional<String> getIpAddress() {
        return this.ipAddress == null ? Optional.empty() : Optional.ofNullable(this.ipAddress);
    }

    public SeedNodeResponse(@Nullable String ipAddress) {
        this.ipAddress = ipAddress;
    }

    private SeedNodeResponse() {
        this.ipAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SeedNodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(SeedNodeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public SeedNodeResponse build() {
            return new SeedNodeResponse(ipAddress);
        }
    }
}
