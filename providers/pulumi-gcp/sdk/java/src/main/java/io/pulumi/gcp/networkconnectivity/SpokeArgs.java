// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkconnectivity;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedInterconnectAttachmentsArgs;
import io.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesArgs;
import io.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpnTunnelsArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpokeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpokeArgs Empty = new SpokeArgs();

    /**
     * An optional description of the spoke.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Immutable. The URI of the hub that this spoke is attached to.
     * 
     */
    @InputImport(name="hub", required=true)
      private final Input<String> hub;

    public Input<String> getHub() {
        return this.hub;
    }

    /**
     * Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * A collection of VLAN attachment resources. These resources should be redundant attachments that all advertise the same prefixes to Google Cloud. Alternatively, in active/passive configurations, all attachments should be capable of advertising the same prefixes.
     * 
     */
    @InputImport(name="linkedInterconnectAttachments")
      private final @Nullable Input<SpokeLinkedInterconnectAttachmentsArgs> linkedInterconnectAttachments;

    public Input<SpokeLinkedInterconnectAttachmentsArgs> getLinkedInterconnectAttachments() {
        return this.linkedInterconnectAttachments == null ? Input.empty() : this.linkedInterconnectAttachments;
    }

    /**
     * The URIs of linked Router appliance resources
     * 
     */
    @InputImport(name="linkedRouterApplianceInstances")
      private final @Nullable Input<SpokeLinkedRouterApplianceInstancesArgs> linkedRouterApplianceInstances;

    public Input<SpokeLinkedRouterApplianceInstancesArgs> getLinkedRouterApplianceInstances() {
        return this.linkedRouterApplianceInstances == null ? Input.empty() : this.linkedRouterApplianceInstances;
    }

    /**
     * The URIs of linked VPN tunnel resources
     * 
     */
    @InputImport(name="linkedVpnTunnels")
      private final @Nullable Input<SpokeLinkedVpnTunnelsArgs> linkedVpnTunnels;

    public Input<SpokeLinkedVpnTunnelsArgs> getLinkedVpnTunnels() {
        return this.linkedVpnTunnels == null ? Input.empty() : this.linkedVpnTunnels;
    }

    /**
     * The location for the resource
     * 
     */
    @InputImport(name="location", required=true)
      private final Input<String> location;

    public Input<String> getLocation() {
        return this.location;
    }

    /**
     * Immutable. The name of the spoke. Spoke names must be unique.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The project for the resource
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public SpokeArgs(
        @Nullable Input<String> description,
        Input<String> hub,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<SpokeLinkedInterconnectAttachmentsArgs> linkedInterconnectAttachments,
        @Nullable Input<SpokeLinkedRouterApplianceInstancesArgs> linkedRouterApplianceInstances,
        @Nullable Input<SpokeLinkedVpnTunnelsArgs> linkedVpnTunnels,
        Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project) {
        this.description = description;
        this.hub = Objects.requireNonNull(hub, "expected parameter 'hub' to be non-null");
        this.labels = labels;
        this.linkedInterconnectAttachments = linkedInterconnectAttachments;
        this.linkedRouterApplianceInstances = linkedRouterApplianceInstances;
        this.linkedVpnTunnels = linkedVpnTunnels;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = name;
        this.project = project;
    }

    private SpokeArgs() {
        this.description = Input.empty();
        this.hub = Input.empty();
        this.labels = Input.empty();
        this.linkedInterconnectAttachments = Input.empty();
        this.linkedRouterApplianceInstances = Input.empty();
        this.linkedVpnTunnels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpokeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> hub;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<SpokeLinkedInterconnectAttachmentsArgs> linkedInterconnectAttachments;
        private @Nullable Input<SpokeLinkedRouterApplianceInstancesArgs> linkedRouterApplianceInstances;
        private @Nullable Input<SpokeLinkedVpnTunnelsArgs> linkedVpnTunnels;
        private Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(SpokeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.hub = defaults.hub;
    	      this.labels = defaults.labels;
    	      this.linkedInterconnectAttachments = defaults.linkedInterconnectAttachments;
    	      this.linkedRouterApplianceInstances = defaults.linkedRouterApplianceInstances;
    	      this.linkedVpnTunnels = defaults.linkedVpnTunnels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHub(Input<String> hub) {
            this.hub = Objects.requireNonNull(hub);
            return this;
        }

        public Builder setHub(String hub) {
            this.hub = Input.of(Objects.requireNonNull(hub));
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLinkedInterconnectAttachments(@Nullable Input<SpokeLinkedInterconnectAttachmentsArgs> linkedInterconnectAttachments) {
            this.linkedInterconnectAttachments = linkedInterconnectAttachments;
            return this;
        }

        public Builder setLinkedInterconnectAttachments(@Nullable SpokeLinkedInterconnectAttachmentsArgs linkedInterconnectAttachments) {
            this.linkedInterconnectAttachments = Input.ofNullable(linkedInterconnectAttachments);
            return this;
        }

        public Builder setLinkedRouterApplianceInstances(@Nullable Input<SpokeLinkedRouterApplianceInstancesArgs> linkedRouterApplianceInstances) {
            this.linkedRouterApplianceInstances = linkedRouterApplianceInstances;
            return this;
        }

        public Builder setLinkedRouterApplianceInstances(@Nullable SpokeLinkedRouterApplianceInstancesArgs linkedRouterApplianceInstances) {
            this.linkedRouterApplianceInstances = Input.ofNullable(linkedRouterApplianceInstances);
            return this;
        }

        public Builder setLinkedVpnTunnels(@Nullable Input<SpokeLinkedVpnTunnelsArgs> linkedVpnTunnels) {
            this.linkedVpnTunnels = linkedVpnTunnels;
            return this;
        }

        public Builder setLinkedVpnTunnels(@Nullable SpokeLinkedVpnTunnelsArgs linkedVpnTunnels) {
            this.linkedVpnTunnels = Input.ofNullable(linkedVpnTunnels);
            return this;
        }

        public Builder setLocation(Input<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Input.of(Objects.requireNonNull(location));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public SpokeArgs build() {
            return new SpokeArgs(description, hub, labels, linkedInterconnectAttachments, linkedRouterApplianceInstances, linkedVpnTunnels, location, name, project);
        }
    }
}
