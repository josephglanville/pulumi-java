// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.autoscaling.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MetadataOptions is a property of AWS::AutoScaling::LaunchConfiguration that describes metadata options for the instances.
 * 
 */
public final class LaunchConfigurationMetadataOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchConfigurationMetadataOptionsArgs Empty = new LaunchConfigurationMetadataOptionsArgs();

    /**
     * This parameter enables or disables the HTTP metadata endpoint on your instances.
     * 
     */
    @InputImport(name="httpEndpoint")
      private final @Nullable Input<String> httpEndpoint;

    public Input<String> getHttpEndpoint() {
        return this.httpEndpoint == null ? Input.empty() : this.httpEndpoint;
    }

    /**
     * The desired HTTP PUT response hop limit for instance metadata requests.
     * 
     */
    @InputImport(name="httpPutResponseHopLimit")
      private final @Nullable Input<Integer> httpPutResponseHopLimit;

    public Input<Integer> getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit == null ? Input.empty() : this.httpPutResponseHopLimit;
    }

    /**
     * The state of token usage for your instance metadata requests.
     * 
     */
    @InputImport(name="httpTokens")
      private final @Nullable Input<String> httpTokens;

    public Input<String> getHttpTokens() {
        return this.httpTokens == null ? Input.empty() : this.httpTokens;
    }

    public LaunchConfigurationMetadataOptionsArgs(
        @Nullable Input<String> httpEndpoint,
        @Nullable Input<Integer> httpPutResponseHopLimit,
        @Nullable Input<String> httpTokens) {
        this.httpEndpoint = httpEndpoint;
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        this.httpTokens = httpTokens;
    }

    private LaunchConfigurationMetadataOptionsArgs() {
        this.httpEndpoint = Input.empty();
        this.httpPutResponseHopLimit = Input.empty();
        this.httpTokens = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchConfigurationMetadataOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> httpEndpoint;
        private @Nullable Input<Integer> httpPutResponseHopLimit;
        private @Nullable Input<String> httpTokens;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchConfigurationMetadataOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpEndpoint = defaults.httpEndpoint;
    	      this.httpPutResponseHopLimit = defaults.httpPutResponseHopLimit;
    	      this.httpTokens = defaults.httpTokens;
        }

        public Builder setHttpEndpoint(@Nullable Input<String> httpEndpoint) {
            this.httpEndpoint = httpEndpoint;
            return this;
        }

        public Builder setHttpEndpoint(@Nullable String httpEndpoint) {
            this.httpEndpoint = Input.ofNullable(httpEndpoint);
            return this;
        }

        public Builder setHttpPutResponseHopLimit(@Nullable Input<Integer> httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }

        public Builder setHttpPutResponseHopLimit(@Nullable Integer httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = Input.ofNullable(httpPutResponseHopLimit);
            return this;
        }

        public Builder setHttpTokens(@Nullable Input<String> httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }

        public Builder setHttpTokens(@Nullable String httpTokens) {
            this.httpTokens = Input.ofNullable(httpTokens);
            return this;
        }
        public LaunchConfigurationMetadataOptionsArgs build() {
            return new LaunchConfigurationMetadataOptionsArgs(httpEndpoint, httpPutResponseHopLimit, httpTokens);
        }
    }
}
