// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LaunchTemplateMetadataOptions {
    /**
     * Whether the metadata service is available. Can be `"enabled"` or `"disabled"`. (Default: `"enabled"`).
     * 
     */
    private final @Nullable String httpEndpoint;
    /**
     * Enables or disables the IPv6 endpoint for the instance metadata service. (Default: `disabled`).
     * 
     */
    private final @Nullable String httpProtocolIpv6;
    /**
     * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Can be an integer from `1` to `64`. (Default: `1`).
     * 
     */
    private final @Nullable Integer httpPutResponseHopLimit;
    /**
     * Whether or not the metadata service requires session tokens, also referred to as _Instance Metadata Service Version 2 (IMDSv2)_. Can be `"optional"` or `"required"`. (Default: `"optional"`).
     * 
     */
    private final @Nullable String httpTokens;
    /**
     * Enables or disables access to instance tags from the instance metadata service. (Default: `disabled`).
     * 
     */
    private final @Nullable String instanceMetadataTags;

    @OutputCustomType.Constructor
    private LaunchTemplateMetadataOptions(
        @OutputCustomType.Parameter("httpEndpoint") @Nullable String httpEndpoint,
        @OutputCustomType.Parameter("httpProtocolIpv6") @Nullable String httpProtocolIpv6,
        @OutputCustomType.Parameter("httpPutResponseHopLimit") @Nullable Integer httpPutResponseHopLimit,
        @OutputCustomType.Parameter("httpTokens") @Nullable String httpTokens,
        @OutputCustomType.Parameter("instanceMetadataTags") @Nullable String instanceMetadataTags) {
        this.httpEndpoint = httpEndpoint;
        this.httpProtocolIpv6 = httpProtocolIpv6;
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        this.httpTokens = httpTokens;
        this.instanceMetadataTags = instanceMetadataTags;
    }

    /**
     * Whether the metadata service is available. Can be `"enabled"` or `"disabled"`. (Default: `"enabled"`).
     * 
    */
    public Optional<String> getHttpEndpoint() {
        return Optional.ofNullable(this.httpEndpoint);
    }
    /**
     * Enables or disables the IPv6 endpoint for the instance metadata service. (Default: `disabled`).
     * 
    */
    public Optional<String> getHttpProtocolIpv6() {
        return Optional.ofNullable(this.httpProtocolIpv6);
    }
    /**
     * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Can be an integer from `1` to `64`. (Default: `1`).
     * 
    */
    public Optional<Integer> getHttpPutResponseHopLimit() {
        return Optional.ofNullable(this.httpPutResponseHopLimit);
    }
    /**
     * Whether or not the metadata service requires session tokens, also referred to as _Instance Metadata Service Version 2 (IMDSv2)_. Can be `"optional"` or `"required"`. (Default: `"optional"`).
     * 
    */
    public Optional<String> getHttpTokens() {
        return Optional.ofNullable(this.httpTokens);
    }
    /**
     * Enables or disables access to instance tags from the instance metadata service. (Default: `disabled`).
     * 
    */
    public Optional<String> getInstanceMetadataTags() {
        return Optional.ofNullable(this.instanceMetadataTags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateMetadataOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String httpEndpoint;
        private @Nullable String httpProtocolIpv6;
        private @Nullable Integer httpPutResponseHopLimit;
        private @Nullable String httpTokens;
        private @Nullable String instanceMetadataTags;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateMetadataOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpEndpoint = defaults.httpEndpoint;
    	      this.httpProtocolIpv6 = defaults.httpProtocolIpv6;
    	      this.httpPutResponseHopLimit = defaults.httpPutResponseHopLimit;
    	      this.httpTokens = defaults.httpTokens;
    	      this.instanceMetadataTags = defaults.instanceMetadataTags;
        }

        public Builder setHttpEndpoint(@Nullable String httpEndpoint) {
            this.httpEndpoint = httpEndpoint;
            return this;
        }

        public Builder setHttpProtocolIpv6(@Nullable String httpProtocolIpv6) {
            this.httpProtocolIpv6 = httpProtocolIpv6;
            return this;
        }

        public Builder setHttpPutResponseHopLimit(@Nullable Integer httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }

        public Builder setHttpTokens(@Nullable String httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }

        public Builder setInstanceMetadataTags(@Nullable String instanceMetadataTags) {
            this.instanceMetadataTags = instanceMetadataTags;
            return this;
        }
        public LaunchTemplateMetadataOptions build() {
            return new LaunchTemplateMetadataOptions(httpEndpoint, httpProtocolIpv6, httpPutResponseHopLimit, httpTokens, instanceMetadataTags);
        }
    }
}
