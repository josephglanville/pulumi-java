// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PartitionStorageDescriptorColumnArgs extends io.pulumi.resources.ResourceArgs {

    public static final PartitionStorageDescriptorColumnArgs Empty = new PartitionStorageDescriptorColumnArgs();

    /**
     * Free-form text comment.
     * 
     */
    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> getComment() {
        return this.comment == null ? Output.empty() : this.comment;
    }

    /**
     * Name of the SerDe.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The datatype of data in the Column.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public PartitionStorageDescriptorColumnArgs(
        @Nullable Output<String> comment,
        Output<String> name,
        @Nullable Output<String> type) {
        this.comment = comment;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = type;
    }

    private PartitionStorageDescriptorColumnArgs() {
        this.comment = Output.empty();
        this.name = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartitionStorageDescriptorColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> comment;
        private Output<String> name;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PartitionStorageDescriptorColumnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }
        public Builder comment(@Nullable String comment) {
            this.comment = Output.ofNullable(comment);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public PartitionStorageDescriptorColumnArgs build() {
            return new PartitionStorageDescriptorColumnArgs(comment, name, type);
        }
    }
}