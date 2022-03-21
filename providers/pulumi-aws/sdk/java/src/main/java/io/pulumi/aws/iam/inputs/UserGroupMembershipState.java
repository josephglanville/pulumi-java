// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserGroupMembershipState extends io.pulumi.resources.ResourceArgs {

    public static final UserGroupMembershipState Empty = new UserGroupMembershipState();

    /**
     * A list of IAM Groups to add the user to
     * 
     */
    @Import(name="groups")
      private final @Nullable Output<List<String>> groups;

    public Output<List<String>> getGroups() {
        return this.groups == null ? Output.empty() : this.groups;
    }

    /**
     * The name of the IAM User to add to groups
     * 
     */
    @Import(name="user")
      private final @Nullable Output<String> user;

    public Output<String> getUser() {
        return this.user == null ? Output.empty() : this.user;
    }

    public UserGroupMembershipState(
        @Nullable Output<List<String>> groups,
        @Nullable Output<String> user) {
        this.groups = groups;
        this.user = user;
    }

    private UserGroupMembershipState() {
        this.groups = Output.empty();
        this.user = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserGroupMembershipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> groups;
        private @Nullable Output<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(UserGroupMembershipState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
    	      this.user = defaults.user;
        }

        public Builder groups(@Nullable Output<List<String>> groups) {
            this.groups = groups;
            return this;
        }
        public Builder groups(@Nullable List<String> groups) {
            this.groups = Output.ofNullable(groups);
            return this;
        }
        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }
        public Builder user(@Nullable Output<String> user) {
            this.user = user;
            return this;
        }
        public Builder user(@Nullable String user) {
            this.user = Output.ofNullable(user);
            return this;
        }        public UserGroupMembershipState build() {
            return new UserGroupMembershipState(groups, user);
        }
    }
}
