// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotInstanceRequestLaunchTemplateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotInstanceRequestLaunchTemplateGetArgs Empty = new SpotInstanceRequestLaunchTemplateGetArgs();

    /**
     * The ID of the launch template. Conflicts with `name`.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The name of the launch template. Conflicts with `id`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Template version. Can be a specific version number, `$Latest` or `$Default`. The default value is `$Default`.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public SpotInstanceRequestLaunchTemplateGetArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        @Nullable Output<String> version) {
        this.id = id;
        this.name = name;
        this.version = version;
    }

    private SpotInstanceRequestLaunchTemplateGetArgs() {
        this.id = Output.empty();
        this.name = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotInstanceRequestLaunchTemplateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotInstanceRequestLaunchTemplateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
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
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }        public SpotInstanceRequestLaunchTemplateGetArgs build() {
            return new SpotInstanceRequestLaunchTemplateGetArgs(id, name, version);
        }
    }
}
