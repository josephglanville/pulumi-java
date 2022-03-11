// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThingGroupMetadataRootToParentGroupGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThingGroupMetadataRootToParentGroupGetArgs Empty = new ThingGroupMetadataRootToParentGroupGetArgs();

    @InputImport(name="groupArn")
      private final @Nullable Output<String> groupArn;

    public Output<String> getGroupArn() {
        return this.groupArn == null ? Output.empty() : this.groupArn;
    }

    @InputImport(name="groupName")
      private final @Nullable Output<String> groupName;

    public Output<String> getGroupName() {
        return this.groupName == null ? Output.empty() : this.groupName;
    }

    public ThingGroupMetadataRootToParentGroupGetArgs(
        @Nullable Output<String> groupArn,
        @Nullable Output<String> groupName) {
        this.groupArn = groupArn;
        this.groupName = groupName;
    }

    private ThingGroupMetadataRootToParentGroupGetArgs() {
        this.groupArn = Output.empty();
        this.groupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThingGroupMetadataRootToParentGroupGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> groupArn;
        private @Nullable Output<String> groupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ThingGroupMetadataRootToParentGroupGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupArn = defaults.groupArn;
    	      this.groupName = defaults.groupName;
        }

        public Builder groupArn(@Nullable Output<String> groupArn) {
            this.groupArn = groupArn;
            return this;
        }

        public Builder groupArn(@Nullable String groupArn) {
            this.groupArn = Output.ofNullable(groupArn);
            return this;
        }

        public Builder groupName(@Nullable Output<String> groupName) {
            this.groupName = groupName;
            return this;
        }

        public Builder groupName(@Nullable String groupName) {
            this.groupName = Output.ofNullable(groupName);
            return this;
        }
        public ThingGroupMetadataRootToParentGroupGetArgs build() {
            return new ThingGroupMetadataRootToParentGroupGetArgs(groupArn, groupName);
        }
    }
}
