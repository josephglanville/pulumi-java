// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInsightsAnalysisPortRange {
    private final @Nullable Integer from;
    private final @Nullable Integer to;

    @CustomType.Constructor
    private NetworkInsightsAnalysisPortRange(
        @CustomType.Parameter("from") @Nullable Integer from,
        @CustomType.Parameter("to") @Nullable Integer to) {
        this.from = from;
        this.to = to;
    }

    public Optional<Integer> getFrom() {
        return Optional.ofNullable(this.from);
    }
    public Optional<Integer> getTo() {
        return Optional.ofNullable(this.to);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisPortRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer from;
        private @Nullable Integer to;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisPortRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        public Builder from(@Nullable Integer from) {
            this.from = from;
            return this;
        }
        public Builder to(@Nullable Integer to) {
            this.to = to;
            return this;
        }        public NetworkInsightsAnalysisPortRange build() {
            return new NetworkInsightsAnalysisPortRange(from, to);
        }
    }
}
