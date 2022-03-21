// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.migrate.inputs.MigrateProjectPropertiesArgs;
import io.pulumi.azurenative.migrate.inputs.MigrateProjectTagsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MigrateProjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrateProjectArgs Empty = new MigrateProjectArgs();

    /**
     * Gets or sets the eTag for concurrency control.
     * 
     */
    @Import(name="eTag")
      private final @Nullable Output<String> eTag;

    public Output<String> getETag() {
        return this.eTag == null ? Output.empty() : this.eTag;
    }

    /**
     * Gets or sets the Azure location in which migrate project is created.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @Import(name="migrateProjectName")
      private final @Nullable Output<String> migrateProjectName;

    public Output<String> getMigrateProjectName() {
        return this.migrateProjectName == null ? Output.empty() : this.migrateProjectName;
    }

    /**
     * Gets or sets the nested properties.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<MigrateProjectPropertiesArgs> properties;

    public Output<MigrateProjectPropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * Name of the Azure Resource Group that migrate project is part of.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<MigrateProjectTagsArgs> tags;

    public Output<MigrateProjectTagsArgs> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public MigrateProjectArgs(
        @Nullable Output<String> eTag,
        @Nullable Output<String> location,
        @Nullable Output<String> migrateProjectName,
        @Nullable Output<MigrateProjectPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<MigrateProjectTagsArgs> tags) {
        this.eTag = eTag;
        this.location = location;
        this.migrateProjectName = migrateProjectName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private MigrateProjectArgs() {
        this.eTag = Output.empty();
        this.location = Output.empty();
        this.migrateProjectName = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> eTag;
        private @Nullable Output<String> location;
        private @Nullable Output<String> migrateProjectName;
        private @Nullable Output<MigrateProjectPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<MigrateProjectTagsArgs> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.location = defaults.location;
    	      this.migrateProjectName = defaults.migrateProjectName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder eTag(@Nullable Output<String> eTag) {
            this.eTag = eTag;
            return this;
        }
        public Builder eTag(@Nullable String eTag) {
            this.eTag = Output.ofNullable(eTag);
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
        public Builder migrateProjectName(@Nullable Output<String> migrateProjectName) {
            this.migrateProjectName = migrateProjectName;
            return this;
        }
        public Builder migrateProjectName(@Nullable String migrateProjectName) {
            this.migrateProjectName = Output.ofNullable(migrateProjectName);
            return this;
        }
        public Builder properties(@Nullable Output<MigrateProjectPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable MigrateProjectPropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<MigrateProjectTagsArgs> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable MigrateProjectTagsArgs tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public MigrateProjectArgs build() {
            return new MigrateProjectArgs(eTag, location, migrateProjectName, properties, resourceGroupName, tags);
        }
    }
}
