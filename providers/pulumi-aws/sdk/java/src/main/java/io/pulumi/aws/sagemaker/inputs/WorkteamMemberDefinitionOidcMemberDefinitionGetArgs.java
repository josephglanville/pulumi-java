// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class WorkteamMemberDefinitionOidcMemberDefinitionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkteamMemberDefinitionOidcMemberDefinitionGetArgs Empty = new WorkteamMemberDefinitionOidcMemberDefinitionGetArgs();

    /**
     * A list of comma separated strings that identifies user groups in your OIDC IdP. Each user group is made up of a group of private workers.
     * 
     */
    @Import(name="groups", required=true)
      private final Output<List<String>> groups;

    public Output<List<String>> getGroups() {
        return this.groups;
    }

    public WorkteamMemberDefinitionOidcMemberDefinitionGetArgs(Output<List<String>> groups) {
        this.groups = Objects.requireNonNull(groups, "expected parameter 'groups' to be non-null");
    }

    private WorkteamMemberDefinitionOidcMemberDefinitionGetArgs() {
        this.groups = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkteamMemberDefinitionOidcMemberDefinitionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> groups;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkteamMemberDefinitionOidcMemberDefinitionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
        }

        public Builder groups(Output<List<String>> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }
        public Builder groups(List<String> groups) {
            this.groups = Output.of(Objects.requireNonNull(groups));
            return this;
        }
        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }        public WorkteamMemberDefinitionOidcMemberDefinitionGetArgs build() {
            return new WorkteamMemberDefinitionOidcMemberDefinitionGetArgs(groups);
        }
    }
}
