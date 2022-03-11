// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.InstanceGroupNamedPortArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupArgs Empty = new InstanceGroupArgs();

    /**
     * An optional textual description of the instance
     * group.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * List of instances in the group. They should be given
     * as either self_link or id. When adding instances they must all be in the same
     * network and zone as the instance group.
     * 
     */
    @InputImport(name="instances")
      private final @Nullable Output<List<String>> instances;

    public Output<List<String>> getInstances() {
        return this.instances == null ? Output.empty() : this.instances;
    }

    /**
     * The name which the port will be mapped to.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The named port configuration. See the section below
     * for details on configuration. Structure is documented below.
     * 
     */
    @InputImport(name="namedPorts")
      private final @Nullable Output<List<InstanceGroupNamedPortArgs>> namedPorts;

    public Output<List<InstanceGroupNamedPortArgs>> getNamedPorts() {
        return this.namedPorts == null ? Output.empty() : this.namedPorts;
    }

    /**
     * The URL of the network the instance group is in. If
     * this is different from the network where the instances are in, the creation
     * fails. Defaults to the network where the instances are in (if neither
     * `network` nor `instances` is specified, this field will be blank).
     * 
     */
    @InputImport(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The zone that this instance group should be created in.
     * 
     */
    @InputImport(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public InstanceGroupArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<String>> instances,
        @Nullable Output<String> name,
        @Nullable Output<List<InstanceGroupNamedPortArgs>> namedPorts,
        @Nullable Output<String> network,
        @Nullable Output<String> project,
        @Nullable Output<String> zone) {
        this.description = description;
        this.instances = instances;
        this.name = name;
        this.namedPorts = namedPorts;
        this.network = network;
        this.project = project;
        this.zone = zone;
    }

    private InstanceGroupArgs() {
        this.description = Output.empty();
        this.instances = Output.empty();
        this.name = Output.empty();
        this.namedPorts = Output.empty();
        this.network = Output.empty();
        this.project = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> instances;
        private @Nullable Output<String> name;
        private @Nullable Output<List<InstanceGroupNamedPortArgs>> namedPorts;
        private @Nullable Output<String> network;
        private @Nullable Output<String> project;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.instances = defaults.instances;
    	      this.name = defaults.name;
    	      this.namedPorts = defaults.namedPorts;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder instances(@Nullable Output<List<String>> instances) {
            this.instances = instances;
            return this;
        }

        public Builder instances(@Nullable List<String> instances) {
            this.instances = Output.ofNullable(instances);
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

        public Builder namedPorts(@Nullable Output<List<InstanceGroupNamedPortArgs>> namedPorts) {
            this.namedPorts = namedPorts;
            return this;
        }

        public Builder namedPorts(@Nullable List<InstanceGroupNamedPortArgs> namedPorts) {
            this.namedPorts = Output.ofNullable(namedPorts);
            return this;
        }

        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Output.ofNullable(network);
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

        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            this.zone = Output.ofNullable(zone);
            return this;
        }
        public InstanceGroupArgs build() {
            return new InstanceGroupArgs(description, instances, name, namedPorts, network, project, zone);
        }
    }
}
