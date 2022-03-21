// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupArgs Empty = new GroupArgs();

    /**
     * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
     * 
     */
    @Import(name="awsAccountId")
      private final @Nullable Output<String> awsAccountId;

    public Output<String> getAwsAccountId() {
        return this.awsAccountId == null ? Output.empty() : this.awsAccountId;
    }

    /**
     * A description for the group.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A name for the group.
     * 
     */
    @Import(name="groupName", required=true)
      private final Output<String> groupName;

    public Output<String> getGroupName() {
        return this.groupName;
    }

    /**
     * The namespace. Currently, you should set this to `default`.
     * 
     */
    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace == null ? Output.empty() : this.namespace;
    }

    public GroupArgs(
        @Nullable Output<String> awsAccountId,
        @Nullable Output<String> description,
        Output<String> groupName,
        @Nullable Output<String> namespace) {
        this.awsAccountId = awsAccountId;
        this.description = description;
        this.groupName = Objects.requireNonNull(groupName, "expected parameter 'groupName' to be non-null");
        this.namespace = namespace;
    }

    private GroupArgs() {
        this.awsAccountId = Output.empty();
        this.description = Output.empty();
        this.groupName = Output.empty();
        this.namespace = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> awsAccountId;
        private @Nullable Output<String> description;
        private Output<String> groupName;
        private @Nullable Output<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.description = defaults.description;
    	      this.groupName = defaults.groupName;
    	      this.namespace = defaults.namespace;
        }

        public Builder awsAccountId(@Nullable Output<String> awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }
        public Builder awsAccountId(@Nullable String awsAccountId) {
            this.awsAccountId = Output.ofNullable(awsAccountId);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder groupName(Output<String> groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }
        public Builder groupName(String groupName) {
            this.groupName = Output.of(Objects.requireNonNull(groupName));
            return this;
        }
        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Output.ofNullable(namespace);
            return this;
        }        public GroupArgs build() {
            return new GroupArgs(awsAccountId, description, groupName, namespace);
        }
    }
}
