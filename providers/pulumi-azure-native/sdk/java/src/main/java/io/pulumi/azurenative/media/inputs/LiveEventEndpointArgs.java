// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The live event endpoint.
 * 
 */
public final class LiveEventEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiveEventEndpointArgs Empty = new LiveEventEndpointArgs();

    /**
     * The endpoint protocol.
     * 
     */
    @InputImport(name="protocol")
      private final @Nullable Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    /**
     * The endpoint URL.
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public LiveEventEndpointArgs(
        @Nullable Input<String> protocol,
        @Nullable Input<String> url) {
        this.protocol = protocol;
        this.url = url;
    }

    private LiveEventEndpointArgs() {
        this.protocol = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> protocol;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocol = defaults.protocol;
    	      this.url = defaults.url;
        }

        public Builder setProtocol(@Nullable Input<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }
        public LiveEventEndpointArgs build() {
            return new LiveEventEndpointArgs(protocol, url);
        }
    }
}
