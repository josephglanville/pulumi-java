// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.enums.SpatialType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpatialSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpatialSpecArgs Empty = new SpatialSpecArgs();

    /**
     * The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*)
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * List of path's spatial type
     * 
     */
    @Import(name="types")
      private final @Nullable Output<List<Either<String,SpatialType>>> types;

    public Output<List<Either<String,SpatialType>>> getTypes() {
        return this.types == null ? Codegen.empty() : this.types;
    }

    public SpatialSpecArgs(
        @Nullable Output<String> path,
        @Nullable Output<List<Either<String,SpatialType>>> types) {
        this.path = path;
        this.types = types;
    }

    private SpatialSpecArgs() {
        this.path = Codegen.empty();
        this.types = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpatialSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> path;
        private @Nullable Output<List<Either<String,SpatialType>>> types;

        public Builder() {
    	      // Empty
        }

        public Builder(SpatialSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.types = defaults.types;
        }

        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder types(@Nullable Output<List<Either<String,SpatialType>>> types) {
            this.types = types;
            return this;
        }
        public Builder types(@Nullable List<Either<String,SpatialType>> types) {
            this.types = Codegen.ofNullable(types);
            return this;
        }
        public Builder types(Either<String,SpatialType>... types) {
            return types(List.of(types));
        }        public SpatialSpecArgs build() {
            return new SpatialSpecArgs(path, types);
        }
    }
}
