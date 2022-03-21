// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceMetadataOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceMetadataOptionsArgs Empty = new InstanceMetadataOptionsArgs();

    /**
     * Whether the metadata service is available. Valid values include `enabled` or `disabled`. Defaults to `enabled`.
     * 
     */
    @Import(name="httpEndpoint")
      private final @Nullable Output<String> httpEndpoint;

    public Output<String> getHttpEndpoint() {
        return this.httpEndpoint == null ? Output.empty() : this.httpEndpoint;
    }

    /**
     * Desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Valid values are integer from `1` to `64`. Defaults to `1`.
     * 
     */
    @Import(name="httpPutResponseHopLimit")
      private final @Nullable Output<Integer> httpPutResponseHopLimit;

    public Output<Integer> getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit == null ? Output.empty() : this.httpPutResponseHopLimit;
    }

    /**
     * Whether or not the metadata service requires session tokens, also referred to as _Instance Metadata Service Version 2 (IMDSv2)_. Valid values include `optional` or `required`. Defaults to `optional`.
     * 
     */
    @Import(name="httpTokens")
      private final @Nullable Output<String> httpTokens;

    public Output<String> getHttpTokens() {
        return this.httpTokens == null ? Output.empty() : this.httpTokens;
    }

    /**
     * Enables or disables access to instance tags from the instance metadata service. Valid values include `enabled` or `disabled`. Defaults to `disabled`.
     * 
     */
    @Import(name="instanceMetadataTags")
      private final @Nullable Output<String> instanceMetadataTags;

    public Output<String> getInstanceMetadataTags() {
        return this.instanceMetadataTags == null ? Output.empty() : this.instanceMetadataTags;
    }

    public InstanceMetadataOptionsArgs(
        @Nullable Output<String> httpEndpoint,
        @Nullable Output<Integer> httpPutResponseHopLimit,
        @Nullable Output<String> httpTokens,
        @Nullable Output<String> instanceMetadataTags) {
        this.httpEndpoint = httpEndpoint;
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        this.httpTokens = httpTokens;
        this.instanceMetadataTags = instanceMetadataTags;
    }

    private InstanceMetadataOptionsArgs() {
        this.httpEndpoint = Output.empty();
        this.httpPutResponseHopLimit = Output.empty();
        this.httpTokens = Output.empty();
        this.instanceMetadataTags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMetadataOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> httpEndpoint;
        private @Nullable Output<Integer> httpPutResponseHopLimit;
        private @Nullable Output<String> httpTokens;
        private @Nullable Output<String> instanceMetadataTags;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMetadataOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpEndpoint = defaults.httpEndpoint;
    	      this.httpPutResponseHopLimit = defaults.httpPutResponseHopLimit;
    	      this.httpTokens = defaults.httpTokens;
    	      this.instanceMetadataTags = defaults.instanceMetadataTags;
        }

        public Builder httpEndpoint(@Nullable Output<String> httpEndpoint) {
            this.httpEndpoint = httpEndpoint;
            return this;
        }
        public Builder httpEndpoint(@Nullable String httpEndpoint) {
            this.httpEndpoint = Output.ofNullable(httpEndpoint);
            return this;
        }
        public Builder httpPutResponseHopLimit(@Nullable Output<Integer> httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }
        public Builder httpPutResponseHopLimit(@Nullable Integer httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = Output.ofNullable(httpPutResponseHopLimit);
            return this;
        }
        public Builder httpTokens(@Nullable Output<String> httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }
        public Builder httpTokens(@Nullable String httpTokens) {
            this.httpTokens = Output.ofNullable(httpTokens);
            return this;
        }
        public Builder instanceMetadataTags(@Nullable Output<String> instanceMetadataTags) {
            this.instanceMetadataTags = instanceMetadataTags;
            return this;
        }
        public Builder instanceMetadataTags(@Nullable String instanceMetadataTags) {
            this.instanceMetadataTags = Output.ofNullable(instanceMetadataTags);
            return this;
        }        public InstanceMetadataOptionsArgs build() {
            return new InstanceMetadataOptionsArgs(httpEndpoint, httpPutResponseHopLimit, httpTokens, instanceMetadataTags);
        }
    }
}
