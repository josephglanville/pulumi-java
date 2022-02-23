// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleAssetPropertyTimestamp extends io.pulumi.resources.InvokeArgs {

    public static final TopicRuleAssetPropertyTimestamp Empty = new TopicRuleAssetPropertyTimestamp();

    @InputImport(name="offsetInNanos")
      private final @Nullable String offsetInNanos;

    public Optional<String> getOffsetInNanos() {
        return this.offsetInNanos == null ? Optional.empty() : Optional.ofNullable(this.offsetInNanos);
    }

    @InputImport(name="timeInSeconds", required=true)
      private final String timeInSeconds;

    public String getTimeInSeconds() {
        return this.timeInSeconds;
    }

    public TopicRuleAssetPropertyTimestamp(
        @Nullable String offsetInNanos,
        String timeInSeconds) {
        this.offsetInNanos = offsetInNanos;
        this.timeInSeconds = Objects.requireNonNull(timeInSeconds, "expected parameter 'timeInSeconds' to be non-null");
    }

    private TopicRuleAssetPropertyTimestamp() {
        this.offsetInNanos = null;
        this.timeInSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleAssetPropertyTimestamp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String offsetInNanos;
        private String timeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleAssetPropertyTimestamp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offsetInNanos = defaults.offsetInNanos;
    	      this.timeInSeconds = defaults.timeInSeconds;
        }

        public Builder setOffsetInNanos(@Nullable String offsetInNanos) {
            this.offsetInNanos = offsetInNanos;
            return this;
        }

        public Builder setTimeInSeconds(String timeInSeconds) {
            this.timeInSeconds = Objects.requireNonNull(timeInSeconds);
            return this;
        }
        public TopicRuleAssetPropertyTimestamp build() {
            return new TopicRuleAssetPropertyTimestamp(offsetInNanos, timeInSeconds);
        }
    }
}
