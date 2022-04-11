// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.FacebookChannelPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Facebook channel definition
 * 
 */
public final class FacebookChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final FacebookChannelArgs Empty = new FacebookChannelArgs();

    /**
     * The channel name
     * Expected value is 'FacebookChannel'.
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
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The set of properties specific to bot facebook channel
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<FacebookChannelPropertiesArgs> properties;

    public Output<FacebookChannelPropertiesArgs> getProperties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    public FacebookChannelArgs(
        Output<String> channelName,
        @Nullable Output<String> etag,
        @Nullable Output<String> location,
        @Nullable Output<FacebookChannelPropertiesArgs> properties) {
        this.channelName = Objects.requireNonNull(channelName, "expected parameter 'channelName' to be non-null");
        this.etag = etag;
        this.location = location == null ? Codegen.ofNullable("global") : location;
        this.properties = properties;
    }

    private FacebookChannelArgs() {
        this.channelName = Codegen.empty();
        this.etag = Codegen.empty();
        this.location = Codegen.empty();
        this.properties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FacebookChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> channelName;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> location;
        private @Nullable Output<FacebookChannelPropertiesArgs> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(FacebookChannelArgs defaults) {
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
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder properties(@Nullable Output<FacebookChannelPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable FacebookChannelPropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }        public FacebookChannelArgs build() {
            return new FacebookChannelArgs(channelName, etag, location, properties);
        }
    }
}
