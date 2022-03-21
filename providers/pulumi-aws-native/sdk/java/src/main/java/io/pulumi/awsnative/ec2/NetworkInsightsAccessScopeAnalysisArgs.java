// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.NetworkInsightsAccessScopeAnalysisTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInsightsAccessScopeAnalysisArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsAccessScopeAnalysisArgs Empty = new NetworkInsightsAccessScopeAnalysisArgs();

    @Import(name="networkInsightsAccessScopeId", required=true)
      private final Output<String> networkInsightsAccessScopeId;

    public Output<String> getNetworkInsightsAccessScopeId() {
        return this.networkInsightsAccessScopeId;
    }

    @Import(name="tags")
      private final @Nullable Output<List<NetworkInsightsAccessScopeAnalysisTagArgs>> tags;

    public Output<List<NetworkInsightsAccessScopeAnalysisTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public NetworkInsightsAccessScopeAnalysisArgs(
        Output<String> networkInsightsAccessScopeId,
        @Nullable Output<List<NetworkInsightsAccessScopeAnalysisTagArgs>> tags) {
        this.networkInsightsAccessScopeId = Objects.requireNonNull(networkInsightsAccessScopeId, "expected parameter 'networkInsightsAccessScopeId' to be non-null");
        this.tags = tags;
    }

    private NetworkInsightsAccessScopeAnalysisArgs() {
        this.networkInsightsAccessScopeId = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAccessScopeAnalysisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> networkInsightsAccessScopeId;
        private @Nullable Output<List<NetworkInsightsAccessScopeAnalysisTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAccessScopeAnalysisArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInsightsAccessScopeId = defaults.networkInsightsAccessScopeId;
    	      this.tags = defaults.tags;
        }

        public Builder networkInsightsAccessScopeId(Output<String> networkInsightsAccessScopeId) {
            this.networkInsightsAccessScopeId = Objects.requireNonNull(networkInsightsAccessScopeId);
            return this;
        }
        public Builder networkInsightsAccessScopeId(String networkInsightsAccessScopeId) {
            this.networkInsightsAccessScopeId = Output.of(Objects.requireNonNull(networkInsightsAccessScopeId));
            return this;
        }
        public Builder tags(@Nullable Output<List<NetworkInsightsAccessScopeAnalysisTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<NetworkInsightsAccessScopeAnalysisTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(NetworkInsightsAccessScopeAnalysisTagArgs... tags) {
            return tags(List.of(tags));
        }        public NetworkInsightsAccessScopeAnalysisArgs build() {
            return new NetworkInsightsAccessScopeAnalysisArgs(networkInsightsAccessScopeId, tags);
        }
    }
}
