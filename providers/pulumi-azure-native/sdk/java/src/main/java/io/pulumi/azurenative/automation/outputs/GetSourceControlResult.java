// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSourceControlResult {
    /**
     * The auto sync of the source control. Default is false.
     * 
     */
    private final @Nullable Boolean autoSync;
    /**
     * The repo branch of the source control. Include branch as empty string for VsoTfvc.
     * 
     */
    private final @Nullable String branch;
    /**
     * The creation time.
     * 
     */
    private final @Nullable String creationTime;
    /**
     * The description.
     * 
     */
    private final @Nullable String description;
    /**
     * The folder path of the source control.
     * 
     */
    private final @Nullable String folderPath;
    /**
     * Fully qualified resource Id for the resource
     * 
     */
    private final String id;
    /**
     * The last modified time.
     * 
     */
    private final @Nullable String lastModifiedTime;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The auto publish of the source control. Default is true.
     * 
     */
    private final @Nullable Boolean publishRunbook;
    /**
     * The repo url of the source control.
     * 
     */
    private final @Nullable String repoUrl;
    /**
     * The source type. Must be one of VsoGit, VsoTfvc, GitHub.
     * 
     */
    private final @Nullable String sourceType;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSourceControlResult(
        @CustomType.Parameter("autoSync") @Nullable Boolean autoSync,
        @CustomType.Parameter("branch") @Nullable String branch,
        @CustomType.Parameter("creationTime") @Nullable String creationTime,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("folderPath") @Nullable String folderPath,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastModifiedTime") @Nullable String lastModifiedTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("publishRunbook") @Nullable Boolean publishRunbook,
        @CustomType.Parameter("repoUrl") @Nullable String repoUrl,
        @CustomType.Parameter("sourceType") @Nullable String sourceType,
        @CustomType.Parameter("type") String type) {
        this.autoSync = autoSync;
        this.branch = branch;
        this.creationTime = creationTime;
        this.description = description;
        this.folderPath = folderPath;
        this.id = id;
        this.lastModifiedTime = lastModifiedTime;
        this.name = name;
        this.publishRunbook = publishRunbook;
        this.repoUrl = repoUrl;
        this.sourceType = sourceType;
        this.type = type;
    }

    /**
     * The auto sync of the source control. Default is false.
     * 
    */
    public Optional<Boolean> getAutoSync() {
        return Optional.ofNullable(this.autoSync);
    }
    /**
     * The repo branch of the source control. Include branch as empty string for VsoTfvc.
     * 
    */
    public Optional<String> getBranch() {
        return Optional.ofNullable(this.branch);
    }
    /**
     * The creation time.
     * 
    */
    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * The description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The folder path of the source control.
     * 
    */
    public Optional<String> getFolderPath() {
        return Optional.ofNullable(this.folderPath);
    }
    /**
     * Fully qualified resource Id for the resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The last modified time.
     * 
    */
    public Optional<String> getLastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The auto publish of the source control. Default is true.
     * 
    */
    public Optional<Boolean> getPublishRunbook() {
        return Optional.ofNullable(this.publishRunbook);
    }
    /**
     * The repo url of the source control.
     * 
    */
    public Optional<String> getRepoUrl() {
        return Optional.ofNullable(this.repoUrl);
    }
    /**
     * The source type. Must be one of VsoGit, VsoTfvc, GitHub.
     * 
    */
    public Optional<String> getSourceType() {
        return Optional.ofNullable(this.sourceType);
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSourceControlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoSync;
        private @Nullable String branch;
        private @Nullable String creationTime;
        private @Nullable String description;
        private @Nullable String folderPath;
        private String id;
        private @Nullable String lastModifiedTime;
        private String name;
        private @Nullable Boolean publishRunbook;
        private @Nullable String repoUrl;
        private @Nullable String sourceType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSourceControlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoSync = defaults.autoSync;
    	      this.branch = defaults.branch;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.folderPath = defaults.folderPath;
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.name = defaults.name;
    	      this.publishRunbook = defaults.publishRunbook;
    	      this.repoUrl = defaults.repoUrl;
    	      this.sourceType = defaults.sourceType;
    	      this.type = defaults.type;
        }

        public Builder autoSync(@Nullable Boolean autoSync) {
            this.autoSync = autoSync;
            return this;
        }
        public Builder branch(@Nullable String branch) {
            this.branch = branch;
            return this;
        }
        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder folderPath(@Nullable String folderPath) {
            this.folderPath = folderPath;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder publishRunbook(@Nullable Boolean publishRunbook) {
            this.publishRunbook = publishRunbook;
            return this;
        }
        public Builder repoUrl(@Nullable String repoUrl) {
            this.repoUrl = repoUrl;
            return this;
        }
        public Builder sourceType(@Nullable String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSourceControlResult build() {
            return new GetSourceControlResult(autoSync, branch, creationTime, description, folderPath, id, lastModifiedTime, name, publishRunbook, repoUrl, sourceType, type);
        }
    }
}
