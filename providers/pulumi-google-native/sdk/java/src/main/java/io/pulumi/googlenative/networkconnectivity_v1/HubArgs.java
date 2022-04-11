// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.networkconnectivity_v1.inputs.RoutingVPCArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HubArgs extends io.pulumi.resources.ResourceArgs {

    public static final HubArgs Empty = new HubArgs();

    /**
     * An optional description of the hub.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="hubId", required=true)
      private final Output<String> hubId;

    public Output<String> getHubId() {
        return this.hubId;
    }

    /**
     * Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Immutable. The name of the hub. Hub names must be unique. They use the following form: `projects/{project_number}/locations/global/hubs/{hub_id}`
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * The VPC networks associated with this hub's spokes. This field is read-only. Network Connectivity Center automatically populates it based on the set of spokes attached to the hub.
     * 
     */
    @Import(name="routingVpcs")
      private final @Nullable Output<List<RoutingVPCArgs>> routingVpcs;

    public Output<List<RoutingVPCArgs>> getRoutingVpcs() {
        return this.routingVpcs == null ? Codegen.empty() : this.routingVpcs;
    }

    public HubArgs(
        @Nullable Output<String> description,
        Output<String> hubId,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<List<RoutingVPCArgs>> routingVpcs) {
        this.description = description;
        this.hubId = Objects.requireNonNull(hubId, "expected parameter 'hubId' to be non-null");
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.routingVpcs = routingVpcs;
    }

    private HubArgs() {
        this.description = Codegen.empty();
        this.hubId = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.routingVpcs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> hubId;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<List<RoutingVPCArgs>> routingVpcs;

        public Builder() {
    	      // Empty
        }

        public Builder(HubArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.hubId = defaults.hubId;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.routingVpcs = defaults.routingVpcs;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder hubId(Output<String> hubId) {
            this.hubId = Objects.requireNonNull(hubId);
            return this;
        }
        public Builder hubId(String hubId) {
            this.hubId = Output.of(Objects.requireNonNull(hubId));
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder routingVpcs(@Nullable Output<List<RoutingVPCArgs>> routingVpcs) {
            this.routingVpcs = routingVpcs;
            return this;
        }
        public Builder routingVpcs(@Nullable List<RoutingVPCArgs> routingVpcs) {
            this.routingVpcs = Codegen.ofNullable(routingVpcs);
            return this;
        }
        public Builder routingVpcs(RoutingVPCArgs... routingVpcs) {
            return routingVpcs(List.of(routingVpcs));
        }        public HubArgs build() {
            return new HubArgs(description, hubId, labels, name, project, requestId, routingVpcs);
        }
    }
}
