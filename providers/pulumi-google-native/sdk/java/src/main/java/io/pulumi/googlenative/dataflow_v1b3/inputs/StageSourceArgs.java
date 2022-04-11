// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Description of an input or output of an execution stage.
 * 
 */
public final class StageSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final StageSourceArgs Empty = new StageSourceArgs();

    /**
     * Dataflow service generated name for this source.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * User name for the original user transform or collection with which this source is most closely associated.
     * 
     */
    @Import(name="originalTransformOrCollection")
      private final @Nullable Output<String> originalTransformOrCollection;

    public Output<String> getOriginalTransformOrCollection() {
        return this.originalTransformOrCollection == null ? Codegen.empty() : this.originalTransformOrCollection;
    }

    /**
     * Size of the source, if measurable.
     * 
     */
    @Import(name="sizeBytes")
      private final @Nullable Output<String> sizeBytes;

    public Output<String> getSizeBytes() {
        return this.sizeBytes == null ? Codegen.empty() : this.sizeBytes;
    }

    /**
     * Human-readable name for this source; may be user or system generated.
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<String> userName;

    public Output<String> getUserName() {
        return this.userName == null ? Codegen.empty() : this.userName;
    }

    public StageSourceArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> originalTransformOrCollection,
        @Nullable Output<String> sizeBytes,
        @Nullable Output<String> userName) {
        this.name = name;
        this.originalTransformOrCollection = originalTransformOrCollection;
        this.sizeBytes = sizeBytes;
        this.userName = userName;
    }

    private StageSourceArgs() {
        this.name = Codegen.empty();
        this.originalTransformOrCollection = Codegen.empty();
        this.sizeBytes = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> originalTransformOrCollection;
        private @Nullable Output<String> sizeBytes;
        private @Nullable Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(StageSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.originalTransformOrCollection = defaults.originalTransformOrCollection;
    	      this.sizeBytes = defaults.sizeBytes;
    	      this.userName = defaults.userName;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder originalTransformOrCollection(@Nullable Output<String> originalTransformOrCollection) {
            this.originalTransformOrCollection = originalTransformOrCollection;
            return this;
        }
        public Builder originalTransformOrCollection(@Nullable String originalTransformOrCollection) {
            this.originalTransformOrCollection = Codegen.ofNullable(originalTransformOrCollection);
            return this;
        }
        public Builder sizeBytes(@Nullable Output<String> sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Builder sizeBytes(@Nullable String sizeBytes) {
            this.sizeBytes = Codegen.ofNullable(sizeBytes);
            return this;
        }
        public Builder userName(@Nullable Output<String> userName) {
            this.userName = userName;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = Codegen.ofNullable(userName);
            return this;
        }        public StageSourceArgs build() {
            return new StageSourceArgs(name, originalTransformOrCollection, sizeBytes, userName);
        }
    }
}
