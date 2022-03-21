// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An A record.
 * 
 */
public final class ARecordResponse extends io.pulumi.resources.InvokeArgs {

    public static final ARecordResponse Empty = new ARecordResponse();

    /**
     * The IPv4 address of this A record.
     * 
     */
    @Import(name="ipv4Address")
      private final @Nullable String ipv4Address;

    public Optional<String> getIpv4Address() {
        return this.ipv4Address == null ? Optional.empty() : Optional.ofNullable(this.ipv4Address);
    }

    public ARecordResponse(@Nullable String ipv4Address) {
        this.ipv4Address = ipv4Address;
    }

    private ARecordResponse() {
        this.ipv4Address = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ARecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipv4Address;

        public Builder() {
    	      // Empty
        }

        public Builder(ARecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv4Address = defaults.ipv4Address;
        }

        public Builder ipv4Address(@Nullable String ipv4Address) {
            this.ipv4Address = ipv4Address;
            return this;
        }        public ARecordResponse build() {
            return new ARecordResponse(ipv4Address);
        }
    }
}
