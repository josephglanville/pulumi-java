// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management;

import io.pulumi.azurenative.management.inputs.CreateManagementGroupDetailsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagementGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementGroupArgs Empty = new ManagementGroupArgs();

    /**
     * The details of a management group used during creation.
     * 
     */
    @Import(name="details")
      private final @Nullable Output<CreateManagementGroupDetailsArgs> details;

    public Output<CreateManagementGroupDetailsArgs> getDetails() {
        return this.details == null ? Output.empty() : this.details;
    }

    /**
     * The friendly name of the management group. If no value is passed then this  field will be set to the groupId.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Management Group ID.
     * 
     */
    @Import(name="groupId")
      private final @Nullable Output<String> groupId;

    public Output<String> getGroupId() {
        return this.groupId == null ? Output.empty() : this.groupId;
    }

    /**
     * The name of the management group. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public ManagementGroupArgs(
        @Nullable Output<CreateManagementGroupDetailsArgs> details,
        @Nullable Output<String> displayName,
        @Nullable Output<String> groupId,
        @Nullable Output<String> name) {
        this.details = details;
        this.displayName = displayName;
        this.groupId = groupId;
        this.name = name;
    }

    private ManagementGroupArgs() {
        this.details = Output.empty();
        this.displayName = Output.empty();
        this.groupId = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CreateManagementGroupDetailsArgs> details;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> groupId;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.displayName = defaults.displayName;
    	      this.groupId = defaults.groupId;
    	      this.name = defaults.name;
        }

        public Builder details(@Nullable Output<CreateManagementGroupDetailsArgs> details) {
            this.details = details;
            return this;
        }
        public Builder details(@Nullable CreateManagementGroupDetailsArgs details) {
            this.details = Output.ofNullable(details);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }
        public Builder groupId(@Nullable Output<String> groupId) {
            this.groupId = groupId;
            return this;
        }
        public Builder groupId(@Nullable String groupId) {
            this.groupId = Output.ofNullable(groupId);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public ManagementGroupArgs build() {
            return new ManagementGroupArgs(details, displayName, groupId, name);
        }
    }
}
