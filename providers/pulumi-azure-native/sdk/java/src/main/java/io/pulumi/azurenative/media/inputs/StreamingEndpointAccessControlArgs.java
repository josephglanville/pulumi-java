// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AkamaiAccessControlArgs;
import io.pulumi.azurenative.media.inputs.IPAccessControlArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StreamingEndpointAccessControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamingEndpointAccessControlArgs Empty = new StreamingEndpointAccessControlArgs();

    @InputImport(name="akamai")
    private final @Nullable Input<AkamaiAccessControlArgs> akamai;

    public Input<AkamaiAccessControlArgs> getAkamai() {
        return this.akamai == null ? Input.empty() : this.akamai;
    }

    @InputImport(name="ip")
    private final @Nullable Input<IPAccessControlArgs> ip;

    public Input<IPAccessControlArgs> getIp() {
        return this.ip == null ? Input.empty() : this.ip;
    }

    public StreamingEndpointAccessControlArgs(
        @Nullable Input<AkamaiAccessControlArgs> akamai,
        @Nullable Input<IPAccessControlArgs> ip) {
        this.akamai = akamai;
        this.ip = ip;
    }

    private StreamingEndpointAccessControlArgs() {
        this.akamai = Input.empty();
        this.ip = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingEndpointAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AkamaiAccessControlArgs> akamai;
        private @Nullable Input<IPAccessControlArgs> ip;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingEndpointAccessControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.akamai = defaults.akamai;
    	      this.ip = defaults.ip;
        }

        public Builder setAkamai(@Nullable Input<AkamaiAccessControlArgs> akamai) {
            this.akamai = akamai;
            return this;
        }

        public Builder setAkamai(@Nullable AkamaiAccessControlArgs akamai) {
            this.akamai = Input.ofNullable(akamai);
            return this;
        }

        public Builder setIp(@Nullable Input<IPAccessControlArgs> ip) {
            this.ip = ip;
            return this;
        }

        public Builder setIp(@Nullable IPAccessControlArgs ip) {
            this.ip = Input.ofNullable(ip);
            return this;
        }

        public StreamingEndpointAccessControlArgs build() {
            return new StreamingEndpointAccessControlArgs(akamai, ip);
        }
    }
}