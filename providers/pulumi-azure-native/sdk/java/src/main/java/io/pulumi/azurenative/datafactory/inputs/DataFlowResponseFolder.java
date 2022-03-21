// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The folder that this data flow is in. If not specified, Data flow will appear at the root level.
 * 
 */
public final class DataFlowResponseFolder extends io.pulumi.resources.InvokeArgs {

    public static final DataFlowResponseFolder Empty = new DataFlowResponseFolder();

    /**
     * The name of the folder that this data flow is in.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public DataFlowResponseFolder(@Nullable String name) {
        this.name = name;
    }

    private DataFlowResponseFolder() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataFlowResponseFolder defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataFlowResponseFolder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public DataFlowResponseFolder build() {
            return new DataFlowResponseFolder(name);
        }
    }
}
