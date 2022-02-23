// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudrun.inputs.DomainMappingMetadataGetArgs;
import io.pulumi.gcp.cloudrun.inputs.DomainMappingSpecGetArgs;
import io.pulumi.gcp.cloudrun.inputs.DomainMappingStatusGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainMappingState extends io.pulumi.resources.ResourceArgs {

    public static final DomainMappingState Empty = new DomainMappingState();

    /**
     * The location of the cloud run instance. eg us-central1
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Metadata associated with this DomainMapping.
     * Structure is documented below.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<DomainMappingMetadataGetArgs> metadata;

    public Input<DomainMappingMetadataGetArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Name should be a [verified](https://support.google.com/webmasters/answer/9008080) domain
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
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
     * The spec for this DomainMapping.
     * Structure is documented below.
     * 
     */
    @InputImport(name="spec")
      private final @Nullable Input<DomainMappingSpecGetArgs> spec;

    public Input<DomainMappingSpecGetArgs> getSpec() {
        return this.spec == null ? Input.empty() : this.spec;
    }

    /**
     * The current status of the DomainMapping.
     * 
     */
    @InputImport(name="statuses")
      private final @Nullable Input<List<DomainMappingStatusGetArgs>> statuses;

    public Input<List<DomainMappingStatusGetArgs>> getStatuses() {
        return this.statuses == null ? Input.empty() : this.statuses;
    }

    public DomainMappingState(
        @Nullable Input<String> location,
        @Nullable Input<DomainMappingMetadataGetArgs> metadata,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<DomainMappingSpecGetArgs> spec,
        @Nullable Input<List<DomainMappingStatusGetArgs>> statuses) {
        this.location = location;
        this.metadata = metadata;
        this.name = name;
        this.project = project;
        this.spec = spec;
        this.statuses = statuses;
    }

    private DomainMappingState() {
        this.location = Input.empty();
        this.metadata = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.spec = Input.empty();
        this.statuses = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private @Nullable Input<DomainMappingMetadataGetArgs> metadata;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<DomainMappingSpecGetArgs> spec;
        private @Nullable Input<List<DomainMappingStatusGetArgs>> statuses;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.spec = defaults.spec;
    	      this.statuses = defaults.statuses;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMetadata(@Nullable Input<DomainMappingMetadataGetArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable DomainMappingMetadataGetArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
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

        public Builder setSpec(@Nullable Input<DomainMappingSpecGetArgs> spec) {
            this.spec = spec;
            return this;
        }

        public Builder setSpec(@Nullable DomainMappingSpecGetArgs spec) {
            this.spec = Input.ofNullable(spec);
            return this;
        }

        public Builder setStatuses(@Nullable Input<List<DomainMappingStatusGetArgs>> statuses) {
            this.statuses = statuses;
            return this;
        }

        public Builder setStatuses(@Nullable List<DomainMappingStatusGetArgs> statuses) {
            this.statuses = Input.ofNullable(statuses);
            return this;
        }
        public DomainMappingState build() {
            return new DomainMappingState(location, metadata, name, project, spec, statuses);
        }
    }
}
