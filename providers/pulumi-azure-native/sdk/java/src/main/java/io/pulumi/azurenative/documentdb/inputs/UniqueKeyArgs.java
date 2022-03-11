// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The unique key on that enforces uniqueness constraint on documents in the collection in the Azure Cosmos DB service.
 * 
 */
public final class UniqueKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final UniqueKeyArgs Empty = new UniqueKeyArgs();

    /**
     * List of paths must be unique for each document in the Azure Cosmos DB service
     * 
     */
    @InputImport(name="paths")
      private final @Nullable Output<List<String>> paths;

    public Output<List<String>> getPaths() {
        return this.paths == null ? Output.empty() : this.paths;
    }

    public UniqueKeyArgs(@Nullable Output<List<String>> paths) {
        this.paths = paths;
    }

    private UniqueKeyArgs() {
        this.paths = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UniqueKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> paths;

        public Builder() {
    	      // Empty
        }

        public Builder(UniqueKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
        }

        public Builder paths(@Nullable Output<List<String>> paths) {
            this.paths = paths;
            return this;
        }

        public Builder paths(@Nullable List<String> paths) {
            this.paths = Output.ofNullable(paths);
            return this;
        }
        public UniqueKeyArgs build() {
            return new UniqueKeyArgs(paths);
        }
    }
}
