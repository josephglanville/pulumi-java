// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb;

import io.pulumi.awsnative.memorydb.inputs.SubnetGroupTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetGroupArgs Empty = new SubnetGroupArgs();

    /**
     * An optional description of the subnet group.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The name of the subnet group. This value must be unique as it also serves as the subnet group identifier.
     * 
     */
    @Import(name="subnetGroupName")
      private final @Nullable Output<String> subnetGroupName;

    public Output<String> getSubnetGroupName() {
        return this.subnetGroupName == null ? Codegen.empty() : this.subnetGroupName;
    }

    /**
     * A list of VPC subnet IDs for the subnet group.
     * 
     */
    @Import(name="subnetIds", required=true)
      private final Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * An array of key-value pairs to apply to this subnet group.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<SubnetGroupTagArgs>> tags;

    public Output<List<SubnetGroupTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public SubnetGroupArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> subnetGroupName,
        Output<List<String>> subnetIds,
        @Nullable Output<List<SubnetGroupTagArgs>> tags) {
        this.description = description;
        this.subnetGroupName = subnetGroupName;
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.tags = tags;
    }

    private SubnetGroupArgs() {
        this.description = Codegen.empty();
        this.subnetGroupName = Codegen.empty();
        this.subnetIds = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> subnetGroupName;
        private Output<List<String>> subnetIds;
        private @Nullable Output<List<SubnetGroupTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.subnetGroupName = defaults.subnetGroupName;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder subnetGroupName(@Nullable Output<String> subnetGroupName) {
            this.subnetGroupName = subnetGroupName;
            return this;
        }
        public Builder subnetGroupName(@Nullable String subnetGroupName) {
            this.subnetGroupName = Codegen.ofNullable(subnetGroupName);
            return this;
        }
        public Builder subnetIds(Output<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Output.of(Objects.requireNonNull(subnetIds));
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder tags(@Nullable Output<List<SubnetGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<SubnetGroupTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(SubnetGroupTagArgs... tags) {
            return tags(List.of(tags));
        }        public SubnetGroupArgs build() {
            return new SubnetGroupArgs(description, subnetGroupName, subnetIds, tags);
        }
    }
}
