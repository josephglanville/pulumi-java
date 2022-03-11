// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.NetworkInsightsAnalysisTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInsightsAnalysisArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsAnalysisArgs Empty = new NetworkInsightsAnalysisArgs();

    @InputImport(name="filterInArns")
      private final @Nullable Output<List<String>> filterInArns;

    public Output<List<String>> getFilterInArns() {
        return this.filterInArns == null ? Output.empty() : this.filterInArns;
    }

    @InputImport(name="networkInsightsPathId", required=true)
      private final Output<String> networkInsightsPathId;

    public Output<String> getNetworkInsightsPathId() {
        return this.networkInsightsPathId;
    }

    @InputImport(name="tags")
      private final @Nullable Output<List<NetworkInsightsAnalysisTagArgs>> tags;

    public Output<List<NetworkInsightsAnalysisTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public NetworkInsightsAnalysisArgs(
        @Nullable Output<List<String>> filterInArns,
        Output<String> networkInsightsPathId,
        @Nullable Output<List<NetworkInsightsAnalysisTagArgs>> tags) {
        this.filterInArns = filterInArns;
        this.networkInsightsPathId = Objects.requireNonNull(networkInsightsPathId, "expected parameter 'networkInsightsPathId' to be non-null");
        this.tags = tags;
    }

    private NetworkInsightsAnalysisArgs() {
        this.filterInArns = Output.empty();
        this.networkInsightsPathId = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> filterInArns;
        private Output<String> networkInsightsPathId;
        private @Nullable Output<List<NetworkInsightsAnalysisTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterInArns = defaults.filterInArns;
    	      this.networkInsightsPathId = defaults.networkInsightsPathId;
    	      this.tags = defaults.tags;
        }

        public Builder filterInArns(@Nullable Output<List<String>> filterInArns) {
            this.filterInArns = filterInArns;
            return this;
        }

        public Builder filterInArns(@Nullable List<String> filterInArns) {
            this.filterInArns = Output.ofNullable(filterInArns);
            return this;
        }

        public Builder networkInsightsPathId(Output<String> networkInsightsPathId) {
            this.networkInsightsPathId = Objects.requireNonNull(networkInsightsPathId);
            return this;
        }

        public Builder networkInsightsPathId(String networkInsightsPathId) {
            this.networkInsightsPathId = Output.of(Objects.requireNonNull(networkInsightsPathId));
            return this;
        }

        public Builder tags(@Nullable Output<List<NetworkInsightsAnalysisTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<NetworkInsightsAnalysisTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public NetworkInsightsAnalysisArgs build() {
            return new NetworkInsightsAnalysisArgs(filterInArns, networkInsightsPathId, tags);
        }
    }
}
