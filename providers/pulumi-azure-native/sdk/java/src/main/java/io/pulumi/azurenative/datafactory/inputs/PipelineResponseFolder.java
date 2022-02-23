// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The folder that this Pipeline is in. If not specified, Pipeline will appear at the root level.
 * 
 */
public final class PipelineResponseFolder extends io.pulumi.resources.InvokeArgs {

    public static final PipelineResponseFolder Empty = new PipelineResponseFolder();

    /**
     * The name of the folder that this Pipeline is in.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public PipelineResponseFolder(@Nullable String name) {
        this.name = name;
    }

    private PipelineResponseFolder() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineResponseFolder defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineResponseFolder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public PipelineResponseFolder build() {
            return new PipelineResponseFolder(name);
        }
    }
}
