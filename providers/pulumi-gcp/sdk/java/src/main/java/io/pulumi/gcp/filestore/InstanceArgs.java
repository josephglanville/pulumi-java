// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.filestore;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * File system shares on the instance. For this version, only a
     * single file share is supported.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fileShares", required=true)
      private final Input<InstanceFileSharesArgs> fileShares;

    public Input<InstanceFileSharesArgs> getFileShares() {
        return this.fileShares;
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the fileshare (16 characters or less)
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * VPC networks to which the instance is connected. For this version,
     * only a single network is supported.
     * Structure is documented below.
     * 
     */
    @InputImport(name="networks", required=true)
      private final Input<List<InstanceNetworkArgs>> networks;

    public Input<List<InstanceNetworkArgs>> getNetworks() {
        return this.networks;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The service tier of the instance.
     * Possible values include: STANDARD, PREMIUM, BASIC_HDD, BASIC_SSD, HIGH_SCALE_SSD and ENTERPRISE (beta only)
     * 
     */
    @InputImport(name="tier", required=true)
      private final Input<String> tier;

    public Input<String> getTier() {
        return this.tier;
    }

    /**
     * - 
     * (Optional, Deprecated)
     * The name of the Filestore zone of the instance.
     * 
     * @deprecated
     * Deprecated in favor of location.
     * 
     */
    @Deprecated /* Deprecated in favor of location. */
    @InputImport(name="zone")
      private final @Nullable Input<String> zone;

    @Deprecated /* Deprecated in favor of location. */
    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public InstanceArgs(
        @Nullable Input<String> description,
        Input<InstanceFileSharesArgs> fileShares,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        Input<List<InstanceNetworkArgs>> networks,
        @Nullable Input<String> project,
        Input<String> tier,
        @Nullable Input<String> zone) {
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
        this.description = Input.empty();
        this.fileShares = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.networks = Input.empty();
        this.project = Input.empty();
        this.tier = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<InstanceFileSharesArgs> fileShares;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private Input<List<InstanceNetworkArgs>> networks;
        private @Nullable Input<String> project;
        private Input<String> tier;
        private @Nullable Input<String> zone;

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

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFileShares(Input<InstanceFileSharesArgs> fileShares) {
            this.fileShares = Objects.requireNonNull(fileShares);
            return this;
        }

        public Builder setFileShares(InstanceFileSharesArgs fileShares) {
            this.fileShares = Input.of(Objects.requireNonNull(fileShares));
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

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setNetworks(Input<List<InstanceNetworkArgs>> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }

        public Builder setNetworks(List<InstanceNetworkArgs> networks) {
            this.networks = Input.of(Objects.requireNonNull(networks));
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

        public Builder setTier(Input<String> tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }

        public Builder setTier(String tier) {
            this.tier = Input.of(Objects.requireNonNull(tier));
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public InstanceArgs build() {
            return new InstanceArgs(description, fileShares, labels, location, name, networks, project, tier, zone);
        }
    }
}
