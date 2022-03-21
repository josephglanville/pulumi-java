// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistryArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryArgs Empty = new RegistryArgs();

    /**
     * A description of the registry.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The Name of the registry.
     * 
     */
    @Import(name="registryName", required=true)
      private final Output<String> registryName;

    public Output<String> getRegistryName() {
        return this.registryName;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public RegistryArgs(
        @Nullable Output<String> description,
        Output<String> registryName,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.tags = tags;
    }

    private RegistryArgs() {
        this.description = Output.empty();
        this.registryName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> registryName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.registryName = defaults.registryName;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder registryName(Output<String> registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }
        public Builder registryName(String registryName) {
            this.registryName = Output.of(Objects.requireNonNull(registryName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public RegistryArgs build() {
            return new RegistryArgs(description, registryName, tags);
        }
    }
}
