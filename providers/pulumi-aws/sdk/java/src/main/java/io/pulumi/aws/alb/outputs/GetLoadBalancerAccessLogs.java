// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLoadBalancerAccessLogs {
    private final String bucket;
    private final Boolean enabled;
    private final String prefix;

    @CustomType.Constructor
    private GetLoadBalancerAccessLogs(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("prefix") String prefix) {
        this.bucket = bucket;
        this.enabled = enabled;
        this.prefix = prefix;
    }

    public String getBucket() {
        return this.bucket;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerAccessLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private Boolean enabled;
        private String prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerAccessLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.enabled = defaults.enabled;
    	      this.prefix = defaults.prefix;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }        public GetLoadBalancerAccessLogs build() {
            return new GetLoadBalancerAccessLogs(bucket, enabled, prefix);
        }
    }
}
