// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FactoryVSTSConfigurationResponse {
    /**
     * Account name.
     * 
     */
    private final String accountName;
    /**
     * Collaboration branch.
     * 
     */
    private final String collaborationBranch;
    /**
     * Last commit id.
     * 
     */
    private final @Nullable String lastCommitId;
    /**
     * VSTS project name.
     * 
     */
    private final String projectName;
    /**
     * Repository name.
     * 
     */
    private final String repositoryName;
    /**
     * Root folder.
     * 
     */
    private final String rootFolder;
    /**
     * VSTS tenant id.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * Type of repo configuration.
     * Expected value is 'FactoryVSTSConfiguration'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private FactoryVSTSConfigurationResponse(
        @CustomType.Parameter("accountName") String accountName,
        @CustomType.Parameter("collaborationBranch") String collaborationBranch,
        @CustomType.Parameter("lastCommitId") @Nullable String lastCommitId,
        @CustomType.Parameter("projectName") String projectName,
        @CustomType.Parameter("repositoryName") String repositoryName,
        @CustomType.Parameter("rootFolder") String rootFolder,
        @CustomType.Parameter("tenantId") @Nullable String tenantId,
        @CustomType.Parameter("type") String type) {
        this.accountName = accountName;
        this.collaborationBranch = collaborationBranch;
        this.lastCommitId = lastCommitId;
        this.projectName = projectName;
        this.repositoryName = repositoryName;
        this.rootFolder = rootFolder;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * Account name.
     * 
    */
    public String getAccountName() {
        return this.accountName;
    }
    /**
     * Collaboration branch.
     * 
    */
    public String getCollaborationBranch() {
        return this.collaborationBranch;
    }
    /**
     * Last commit id.
     * 
    */
    public Optional<String> getLastCommitId() {
        return Optional.ofNullable(this.lastCommitId);
    }
    /**
     * VSTS project name.
     * 
    */
    public String getProjectName() {
        return this.projectName;
    }
    /**
     * Repository name.
     * 
    */
    public String getRepositoryName() {
        return this.repositoryName;
    }
    /**
     * Root folder.
     * 
    */
    public String getRootFolder() {
        return this.rootFolder;
    }
    /**
     * VSTS tenant id.
     * 
    */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * Type of repo configuration.
     * Expected value is 'FactoryVSTSConfiguration'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FactoryVSTSConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String collaborationBranch;
        private @Nullable String lastCommitId;
        private String projectName;
        private String repositoryName;
        private String rootFolder;
        private @Nullable String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FactoryVSTSConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.collaborationBranch = defaults.collaborationBranch;
    	      this.lastCommitId = defaults.lastCommitId;
    	      this.projectName = defaults.projectName;
    	      this.repositoryName = defaults.repositoryName;
    	      this.rootFolder = defaults.rootFolder;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder collaborationBranch(String collaborationBranch) {
            this.collaborationBranch = Objects.requireNonNull(collaborationBranch);
            return this;
        }
        public Builder lastCommitId(@Nullable String lastCommitId) {
            this.lastCommitId = lastCommitId;
            return this;
        }
        public Builder projectName(String projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }
        public Builder rootFolder(String rootFolder) {
            this.rootFolder = Objects.requireNonNull(rootFolder);
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public FactoryVSTSConfigurationResponse build() {
            return new FactoryVSTSConfigurationResponse(accountName, collaborationBranch, lastCommitId, projectName, repositoryName, rootFolder, tenantId, type);
        }
    }
}
