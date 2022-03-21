// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PresignedUrlConfigProperties {
    private final @Nullable Integer expiresInSec;
    private final String roleArn;

    @CustomType.Constructor
    private PresignedUrlConfigProperties(
        @CustomType.Parameter("expiresInSec") @Nullable Integer expiresInSec,
        @CustomType.Parameter("roleArn") String roleArn) {
        this.expiresInSec = expiresInSec;
        this.roleArn = roleArn;
    }

    public Optional<Integer> getExpiresInSec() {
        return Optional.ofNullable(this.expiresInSec);
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PresignedUrlConfigProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer expiresInSec;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(PresignedUrlConfigProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiresInSec = defaults.expiresInSec;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder expiresInSec(@Nullable Integer expiresInSec) {
            this.expiresInSec = expiresInSec;
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }        public PresignedUrlConfigProperties build() {
            return new PresignedUrlConfigProperties(expiresInSec, roleArn);
        }
    }
}
