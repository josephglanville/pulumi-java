// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInsightsAccessScopeResourceStatementRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsAccessScopeResourceStatementRequestArgs Empty = new NetworkInsightsAccessScopeResourceStatementRequestArgs();

    @InputImport(name="resourceTypes")
      private final @Nullable Output<List<String>> resourceTypes;

    public Output<List<String>> getResourceTypes() {
        return this.resourceTypes == null ? Output.empty() : this.resourceTypes;
    }

    @InputImport(name="resources")
      private final @Nullable Output<List<String>> resources;

    public Output<List<String>> getResources() {
        return this.resources == null ? Output.empty() : this.resources;
    }

    public NetworkInsightsAccessScopeResourceStatementRequestArgs(
        @Nullable Output<List<String>> resourceTypes,
        @Nullable Output<List<String>> resources) {
        this.resourceTypes = resourceTypes;
        this.resources = resources;
    }

    private NetworkInsightsAccessScopeResourceStatementRequestArgs() {
        this.resourceTypes = Output.empty();
        this.resources = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAccessScopeResourceStatementRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> resourceTypes;
        private @Nullable Output<List<String>> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAccessScopeResourceStatementRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceTypes = defaults.resourceTypes;
    	      this.resources = defaults.resources;
        }

        public Builder resourceTypes(@Nullable Output<List<String>> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        public Builder resourceTypes(@Nullable List<String> resourceTypes) {
            this.resourceTypes = Output.ofNullable(resourceTypes);
            return this;
        }

        public Builder resources(@Nullable Output<List<String>> resources) {
            this.resources = resources;
            return this;
        }

        public Builder resources(@Nullable List<String> resources) {
            this.resources = Output.ofNullable(resources);
            return this;
        }
        public NetworkInsightsAccessScopeResourceStatementRequestArgs build() {
            return new NetworkInsightsAccessScopeResourceStatementRequestArgs(resourceTypes, resources);
        }
    }
}
