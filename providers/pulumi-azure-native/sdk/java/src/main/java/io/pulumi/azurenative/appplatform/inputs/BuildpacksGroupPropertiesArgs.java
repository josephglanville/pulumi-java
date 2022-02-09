// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.inputs.BuildpackPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BuildpacksGroupPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BuildpacksGroupPropertiesArgs Empty = new BuildpacksGroupPropertiesArgs();

    @InputImport(name="buildpacks")
    private final @Nullable Input<List<BuildpackPropertiesArgs>> buildpacks;

    public Input<List<BuildpackPropertiesArgs>> getBuildpacks() {
        return this.buildpacks == null ? Input.empty() : this.buildpacks;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public BuildpacksGroupPropertiesArgs(
        @Nullable Input<List<BuildpackPropertiesArgs>> buildpacks,
        @Nullable Input<String> name) {
        this.buildpacks = buildpacks;
        this.name = name;
    }

    private BuildpacksGroupPropertiesArgs() {
        this.buildpacks = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildpacksGroupPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<BuildpackPropertiesArgs>> buildpacks;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildpacksGroupPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildpacks = defaults.buildpacks;
    	      this.name = defaults.name;
        }

        public Builder setBuildpacks(@Nullable Input<List<BuildpackPropertiesArgs>> buildpacks) {
            this.buildpacks = buildpacks;
            return this;
        }

        public Builder setBuildpacks(@Nullable List<BuildpackPropertiesArgs> buildpacks) {
            this.buildpacks = Input.ofNullable(buildpacks);
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

        public BuildpacksGroupPropertiesArgs build() {
            return new BuildpacksGroupPropertiesArgs(buildpacks, name);
        }
    }
}
