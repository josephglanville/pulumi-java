// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.GitHubActionConfigurationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebAppSourceControlResult {
    private final @Nullable String branch;
    private final @Nullable Boolean deploymentRollbackEnabled;
    private final @Nullable GitHubActionConfigurationResponse gitHubActionConfiguration;
    private final String id;
    private final @Nullable Boolean isGitHubAction;
    private final @Nullable Boolean isManualIntegration;
    private final @Nullable Boolean isMercurial;
    private final @Nullable String kind;
    private final String name;
    private final @Nullable String repoUrl;
    private final String type;

    @OutputCustomType.Constructor({"branch","deploymentRollbackEnabled","gitHubActionConfiguration","id","isGitHubAction","isManualIntegration","isMercurial","kind","name","repoUrl","type"})
    private GetWebAppSourceControlResult(
        @Nullable String branch,
        @Nullable Boolean deploymentRollbackEnabled,
        @Nullable GitHubActionConfigurationResponse gitHubActionConfiguration,
        String id,
        @Nullable Boolean isGitHubAction,
        @Nullable Boolean isManualIntegration,
        @Nullable Boolean isMercurial,
        @Nullable String kind,
        String name,
        @Nullable String repoUrl,
        String type) {
        this.branch = branch;
        this.deploymentRollbackEnabled = deploymentRollbackEnabled;
        this.gitHubActionConfiguration = gitHubActionConfiguration;
        this.id = Objects.requireNonNull(id);
        this.isGitHubAction = isGitHubAction;
        this.isManualIntegration = isManualIntegration;
        this.isMercurial = isMercurial;
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.repoUrl = repoUrl;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getBranch() {
        return Optional.ofNullable(this.branch);
    }
    public Optional<Boolean> getDeploymentRollbackEnabled() {
        return Optional.ofNullable(this.deploymentRollbackEnabled);
    }
    public Optional<GitHubActionConfigurationResponse> getGitHubActionConfiguration() {
        return Optional.ofNullable(this.gitHubActionConfiguration);
    }
    public String getId() {
        return this.id;
    }
    public Optional<Boolean> getIsGitHubAction() {
        return Optional.ofNullable(this.isGitHubAction);
    }
    public Optional<Boolean> getIsManualIntegration() {
        return Optional.ofNullable(this.isManualIntegration);
    }
    public Optional<Boolean> getIsMercurial() {
        return Optional.ofNullable(this.isMercurial);
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getRepoUrl() {
        return Optional.ofNullable(this.repoUrl);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppSourceControlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String branch;
        private @Nullable Boolean deploymentRollbackEnabled;
        private @Nullable GitHubActionConfigurationResponse gitHubActionConfiguration;
        private String id;
        private @Nullable Boolean isGitHubAction;
        private @Nullable Boolean isManualIntegration;
        private @Nullable Boolean isMercurial;
        private @Nullable String kind;
        private String name;
        private @Nullable String repoUrl;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppSourceControlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.deploymentRollbackEnabled = defaults.deploymentRollbackEnabled;
    	      this.gitHubActionConfiguration = defaults.gitHubActionConfiguration;
    	      this.id = defaults.id;
    	      this.isGitHubAction = defaults.isGitHubAction;
    	      this.isManualIntegration = defaults.isManualIntegration;
    	      this.isMercurial = defaults.isMercurial;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.repoUrl = defaults.repoUrl;
    	      this.type = defaults.type;
        }

        public Builder setBranch(@Nullable String branch) {
            this.branch = branch;
            return this;
        }

        public Builder setDeploymentRollbackEnabled(@Nullable Boolean deploymentRollbackEnabled) {
            this.deploymentRollbackEnabled = deploymentRollbackEnabled;
            return this;
        }

        public Builder setGitHubActionConfiguration(@Nullable GitHubActionConfigurationResponse gitHubActionConfiguration) {
            this.gitHubActionConfiguration = gitHubActionConfiguration;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsGitHubAction(@Nullable Boolean isGitHubAction) {
            this.isGitHubAction = isGitHubAction;
            return this;
        }

        public Builder setIsManualIntegration(@Nullable Boolean isManualIntegration) {
            this.isManualIntegration = isManualIntegration;
            return this;
        }

        public Builder setIsMercurial(@Nullable Boolean isMercurial) {
            this.isMercurial = isMercurial;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRepoUrl(@Nullable String repoUrl) {
            this.repoUrl = repoUrl;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetWebAppSourceControlResult build() {
            return new GetWebAppSourceControlResult(branch, deploymentRollbackEnabled, gitHubActionConfiguration, id, isGitHubAction, isManualIntegration, isMercurial, kind, name, repoUrl, type);
        }
    }
}
