// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecrpublic.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryPolicyState Empty = new RepositoryPolicyState();

    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy == null ? Output.empty() : this.policy;
    }

    /**
     * The registry ID where the repository was created.
     * 
     */
    @Import(name="registryId")
      private final @Nullable Output<String> registryId;

    public Output<String> getRegistryId() {
        return this.registryId == null ? Output.empty() : this.registryId;
    }

    /**
     * Name of the repository to apply the policy.
     * 
     */
    @Import(name="repositoryName")
      private final @Nullable Output<String> repositoryName;

    public Output<String> getRepositoryName() {
        return this.repositoryName == null ? Output.empty() : this.repositoryName;
    }

    public RepositoryPolicyState(
        @Nullable Output<String> policy,
        @Nullable Output<String> registryId,
        @Nullable Output<String> repositoryName) {
        this.policy = policy;
        this.registryId = registryId;
        this.repositoryName = repositoryName;
    }

    private RepositoryPolicyState() {
        this.policy = Output.empty();
        this.registryId = Output.empty();
        this.repositoryName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> policy;
        private @Nullable Output<String> registryId;
        private @Nullable Output<String> repositoryName;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.registryId = defaults.registryId;
    	      this.repositoryName = defaults.repositoryName;
        }

        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = Output.ofNullable(policy);
            return this;
        }
        public Builder registryId(@Nullable Output<String> registryId) {
            this.registryId = registryId;
            return this;
        }
        public Builder registryId(@Nullable String registryId) {
            this.registryId = Output.ofNullable(registryId);
            return this;
        }
        public Builder repositoryName(@Nullable Output<String> repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }
        public Builder repositoryName(@Nullable String repositoryName) {
            this.repositoryName = Output.ofNullable(repositoryName);
            return this;
        }        public RepositoryPolicyState build() {
            return new RepositoryPolicyState(policy, registryId, repositoryName);
        }
    }
}
