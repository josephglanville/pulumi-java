// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAccessPointResult {
    private final @Nullable String arn;
    private final @Nullable Object policy;

    @OutputCustomType.Constructor({"arn","policy"})
    private GetAccessPointResult(
        @Nullable String arn,
        @Nullable Object policy) {
        this.arn = arn;
        this.policy = policy;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<Object> getPolicy() {
        return Optional.ofNullable(this.policy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Object policy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.policy = defaults.policy;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setPolicy(@Nullable Object policy) {
            this.policy = policy;
            return this;
        }

        public GetAccessPointResult build() {
            return new GetAccessPointResult(arn, policy);
        }
    }
}