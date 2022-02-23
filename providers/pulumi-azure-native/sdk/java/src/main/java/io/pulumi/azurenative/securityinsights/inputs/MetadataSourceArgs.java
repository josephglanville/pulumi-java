// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.enums.SourceKind;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The original source of the content item, where it comes from.
 * 
 */
public final class MetadataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetadataSourceArgs Empty = new MetadataSourceArgs();

    /**
     * Source type of the content
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<Either<String,SourceKind>> kind;

    public Input<Either<String,SourceKind>> getKind() {
        return this.kind;
    }

    /**
     * Name of the content source.  The repo name, solution name, LA workspace name etc.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * ID of the content source.  The solution ID, workspace ID, etc
     * 
     */
    @InputImport(name="sourceId")
      private final @Nullable Input<String> sourceId;

    public Input<String> getSourceId() {
        return this.sourceId == null ? Input.empty() : this.sourceId;
    }

    public MetadataSourceArgs(
        Input<Either<String,SourceKind>> kind,
        @Nullable Input<String> name,
        @Nullable Input<String> sourceId) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = name;
        this.sourceId = sourceId;
    }

    private MetadataSourceArgs() {
        this.kind = Input.empty();
        this.name = Input.empty();
        this.sourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,SourceKind>> kind;
        private @Nullable Input<String> name;
        private @Nullable Input<String> sourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.sourceId = defaults.sourceId;
        }

        public Builder setKind(Input<Either<String,SourceKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(Either<String,SourceKind> kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
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

        public Builder setSourceId(@Nullable Input<String> sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        public Builder setSourceId(@Nullable String sourceId) {
            this.sourceId = Input.ofNullable(sourceId);
            return this;
        }
        public MetadataSourceArgs build() {
            return new MetadataSourceArgs(kind, name, sourceId);
        }
    }
}
