// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.AlexaChannelPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Alexa channel definition
 * 
 */
public final class AlexaChannelResponse extends io.pulumi.resources.InvokeArgs {

    public static final AlexaChannelResponse Empty = new AlexaChannelResponse();

    /**
     * The channel name
     * Expected value is 'AlexaChannel'.
     * 
     */
    @InputImport(name="channelName", required=true)
      private final String channelName;

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * Entity Tag of the resource
     * 
     */
    @InputImport(name="etag")
      private final @Nullable String etag;

    public Optional<String> getEtag() {
        return this.etag == null ? Optional.empty() : Optional.ofNullable(this.etag);
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @InputImport(name="location")
      private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * The set of properties specific to Alexa channel resource
     * 
     */
    @InputImport(name="properties")
      private final @Nullable AlexaChannelPropertiesResponse properties;

    public Optional<AlexaChannelPropertiesResponse> getProperties() {
        return this.properties == null ? Optional.empty() : Optional.ofNullable(this.properties);
    }

    /**
     * Provisioning state of the resource
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public AlexaChannelResponse(
        String channelName,
        @Nullable String etag,
        @Nullable String location,
        @Nullable AlexaChannelPropertiesResponse properties,
        String provisioningState) {
        this.channelName = Objects.requireNonNull(channelName, "expected parameter 'channelName' to be non-null");
        this.etag = etag;
        this.location = location == null ? "global" : location;
        this.properties = properties;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private AlexaChannelResponse() {
        this.channelName = null;
        this.etag = null;
        this.location = null;
        this.properties = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlexaChannelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channelName;
        private @Nullable String etag;
        private @Nullable String location;
        private @Nullable AlexaChannelPropertiesResponse properties;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(AlexaChannelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelName = defaults.channelName;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setChannelName(String channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setProperties(@Nullable AlexaChannelPropertiesResponse properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public AlexaChannelResponse build() {
            return new AlexaChannelResponse(channelName, etag, location, properties, provisioningState);
        }
    }
}
