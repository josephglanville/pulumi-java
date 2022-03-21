// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.AlexaChannelPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Alexa channel definition
 * 
 */
public final class AlexaChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlexaChannelArgs Empty = new AlexaChannelArgs();

    /**
     * The channel name
     * Expected value is 'AlexaChannel'.
     * 
     */
    @Import(name="channelName", required=true)
      private final Output<String> channelName;

    public Output<String> getChannelName() {
        return this.channelName;
    }

    /**
     * Entity Tag of the resource
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The set of properties specific to Alexa channel resource
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<AlexaChannelPropertiesArgs> properties;

    public Output<AlexaChannelPropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    public AlexaChannelArgs(
        Output<String> channelName,
        @Nullable Output<String> etag,
        @Nullable Output<String> location,
        @Nullable Output<AlexaChannelPropertiesArgs> properties) {
        this.channelName = Objects.requireNonNull(channelName, "expected parameter 'channelName' to be non-null");
        this.etag = etag;
        this.location = location == null ? Output.ofNullable("global") : location;
        this.properties = properties;
    }

    private AlexaChannelArgs() {
        this.channelName = Output.empty();
        this.etag = Output.empty();
        this.location = Output.empty();
        this.properties = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlexaChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> channelName;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> location;
        private @Nullable Output<AlexaChannelPropertiesArgs> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(AlexaChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelName = defaults.channelName;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
        }

        public Builder channelName(Output<String> channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }
        public Builder channelName(String channelName) {
            this.channelName = Output.of(Objects.requireNonNull(channelName));
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder properties(@Nullable Output<AlexaChannelPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable AlexaChannelPropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }        public AlexaChannelArgs build() {
            return new AlexaChannelArgs(channelName, etag, location, properties);
        }
    }
}
