// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Gets or sets the tags.
 * 
 */
public final class MigrateProjectTagsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrateProjectTagsArgs Empty = new MigrateProjectTagsArgs();

    @InputImport(name="additionalProperties")
      private final @Nullable Output<String> additionalProperties;

    public Output<String> getAdditionalProperties() {
        return this.additionalProperties == null ? Output.empty() : this.additionalProperties;
    }

    public MigrateProjectTagsArgs(@Nullable Output<String> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    private MigrateProjectTagsArgs() {
        this.additionalProperties = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateProjectTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> additionalProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateProjectTagsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalProperties = defaults.additionalProperties;
        }

        public Builder additionalProperties(@Nullable Output<String> additionalProperties) {
            this.additionalProperties = additionalProperties;
            return this;
        }

        public Builder additionalProperties(@Nullable String additionalProperties) {
            this.additionalProperties = Output.ofNullable(additionalProperties);
            return this;
        }
        public MigrateProjectTagsArgs build() {
            return new MigrateProjectTagsArgs(additionalProperties);
        }
    }
}
