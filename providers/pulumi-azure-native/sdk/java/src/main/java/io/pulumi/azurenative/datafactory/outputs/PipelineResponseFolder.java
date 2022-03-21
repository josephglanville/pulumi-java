// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineResponseFolder {
    /**
     * The name of the folder that this Pipeline is in.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private PipelineResponseFolder(@CustomType.Parameter("name") @Nullable String name) {
        this.name = name;
    }

    /**
     * The name of the folder that this Pipeline is in.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
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

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public PipelineResponseFolder build() {
            return new PipelineResponseFolder(name);
        }
    }
}
