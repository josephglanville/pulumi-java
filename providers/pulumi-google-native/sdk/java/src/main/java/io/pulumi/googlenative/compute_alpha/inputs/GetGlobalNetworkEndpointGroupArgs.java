// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGlobalNetworkEndpointGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGlobalNetworkEndpointGroupArgs Empty = new GetGlobalNetworkEndpointGroupArgs();

    @Import(name="networkEndpointGroup", required=true)
      private final String networkEndpointGroup;

    public String getNetworkEndpointGroup() {
        return this.networkEndpointGroup;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetGlobalNetworkEndpointGroupArgs(
        String networkEndpointGroup,
        @Nullable String project) {
        this.networkEndpointGroup = Objects.requireNonNull(networkEndpointGroup, "expected parameter 'networkEndpointGroup' to be non-null");
        this.project = project;
    }

    private GetGlobalNetworkEndpointGroupArgs() {
        this.networkEndpointGroup = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalNetworkEndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkEndpointGroup;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalNetworkEndpointGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkEndpointGroup = defaults.networkEndpointGroup;
    	      this.project = defaults.project;
        }

        public Builder networkEndpointGroup(String networkEndpointGroup) {
            this.networkEndpointGroup = Objects.requireNonNull(networkEndpointGroup);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetGlobalNetworkEndpointGroupArgs build() {
            return new GetGlobalNetworkEndpointGroupArgs(networkEndpointGroup, project);
        }
    }
}
