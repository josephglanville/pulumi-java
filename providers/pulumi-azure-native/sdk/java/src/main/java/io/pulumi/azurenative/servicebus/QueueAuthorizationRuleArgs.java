// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.servicebus.enums.AccessRights;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueAuthorizationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueueAuthorizationRuleArgs Empty = new QueueAuthorizationRuleArgs();

    /**
     * The authorization rule name.
     * 
     */
    @Import(name="authorizationRuleName")
      private final @Nullable Output<String> authorizationRuleName;

    public Output<String> getAuthorizationRuleName() {
        return this.authorizationRuleName == null ? Codegen.empty() : this.authorizationRuleName;
    }

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
      private final Output<String> namespaceName;

    public Output<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * The queue name.
     * 
     */
    @Import(name="queueName", required=true)
      private final Output<String> queueName;

    public Output<String> getQueueName() {
        return this.queueName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The rights associated with the rule.
     * 
     */
    @Import(name="rights", required=true)
      private final Output<List<AccessRights>> rights;

    public Output<List<AccessRights>> getRights() {
        return this.rights;
    }

    public QueueAuthorizationRuleArgs(
        @Nullable Output<String> authorizationRuleName,
        Output<String> namespaceName,
        Output<String> queueName,
        Output<String> resourceGroupName,
        Output<List<AccessRights>> rights) {
        this.authorizationRuleName = authorizationRuleName;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.queueName = Objects.requireNonNull(queueName, "expected parameter 'queueName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.rights = Objects.requireNonNull(rights, "expected parameter 'rights' to be non-null");
    }

    private QueueAuthorizationRuleArgs() {
        this.authorizationRuleName = Codegen.empty();
        this.namespaceName = Codegen.empty();
        this.queueName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.rights = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authorizationRuleName;
        private Output<String> namespaceName;
        private Output<String> queueName;
        private Output<String> resourceGroupName;
        private Output<List<AccessRights>> rights;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueAuthorizationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationRuleName = defaults.authorizationRuleName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.queueName = defaults.queueName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.rights = defaults.rights;
        }

        public Builder authorizationRuleName(@Nullable Output<String> authorizationRuleName) {
            this.authorizationRuleName = authorizationRuleName;
            return this;
        }
        public Builder authorizationRuleName(@Nullable String authorizationRuleName) {
            this.authorizationRuleName = Codegen.ofNullable(authorizationRuleName);
            return this;
        }
        public Builder namespaceName(Output<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Output.of(Objects.requireNonNull(namespaceName));
            return this;
        }
        public Builder queueName(Output<String> queueName) {
            this.queueName = Objects.requireNonNull(queueName);
            return this;
        }
        public Builder queueName(String queueName) {
            this.queueName = Output.of(Objects.requireNonNull(queueName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder rights(Output<List<AccessRights>> rights) {
            this.rights = Objects.requireNonNull(rights);
            return this;
        }
        public Builder rights(List<AccessRights> rights) {
            this.rights = Output.of(Objects.requireNonNull(rights));
            return this;
        }
        public Builder rights(AccessRights... rights) {
            return rights(List.of(rights));
        }        public QueueAuthorizationRuleArgs build() {
            return new QueueAuthorizationRuleArgs(authorizationRuleName, namespaceName, queueName, resourceGroupName, rights);
        }
    }
}
