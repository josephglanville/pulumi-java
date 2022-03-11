// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.GitHubClientSecretArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Factory's GitHub repo information.
 * 
 */
public final class FactoryGitHubConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FactoryGitHubConfigurationArgs Empty = new FactoryGitHubConfigurationArgs();

    /**
     * Account name.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * GitHub bring your own app client id.
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId == null ? Output.empty() : this.clientId;
    }

    /**
     * GitHub bring your own app client secret information.
     * 
     */
    @InputImport(name="clientSecret")
      private final @Nullable Output<GitHubClientSecretArgs> clientSecret;

    public Output<GitHubClientSecretArgs> getClientSecret() {
        return this.clientSecret == null ? Output.empty() : this.clientSecret;
    }

    /**
     * Collaboration branch.
     * 
     */
    @InputImport(name="collaborationBranch", required=true)
      private final Output<String> collaborationBranch;

    public Output<String> getCollaborationBranch() {
        return this.collaborationBranch;
    }

    /**
     * GitHub Enterprise host name. For example: https://github.mydomain.com
     * 
     */
    @InputImport(name="hostName")
      private final @Nullable Output<String> hostName;

    public Output<String> getHostName() {
        return this.hostName == null ? Output.empty() : this.hostName;
    }

    /**
     * Last commit id.
     * 
     */
    @InputImport(name="lastCommitId")
      private final @Nullable Output<String> lastCommitId;

    public Output<String> getLastCommitId() {
        return this.lastCommitId == null ? Output.empty() : this.lastCommitId;
    }

    /**
     * Repository name.
     * 
     */
    @InputImport(name="repositoryName", required=true)
      private final Output<String> repositoryName;

    public Output<String> getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * Root folder.
     * 
     */
    @InputImport(name="rootFolder", required=true)
      private final Output<String> rootFolder;

    public Output<String> getRootFolder() {
        return this.rootFolder;
    }

    /**
     * Type of repo configuration.
     * Expected value is 'FactoryGitHubConfiguration'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public FactoryGitHubConfigurationArgs(
        Output<String> accountName,
        @Nullable Output<String> clientId,
        @Nullable Output<GitHubClientSecretArgs> clientSecret,
        Output<String> collaborationBranch,
        @Nullable Output<String> hostName,
        @Nullable Output<String> lastCommitId,
        Output<String> repositoryName,
        Output<String> rootFolder,
        Output<String> type) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.collaborationBranch = Objects.requireNonNull(collaborationBranch, "expected parameter 'collaborationBranch' to be non-null");
        this.hostName = hostName;
        this.lastCommitId = lastCommitId;
        this.repositoryName = Objects.requireNonNull(repositoryName, "expected parameter 'repositoryName' to be non-null");
        this.rootFolder = Objects.requireNonNull(rootFolder, "expected parameter 'rootFolder' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FactoryGitHubConfigurationArgs() {
        this.accountName = Output.empty();
        this.clientId = Output.empty();
        this.clientSecret = Output.empty();
        this.collaborationBranch = Output.empty();
        this.hostName = Output.empty();
        this.lastCommitId = Output.empty();
        this.repositoryName = Output.empty();
        this.rootFolder = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FactoryGitHubConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> clientId;
        private @Nullable Output<GitHubClientSecretArgs> clientSecret;
        private Output<String> collaborationBranch;
        private @Nullable Output<String> hostName;
        private @Nullable Output<String> lastCommitId;
        private Output<String> repositoryName;
        private Output<String> rootFolder;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FactoryGitHubConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.collaborationBranch = defaults.collaborationBranch;
    	      this.hostName = defaults.hostName;
    	      this.lastCommitId = defaults.lastCommitId;
    	      this.repositoryName = defaults.repositoryName;
    	      this.rootFolder = defaults.rootFolder;
    	      this.type = defaults.type;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = Output.ofNullable(clientId);
            return this;
        }

        public Builder clientSecret(@Nullable Output<GitHubClientSecretArgs> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(@Nullable GitHubClientSecretArgs clientSecret) {
            this.clientSecret = Output.ofNullable(clientSecret);
            return this;
        }

        public Builder collaborationBranch(Output<String> collaborationBranch) {
            this.collaborationBranch = Objects.requireNonNull(collaborationBranch);
            return this;
        }

        public Builder collaborationBranch(String collaborationBranch) {
            this.collaborationBranch = Output.of(Objects.requireNonNull(collaborationBranch));
            return this;
        }

        public Builder hostName(@Nullable Output<String> hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder hostName(@Nullable String hostName) {
            this.hostName = Output.ofNullable(hostName);
            return this;
        }

        public Builder lastCommitId(@Nullable Output<String> lastCommitId) {
            this.lastCommitId = lastCommitId;
            return this;
        }

        public Builder lastCommitId(@Nullable String lastCommitId) {
            this.lastCommitId = Output.ofNullable(lastCommitId);
            return this;
        }

        public Builder repositoryName(Output<String> repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }

        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Output.of(Objects.requireNonNull(repositoryName));
            return this;
        }

        public Builder rootFolder(Output<String> rootFolder) {
            this.rootFolder = Objects.requireNonNull(rootFolder);
            return this;
        }

        public Builder rootFolder(String rootFolder) {
            this.rootFolder = Output.of(Objects.requireNonNull(rootFolder));
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public FactoryGitHubConfigurationArgs build() {
            return new FactoryGitHubConfigurationArgs(accountName, clientId, clientSecret, collaborationBranch, hostName, lastCommitId, repositoryName, rootFolder, type);
        }
    }
}
