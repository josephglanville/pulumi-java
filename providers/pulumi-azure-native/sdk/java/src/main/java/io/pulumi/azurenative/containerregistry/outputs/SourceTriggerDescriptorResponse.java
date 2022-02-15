// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SourceTriggerDescriptorResponse {
    private final @Nullable String branchName;
    private final @Nullable String commitId;
    private final @Nullable String eventType;
    private final @Nullable String id;
    private final @Nullable String providerType;
    private final @Nullable String pullRequestId;
    private final @Nullable String repositoryUrl;

    @OutputCustomType.Constructor({"branchName","commitId","eventType","id","providerType","pullRequestId","repositoryUrl"})
    private SourceTriggerDescriptorResponse(
        @Nullable String branchName,
        @Nullable String commitId,
        @Nullable String eventType,
        @Nullable String id,
        @Nullable String providerType,
        @Nullable String pullRequestId,
        @Nullable String repositoryUrl) {
        this.branchName = branchName;
        this.commitId = commitId;
        this.eventType = eventType;
        this.id = id;
        this.providerType = providerType;
        this.pullRequestId = pullRequestId;
        this.repositoryUrl = repositoryUrl;
    }

    public Optional<String> getBranchName() {
        return Optional.ofNullable(this.branchName);
    }
    public Optional<String> getCommitId() {
        return Optional.ofNullable(this.commitId);
    }
    public Optional<String> getEventType() {
        return Optional.ofNullable(this.eventType);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getProviderType() {
        return Optional.ofNullable(this.providerType);
    }
    public Optional<String> getPullRequestId() {
        return Optional.ofNullable(this.pullRequestId);
    }
    public Optional<String> getRepositoryUrl() {
        return Optional.ofNullable(this.repositoryUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceTriggerDescriptorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String branchName;
        private @Nullable String commitId;
        private @Nullable String eventType;
        private @Nullable String id;
        private @Nullable String providerType;
        private @Nullable String pullRequestId;
        private @Nullable String repositoryUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceTriggerDescriptorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.commitId = defaults.commitId;
    	      this.eventType = defaults.eventType;
    	      this.id = defaults.id;
    	      this.providerType = defaults.providerType;
    	      this.pullRequestId = defaults.pullRequestId;
    	      this.repositoryUrl = defaults.repositoryUrl;
        }

        public Builder setBranchName(@Nullable String branchName) {
            this.branchName = branchName;
            return this;
        }

        public Builder setCommitId(@Nullable String commitId) {
            this.commitId = commitId;
            return this;
        }

        public Builder setEventType(@Nullable String eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setProviderType(@Nullable String providerType) {
            this.providerType = providerType;
            return this;
        }

        public Builder setPullRequestId(@Nullable String pullRequestId) {
            this.pullRequestId = pullRequestId;
            return this;
        }

        public Builder setRepositoryUrl(@Nullable String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }

        public SourceTriggerDescriptorResponse build() {
            return new SourceTriggerDescriptorResponse(branchName, commitId, eventType, id, providerType, pullRequestId, repositoryUrl);
        }
    }
}