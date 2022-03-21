// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.fms.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNotificationChannelResult {
    private final @Nullable String snsRoleName;
    private final @Nullable String snsTopicArn;

    @CustomType.Constructor
    private GetNotificationChannelResult(
        @CustomType.Parameter("snsRoleName") @Nullable String snsRoleName,
        @CustomType.Parameter("snsTopicArn") @Nullable String snsTopicArn) {
        this.snsRoleName = snsRoleName;
        this.snsTopicArn = snsTopicArn;
    }

    public Optional<String> getSnsRoleName() {
        return Optional.ofNullable(this.snsRoleName);
    }
    public Optional<String> getSnsTopicArn() {
        return Optional.ofNullable(this.snsTopicArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationChannelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String snsRoleName;
        private @Nullable String snsTopicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNotificationChannelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.snsRoleName = defaults.snsRoleName;
    	      this.snsTopicArn = defaults.snsTopicArn;
        }

        public Builder snsRoleName(@Nullable String snsRoleName) {
            this.snsRoleName = snsRoleName;
            return this;
        }
        public Builder snsTopicArn(@Nullable String snsTopicArn) {
            this.snsTopicArn = snsTopicArn;
            return this;
        }        public GetNotificationChannelResult build() {
            return new GetNotificationChannelResult(snsRoleName, snsTopicArn);
        }
    }
}
