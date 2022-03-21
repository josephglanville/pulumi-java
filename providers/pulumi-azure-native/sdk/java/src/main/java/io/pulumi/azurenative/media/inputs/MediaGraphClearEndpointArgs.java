// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.MediaGraphUsernamePasswordCredentialsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An endpoint to connect to with no encryption in transit.
 * 
 */
public final class MediaGraphClearEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final MediaGraphClearEndpointArgs Empty = new MediaGraphClearEndpointArgs();

    /**
     * Polymorphic credentials to present to the endpoint.
     * 
     */
    @Import(name="credentials")
      private final @Nullable Output<MediaGraphUsernamePasswordCredentialsArgs> credentials;

    public Output<MediaGraphUsernamePasswordCredentialsArgs> getCredentials() {
        return this.credentials == null ? Output.empty() : this.credentials;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphClearEndpoint'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * Url for the endpoint.
     * 
     */
    @Import(name="url", required=true)
      private final Output<String> url;

    public Output<String> getUrl() {
        return this.url;
    }

    public MediaGraphClearEndpointArgs(
        @Nullable Output<MediaGraphUsernamePasswordCredentialsArgs> credentials,
        Output<String> odataType,
        Output<String> url) {
        this.credentials = credentials;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private MediaGraphClearEndpointArgs() {
        this.credentials = Output.empty();
        this.odataType = Output.empty();
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaGraphClearEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MediaGraphUsernamePasswordCredentialsArgs> credentials;
        private Output<String> odataType;
        private Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaGraphClearEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.odataType = defaults.odataType;
    	      this.url = defaults.url;
        }

        public Builder credentials(@Nullable Output<MediaGraphUsernamePasswordCredentialsArgs> credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder credentials(@Nullable MediaGraphUsernamePasswordCredentialsArgs credentials) {
            this.credentials = Output.ofNullable(credentials);
            return this;
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder url(Output<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder url(String url) {
            this.url = Output.of(Objects.requireNonNull(url));
            return this;
        }        public MediaGraphClearEndpointArgs build() {
            return new MediaGraphClearEndpointArgs(credentials, odataType, url);
        }
    }
}
