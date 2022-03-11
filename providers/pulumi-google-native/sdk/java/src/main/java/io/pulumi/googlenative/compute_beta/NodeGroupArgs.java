// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.NodeGroupMaintenancePolicy;
import io.pulumi.googlenative.compute_beta.enums.NodeGroupStatus;
import io.pulumi.googlenative.compute_beta.inputs.NodeGroupAutoscalingPolicyArgs;
import io.pulumi.googlenative.compute_beta.inputs.NodeGroupMaintenanceWindowArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupArgs Empty = new NodeGroupArgs();

    /**
     * Specifies how autoscaling should behave.
     * 
     */
    @InputImport(name="autoscalingPolicy")
      private final @Nullable Output<NodeGroupAutoscalingPolicyArgs> autoscalingPolicy;

    public Output<NodeGroupAutoscalingPolicyArgs> getAutoscalingPolicy() {
        return this.autoscalingPolicy == null ? Output.empty() : this.autoscalingPolicy;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @InputImport(name="initialNodeCount", required=true)
      private final Output<String> initialNodeCount;

    public Output<String> getInitialNodeCount() {
        return this.initialNodeCount;
    }

    /**
     * An opaque location hint used to place the Node close to other resources. This field is for use by internal tools that use the public API. The location hint here on the NodeGroup overrides any location_hint present in the NodeTemplate.
     * 
     */
    @InputImport(name="locationHint")
      private final @Nullable Output<String> locationHint;

    public Output<String> getLocationHint() {
        return this.locationHint == null ? Output.empty() : this.locationHint;
    }

    /**
     * Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For more information, see Maintenance policies.
     * 
     */
    @InputImport(name="maintenancePolicy")
      private final @Nullable Output<NodeGroupMaintenancePolicy> maintenancePolicy;

    public Output<NodeGroupMaintenancePolicy> getMaintenancePolicy() {
        return this.maintenancePolicy == null ? Output.empty() : this.maintenancePolicy;
    }

    @InputImport(name="maintenanceWindow")
      private final @Nullable Output<NodeGroupMaintenanceWindowArgs> maintenanceWindow;

    public Output<NodeGroupMaintenanceWindowArgs> getMaintenanceWindow() {
        return this.maintenanceWindow == null ? Output.empty() : this.maintenanceWindow;
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * URL of the node template to create the node group from.
     * 
     */
    @InputImport(name="nodeTemplate")
      private final @Nullable Output<String> nodeTemplate;

    public Output<String> getNodeTemplate() {
        return this.nodeTemplate == null ? Output.empty() : this.nodeTemplate;
    }

    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    @InputImport(name="status")
      private final @Nullable Output<NodeGroupStatus> status;

    public Output<NodeGroupStatus> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    @InputImport(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public NodeGroupArgs(
        @Nullable Output<NodeGroupAutoscalingPolicyArgs> autoscalingPolicy,
        @Nullable Output<String> description,
        Output<String> initialNodeCount,
        @Nullable Output<String> locationHint,
        @Nullable Output<NodeGroupMaintenancePolicy> maintenancePolicy,
        @Nullable Output<NodeGroupMaintenanceWindowArgs> maintenanceWindow,
        @Nullable Output<String> name,
        @Nullable Output<String> nodeTemplate,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<NodeGroupStatus> status,
        @Nullable Output<String> zone) {
        this.autoscalingPolicy = autoscalingPolicy;
        this.description = description;
        this.initialNodeCount = Objects.requireNonNull(initialNodeCount, "expected parameter 'initialNodeCount' to be non-null");
        this.locationHint = locationHint;
        this.maintenancePolicy = maintenancePolicy;
        this.maintenanceWindow = maintenanceWindow;
        this.name = name;
        this.nodeTemplate = nodeTemplate;
        this.project = project;
        this.requestId = requestId;
        this.status = status;
        this.zone = zone;
    }

    private NodeGroupArgs() {
        this.autoscalingPolicy = Output.empty();
        this.description = Output.empty();
        this.initialNodeCount = Output.empty();
        this.locationHint = Output.empty();
        this.maintenancePolicy = Output.empty();
        this.maintenanceWindow = Output.empty();
        this.name = Output.empty();
        this.nodeTemplate = Output.empty();
        this.project = Output.empty();
        this.requestId = Output.empty();
        this.status = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NodeGroupAutoscalingPolicyArgs> autoscalingPolicy;
        private @Nullable Output<String> description;
        private Output<String> initialNodeCount;
        private @Nullable Output<String> locationHint;
        private @Nullable Output<NodeGroupMaintenancePolicy> maintenancePolicy;
        private @Nullable Output<NodeGroupMaintenanceWindowArgs> maintenanceWindow;
        private @Nullable Output<String> name;
        private @Nullable Output<String> nodeTemplate;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<NodeGroupStatus> status;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicy = defaults.autoscalingPolicy;
    	      this.description = defaults.description;
    	      this.initialNodeCount = defaults.initialNodeCount;
    	      this.locationHint = defaults.locationHint;
    	      this.maintenancePolicy = defaults.maintenancePolicy;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.name = defaults.name;
    	      this.nodeTemplate = defaults.nodeTemplate;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.status = defaults.status;
    	      this.zone = defaults.zone;
        }

        public Builder autoscalingPolicy(@Nullable Output<NodeGroupAutoscalingPolicyArgs> autoscalingPolicy) {
            this.autoscalingPolicy = autoscalingPolicy;
            return this;
        }

        public Builder autoscalingPolicy(@Nullable NodeGroupAutoscalingPolicyArgs autoscalingPolicy) {
            this.autoscalingPolicy = Output.ofNullable(autoscalingPolicy);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder initialNodeCount(Output<String> initialNodeCount) {
            this.initialNodeCount = Objects.requireNonNull(initialNodeCount);
            return this;
        }

        public Builder initialNodeCount(String initialNodeCount) {
            this.initialNodeCount = Output.of(Objects.requireNonNull(initialNodeCount));
            return this;
        }

        public Builder locationHint(@Nullable Output<String> locationHint) {
            this.locationHint = locationHint;
            return this;
        }

        public Builder locationHint(@Nullable String locationHint) {
            this.locationHint = Output.ofNullable(locationHint);
            return this;
        }

        public Builder maintenancePolicy(@Nullable Output<NodeGroupMaintenancePolicy> maintenancePolicy) {
            this.maintenancePolicy = maintenancePolicy;
            return this;
        }

        public Builder maintenancePolicy(@Nullable NodeGroupMaintenancePolicy maintenancePolicy) {
            this.maintenancePolicy = Output.ofNullable(maintenancePolicy);
            return this;
        }

        public Builder maintenanceWindow(@Nullable Output<NodeGroupMaintenanceWindowArgs> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder maintenanceWindow(@Nullable NodeGroupMaintenanceWindowArgs maintenanceWindow) {
            this.maintenanceWindow = Output.ofNullable(maintenanceWindow);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder nodeTemplate(@Nullable Output<String> nodeTemplate) {
            this.nodeTemplate = nodeTemplate;
            return this;
        }

        public Builder nodeTemplate(@Nullable String nodeTemplate) {
            this.nodeTemplate = Output.ofNullable(nodeTemplate);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }

        public Builder status(@Nullable Output<NodeGroupStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable NodeGroupStatus status) {
            this.status = Output.ofNullable(status);
            return this;
        }

        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            this.zone = Output.ofNullable(zone);
            return this;
        }
        public NodeGroupArgs build() {
            return new NodeGroupArgs(autoscalingPolicy, description, initialNodeCount, locationHint, maintenancePolicy, maintenanceWindow, name, nodeTemplate, project, requestId, status, zone);
        }
    }
}
