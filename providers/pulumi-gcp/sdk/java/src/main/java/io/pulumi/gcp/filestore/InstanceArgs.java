// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.filestore;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.filestore.inputs.InstanceFileSharesArgs;
import io.pulumi.gcp.filestore.inputs.InstanceNetworkArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * A description of the instance.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * File system shares on the instance. For this version, only a
     * single file share is supported.
     * Structure is documented below.
     * 
     */
    @Import(name="fileShares", required=true)
      private final Output<InstanceFileSharesArgs> fileShares;

    public Output<InstanceFileSharesArgs> getFileShares() {
        return this.fileShares;
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the fileshare (16 characters or less)
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * VPC networks to which the instance is connected. For this version,
     * only a single network is supported.
     * Structure is documented below.
     * 
     */
    @Import(name="networks", required=true)
      private final Output<List<InstanceNetworkArgs>> networks;

    public Output<List<InstanceNetworkArgs>> getNetworks() {
        return this.networks;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The service tier of the instance.
     * Possible values include: STANDARD, PREMIUM, BASIC_HDD, BASIC_SSD, HIGH_SCALE_SSD and ENTERPRISE (beta only)
     * 
     */
    @Import(name="tier", required=true)
      private final Output<String> tier;

    public Output<String> getTier() {
        return this.tier;
    }

    /**
     * - 
     * (Optional, Deprecated)
     * The name of the Filestore zone of the instance.
     * 
     * @Deprecated
     * Deprecated in favor of location.
     * 
     */
    @Deprecated /* Deprecated in favor of location. */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    @Deprecated /* Deprecated in favor of location. */
    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public InstanceArgs(
        @Nullable Output<String> description,
        Output<InstanceFileSharesArgs> fileShares,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        Output<List<InstanceNetworkArgs>> networks,
        @Nullable Output<String> project,
        Output<String> tier,
        @Nullable Output<String> zone) {
        this.description = description;
        this.fileShares = Objects.requireNonNull(fileShares, "expected parameter 'fileShares' to be non-null");
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.networks = Objects.requireNonNull(networks, "expected parameter 'networks' to be non-null");
        this.project = project;
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
        this.zone = zone;
    }

    private InstanceArgs() {
        this.description = Output.empty();
        this.fileShares = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.networks = Output.empty();
        this.project = Output.empty();
        this.tier = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<InstanceFileSharesArgs> fileShares;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private Output<List<InstanceNetworkArgs>> networks;
        private @Nullable Output<String> project;
        private Output<String> tier;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.fileShares = defaults.fileShares;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networks = defaults.networks;
    	      this.project = defaults.project;
    	      this.tier = defaults.tier;
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
        public Builder fileShares(Output<InstanceFileSharesArgs> fileShares) {
            this.fileShares = Objects.requireNonNull(fileShares);
            return this;
        }
        public Builder fileShares(InstanceFileSharesArgs fileShares) {
            this.fileShares = Output.of(Objects.requireNonNull(fileShares));
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
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
        public Builder networks(Output<List<InstanceNetworkArgs>> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }
        public Builder networks(List<InstanceNetworkArgs> networks) {
            this.networks = Output.of(Objects.requireNonNull(networks));
            return this;
        }
        public Builder networks(InstanceNetworkArgs... networks) {
            return networks(List.of(networks));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder tier(Output<String> tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Output.of(Objects.requireNonNull(tier));
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Output.ofNullable(zone);
            return this;
        }        public InstanceArgs build() {
            return new InstanceArgs(description, fileShares, labels, location, name, networks, project, tier, zone);
        }
    }
}
