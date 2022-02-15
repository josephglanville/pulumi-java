// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionS3OriginConfig {
    private final @Nullable String originAccessIdentity;

    @OutputCustomType.Constructor({"originAccessIdentity"})
    private DistributionS3OriginConfig(@Nullable String originAccessIdentity) {
        this.originAccessIdentity = originAccessIdentity;
    }

    public Optional<String> getOriginAccessIdentity() {
        return Optional.ofNullable(this.originAccessIdentity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionS3OriginConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String originAccessIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionS3OriginConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originAccessIdentity = defaults.originAccessIdentity;
        }

        public Builder setOriginAccessIdentity(@Nullable String originAccessIdentity) {
            this.originAccessIdentity = originAccessIdentity;
            return this;
        }

        public DistributionS3OriginConfig build() {
            return new DistributionS3OriginConfig(originAccessIdentity);
        }
    }
}