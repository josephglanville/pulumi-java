// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specify checkpoint version for update. This is only required to update the Compatibility.
 * 
 */
public final class SchemaVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaVersionArgs Empty = new SchemaVersionArgs();

    /**
     * Indicates if the latest version needs to be updated.
     * 
     */
    @Import(name="isLatest")
      private final @Nullable Output<Boolean> isLatest;

    public Output<Boolean> getIsLatest() {
        return this.isLatest == null ? Output.empty() : this.isLatest;
    }

    /**
     * Indicates the version number in the schema to update.
     * 
     */
    @Import(name="versionNumber")
      private final @Nullable Output<Integer> versionNumber;

    public Output<Integer> getVersionNumber() {
        return this.versionNumber == null ? Output.empty() : this.versionNumber;
    }

    public SchemaVersionArgs(
        @Nullable Output<Boolean> isLatest,
        @Nullable Output<Integer> versionNumber) {
        this.isLatest = isLatest;
        this.versionNumber = versionNumber;
    }

    private SchemaVersionArgs() {
        this.isLatest = Output.empty();
        this.versionNumber = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> isLatest;
        private @Nullable Output<Integer> versionNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isLatest = defaults.isLatest;
    	      this.versionNumber = defaults.versionNumber;
        }

        public Builder isLatest(@Nullable Output<Boolean> isLatest) {
            this.isLatest = isLatest;
            return this;
        }
        public Builder isLatest(@Nullable Boolean isLatest) {
            this.isLatest = Output.ofNullable(isLatest);
            return this;
        }
        public Builder versionNumber(@Nullable Output<Integer> versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public Builder versionNumber(@Nullable Integer versionNumber) {
            this.versionNumber = Output.ofNullable(versionNumber);
            return this;
        }        public SchemaVersionArgs build() {
            return new SchemaVersionArgs(isLatest, versionNumber);
        }
    }
}
