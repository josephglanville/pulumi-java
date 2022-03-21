// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties corresponding to a line channel registration
 * 
 */
public final class LineRegistrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LineRegistrationArgs Empty = new LineRegistrationArgs();

    /**
     * Access token for the line channel registration
     * 
     */
    @Import(name="channelAccessToken")
      private final @Nullable Output<String> channelAccessToken;

    public Output<String> getChannelAccessToken() {
        return this.channelAccessToken == null ? Output.empty() : this.channelAccessToken;
    }

    /**
     * Secret for the line channel registration
     * 
     */
    @Import(name="channelSecret")
      private final @Nullable Output<String> channelSecret;

    public Output<String> getChannelSecret() {
        return this.channelSecret == null ? Output.empty() : this.channelSecret;
    }

    public LineRegistrationArgs(
        @Nullable Output<String> channelAccessToken,
        @Nullable Output<String> channelSecret) {
        this.channelAccessToken = channelAccessToken;
        this.channelSecret = channelSecret;
    }

    private LineRegistrationArgs() {
        this.channelAccessToken = Output.empty();
        this.channelSecret = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LineRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> channelAccessToken;
        private @Nullable Output<String> channelSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(LineRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelAccessToken = defaults.channelAccessToken;
    	      this.channelSecret = defaults.channelSecret;
        }

        public Builder channelAccessToken(@Nullable Output<String> channelAccessToken) {
            this.channelAccessToken = channelAccessToken;
            return this;
        }
        public Builder channelAccessToken(@Nullable String channelAccessToken) {
            this.channelAccessToken = Output.ofNullable(channelAccessToken);
            return this;
        }
        public Builder channelSecret(@Nullable Output<String> channelSecret) {
            this.channelSecret = channelSecret;
            return this;
        }
        public Builder channelSecret(@Nullable String channelSecret) {
            this.channelSecret = Output.ofNullable(channelSecret);
            return this;
        }        public LineRegistrationArgs build() {
            return new LineRegistrationArgs(channelAccessToken, channelSecret);
        }
    }
}
