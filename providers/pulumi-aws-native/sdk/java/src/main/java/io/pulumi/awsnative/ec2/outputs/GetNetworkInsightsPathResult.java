// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.NetworkInsightsPathTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworkInsightsPathResult {
    private final @Nullable String createdDate;
    private final @Nullable String networkInsightsPathArn;
    private final @Nullable String networkInsightsPathId;
    private final @Nullable List<NetworkInsightsPathTag> tags;

    @CustomType.Constructor
    private GetNetworkInsightsPathResult(
        @CustomType.Parameter("createdDate") @Nullable String createdDate,
        @CustomType.Parameter("networkInsightsPathArn") @Nullable String networkInsightsPathArn,
        @CustomType.Parameter("networkInsightsPathId") @Nullable String networkInsightsPathId,
        @CustomType.Parameter("tags") @Nullable List<NetworkInsightsPathTag> tags) {
        this.createdDate = createdDate;
        this.networkInsightsPathArn = networkInsightsPathArn;
        this.networkInsightsPathId = networkInsightsPathId;
        this.tags = tags;
    }

    public Optional<String> getCreatedDate() {
        return Optional.ofNullable(this.createdDate);
    }
    public Optional<String> getNetworkInsightsPathArn() {
        return Optional.ofNullable(this.networkInsightsPathArn);
    }
    public Optional<String> getNetworkInsightsPathId() {
        return Optional.ofNullable(this.networkInsightsPathId);
    }
    public List<NetworkInsightsPathTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInsightsPathResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createdDate;
        private @Nullable String networkInsightsPathArn;
        private @Nullable String networkInsightsPathId;
        private @Nullable List<NetworkInsightsPathTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkInsightsPathResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.networkInsightsPathArn = defaults.networkInsightsPathArn;
    	      this.networkInsightsPathId = defaults.networkInsightsPathId;
    	      this.tags = defaults.tags;
        }

        public Builder createdDate(@Nullable String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public Builder networkInsightsPathArn(@Nullable String networkInsightsPathArn) {
            this.networkInsightsPathArn = networkInsightsPathArn;
            return this;
        }
        public Builder networkInsightsPathId(@Nullable String networkInsightsPathId) {
            this.networkInsightsPathId = networkInsightsPathId;
            return this;
        }
        public Builder tags(@Nullable List<NetworkInsightsPathTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(NetworkInsightsPathTag... tags) {
            return tags(List.of(tags));
        }        public GetNetworkInsightsPathResult build() {
            return new GetNetworkInsightsPathResult(createdDate, networkInsightsPathArn, networkInsightsPathId, tags);
        }
    }
}
